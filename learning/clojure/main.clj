42 ; this is a 64 bit integer
23.2 ; this is a float
22/7 ; this is a ratio

"Hello world"   ; this is a literal string
#"[a-z]+"       ; This is a regex. It will compile to java.util.regex.Pattern object.
\e              ; This is a character. Unicode charactes can be represented in hex or octal: \uNNNN \oNNN
\newline
\tab
\spec

; Symbols: map, +, clojure.core/+ (namespaced symbol)
; nil, true, false
; :aplha, :release/alpha are keyword and keyword with namespace.


; Literal collections

'(1 2 3)        ; list
[1 2 3]         ; vector
#{1 2 3}        ; Set
{:a 1, :b 2}    ; map


; Clojure expression

(+ 3 4) ; ( <- list, + <- symbol, 3 and 4 are Numbers (This is produced by the reader) / ( <- invocation, + <- function, 3 and 4 are arguments (How data is understood by the java runtime)

; Most clojure expressions are evaluated to themselves, except symbols and lists.
; Symbols are used to refer to something else and when evaluated, return what they refer to.

; *1 to get the result of the previous expression.
; *2 to get the result of two previous expression.
; *3 to get the result of three previous expression.

; (require '[clojure.repl :refer :all])

; functions: doc, find-doc, apropos, source and dir.

; (doc +)
; (apropos "+") returns +, +'. It returns functions that match the regex. (clojure.core/+ clojure.core/+')
; (find-doc "trim") find doc about functions that are similar to the string.
; (dir clojure.repl) 

; This is used to associate the symbol x with the value 7. This is called var. #' is the literal representation for a var, and use is the default namespace.
(def x 7) ; This is used to define a variable x. This will prompt #'user/x. user is the default namespace.

; Execution error (ClassCastException) at user/eval144 (REPL:1).
; class clojure.lang.Var cannot be cast to class java.lang.Number (clojure.lang.Var is in unnamed module of loader 'app'; java.lang.Number is in module java.base of loader 'bootstrap')
; (+ #'user/x #'user/x)

; We can print to the output using the functions:
(println "This is awesome")
(print "This is \t awesome\n")

; This will not translate the characters with new line or tab
(prn "This is awesome \n")
(pr "This is \tawesome \n")

; defn is used to create a named function and returns the message Hello, name
(defn greet [name] (str "Hello, " name)) ; This will return #'user/greet, which is a clojure.lang.Var.

; This will returns Hello, Ivan to the repl output
(greet "Ivan")

(println (greet "Ivan"))

; This will create a function with two options. First option, it is without arguments and it prints Hello World. Second option, it is with one argument.
(defn greet_1
    ([] (greet_1 "World"))
    ([msg] (str "Hello, " msg)))

(greet_1 "Ivan")

(println (greet_1 "Ivan"))

; & others -> It is the list of strings.
(defn greet_2 [first & others] (str "Hello, " first others))

(greet_2 "Ivan" "Noe" "Virginia" "Freddy")

; Returns the function object, but we cant invoke the function later, so we usually call the function at the creation moment.
(fn [name] (println "Hello " name))

( (fn [name] (println "Hello, " name)) "Ivan")

; The def keyword is used to define a name and fn is used to create a function.
(defn greet_3 [arg] (println arg))

(def greet_4 (fn [arg] (println arg)))

; We can use this shortcut #() to use like a function with arguments: % (one argument), %1 %2 %3 (positional arguments) and %& (variadic arguments)
; Nesting anonymous functions are not allowed.
#(+ 6 %) ; (fn [x] (+ 6 x))

( #(+ 6 %) 2) ; ((fn [x] (+ 6 x)) 2)

#(+ %1 %2) ; (fn [x y] (+ x y))

( #(+ %1 %2) 1 2) ; ((fn [x y] (+ x y)) 1 2)

; Dont do this
#([%]) ; (fn [x] ([x]))

; Instead of this:
#(vector %) ; (fn [x] (vector x))

; Or this
(fn [x] [x])

; or simple the vector function
vector

; apply function. We can use it to apply a sequence of values to a function where we need values.
(defn example [first second third] (println first second third))

; We must use at least one sequence in the function
(apply example '(1 2 3))
(apply example 1 '(2 3))
(apply example 1 2 '(3))

; let is used to binds symbols to values in a lexical scope.
(let [x 1 y 2]
    (println (+ x y))
    (println (* x y)))

(defn example_1 [msg]
    (let [a 1 
        b 2 
        c (clojure.string/capitalize msg)]
        (println c)
        (println (+ a b ))
    )
)

(example_1 "people")

; Instantiation of an object: (Car. "Volvo")
; Instance method: (.start "now")
; Instance field: (.-steeringWheel car)
; Static method: (Math/sqrt 25)
; Static field: (Math/PI)

( (fn [obj] (.length obj)) "Hello")

( #(.length %) "Hello")

; We can use (not) function to negate some value.
(let [x false]
    (not x))

; We can use if condition to sout if a value is greater than anything
(let [x 17 y 20]
    (if (> x 18) (println "You are old") (println "You are young"))
    (assert (not (< y x)))
    )

; Looping from the value from to the value to printing Hello world.
(defn looping [from to] (
    (when (< from to) (println "Hello world") (looping (inc from) to))
))

; We are using the if condition to print hello world when in range and false when not.
(defn looping_if [from to] (
    (if (< from to) (do (println "Hello world") (looping (inc from) to)) false)
))

(defn ^Integer s [^Integer a ^Integer b] (+ a b))

(s 1 2)

; (looping_if 0 10)

; Collections

(get [1 2 3] 1) ; returns 2
(get [false true "Hello" 1] 0) ; returns false
(get [0 1] 3) ; returns nil

(count [1 2 3]) ; returns 3 because is the amount of elements in the vector

; how to construct a vector
(vector 1 2 3) ; returns [1 2 3]

(conj [1 2 3] [4 5 6] 7 8) ; returns [1 2 3 [4 5 6] 7 8]

(def v [1 2 3])
(conj v 4 5 6) ; [1 2 3 4 5 6]
v ; returns [1 2 3]

; Lists are sequential linked lists that add elements to the head of the list instead to the tail.
(def cards '(10 :ace :jack 9)) ; we must quote the list, because we dont want autoevaluation.
(first cards) ; Lists are not indexed, so we have to use first and rest. first always return first element of cards.
(rest cards)

(conj cards :queen) ; It will return (:queen 10 :ace :jack 9)

(peek cards) ; It will return the head of the linked list: 10

(pop cards) ; It will return the rest of cards as a linked list

(def players #{"Hello" "second" "last"})

(conj players "other") ; Returns #{"Hello" "second" "last" "other"}
(disj players "Hello") ; Returns #{"second" "last"}
(contains? players "Hello") ; Returns true
(conj (sorted-set) "Noe" "Ivan" "Vir" "Freddy") ; Returns #{"Freddy" "Ivan" "Noe" "Vir"}
(into players [1 2 3]) ; returns a list of the type of the first argument with the values of the second.

(let [x (vector 1 2 3)]
    (println (into x '(4 5 6)))
    (println (into x #{4 5 7}))
)

; This is a java.util.List. We can use the instance? function to test if the structure is an instance of java.util.List.
(instance? java.util.List (list 1 2 3))
(class (vector 1 2 3)) ; returns clojure.lang.PersistentVector

; store a person object with city and name attributes.
(def person { :city "Ourense" :name "Ivan" })

; get the value for the attribute city in person object
(:city person)

; We can use the modifiers:
;   :let [binding-form expr]
;   :while test
;   :when  test
; It returns a list of vectors with the odd numbers. ([1] [3] [5] [7])
(defn looping-odd-numbers [^Integer from ^Integer to]
    (if (> from to) 
        false
        (for [y (range from to) :when (odd? y)] [y])))

; It returns a clojure.lang.lazySeq
(looping-odd-numbers 1 10) ; (class (looping-odd-numbers 1 10))
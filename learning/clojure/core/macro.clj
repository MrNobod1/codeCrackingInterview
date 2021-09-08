; returns the reverse of the parameter passed to the macro
(defmacro backwards
    [form]
    (reverse form))

; This without using the macro backwards wont success.
; It returns (str "I am backwards") and then clojure evaluates this expression and leads to "I am backwards"
; (backwards (" backwards" " am" "I" str)) this is the code to execute and it is right.

; This shows that clojure will take our program as a list and execute it.
(eval (list + 1 2)) ; This will return (eval (+ 1 2)) and then execute the function with its args.

; Clojure is homoiconic: it represents abstract syntax trees using lists, and you write 
; textual representations of lists when you write clojure code.
(eval (list 'def 'lucky-number (+ 1 2))) ; here we are defining a variable to be the name lucky number and the value of 3
; (eval '('def 'lucky-number (+ 1 2)))

(read-string "(+ 1 2)")             ; Will return a list of (+ 1 2)
(eval (read-string "(+ 1 2)"))      ; Will return the result of the operations. In that case will return 3
(list? (read-string "(+ 1 2)"))     ; This will return true
(conj (read-string "(+ 1 2)") 10)   ; will return (10 + 1 2)

(read-string "(fn [param] (+ 1 param))")
; In this case, the reader used a reader macro to transform #(+ 1 %)
(read-string "#(+ 1 %)") ; This will return (fn* [p1__177#] (+ 1 p1__177#))

; Some macro characters are: ', #, @

(read-string "'(1 2 3)")    ; Will expand de macro character to: (quote (1 2 3))
(read-string "@var")        ; Will return (clojure.core/deref var). It is the same as using:

(def x (atom 1))
(assert (= (deref x) @x)) ; @ and deref is used to get the value of the actual reference. @ is not available in edn(?)

(read-string ";ignore!\n(+ 1 2)")
(read-string "#_(def x 1)")

; The most recent binding takes precedence
(def x 4)
(assert (= (let [x 10] (let [x 5] (+ x 2))) 7))

(type (read-string "+"))    ; clojure.lang.Symbol
(class (read-string "+"))   ; clojure.lang.Symbol
(assert (= (type (read-string "+")) (class (read-string "+")))) ; In this case the type of symbol is the same as its class.

(defmacro add_old_way[ops]
    (list (second ops) (first ops) (last ops)))

(add_old_way (1 + 2))
(macroexpand '(add_old_way (1 + 2)))

(defn example [e] (* e  2))
(defn example_1 [e] (str "This is the value " e))

; this macro acts as a pipeline between functions.
(-> 3
    example
    example_1)

; slurp allows to read a file and convert it to a string. It can also fetch the content of a socket like https://clojuredocs.org
(defn read-resource
    "Read a resource into a string"
    [path]
    (-> path
        clojure.java.io/resource
        slurp
        read-string))

; (1 + 3 * 4 - 5)

(defmacro transform_into_clojure [c]
    (list (nth c 5) (list (nth c 1) (first c) (list (nth c 3) (nth c 2) (nth c 4))) (nth c 6)))

(transform_into_clojure (1 + 3 * 4 - 5))
(macroexpand '(transform_into_clojure (1 + 3 * 4 - 5)))

(macroexpand '(when (and (< 4 8) (= 2 2)) 
    (println "Hello world")
    (println "Other statement")
    (+ 1 2)))

; this will transform the when macro to if and do
(if (and (< 4 8) (= 2 2))
    (do
        (println "Hello world")
        (println "Other statement")
        (+ 1 2)))
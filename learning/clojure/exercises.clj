
(defn print_hello [] (println "Hello")) ; (def print_hello (fn [] (println "Hello")))

(def print_hello (fn [] (println "Hello")))

(def print_hello #(println "Hello"))

(defn greeting
    ([] (greeting "World"))
    ([msg] (str "Hello, " msg "!"))
    ([x y] (str x "," y "!"))
)

(assert (= "Hello, World!" (greeting)))        ; It will assert it.
(assert (= "Hello, Ivan!" (greeting "Ivan")))  ; It will assert it.
(assert (= "1,2!" (greeting 1 2)))             ; It will assert it.

(defn do-nothing [x] (x)) ; Identity function (source identity)

(identity (long 1)) ; This will return the long 1. This is how the identity function works.

(assert (= 1 (do-nothing 1)))

(defn always-thing [& args] (long 100))

(assert (= 100 (always-thing 1 10 101)))
; (assert (= 100 (#(long 100) 100))) this wont work
(assert (= 100 ((fn [& args] (long 100)) 1 10 101)))

(defn make-thingy [x] (fn [& args] x)) ; This is the same as the function constantly
; (source constantly)

; java.clojure.IFn -> is Interface Function
; java.clojure.RT -> is RunTime

(let [n (rand-int Integer/MAX_VALUE)
    f (make-thingy n)]
    (assert (= n (f 1 2 3 4)))
    (assert (= n (f n)))
    (assert (= n (f 100 200 300)))
)

; Call a function three times
(defn triplicate [function] (repeat 3 (function)))

(assert (= '("Hello" "Hello" "Hello") (triplicate (fn [] "Hello"))))
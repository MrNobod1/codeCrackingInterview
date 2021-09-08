(def a "123")

(assert (= a "123"))

; We can use the str function.
(def b (str 123))

(assert (= b "123"))

; We can use the method toString
(def c (.toString 123))

(assert (= c "123"))

; We can use the arrow macro too.
(def d (-> 123 .toString))
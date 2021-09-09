; this function is the same as dedupe
(defn unique-in-order [input]
    (let [f (conj (apply list input) nil)]
        (apply vector (keep-indexed #(if-not (= (nth f %1) %2) %2) input))))

(defn unique-in-order_1 [input]
    (reduce #(if-not (= (peek %1) %2) (conj %1 %2) %1) [] input))

(unique-in-order_1 "AAAABBBCCDAABBB")

; We can iterate over a string...
(str (keep-indexed #(Character/toUpperCase %2) "this is a string"))

; 2 4 3 -> input
; 4 3   -> f

; 0 2 2 2 -> f
; 2 2 2 -> input

(into [1] [2 3 4])

(conj (apply list [1 2 3]) 0)
(apply list '(1 2 3))
(apply list "this is a string")

(def l '(1 2 3))
(peek l) ; it only returns the first element of the list. It doesnt remove it.
(peek l)
l

(peek [1 2 3]) ; it returns the last element in the vector...
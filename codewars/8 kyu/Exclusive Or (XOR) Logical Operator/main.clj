(defn xor [a b] (or (and (true? a) (false? b)) (and (false? a) (true? b))))

(defn xor_alternative [a b] (not= a b))

; Rename a function that already exists to the xor function...
(def xor_alternative_1 distinct?)

(assert (= (xor false false) false))
(assert (= (xor true false) true))
(assert (= (xor false true) true))
(assert (= (xor true true) false))
(assert (= (not (xor true true)) true))

(assert (= (xor_alternative_1 true false) true))
(assert (= (xor_alternative_1 false true) true))
(assert (= (xor_alternative_1 false false) false))
(assert (= (xor_alternative_1 true true) false))
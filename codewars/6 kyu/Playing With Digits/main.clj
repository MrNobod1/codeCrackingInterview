(defn dig-pow [n p]
    (let [s (reduce + (map-indexed #(long (Math/pow (Character/digit %2 10) (+ p %1))) (str n)))]
        (if (= (mod s n) 0)
            (/ s n)
            -1)))
        
(def v 1)
(map-indexed #(* %2 (+ v %1)) (repeat 5 5))

(dig-pow 695 2)
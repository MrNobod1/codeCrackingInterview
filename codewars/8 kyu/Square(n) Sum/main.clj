(defn square-sum1 [lst]
    (loop [index (int 0) result (long 0)]
        (if (= index (count lst))
            result
            (recur (inc index) (+ result (* (get lst index) (get lst index)))))))
        
(defn square-sum2 [lst]
    (reduce + 
        (for [x lst]
            (* x x))))

(assert (= 5 (square-sum2 [1 2])))
(assert (= 50 (square-sum2 [5 3 4])))
(assert (= 0 (square-sum2 [])))

(defn square-sum3 [lst]
    (reduce +
        (for [x lst
            :let [y (* x x)]]
            y)))

(assert (= 5 (square-sum3 [1 2])))
(assert (= 50 (square-sum3 [5 3 4])))
(assert (= 0 (square-sum3 [])))

(defn square-sum [lst]
    (reduce + (map #(* % %) lst)))

(square-sum [1 2])

(assert (= 5 (square-sum [1 2]))) ; Should return 5
(assert (= 50 (square-sum [5 3 4]))) ; Should return 50
(assert (= 0 (square-sum [])) ; Should return 0
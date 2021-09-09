(defn hotpo 
    ([n] (hotpo n 0))
    ([n i] (if (= n 1) i (hotpo (if (even? n) (/ n 2) (inc (* 3 n))) (inc i)))))

(defn hotpo_1 [n] (count (take-while (partial not= 1) (iterate #(if (even? %) (/ % 2) (inc (* 3 %))) n))))

(hotpo 1)

(assert (= (hotpo 1) 0))
(assert (= (hotpo 5) 5))
(assert (= (hotpo 6) 8))
(assert (= (hotpo 23) 15))

(hotpo_1 1)

(assert (= (hotpo_1 1) 0))
(assert (= (hotpo_1 5) 5))
(assert (= (hotpo_1 6) 8))
(assert (= (hotpo_1 23) 15))
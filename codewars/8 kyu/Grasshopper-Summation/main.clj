(defn summation [n] (reduce + (range (inc n))))

(assert (= (summation 2) 3))
(assert (= (summation 8) 36))
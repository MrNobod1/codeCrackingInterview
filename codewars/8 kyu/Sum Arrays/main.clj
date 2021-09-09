(def sum #(reduce + %))
(def sum_1 (partial reduce +))
(def sum_2 #(apply + %))

(sum [1 2 3 4])
(sum_2 [1 2 3 4])
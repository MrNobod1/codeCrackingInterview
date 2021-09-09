(defn positive-sum [xs]
    (reduce + (filter pos? xs)))

(assert (= (positive-sum [1 2 3 4 5]) 15))
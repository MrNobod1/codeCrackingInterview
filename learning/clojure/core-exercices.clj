(for [x (range 100)
    :let [y (* x x)]
    :when (even? y)]
        y)

(for [x (range 100)
    :let [y (* x 2)]
    :while (< y 120)]
        y)

(defn is_prime [n]
    (let [limit (int (inc (Math/sqrt n)))]
        (loop [i 2]
            (do
                (when (= limit i) true)
                (if (= (mod n i) 0)
                    false (recur (inc i)))))))

(is_prime 4)
(is_prime 5)
(for [x (range 100)
    :let [y (* x x)]
    :when (even? y)]
        y)

(for [x (range 100)
    :let [y (* x 2)]
    :while (< y 120)]
        y)

(defn is_prime_recursive
    ([^Integer n] (is_prime_recursive n 2))
    ([^Integer n ^Integer i] (if (< i (int (Math/sqrt n)))
        (if (= 0 (mod n i))
            false
            (recur n (inc i)))
        true)))

(println (is_prime_recursive 21))
(println (is_prime_recursive 3))

(for [x (range 2 100)
    :let [y (str x " is prime")]
    :when (is_prime_recursive x)]
    (do (println y)
        y))

(doseq [x (range 2 100)
    :let [y (str x " is prime")]
    :when (is_prime_recursive x)]
    (println y))

(defn is_prime [n]
    (let [limit (int (inc (Math/sqrt n)))]
        (loop [i 2]
            (if (= limit i) true
                (if (= (mod n i) 0)
                    false (inc i))))))

(is_prime 4)
(is_prime 5)
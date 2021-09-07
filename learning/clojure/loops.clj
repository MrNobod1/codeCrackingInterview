; pos? returns true when the value is positive and false if it is negative.
(defn print-down-from [x]
    (when (pos? x)
        (println x)
        (recur (dec x))))

(defn print-down-from-if [x]
    (if (pos? x)
        (do
            (println x)
            (recur (dec x)))
        false))

(print-down-from 10)

(print-down-from-if 10)

(defn print_even [from to] (filter even? (range from to)))
(defn print_odd [from to] (filter odd? (range from to)))

(println ( (fn [from to even] (let [f (if (true? even) even? odd?)] (filter f (range from to)))) 0 100 true))

(def print_even_or_odd ( fn [from to even]
    (let [f (if (true? even) even? odd?) f_string (if (true? even) "par" "impar")]
        (for [x (range 0 100)
            :let [y (str "este numero " x " es " f_string)]
            :when (even? y)]
            (do 
                (println y)
                y)))))

(print_even_or_odd 0 100 true)
; We can use a list, vector, set or map to the map function.
(map #(str "Hello, " %) '("Ivan" "Freddy" "Noe" "Virginia"))
(map #(str "Hello, " %) ["Ivan" "Freddy" "Noe" "Virginia"])
(map #(str "Hello, " %) #{"Ivan" "Freddy" "Noe" "Virginia"})
(map #(str "Hello, " (second %)) {:first "Ivan" :second "Freddy" :third "Noe" :fourth "Virginia"})

; We can create a inline function using:
(assert (= ((fn [a b] (* a b)) 1 2) 2))
(assert (= (#(* %1 %2) 1 2) 2))

; https://dzone.com/articles/clojure-partial-and-comp#:~:text=The%20partial%20function%20takes%20a,variable%20number%20of%20additional%20args.&text=The%20partial%20function%20can%20often,alternative%20to%20fn%20or%20%23().
(assert (= (map #(* % 2) [1 2 3]) '(2 4 6)))
(assert (= (map (partial * 2) [1 2 3]) '(2 4 6))) ; I dont like it very much. At least with the examples that DZone give us.
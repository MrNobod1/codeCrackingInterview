(def l '(1 3 3 3 3 2 3))

(let [index (inc (count (take-while (partial not= 2) l)))]
    (nth l index nil))

(let [index (inc (.indexOf "testing" \t))]
    (get "testing" index nil))

(.indexOf '(1 2 2 2 2 3 4) 3)
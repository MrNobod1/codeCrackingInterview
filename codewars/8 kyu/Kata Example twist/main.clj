(def websites ((fn [] (repeat 1000 "codewars"))))
(def websites_1 (repeat 1000 "codewars"))
(def websites_2 (take 1000 (repeat "codewars")))

(assert (pos? (count websites)))
(assert (every? #(="codewars" %) websites))
(assert (= 1000 (count websites)))

(repeat 3 "codewars")
(apply str (repeat 3 "codewars")) ; will return a string composed of codewars repeated 3 times
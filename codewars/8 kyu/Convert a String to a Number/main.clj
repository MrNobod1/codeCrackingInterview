(def string-to-number #(Integer/parseInt %))
(def string-to-number_1 #(read-string %))

(assert (= (class (string-to-number "10")) java.lang.Integer))
(assert (= (class (string-to-number_1 "10")) java.lang.Long))

(class (read-string "10"))
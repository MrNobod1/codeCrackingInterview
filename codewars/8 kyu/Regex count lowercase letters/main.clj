(defn lowercase_count [strng]
    (count (filter #(Character/isLowerCase %) strng)))

(defn lowercase_count_1 [strng]
    (count (filter #(not (Character/isUpperCase %)) strng)))

(defn lowercase_count_2 [strng]
    (count (re-seq #"[a-z]" strng)))

(assert (= (lowercase_count "abc") 3))
(assert (= (lowercase_count "abcABC123") 3))
(assert (= (lowercase_count "") 0))
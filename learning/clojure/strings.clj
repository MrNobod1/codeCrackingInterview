; Functions in clojure.string namespace
; blank?
; capitalize
; ends-with?
; escape
; includes?
; index-of
; join
; last-index-of
; lower-case
; re-quote-replacement
; replace
; replace-first
; reverse
; split
; split-lines
; starts-with?
; trim
; trim-newline
; triml
; trimr
; upper-case

; Feature added in clojure 1.2
; The only values that are false for clojure are: nil and false.
(clojure.string/blank? nil)     ;return true because it is nil.
(clojure.string/blank? "     ") ; returns true because it is a strings build of whitespaces.
(clojure.string/blank? "")      ; returns true because it is an empty string.

(defn blank-string [^CharSequence s]
    (if s
        (loop [index (int 0)]
            (if (= (.length s) index)
                true
                (if (Character/isWhitespace (.charAt s index))
                    (recur (inc index))
                    false)))
    true))

(let [first nil 
    second "   " 
    third "something"]
    (assert (= (clojure.string/blank? first) (blank-string first)))
    (assert (= (clojure.string/blank? second) (blank-string second)))
    (assert (= (clojure.string/blank? third) (blank-string third))))

(defn re-matcher-seq [re string]
    (let [matcher (re-matcher re string)]
    (loop [find (re-find matcher)
        result []]
        (if-not find
            result
            (recur (re-find matcher) (conj result find))))))

(re-matcher-seq #"\d" "12345")

(def matcher (re-matcher #"\d" "1234"))

(re-find matcher) ; Until it returns nil, when regex dont get the string

; Feature added in clojure 1.2
; Returns the string with the first character capitalized and the rest in lowercase.
(clojure.string/capitalize "hELLO") ; Will returns Hello
(clojure.string/capitalize "HeLLo") ; Will returns Hello
(assert (= (clojure.string/capitalize "hELLO") (clojure.string/capitalize "HeLLO"))) ; assert true

(defn ^String capitalize-personal [^CharSequence s]
    (let [s (.toString s)]
        (if (> (count s) 2)
            (str (.toUpperCase (subs s 0 1))
                (.toLowerCase (subs s 1)))
            (.toUpperCase s))))

(capitalize-personal "hELLO") ; Will return Hello
(assert (= (clojure.string/capitalize "hELLO") (capitalize-personal "hEllO"))) ; Will assert true

(dotimes [n 10] (println "this is the number " n))

(dotimes [n 10] (println (reduce + (map #(* % %) (range n (+ n 10))))))
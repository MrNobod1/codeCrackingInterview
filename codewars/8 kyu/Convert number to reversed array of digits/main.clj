; It is not necessary to split the string because we can use map over a string so we are getting each character in each iteration.
(def digitize (fn [number] (map #(Integer/parseInt %) (reverse (clojure.string/split (str number) #"")))))
(def digitize_1 (fn [number] (map #(Character/digit % 10) (reverse (str number)))))
(defn digitize_2 [n]
    (->> n
        str
        reverse
        (map #(Character/digit % 10))))

(digitize 102)
(digitize_1 204)

(clojure.string/capitalize (get {:name "pedro" :age 19} :name))

; Threaded first macro
(-> :name 
    {:name "pedro" :age 19}
    clojure.string/capitalize)

(-> {:name "pedro" :age 19}
    :name
    clojure.string/capitalize)

; This piece of code is equivalent to the threaded last macro.
(assert (= (reduce + (map #(* % %) (filter odd? (range 10)))) 165))

; Threaded last macro equivalent to the up code.
; The three commas mark the place where the parameter will be inserted.
(->> (range 10)
    (filter odd? ,,,)
    (map #(* % %) ,,,)
    (reduce + ,,,))

; Some thumb rules to use threaded-first macro and threaded last macro:
;   - using functions that interact with sequences, we use threaded-last macro because we need the parameter as the last argument
;   - assoc, update, dissoc, get and their -in variants we use threaded-first macro.
;   - When using java interop and the parameter is the first to put we use threaded-first macro.

(-> "hello world" clojure.string/upper-case) ; This will output HELLO WORLD
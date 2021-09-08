; It is better to have 100 functions operate on one data structure than 10 functions on 10 data structures
; maps
(def person {:name "pedro" :age 20 :profesion "programmer"})
(def hashmap (hash-map :a 1 :b 2))

(assert (= (get person :name) "pedro"))
(assert (= (get person :non_existent "default") "default"))
(assert (= (get person :name) (person :name)))
(assert (= (:non_existent person "default") "default"))
(assert (= (get-in { :a { :b { :c { :d "hello" } } } } [:a :b :c :d]) "hello")) 
; the expresion in the up line and the down line are the same...
(assert (= (get (get (get (get { :a { :b { :c { :d "hello" } } } } :a) :b) :c) :d) "hello"))

; vectors
(def numbers [0 1 2 3 4 5])
(def numbers_1 (vector 0 1 2 3 4 5))

(assert (= (get [1 2 3] 0) 1))
(assert (= (count (conj [1 2 3] 1)) 4))
(assert (= (conj [1 2 3] 4) [1 2 3 4])) ; conj function will append the value to the end of the vector.

; lists
'(1 2 3 4)
(list "hello" 1 :a)
; Using nth to retrieve the value from list is slower than getting the value from vector using get function
; This is because nth have to traverse all n elements of a list to get the nth, whereas it only takes a few hops at most to access
; a vector element by its index.
(assert (= (nth '(1 2 3 4) 0) 1))
(assert (= (conj '(1 2 3) :a) '(:a 1 2 3))) ; conj function will append to the head of the list.

; hash-sets and sorted-sets
#{ "hello" 20 :icicle }
(hash-set 1 2 3 3)
(set [2 2 2 4])

(assert (= (hash-set 1 1 2 2) #{ 1 2 }))
(assert (= (conj #{:a :b} :b) #{:a :b}))
(assert (= (set [2 2 4 4])))
(assert (contains? #{:a :b} :b))
(assert (= (:a #{:a :b}) :a))
(assert (= (get #{:a :b} :a) :a))
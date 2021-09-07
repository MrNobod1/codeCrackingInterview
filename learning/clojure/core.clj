; https://clojuredocs.org/clojure.core/reduce
; https://clojuredocs.org/clojure.core/take
; https://clojuredocs.org/clojure.core/dotimes
; https://clojuredocs.org/clojure.core/repeatedly
; https://clojuredocs.org/clojure.core/re-matcher

; for macro in clojure
; (for seq-exprs body-expr)
; The modifiers are->
;   :let []
;   :when (expr)
;   :while (expr)
; It returns a clojure.lang.LazySeq with all the values of x*2 and when they are less than 18
(for [x (range 10)
    :let [y (* x 2)]
    :when (< y 18)]
    y)

; It returns a clojure.lang.LazySeq with all the values of x * 2 and while they are less than 18
(for [x (range 10)
    :let [y (* x 2)]
    :while (< y 18)]
y)

; returns a compilation of all combinations of the first vector with the second one.
(for [x [1 2 3]
    y ['a 'b 'c]]
    [x y])

(class (for [x [1 2]] x)) ; it returns clojure.lang.LazySeq

; doseq macro in clojure
; (doseq seq-exprs & body)
; Dont have modifiers
; It does the sequence, but doesn't return anything. It returns nil in the end of the do sequence.
(doseq [x [1 2 3 4]
    y [5 4 3 2 1]]
        (prn [x y]))

; list function is used to create a list from other data structure
; (list & items)
(assert (= (list 1 2 3) '(1 2 3)))

; (map f) (map f coll) (map f c1 c2) (map f c1 c2 c3) (map f c1 c2 c3 & colls)
(reduce + (map inc [1 2 3 4])) ; Returns 14
(map #(* % %) (range 100)) ; returns a list of values from 0 to 100.
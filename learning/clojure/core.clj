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
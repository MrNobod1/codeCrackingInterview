(def multiply *)

(defmacro multiply_macro [l]
    (list (second l) (first l) (last l)))

(macroexpand '(multiply_macro (a * b)))

(defn multiply_1 [a b]
    (multiply_macro (a * b)))

(assert (= (multiply_1 3 2) 6))
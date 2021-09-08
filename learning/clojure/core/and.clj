; and returns the last truthy value if all the expresionss are true.
; if the one expression is false, it returns the first false expression.

(assert (false? (and false true)))
(assert (= "hello" (and true true "hello")))
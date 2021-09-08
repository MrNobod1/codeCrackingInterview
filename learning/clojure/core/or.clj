; or will return the first value that is true

(assert (true? (or false true false)))
(assert (= "hello" (or false "hello" false)))
(assert (= "hello" (or false "hello" false "bye")))
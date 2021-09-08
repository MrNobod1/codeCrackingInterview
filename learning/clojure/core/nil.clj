(assert (true? (nil? nil))) ; it returns nill and the assertion is true.
(assert (false? (nil? true))) ; it returns nil and the assertion is true.
(assert (not (true? (nil? false))))

; nil and false are the only values in clojure that represents falseynes.
(if nil (println "it wont be printed") (println "the value nil is false"))
(if false (println "it wont be printed") (println "the value false is false. xd"))

(true? "hello") ; will return false.
(def repeat-str #(apply str (take %1 (repeat %2))))
(def repeat-str-1 #(apply str (repeat %1 %2)))
(#(apply str (take %1 (repeat %2))) 6 "I")

(repeat-str 6 "I")
(repeat-str-1 6 "I")

(assert (= (repeat-str 6 "I") "IIIIII"))
(assert (= (repeat-str-1 6 "I") "IIIIII"))

; to import modules, we can use this:
; (ns clojure.string-repeat
;   (require [clojure.string :as string])) ; and then we can call it using the shortcut string instead of clojure.string/method
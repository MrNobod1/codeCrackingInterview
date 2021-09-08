(defn chromosome-check [a]
    (let [m "Congratulations! You're going to have a " son "son" daughter "daughter"]
        (if (.contains a "Y")
            (str m son ".")
            (str m daughter "."))))

(assert (= (chromosome-check "XY") "Congratulations! You're going to have a son."))
(assert (= (chromosome-check "XX") "Congratulations! You're going to have a daughter."))
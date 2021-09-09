(defn twosum [numbers target]
    (loop [i 0 s (hash-map)] 
        (if (contains? s (get numbers i))
            [(s (get numbers i)) i]
            (recur (inc i) (assoc s (- target (get numbers i)) i)))))

(twosum [1 2 3 4] 4)

; target 4
; 1 2 3 4
; 
; set = 3

((assoc {} 1 2) 1)
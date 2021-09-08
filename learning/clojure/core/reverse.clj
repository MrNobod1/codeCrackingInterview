(reverse (str "I " "am " "Jesus"))          ; Will return (\s \u \s \e \J \space \m \a \space \I)
(apply str (reverse "I am Jesus"))          ; Will return the reverse of the string as a string.
(assert (= (reverse '(1 2 3)) '(3 2 1)))    ; Will assert true.

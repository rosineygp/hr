(defn superDigit [n k]
  (let [x (mod (* (BigInteger. n) k) 9)]
    (if (= x 0) "9" (str x))))

; tests
(println (superDigit "148" 3))  ; 3
(println (superDigit "9875" 4)) ; 8
(println (superDigit "123" 3))  ; 9
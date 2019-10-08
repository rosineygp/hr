(defn f [n]
  (if (> (count n) 1)
    (f (str (reduce +
                    (map #(BigInteger. (str %)) n))))
    n))

(defn superDigit [n k]
  (f (clojure.string/join (repeat k n))))

; tests
(println (superDigit 148 3))  ; 3
(println (superDigit 9875 4)) ; 8
(println (superDigit 123 3))  ; 9
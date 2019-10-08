(defn step [d n]
  (clojure.string/join (concat
                        (repeat (- n d) " ")
                        (repeat d "#"))))

(defn steps [n]
  (for [d (range 1 (inc n))]
    (step d n)))

(defn staircase [n]
  (steps n))

(println (staircase 6))

(defn f [num lst]
  (flatten (map #(repeat num %) lst)))


(println (f 3 [1 2 3 4]))
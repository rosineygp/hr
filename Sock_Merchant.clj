(defn leftover [sock]
  (if (> sock 2)
    (if (odd? sock)
      (dec sock)
      sock)
    sock))

(defn sockMerchant [n ar]
  (reduce +
          (map #(/ (leftover (get % 1)) 2)
               (filter #(= (mod (leftover (get % 1)) 2) 0) (frequencies ar)))))

(println (sockMerchant 9 [10 20 20 10 10 30 50 10 20]))
(def input '(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10))

(defn reversed [l]
  (if (empty? l) []
    (conj (reversed (rest l)) (first l))
    )
  )

(do (println (reversed input)))

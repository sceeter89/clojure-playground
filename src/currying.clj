(defn add [x y] (+ x y))

(defn add-n [n] (partial add n))

(let [add-5 (add-n 5)]
  (println (add-5 2)))

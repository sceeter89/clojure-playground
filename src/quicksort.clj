(defn qsort [L]
  (if (empty? L)
      '()
      (let [[pivot & L2] L]
           (lazy-cat (qsort (for [y L2 :when (<  y pivot)] y))
                     (list pivot)
                     (qsort (for [y L2 :when (>= y pivot)] y))))))

(use 'clojure.test)

(deftest output-list-is-sorted
  (let [input '(4, 3, 5, 1, 6, 1, 3)
        expected '(1, 1, 3, 3, 4, 5, 6)]
    (is (= expected (qsort input)))
    )
  )

(run-all-tests)

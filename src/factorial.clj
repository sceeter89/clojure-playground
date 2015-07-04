(defn factorial [n]
  (if (= n 1) 1
    (* n (factorial (- n 1))))
  )

(use 'clojure.test)

(deftest factorial-1
  (is (= 1 (factorial 1)))
  )

(deftest factorial-2
  (is (= 2 (factorial 2)))
  )

(deftest factorial-3
  (is (= 6 (factorial 3)))
  )

(deftest factorial-4
  (is (= 24 (factorial 4)))
  )

(deftest factorial-5
  (is (= 120 (factorial 5)))
  )

(run-all-tests)

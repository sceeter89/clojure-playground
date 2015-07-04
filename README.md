# clojure-playground

## Defining structures
Define function: `(defn name [args...] body)`
Define function that returns true or false: `(defn name? [args...] body)`
For example:
```clojure
   (defn add [x y] (+ x y))
   (add 1 2)
```
Define list:
```clojure
   '(1 2 3 4)
   (list 1 2 3 4)
```
Define set:
```clojure
   #{1 2 3 3 3 4 4 4 4}
   (set '(1 2 3 3 3 4 4 4 4))
```
Define constant:
```clojure
   (let [name1 value1 ... nameN valueN] body)
```
List comprehension:
```clojure
   (for [x [0 1 2 3 4 5]
         :let [y (* x 3)]
         :when (even? y)]
     y)
```
## Operations on data structures
`(conj collection elements)` - returns collection with elements added to 'optimal' end of collection. I.e. on list's head, and vector's tail.
`(cons element list)` - return *seq* with elements added to the beginning of collection
`(intersection set1 set1)`
`(union set1 set1)`
`(first *list*)` - returns first element of list
`(last *list*)` - returns last element of list
`(rest *list*)` - returns list without first element
`(concat *list1* ... *listN*)` - returns list with all elements from all lists 1-N
`(lazy-cat *list1* ... *listN*)` - returns list with all elements from all lists 1-N, but joining it self occurs only when needed
`(str item1 item2 ... itemN)` - stringifies all items and returns concatenated items
`(reverse *list*)`
`(mapcat function *list1* ... *listN*)` - applies function to each list and then concatenates all of them

## Conditional and flow-control statements
`(if bool-expression body-if-true body-if-false)`
`(when bool-expression body-if-true ... another-body-if-true)` - almost like `if` but without else and with multiple functions to eval if condition is true.

`(do body1 ... bodyN)` - run multiple functions one after another, result is return value of last function. Useful e.g. when printing some values inside function.
While-like loop, that runs as long as `recur` function is called. In following example there will be 5 iterations. 
```clojure
   (loop [i 0]
     (when (< i 5)
       (println i)
       (recur (inc i))))
```
For-like loops:
```clojure
   (doseq [i (range 0 5)]
     (println i))

   (dorun (for [i (range 0 5)]
     (println i)))
```

## Testing

Firstly
```clojure
  (use 'clojure.test)
```
Then write some test cases:
```clojure
   (deftest is-1-equal-to-1
     (is (= 1 1))
     )
    
   (deftest is-true-really-true
     (is (= true true))
     )
```
And finally run all tests:
```clojure
   (run-all-tests)
```

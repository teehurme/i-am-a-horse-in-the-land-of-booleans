(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if ( or (= x nil) (= x false))
    false
    true)
  )

(defn abs [x]
  (if (< x 0)
    (- x)
     x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (= (mod n 15) 0) "gotcha!"
   (= (mod n 5) 0) "buzz"
   (= (mod n 3) 0) "fizz"
   :else ""
   ))

(defn teen? [age]
  (if (< 12 age 20)
    true
    false))

(defn not-teen? [age]
  (if (teen? age)
    false
    true))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (= (mod year 400) 0) true
   (= (mod year 100) 0) false
   (= (mod year 4) 0) true
   :else false
   ))

; '_______'

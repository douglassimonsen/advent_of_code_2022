(ns sol2)
(:import slurp) 
(require '[clojure.string :as str])

(defn tmp [val] 
  (def handScores {\A 1 \B 2 \C 3 \X 1 \Y 2 \Z 3})
  (def winScores {1 6 0 3 2 0})
  (def first (nth val 0))
  (def second (nth val 2))
  (+ 
   (get handScores second) 
   (get winScores (mod (
                   - (get handScores second)
                     (get handScores first)
                   ) 3))
   )
  )

(reduce + (map tmp (str/split (slurp "/home/hannah/advent_of_code_2022/2/data.txt") #"\n")))

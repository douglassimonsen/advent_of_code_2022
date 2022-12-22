(ns sol1)
(:import slurp)
(require '[clojure.string :as str])
(defn parseInt [val] (Integer/parseInt val))
(defn sum_split [lst] (reduce + (map parseInt (str/split lst  #"\n"))))
(defn sorted_list [path] (reverse (sort (map sum_split (str/split (slurp path) #"\n\n")))))
(reduce + (take 1 (sorted_list "data.txt")))

(reduce + (take 3 (sorted_list "data.txt")))
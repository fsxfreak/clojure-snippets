(ns daily-programmer-132.core
  (:gen-class))

(defn gcd [a b]
    "Euclid's algorithm."
    (if (= b 0)
        a
        (recur b (mod a b))))

(defn -main [& args]
    (with-open [rdr (clojure.java.io/reader (first args))]
        (doseq [line (remove empty? (line-seq rdr))]
            (let [[num-1 num-2]
                (vec (map read-string (re-seq #"[\d.]+" line)))]

                (println (gcd num-1 num-2))))))


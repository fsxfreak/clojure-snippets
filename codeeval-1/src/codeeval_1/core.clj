(ns codeeval-1.core
  (:gen-class))

(defn divides? [numerator denominator]
    (= (mod numerator denominator) 0))

(defn -main [& args]
  (with-open [rdr (clojure.java.io/reader (first args))]
    (doseq [line (remove empty? (line-seq rdr))]
        
        (let [[divisor-fizz divisor-buzz end-number] 
            (vec (map read-string (re-seq #"[\d.]+" line)))]
            
            (doseq [i (range 1 (+ end-number 1))]
                (if (and (divides? i divisor-fizz) (divides? i divisor-buzz))
                        (print "FB")
                        (if (divides? i divisor-fizz)
                            (print "F")
                            (if (divides? i divisor-buzz)
                                (print "B")
                                (print i))))
                (if (not= i end-number)
                    (print " ")
                    (println "")))))))

                
                

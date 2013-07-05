(ns daily-programmer-131.core
  (:gen-class))

(comment 

	My old version, written when I didn't understand let.

	(use 'clojure.java.io)
	(use '[clojure.string :only (join split upper-case)])

	(defn second-word [string]
		(second (split (apply str string) #"\s")))

	(defn third-word [string]
		(nth (split (apply str string) #"\s") 2))

	(defn check-data [line]
		(true? (= (third-word line) (second-word line))))

	(defn rev [line]
		(clojure.string/reverse (second-word line)))

	(defn upper [line]
		(upper-case (second-word line)))

	(defn -main [& args]
	  (with-open [rdr (reader "../input.txt")]
	  	(doseq [line (line-seq rdr)]
	  		(if (= (first line) \0)
	  			(if (true? 
	  				(check-data (clojure.string/replace line (second-word line) (rev line))))
	  				(println "Good test data.")
	  				(println "Bad test data.")))
	  		(if (= (first line) \1)
	  			(if (true? 
	  				(check-data (clojure.string/replace line (second-word line) (upper line))))
	  				(println "Good test data.")
	  				(println "Bad test data."))))))
)
  
;; Improved version I modified to take an input from a file, logic taken from
;; a reddit comment, but I took the time to understand it.
(defn -main [& args]
	(with-open [rdr (reader (first args))]
		(doseq [testcase (line-seq rdr)]
 			(let [[number word1 word2] (clojure.string/split testcase #" ")]
 				(if (or (and (= number "0")
 							 (= word2 (clojure.string/reverse word1)))
 						(and (= number "1")
 							 (= word2 (clojure.string/upper-case word1))))
 				(println "Test positive.")
 				(println "Test negative."))))))


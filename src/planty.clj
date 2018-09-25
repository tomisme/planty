(ns planty
  (:require [serial.core :as serial]
            [byte-streams :as bs]))


(def port (serial/open "/dev/ttyACM0" :baud-rate 9600))


(def log-file (clojure.java.io/file "./data/data.log"))


(defn handler
  [input-stream]
  (bs/transfer input-stream log-file))


(defn -main
  []
  (println "Hello 🌱")
  (serial/listen! port handler)
  (loop [] (recur)))

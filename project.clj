(defproject cljr-nsca "0.0.3"
  :description "Clojure wrapper for jsendnsca - Send passive Nagios checks from Clojure."
  :url "http://github.com/mcorbin/clj-nsca"
  :repositories {"redhat" "https://maven.repository.redhat.com/ga/"}
  :dependencies [[com.googlecode/jsendnsca-core "1.3.1"]]
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :profiles {:dev {:dependencies [[midje "1.5.0"]
                                  [org.clojure/clojure "1.8.0"]]}})

(defproject org.clojars.rymndhng/tools.namespace "0.3.0-alpha5"
  :description "TNS-48"
  :url "http://github.com/rymndhng/tools.namespace"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/java.classpath "0.2.3"]
                 [org.clojure/tools.reader "0.10.0"]]
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :global-vars {*warn-on-reflection* true}
  :deploy-repositories {"releases" {:url "https://repo.clojars.org" :creds :gpg}})

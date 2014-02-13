(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-core "1.2.0"]
                 [ring/ring-json "0.2.0"]
                 [ring-mock "0.1.5"]
                 [compojure "1.1.6"]]

  :plugins [[lein-ring "0.8.10"]]

  :aliases {"up" ["ring" "server-headless"]}

  :min-lein-version "2.0.0"
  :uberjar-name "{{name}}-standalone.jar"

  :ring {:handler {{name}}.handler/app})


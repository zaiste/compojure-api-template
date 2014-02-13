(ns leiningen.new.compojure-api
  (:require [leiningen.new.templates :refer [renderer year name-to-path ->files]]))

(defn compojure-api [name]
  (let [data {:name name
              :sanitized (name-to-path name)
              :year (year)}
        render #((renderer "compojure_api") % data)]
    (->files data
             "resources/public"
             ["src/{{sanitized}}/handler.clj" (render "handler.clj")]
             ["test/{{sanitized}}/test/handler.clj" (render "handler_test.clj")]
             ["README.md" (render "README.md")]
             ["project.clj" (render "project.clj")]
             [".gitignore" (render "gitignore")])))

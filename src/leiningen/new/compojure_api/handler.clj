(ns {{name}}.handler
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [compojure.core :refer [GET POST defroutes]]
            [ring.middleware.json :as middleware]
            [ring.util.response :refer :all]))

(defroutes app-routes
  (GET  "/" [] (response {:message "Hello, World"}))
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (-> (handler/api app-routes)
      (middleware/wrap-json-body {:keywords? true})
      (middleware/wrap-json-response)))

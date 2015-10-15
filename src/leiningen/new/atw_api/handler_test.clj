(ns {{name}}.test.handler
  (:use clojure.test
        ring.mock.request
        {{name}}.handler))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:headers response) {"Content-Type" "application/json; charset=utf-8"}))
      (is (= (:body response) "{\"message\":\"Hello, World\"}"))))

  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= (:status response) 404)))))

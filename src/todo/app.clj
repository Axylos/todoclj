(ns todo.app
  (:use ring.util.response)
  (:require [clojure.string :as string])
  (:require [todo.db :as db])
  (:require
   [ring.middleware.json :refer :all]
   [compojure.route :as route])
  (:require [compojure.core :refer :all]))

(defroutes app-routes
  (GET "/" []
    {:status 200
     :headers {"Content-Type" "application/json"}
     :body {:msg "what's happening"}})
  (GET "/name/:id" [id]
    {:status 200
     :body {:msg (apply str (interpose ": " ["wat" id (todo.db/find-users)]))}})
  (route/not-found (response {:status 404
                              :msg "You're out of Luck"})))

(def app
  (-> app-routes
      wrap-json-response))

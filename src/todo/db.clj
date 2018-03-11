(ns todo.db
  (:use
   [korma.core]
   [korma.db]))

(def db (postgres
         {:port 5432
          :user "axylos"
          :host "0.0.0.0"
          :db "todo-clj"}))

(defdb korma-db db)

(defn find-users
  []
  (select "users"
          (limit 1)))

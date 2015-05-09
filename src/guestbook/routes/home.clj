(ns guestbook.routes.home
  (:require [compojure.core :refer :all]
            [guestbook.views.layout :as layout]))

(defn home []
  (layout/common
    [:h1 "Guestbook"]
     [:p "Welcome"]
     [:hr]
     [:form
        [:p "Name:"]
        [:input]
      [:p "message:"]
        [:textarea {:rows 10 :cols 40}]]))

(defroutes home-routes
  (GET "/" [] (home)))

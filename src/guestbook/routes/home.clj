(ns guestbook.routes.home
  (:require [compojure.core :refer :all]
            [guestbook.views.layout :as layout]
            ; [clojure.tools.logging :as log]
            [hiccup.form :refer :all]))

; (log/info "dividing")

(defn show-guests []
  [:ul.guests
   (for [{:keys [message name timestamp]}
         [{:message "Howdy" :name "Bob" :timestamp nil}
          {:message "Hello" :name "Bob" :timestamp nil}]]
     [:li
      [:blockquote message]
      [:p " - " [:cite name]]
      [:time timestamp]])])

(defn home [& [name message error]]
  (layout/common
    [:h1 "Guestbook"]
     [:p "Welcome"]
     [:p error]
     (show-guests)
     [:hr]
     (form-to [:post "/"]
        [:p "Name:"]
        (text-field "name" name)
        [:p "message:"]
        (text-area {:rows 10 :cols 40} "message" message)
        [:br]
        (submit-button "comment"))))

(defn save-message [name message]
  (cond
    (empty? name)
      (home name message "You forgot to leave a name")

    (empty? message)
      (home name message "Don't you have something to say?")

    :else
    (do
      (home))))

(defroutes home-routes
  (GET "/" [] (home))
  (POST "/" [name message] (save-message name message)))

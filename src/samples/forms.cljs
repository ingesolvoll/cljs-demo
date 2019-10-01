(ns samples.forms
  (:require [samples.re-frame :as f]
            [reagent.core :as r]))

(defn valid-username? [username]
  (= username "gyldig@epost.no"))

(defn valid-password? [password]
  (= password "abc13cba524"))

(defn app []
  [:form {:class "sample-form"}
   [:div.form-group
    [:label "Email address"]
    [:input {:class       "form-control"
             :type        "email"
             :placeholder "Enter email"}]

    [:small {:class "form-text text-muted"}
     "We'll never share your email with anyone else."]]

   [:div.form-group
    [:label "Password"]
    [:input {:class       "form-control"
             :type        "password"
             :placeholder "Password"}]]
   [:div {:class "form-group"}
    [:input {:type "checkbox"}]
    [:label "Check me out"]]
   [:button.btn.btn-primary {:type "submit"} "Submit"]])
(ns forms.core
  (:require [re-frame.core :as f]
            [reagent.core :as r]))

(f/reg-event-db :init
                (fn [db event-vector]
                  (println "her er input til eventen" event-vector)))


(r/render-component [:div "tjohei"]
                    (.getElementById js/document "app"))

(f/dispatch [:init (rand-int 200)])
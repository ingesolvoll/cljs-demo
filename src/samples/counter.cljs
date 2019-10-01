(ns samples.counter
  (:require [samples.re-frame :as f]))

(f/reg-event-db :go-up
                (fn [db _]
                  (update db :the-number inc)))

(f/reg-event-db :go-down
                (fn [db _]
                  (update db :the-number rand-int)))

(f/reg-sub :the-number
           (fn [db] (get db :the-number)))

(f/reg-sub :dependent-number
           (fn [_]
              (f/subscribe [:the-number]))
           (fn [n]
             (println "do something with " n)
             n))

(defn app []
  [:div {:class "buttons-container"}
   [:button {:on-click #(f/dispatch [:go-up])} "-"]
   [:button {:on-click #(f/dispatch [:go-down])} "+"]
   [:div
    @(f/subscribe [:the-number])

    ;@(f/subscribe [:dependent-number])
    ]])
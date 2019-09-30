(ns samples.counter
  (:require [samples.re-frame :as f]
            [reagent.core :as r]))

(f/reg-event-db :init
                (fn [db [_ n]]
                  (assoc db :the-number n)))

(f/reg-event-db :go-up
                (fn [db _]
                  (update db :the-number inc)))

(f/reg-event-db :go-down
                (fn [db _]
                  (update db :the-number rand-int)))

(f/reg-sub :the-number
           (fn [db] (get db :the-number)))

(defn app []
  (r/with-let [the-number (f/subscribe [:the-number])
               _          (f/dispatch [:init 5])]
    [:div {:class "buttons-container"}
     [:button {:on-click #(f/dispatch [:go-up])} "-"]
     [:button {:on-click #(f/dispatch [:go-down])} "+"]
     [:div
      @the-number]]))
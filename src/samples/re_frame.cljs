(ns samples.re-frame
  (:require [re-frame.core :as f]))

;; This namespace is used for any shared overrides we want on re-frame

(defn reg-event-db [id handler]
  (f/reg-event-db id [f/debug] handler))

(defn dispatch [e]
  (f/dispatch e))

(def subscribe f/subscribe)
(def reg-sub f/reg-sub)

(f/set-loggers!
 {:warn (fn [& args]
          (when-not (re-find #"^re-frame: overwriting" (first args))
            (apply js/console.warn args)))})
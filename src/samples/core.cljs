(ns ^:figwheel-hooks samples.core
  (:require [re-frame.core :as rf]
            [samples.counter :as counter]
            [samples.multiplication :as multiplication]
            [reagent.core :as r]))

(enable-console-print!)

(defn ^:after-load render []
  (rf/clear-subscription-cache!)
  (r/render-component [counter/app]
                      (.getElementById js/document "app")))

(render)
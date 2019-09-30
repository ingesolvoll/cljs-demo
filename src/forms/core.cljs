(ns ^:figwheel-hooks forms.core
  (:require [re-frame.core :as rf]
            [forms.counter :as counter]
            [forms.multiplication :as multiplication]
            [reagent.core :as r]))

(enable-console-print!)

(defn ^:after-load render []
  (rf/clear-subscription-cache!)
  (r/render-component [multiplication/app]
                      (.getElementById js/document "app")))

(render)
(ns forms.core
  (:require [forms.re-frame :as f]
            [forms.counter :as counter]
            [reagent.core :as r]))

(r/render-component [counter/counter-app]
                    (.getElementById js/document "app"))
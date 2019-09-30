(defproject cljs-demo "0.1.0-SNAPSHOT"

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.520"]
                 [reagent "0.9.0-rc1"]
                 [re-frame "0.11.0-rc1"]]

  :resource-paths ["resources" "target"]

  :clean-targets ^{:protect false} ["target/public"]

  :profiles {:dev
             {:dependencies
              [[com.bhauman/figwheel-main "0.2.3"]
               [com.bhauman/rebel-readline-cljs "0.1.4"]]}}

  :aliases {"fig"      ["trampoline" "run" "-m" "figwheel.main"]
            "fig:prod" ["trampoline" "run" "-m" "figwheel.main" "-O" "advanced" "-b" "samples" "-s"]
            "fig:dev"  ["trampoline" "run" "-m" "figwheel.main" "-b" "samples" "-r"]})
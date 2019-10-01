(ns samples.forms-test
  (:require [cljs.test :refer [deftest is]]
            [samples.forms :as forms]))

(deftest learning-the-api

  (is (= 1 2))

  (is (= []
         (filter even? [1 2 3])
         (filter odd? [1 2 3])))

  (is (= [1 2 3] (map inc [1 2 3])))

  (is (true? (or 1 2)))

  (is (true? (and 1 2 3 4)))

  (is (= "Denne verdien må rettes"
         (let [test-map {:my-key  "joda"
                         "key" "her ja"}]
           (:my-key test-map)))))

(deftest username-validation
  (is (not (forms/valid-username? "user@domain")))

  (is (forms/valid-username? "gyldig@epost.no")))

(deftest password-validation

  (is (not (forms/valid-password? "nei")))

  (is (forms/valid-password? "ab13ba524")))

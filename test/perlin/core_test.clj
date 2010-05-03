(ns perlin.core-test
  (:import (perlin Reference))
  (:use [perlin.core] :reload-all)
  (:use [clojure.test]))

(deftest test-fade
  (is (= (fade 0.0) (. Reference fade 0.0)))
  (is (= (fade -1.0) (. Reference fade -1.0)))
  (is (= (fade 1.5) (. Reference fade 1.5)))
  (is (= (fade 20.0) (. Reference fade 20.0))))

(deftest test-lerp
  (is (= (lerp 0.0 1.0 5.0) (. Reference lerp 0.0 1.0 5.0)))
  (is (= (lerp 1.0 1.0 5.0) (. Reference lerp 1.0 1.0 5.0)))
  (is (= (lerp 0.5 1.0 5.0) (. Reference lerp 0.5 1.0 5.0)))
  (is (= (lerp -0.5 1.0 5.0) (. Reference lerp -0.5 1.0 5.0)))
  (is (= (lerp 20.0 1.0 5.0) (. Reference lerp 20.0 1.0 5.0))))

(deftest test-grad
  (is (= (grad 16 1.1 2.2 3.3) (. Reference grad 16 1.1 2.2 3.3))) ; h 0
  (is (= (grad 15 1.1 2.2 3.3) (. Reference grad 15 1.1 2.2 3.3))) ; h 15
  (is (= (grad 4 1.1 2.2 3.3) (. Reference grad 4 1.1 2.2 3.3))) ; h 4
  (is (= (grad 12 1.1 2.2 3.3) (. Reference grad 12 1.1 2.2 3.3))) ; h 12
  (is (= (grad 14 1.1 2.2 3.3) (. Reference grad 14 1.1 2.2 3.3))) ; h 14
  (is (= (grad 11 1.1 2.2 3.3) (. Reference grad 11 1.1 2.2 3.3))) ; h 11
  (is (= (grad 1 1.1 2.2 3.3) (. Reference grad 1 1.1 2.2 3.3))) ; h 1
  (is (= (grad 2 1.1 2.2 3.3) (. Reference grad 2 1.1 2.2 3.3))) ; h 2
  (is (= (grad 3 1.1 2.2 3.3) (. Reference grad 3 1.1 2.2 3.3))) ; h 3
)

(deftest test-noise
  (is (= (noise 1.1 1.2 1.3) (. Reference noise 1.1 1.2 1.3)))
  (is (= (noise 1.1 1.12 1.3) (. Reference noise 1.1 1.12 1.3))))
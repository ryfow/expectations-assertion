(ns expectations-assertion.core-test
  (:use expectations)
  (:use expectations-assertion.core))

(expect "Hello, Ryan" (binding [*name* "Ryan"] (say-hello)))

(expect "Hello, Ryan" (say-hello))


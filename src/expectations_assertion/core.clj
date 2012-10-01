(ns expectations-assertion.core)

(def ^:dynamic *name* nil)

(defn say-hello
  "I don't do a whole lot."
  []
  (assert *name* "*name* needs to be bound.")
  (str "Hello, " *name*))

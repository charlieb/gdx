(ns gdx.core.desktop-launcher
  (:require [gdx.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl3 Lwjgl3Application]
           [com.badlogic.gdx.backends.lwjgl3 Lwjgl3ApplicationConfiguration]
           )
  (:gen-class))

(defn -main []
  (let [config (Lwjgl3ApplicationConfiguration.)]
    (Lwjgl3Application. (gdx.core.Game.) config))
  )


(ns gdx.input
  (:import [com.badlogic.gdx Gdx InputProcessor Input$Keys]))

(gen-class
  :name gdx.input.Input
  :extends com.badlogic.gdx.InputProcessor)

(def input-processor
  (proxy [InputProcessor] []
      (keyDown [keycode]
        (if (.isKeyPressed Gdx/input Input$Keys/LEFT) (println "LEFT") (println "NONE"))
        true)
      (keyTyped [character] (println character) true)
      (keyUp [keycode] 
        (println "KEYUP")
        true)
      (touchDown [screenX screenY pointer button] (println "mouseDown") true)
      (touchUp [screenX screenY pointer button] (println "mouseUp") true)
      (touchDragged [screenX screenY button] (println "mouseDragged") true)
      (mouseMoved [screenX screenY] (println screenX "," screenY) true)
      
      ))

(defproject gdx "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[com.badlogicgames.gdx/gdx "1.9.14"]
                 [com.badlogicgames.gdx/gdx-backend-lwjgl3 "1.9.14"]
                 [com.badlogicgames.gdx/gdx-platform "1.9.14"
                  :classifier "natives-desktop"]
                 [org.clojure/clojure "1.10.1"]]
  :source-paths ["src" "src-common"]
  :aot [gdx.core.desktop-launcher]
  :main gdx.core.desktop-launcher
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})

(defproject todo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [lein-cljfmt "0.5.7"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [ring/ring-devel "1.6.3"]
                 [ring/ring-json "0.4.0"]
                 [korma "0.4.3"]
                 [org.postgresql/postgresql  "9.2-1002-jdbc4"]
                 [compojure "1.1.6"]
                 ]

  :plugins [
            [lein-cljfmt "0.5.7"]
            [lein-ring "0.12.3"]
            ]
  :ring {
         :handler todo.app/app
         }
  :main ^:skip-aot todo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

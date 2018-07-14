(defproject data-wizard "0.1.0-SNAPSHOT"
  :description "My Cool Project"
  :license {:name "MIT" :url "https://opensource.org/licenses/MIT"}
  :min-lein-version "2.7.0"
  :jvm-opts ["-Xmx1G"]
 :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946"]
                 [fulcrologic/fulcro "2.3.1"]
                 [fulcrologic/fulcro-spec "2.0.3-1" :scope "test" :exclusions [fulcrologic/fulcro]]

                ;; Deep Learning 4j clojure wrapper

                [hswick/jutsu.ai "0.1.5"]
                [org.nd4j/nd4j-native-platform "1.0.0-beta"]

                ;; Threadpool
;                https://github.com/TheClimateCorporation/claypoole
;; Pretty printing
;;                 [fipp "0.6.12"]

;;smile libraries
                 [com.github.haifengl/smile-core "1.5.1"]

                 [com.github.haifengl/smile-plot "1.5.1"]

                 [com.github.haifengl/smile-netlib "1.5.1"]

                 [com.github.haifengl/smile-nlp "1.5.1"]

;; Graph datastructures

                 [aysylu/loom "1.0.1"]
                 [ubergraph "0.4.0"]
                 [instaparse "1.4.8"]
                 [net.cgrand/xforms "0.16.0"]
                 [net.cgrand/seqexp "0.6.2"]
                 [clj-pdf "2.2.31"]
;;                [yogthos/config "1.1.1"]

;; String manipulation
                [funcool/cuerdas "2.0.5"]



;; github api - raises error of fileNotFound for the clj-http class
;               [tentacles "0.5.1"]


                [potemkin "0.4.4"]

;; HTTP-kit
;; TODO make a HackerRank / Reddit client in Clojure
                [http-kit "2.2.0"]


;; BigML api https://github.com/bigmlcom/clj-bigml
                [bigml/clj-bigml "0.3.0"]


;; Telegram api

                [morse "0.4.0"]


;; For TOML
                 [toml "0.1.2"]

;; For YAML
                 [io.forward/yaml "1.0.7"]


;; For Markdown

                [net.steppschuh.markdowngenerator/markdowngenerator "1.3.0.0"]
                [markdown-clj "1.0.2"]


;; Asciidoc
                [org.asciidoctor/asciidoctorj "1.5.6"]

;; Spirit from zcaudate
;                 [zcaudate/spirit.data.atom "0.8.0"]
;                 [zcaudate/spirit.data.cache "0.8.0"]
;                 [zcaudate/spirit.data.exchange "0.8.0"]
;                 [zcaudate/spirit.data.pipeline "0.8.0"]
;                 [zcaudate/spirit.data.schema "0.8.0"]
;                 [zcaudate/spirit.data.table "0.8.0"]

;; Check these
;                 [zcaudate/spirit.datomic "0.8.0"]
; [zcaudate/spirit "0.8.0"]


;                 <groupId>edu.princeton.cs</groupId> <artifactId>algs4</artifactId> <version>1.0.3</version>

;                 [edu.princeton.cs/algs4 "1.0.3"]


;; apache spark
;                 [yieldbot/flambo "0.8.2"]
; powderkeg
;                 [hcadatalab/powderkeg "0.5.1"]
;                 [com.esotericsoftware/kryo-shaded "4.0.0"]  ;; For Spark 2.x support
;                [org.apache.spark/spark-core_2.11 "2.1.0"]
;                [org.apache.spark/spark-streaming_2.11 "2.1.0"]


;; Neural networks
                 [thinktopic/cortex "0.9.22"]

                 [net.mikera/core.matrix "0.62.0"]
;                 [net.mikera/vectorz-clj "0.47.0"]
                 [uncomplicate/fluokitten "0.6.1"]
;                 [funcool/cats "2.2.0"]


;; Genetics - TBD as a wrapper

                 [io.jenetics/jenetics "4.1.0"]

; com.amihaiemil.ai eva 1.1.0
;                https://github.com/lspector/Clojush
;                https://github.com/GMUEClab/ecj
;               https://github.com/jeffheaton/aifh
;               net.sf.tweety tweety-full 1.10
;               https://github.com/neuroph/neuroph
;                https://watchmaker.uncommons.org/


;; Eclipse collections

;                 [org.eclipse.collections/eclipse-collections "9.1.0"]
;; Google Guice
;                [com.google.guava/guava "16.0.1"]



;; GUI
                 [halgari/fn-fx "0.4.0"]
                 [seesaw "1.4.5"]

;; fulcro already has it.
                 [com.cognitect/transit-clj "0.8.300"]

;; Datomic
                 [com.datomic/datomic-free "0.9.5656"]

;                [com.datomic/datomic-pro "0.9.5661"]
;                [com.datomic/client-pro "0.8.14"]

;; Janus graph
;; Can also use jaunt in the _zipped_archives directory
;                http://titanium.clojurewerkz.org/articles/guides.html
;                [clojurewerkz/ogre "3.3.0.0"]
;                [org.janusgraph/janusgraph-all "0.2.0"]
;                [clojurewerkz/elastisch "3.0.0"]
;                https://github.com/mpenet/spandex


                 [sparkledriver "0.2.2"]

                 [io.github.bonigarcia/webdrivermanager "2.1.0"]
                 [webica "3.0.0-beta2-clj0"]

                [com.gfredericks/test.chuck "0.2.8"]
                [com.velisco/strgen "0.1.5"]

;; HTML parsing and templating stuff

                [enlive "1.1.6"]
                [hickory "0.7.1"]
                [hiccup "1.0.5"]

                 [metasoarous/oz "1.2.2"]

;; Utils 
                 [zcaudate/hara "2.8.2"]
                 [zcaudate/lucid "1.4.4"]

                 [environ "1.1.0"]
;; Parallel functions
;                https://github.com/reborg/parallel
                 [org.onyxplatform/onyx "0.12.7"]

;; For remote data access - haxl
;                 [muse2/muse "0.4.4"]
;                 [com.walmartlabs/lacinia "0.25.0"]
;                [funcool/urania "0.1.0"]


;; This is for traversing the nested clojure data structure
                 [com.rpl/specter "1.0.3"]

;; Utility for traversing CLJ(S) data structures
                 [medley "1.0.0"]


;; XML trees
[org.clojure/data.xml "0.2.0-alpha5"]
[org.clojure/data.zip "0.1.2"]

;; CSV
[org.clojure/data.csv "0.1.4"]
[semantic-csv "0.2.1-alpha1"]

;; Random data generators
[org.clojure/data.generators "0.1.2"]


;; Combinatorics
[org.clojure/math.combinatorics "0.1.4"]

;; Quickcheck
                 [org.clojure/test.check "0.10.0-alpha2"]

                 [fullcontact/full.async "1.0.0"]
                 [org.clojure/core.async "0.4.474"]
;; Unix4j
                 ;[org.unix4j/unix4j-command "0.5"]

;; Emails via clojrue
                [com.draines/postal "2.0.2"]


                 [org.clojure/core.match "0.3.0-alpha5"]

;; Documentation using marginalia
                 [lein-marginalia "0.9.0"]

;; Boot documenataion tool Codox
                 [lein-codox "0.10.3"]

;; Shell library
                 [me.raynes/conch "0.8.0"]

                 [org.clojars.turbopape/milestones "1.0.1"]
;; JSON
                 [cheshire "5.8.0"]

;; PostgreSQL
                 [honeysql "0.9.1"]
                 [nilenso/honeysql-postgres "0.2.3"]

                [com.layerware/hugsql "0.4.8"]
                [org.postgresql/postgresql "42.1.4"]

;; H2
                 [org.clojure/java.jdbc "0.7.5"]
                 [com.h2database/h2 "1.4.196"]

;; MapDB - causes error
;                 [spicerack "0.1.4"]
;                 [org.mapdb/mapdb "3.0.5" :exclusions [com.google.guava/guava]]
;                 [org.mapdb/mapdb "3.0.5"]



;; Need to be used with Localstack
;                 [amazonica "0.3.121"]

                 ]

  :uberjar-name "data_wizard.jar"

  :source-paths ["src/main"]
  :test-paths ["src/test"]
  :clean-targets ^{:protect false} ["target" "resources/public/js" "resources/private"]

  ; Notes  on production build:
  ; To limit possible dev config interference with production builds
  ; Use `lein with-profile production cljsbuild once production`
  :cljsbuild {:builds [{:id           "production"
                        :source-paths ["src/main"]
                        :jar          true
                        :compiler     {:asset-path    "js/prod"
                                       :main          data-wizard.client-main
                                       :optimizations :advanced
                                       :source-map    "resources/public/js/data_wizard.js.map"
                                       :output-dir    "resources/public/js/prod"
                                       :output-to     "resources/public/js/data_wizard.js"}}]}

  :profiles {:uberjar    {:main           data-wizard.server-main
                          :aot            :all
                          :jar-exclusions [#"public/js/prod" #"com/google.*js$"]
                          :prep-tasks     ["clean" ["clean"]
                                           "compile" ["with-profile" "production" "cljsbuild" "once" "production"]]}
             :production {}
             :dev        {:source-paths ["src/dev" "src/main" "src/test" "src/cards"]

                          :jvm-opts     ["-XX:-OmitStackTraceInFastThrow" "-client" "-XX:+TieredCompilation" "-XX:TieredStopAtLevel=1"
                                         "-Xmx1g" "-XX:+UseConcMarkSweepGC" "-XX:+CMSClassUnloadingEnabled" "-Xverify:none"]

                          :doo          {:build "automated-tests"
                                         :paths {:karma "node_modules/karma/bin/karma"}}

                          :figwheel     {:css-dirs ["resources/public/css"]}

                          :test-refresh {:report       fulcro-spec.reporters.terminal/fulcro-report
                                         :with-repl    true
                                         :changes-only true}

                          :cljsbuild    {:builds
                                         [{:id           "dev"
                                           :figwheel     {:on-jsload "cljs.user/mount"}
                                           :source-paths ["src/dev" "src/main"]
                                           :compiler     {:asset-path           "js/dev"
                                                          :main                 cljs.user
                                                          :optimizations        :none
                                                          :output-dir           "resources/public/js/dev"
                                                          :output-to            "resources/public/js/data_wizard.js"
                                                          :preloads             [devtools.preload fulcro.inspect.preload]
                                                          :source-map-timestamp true}}
                                          {:id           "i18n" ;for gettext string extraction
                                           :source-paths ["src/main"]
                                           :compiler     {:asset-path    "i18n"
                                                          :main          data-wizard.client-main
                                                          :optimizations :whitespace
                                                          :output-dir    "target/i18n"
                                                          :output-to     "target/i18n.js"}}
                                          {:id           "test"
                                           :source-paths ["src/test" "src/main"]
                                           :figwheel     {:on-jsload "data-wizard.client-test-main/client-tests"}
                                           :compiler     {:asset-path    "js/test"
                                                          :main          data-wizard.client-test-main
                                                          :optimizations :none
                                                          :output-dir    "resources/public/js/test"
                                                          :output-to     "resources/public/js/test/test.js"
                                                          :preloads      [devtools.preload]}}
                                          {:id           "automated-tests"
                                           :source-paths ["src/test" "src/main"]
                                           :compiler     {:asset-path    "js/ci"
                                                          :main          data-wizard.CI-runner
                                                          :optimizations :none
                                                          :output-dir    "resources/private/js/ci"
                                                          :output-to     "resources/private/js/unit-tests.js"}}
                                          {:id           "cards"
                                           :figwheel     {:devcards true}
                                           :source-paths ["src/main" "src/cards"]
                                           :compiler     {:asset-path           "js/cards"
                                                          :main                 data-wizard.cards
                                                          :optimizations        :none
                                                          :output-dir           "resources/public/js/cards"
                                                          :output-to            "resources/public/js/cards.js"
                                                          :preloads             [devtools.preload]
                                                          :source-map-timestamp true}}]}

                          :plugins      [[lein-cljsbuild "1.1.7"]
                                         [lein-doo "0.1.7"]
                                         [com.jakemccrary/lein-test-refresh "0.21.1"]]

                          :dependencies [[binaryage/devtools "0.9.9"]
                                         [fulcrologic/fulcro-inspect "2.0.0"]
                                         [org.clojure/tools.namespace "0.3.0-alpha4"]
                                         [org.clojure/tools.nrepl "0.2.13"]
                                         [com.cemerick/piggieback "0.2.2"]
                                         [lein-doo "0.1.7" :scope "test"]
                                         [figwheel-sidecar "0.5.15" :exclusions [org.clojure/tools.reader]]
                                         [devcards "0.2.4" :exclusions [cljsjs/react cljsjs/react-dom]]]
                          :repl-options {:init-ns          user
                                         :nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}})

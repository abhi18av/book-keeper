(defproject book-keeper "0.1.0-SNAPSHOT"

  :description "A clojure repl for managing my personal e-library"

  :url "https://github.com/abhi18av/book-keeper"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}


;; Install the peer library by running ./bin/maven-install from the datomic-free/pro root folder
  :repositories {"my.datomic.com" {:url "https://my.datomic.com/repo"
                                 :creds :gpg}}
  :dependencies [
                 [org.clojure/clojure "1.9.0"]

  ;; Datomic free and pro
                 [com.datomic/datomic-free "0.9.5703"]
                 [com.datomic/datomic-pro "0.9.5703"]

  ;; Rules engine

                 [com.cerner/clara-rules "0.18.0"]

  ;; zcaudate
                 [zcaudate/spirit "0.9.0"]
                 [zcaudate/hara "2.8.6"]
                 [zcaudate/lucid "1.4.6"]


  ;; Github java api

  ;; This is for traversing the nested clojure data structure
                 [com.rpl/specter "1.0.3"]

  ;; Utility for traversing CLJ(S) data structures
                 [medley "1.0.0"]


  ;; JSON
                 [cheshire "5.8.0"]

  ;; XML trees
                 [org.clojure/data.xml "0.2.0-alpha5"]
                 [org.clojure/data.zip "0.1.2"]

  ;; CSV
                 [org.clojure/data.csv "0.1.4"]


  ;; For TOML
                 [toml "0.1.2"]

  ;; For YAML
                 [io.forward/yaml "1.0.7"]

  ;; Data Serialization
                 [com.cognitect/transit-clj "0.8.300"]

  ;; Shell library
                 [me.raynes/conch "0.8.0"]



  ])

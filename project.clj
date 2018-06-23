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


  [com.datomic/datomic-free "0.9.5703"]


  [com.datomic/datomic-pro "0.9.5703"]

  ;; Rules engine
  ;[com.cerner/clara-rules "0.18.0"]
  ])

(require '[clojure.java.jdbc :as j])

;; there are many ways to write a db-spec but the easiest way is to
;; use :dbtype and then provide the :dbname and any of :user, :password,
;; :host, :port, and other options as needed:
(def mysql-db {:dbtype "mysql"
               :dbname "clojure_test"
               :user "clojure_test"
               :password "clojure_test"})

(def pg-db {:dbtype "postgresql"
            :dbname "mypgdatabase"
            :host "mydb.server.com"
            :user "myuser"
            :password "secret"
            :ssl true
            :sslfactory "org.postgresql.ssl.NonValidatingFactory"})

;; if the dbtype is not known to clojure.java.jdbc, or you want to override the
;; default choice of JDBC driver class name, you can provide :classname and the
;; name of the class to use:

(def redshift42 {:dbtype "redshift"
                 :dbname "myredstore"
                 :classname "com.amazon.redshift.jdbc42.Driver"
                 ...})

;; you can also specify a full connection string if you'd prefer:
(def pg-uri
  {:connection-uri (str "postgresql://myuser:secret@mydb.server.com:5432/mypgdatabase"
                        "?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory")})

(j/insert-multi! mysql-db :fruit
  [{:name "Apple" :appearance "rosy" :cost 24}
   {:name "Orange" :appearance "round" :cost 49}])
;; ({:generated_key 1} {:generated_key 2})

(j/query mysql-db
  ["select * from fruit where appearance = ?" "rosy"]
  {:row-fn :cost})
;; (24)

(require '[neo4j-clj.core :as db])

;; first of all, connect to a Neo4j instance using URL, user and password credentials.
;; Remember not to check in credentials into source code repositories, but use environment variables
;; instead.

(def local-db
  (db/connect "bolt://localhost:7687" "neo4j" "password"))

(db/defquery delete-all-users
  "match (u:user) delete u")

;; Using a transaction
(db/with-transaction local-db tx
  (delete-all-users tx))

;; We're big fans of using Strings to represent Cypher queries, and not wrap Cypher into some
;; other data structure to make things more complicated then necessary. So simply defquery your query...

(db/defquery create-user
  "CREATE (u:user $user)")

;; ... and you'll get a function `create-user` to call with a session and the parameters. See below.

;; Define any other queries you'll need. I'd suggest to keep all the Cypher queries in a separate namespace,
;; but hey, that's up to you.

;; Using a session
(with-open [session (db/get-session local-db)]
  (create-user session {:user {:firstName "Anakin" :middleName "Darth Vader" :lastName "Skywalker"}}))

;; Using a session
(with-open [session (db/get-session local-db)]
  (create-user session {:user {:firstName "Luke" :lastName "Skywalker"}}))

;; Using a session
(with-open [session (db/get-session local-db)]
  (create-user session {:user {:firstName "Babu" :middleName '"Artengo" ':lastName "Fett"}}))

;; Using a session
(with-open [session (db/get-session local-db)]
  (create-user session {:user {:firstName "Boba" :middleName '"Django" ':lastName "Fett"}}));; Using a transaction

(db/defquery get-all-users
  "MATCH (u:user) RETURN u as user")


(db/with-transaction local-db tx
  (get-all-users tx)) ;; => ({:user {:first-name "Luke", :last-name "Skywalker"}}))

;;;;

(db/defquery get-users-by-middlename
  "MATCH (u:User {middleName: $middleName}) RETURN u as user")

(db/with-transaction local-db tx
  ;(get-users-by-middlename tx {:middleName "Darth Vader"}))
  ;(get-users-by-middlename tx {:middleName "\"Darth Vader\""}))
  (get-users-by-middlename tx {:middleName """Darth Vader"""}))

(db/defquery get-users-by-firstname
  "MATCH (u:User {firstName: $firstName}) RETURN u as user")

(db/with-transaction local-db tx
  (get-users-by-firstname tx {:firstName "Anakin"}))

;;;;

(db/defquery get-darth-vader
  "MATCH (user {middleName: \"Darth Vader\"}) RETURN user")

(db/with-transaction local-db tx
  (get-darth-vader tx))



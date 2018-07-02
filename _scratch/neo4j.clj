(require '[neo4j-clj.core :as db])

;; first of all, connect to a Neo4j instance using URL, user and password credentials.
;; Remember not to check in credentials into source code repositories, but use environment variables
;; instead.

(def local-db
  (db/connect "bolt://localhost:7687" "neo4j" "password"))

;; We're big fans of using Strings to represent Cypher queries, and not wrap Cypher into some
;; other data structure to make things more complicated then necessary. So simply defquery your query...

(db/defquery create-user
  "CREATE (u:user $user)")

;; ... and you'll get a function `create-user` to call with a session and the parameters. See below.

;; Define any other queries you'll need. I'd suggest to keep all the Cypher queries in a separate namespace,
;; but hey, that's up to you.

(db/defquery get-all-users
  "MATCH (u:user) RETURN u as user")

  ;; Using a session
(with-open [session (db/get-session local-db)]
  (create-user session {:user {:firstName "Anakin" :middleName "\"Darth Vader\"" :lastName "Skywalker"}}))


;; Using a session
(with-open [session (db/get-session local-db)]
  (create-user session {:user {:first-name "Luke" :last-name "Skywalker"}}))

(with-open [session (db/get-session local-db)]
(create-user session {:user {:firstName "Luke" :lastName "Skywalker"}}))

;; Using a session
(with-open [session (db/get-session local-db)]
  (create-user session {:user {:first-name "Babu" :middle-name '"Django 2"' :last-name "Fett"}}))




  ;; Using a transaction
(db/with-transaction local-db tx
  (get-all-users tx)) ;; => ({:user {:first-name "Luke", :last-name "Skywalker"}}))


(db/with-transaction local-db tx
  ("MATCH (u:user) RETURN u as user" tx)) ;; => ({:user {:first-name "Luke", :last-name "Skywalker"}}))

(db/defquery get-darth-vader
  "MATCH (u:user) RETURN u as user")



(db/with-transaction local-db tx
  ("MATCH (user {middleName: '\"Darth Vader\"'}) RETURN user" tx)) ;; => ({:user {:first-name "Luke", :last-name "Skywalker"}}))


(db/with-transaction local-db tx
  ("MATCH (cloudAtlas {title: '\"Cloud Atlas\"'}) RETURN cloudAtlas" tx))


;; TODO: Get this to work with escaped strings
(db/with-transaction local-db tx
  ("MATCH (user {firstName: """\"Anakin\""""}) RETURN user" tx)) ;; => ({:user {:first-name "Luke", :last-name "Skywalker"}}))




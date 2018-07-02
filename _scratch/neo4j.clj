(require '[neo4j-clj.core :as db])

(def local-db
  (db/connect "bolt://localhost:7687" "neo4j" "password"))

(db/defquery delete-all-users
  "match (u:user) delete u")

(db/with-transaction local-db tx
  (delete-all-users tx))


(db/defquery create-user
  "CREATE (u:user $user)")

(with-open [session (db/get-session local-db)]
  (create-user session {:user {:firstName "Anakin" :middleName "\"Darth Vader\"" :lastName "Skywalker"}}))

(with-open [session (db/get-session local-db)]
  (create-user session {:user {:firstName "Boba" :middleName "Django" :lastName "Fett"}}))

(db/defquery get-all-users
  "MATCH (u:user) RETURN u as user")


(db/with-transaction local-db tx
  (get-all-users tx))

;;;;

(db/defquery get-users-by-middlename
  "MATCH (u:user {middleName: $middleName}) RETURN u as user")

(db/with-transaction local-db tx
  (get-users-by-middlename tx {:middleName "\"Darth Vader\""}))

(with-open [session (db/get-session local-db)]
  (get-users-by-middlename session {:middleName "\"Darth Vader\""}))


;;;;

(db/defquery get-darth-vader
  "MATCH (user {middleName: \"Darth Vader\"}) RETURN user")

(db/with-transaction local-db tx
  (get-darth-vader tx))


;;;;


(db/defquery get-users-by-firstname
  "MATCH (u:User {firstName: $firstName}) RETURN u as user")


(db/with-transaction local-db tx
  (get-users-by-firstname tx {:firstName "Anakin"}))

;;;; first name

(db/defquery get-users-by-firstname
  "MATCH (u:user {firstName: $firstName}) RETURN u as user")

(db/with-transaction local-db tx
 (get-users-by-firstname tx {:firstName "Anakin"}))

(with-open [session (db/get-session local-db)]
 (get-users-by-firstname session {:firstName "Anakin"}))



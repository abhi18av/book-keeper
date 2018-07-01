(require '[pandect.algo.sha1 :refer :all])

(sha1 "Hello World!")                      ;; => "2ef7bde608ce5404e97d5f042f95f89f1c232871"
(sha1 (.getBytes "Hello World!" "UTF-8"))  ;; => "2ef7bde608ce5404e97d5f042f95f89f1c232871"
(sha1 (File. "../project.clj"))               ;; => "ff3b4565652aeb835edf2715b2a28586929ea4cc"
(sha1 (FileInputStream. "project.clj"))    ;; => "ff3b4565652aeb835edf2715b2a28586929ea4cc"

;; more variants
(sha1-bytes "Hello World!")                ;; => #<byte[] [B@5293b95>
(sha1-file "project.clj")                  ;; => "ff3b4565652aeb835edf2715b2a28586929ea4cc"
(sha1-file-bytes "project.clj")            ;; => #<byte[] [B@e2606c7>

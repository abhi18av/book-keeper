;; I'll start dealing with the ebooks in a directory


(use 'hara.reflect)

(use 'lucid.mind)

(use 'clojure.pprint)
                                        ; http://www.unix4j.org/javadoc/0.5/index.html
(import org.unix4j.Unix4j )


(import org.unix4j.unix.Ls)

(org.unix4j.unix.Ls )

(class-hierarchy org.unix4j.unix.Ls)

(class-info org.unix4j.unix.Ls)


(.* org.unix4j.unix.Ls :name #"")


(def unix-ls (new org.unix4j.unix.Ls))


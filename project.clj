(defproject cn.leancloud/korma "0.8.0"
  :description "Tasty SQL for Clojure"
  :url "http://github.com/korma/Korma"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :mailing-list {:name      "Korma Google Group"
                 :subscribe "https://groups.google.com/group/sqlkorma"}
  :codox {:exclude                   [korma.sql.engine
                                      korma.sql.fns
                                      korma.sql.utils]
          :src-dir-uri               "https://github.com/korma/Korma/blob/master/"
          :src-linenum-anchor-prefix "L"}

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.mchange/c3p0 "0.9.5.5"]
                 [org.clojure/java.jdbc "0.7.11"]]

  :min-lein-version "2.0.0"

  :profiles {:dev  {:dependencies [[gui-diff "0.6.6"]
                                   [postgresql "9.3-1102.jdbc41"]
                                   [slamhound "1.5.5"]
                                   [criterium "0.4.3"]]
                    :plugins      [[codox "0.8.12"]
                                   [jonase/eastwood "0.2.1"]
                                   [lein-localrepo "0.5.3"]]}
             :test {:dependencies [[mysql/mysql-connector-java "8.0.21"]
                                   [com.h2database/h2 "1.4.187"]
                                   [criterium "0.4.3"]]}
             :1.4  {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5  {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.6  {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7  {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8  {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :1.9  {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :1.10 {:dependencies [[org.clojure/clojure "1.10.1"]]}}
  :aliases {"run-tests" ["with-profile" "1.4:1.5:1.6:1.7:1.8:1.9:1.10" "test"]
            "slamhound" ["run" "-m" "slam.hound"]}
  :jvm-opts ["-Dline.separator=\n"])

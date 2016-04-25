(defproject clj-saml-adfs "1.0.0"
  :description "Simplest SAML 2.0 auth that works with ADFS"
  :url "https://github.com/altV/clj-adfs-saml"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src"]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [clj-time "0.11.0"]
                 [ring "1.4.0"]
                 [org.apache.santuario/xmlsec "2.0.4"]
                 [compojure "1.5.0"]
                 [environ "1.0.2"]
                 [org.opensaml/opensaml "2.6.4"]
                 [org.clojure/data.xml "0.0.7"]
                 [org.clojure/data.codec "0.1.0"]
                 [org.clojure/data.zip "0.1.1"]
                 [org.vlacs/helmsman "1.0.0-alpha5"]]
  :pedantic :warn
  :profiles {:dev {:source-paths ["dev" "test"]
                   :dependencies [[org.clojure/tools.namespace "0.2.10"]
                                  [org.clojure/tools.nrepl "0.2.3"]
                                  [hiccup "1.0.5"]
                                  [http-kit "2.1.18"]]}})

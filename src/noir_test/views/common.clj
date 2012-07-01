(ns noir-test.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css include-js html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "noir-test"]
               (include-css "/css/reset.css")
               (include-css "/css/bootstrap-responsive.min.css")
               (include-css "/css/bootstrap.min.css")
               (include-js "/javascripts/bootstrap.min.js")
               (include-js "/javascripts/bootstrap-responsive.min.css")]
              [:body
               [:div#wrapper
                content]]))

(defpartial site-layout [& content]
  (html5
   (include-js "https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js")
   (include-js "/javascripts/bootstrap.min.js")
   (include-js "/javascripts/bootstrap.js")
   (include-css "/css/bootstrap-responsive.min.css")
   (include-css "/css/bootstrap.min.css")
    [:head
      [:title "Experimenting with Noir"]]
    [:body
      [:div#wrapper
        content]]))

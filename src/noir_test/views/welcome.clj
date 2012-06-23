(ns noir-test.views.welcome
  (:require [noir-test.views.common :as common]
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to noir-test"]))

(defpage "/my-page" []
  (common/site-layout
    [:script {:type "text/javascript"} 
	"$(document).ready(function(){
	  $('#red').css('color','red');
	  $('#clickableThing').click(function(){
		$('#showThing').toggle('slow');
	  });
	  $('#showThing').hide();
					});"]
    [:h1#red "Welcome to my site!"]
    [:p "Hope you like it."]
    [:div#clickableThing "Click this text to see or hide something cool!"]
    [:div#showThing [:img {:src "http://upload.wikimedia.org/wikipedia/en/e/e8/Noir_vol_1.jpg"} ]]))


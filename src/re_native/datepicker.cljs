(ns re-native.datepicker
  (:require [reagent.core :as r]
            [re-frame.core :as re]))

(def react-native-datepicker (js/require "react-native-datepicker"))
(def DatePicker (aget react-native-datepicker "default"))

(assert react-native-datepicker)
(assert DatePicker)

(def date-picker (r/adapt-react-class DatePicker))

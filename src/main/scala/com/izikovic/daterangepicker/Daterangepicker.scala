package com.izikovic.daterangepicker

import org.scalajs.dom
import org.scalajs.jquery._

import scala.scalajs.js

import moment._

import scala.language.implicitConversions

@js.native
trait JQueryDateRangePicker extends js.Object {
  def daterangepicker(options: js.Any, callback: js.Function3[Date, Date, String, Unit]):DateRangePicker = js.native
}

object JQueryDateRangePicker {
  implicit def pimpJQuery(jquery: JQuery) = jquery.asInstanceOf[JQueryDateRangePicker]
}

@js.native
trait DateRangePicker extends js.Object {
  def setStartDate(startDate: Date): Unit = js.native  
  def setEndDate(endDate: Date): Unit = js.native
}

object DateRangePicker {
  import JQueryDateRangePicker._
  
  def apply(element: dom.Element, options: js.Any, callback: js.Function3[Date, Date, String, Unit]) = 
    jQuery(element).daterangepicker(options, callback)
}
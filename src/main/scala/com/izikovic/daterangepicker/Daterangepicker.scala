package com.izikovic.daterangepicker

import org.scalajs.dom
import org.scalajs.jquery._
import scala.scalajs.js

@js.native
trait DateRangePicker extends js.Object {
  def setStartDate(startDate: MomentDate): Unit = js.native  
  def setEndDate(endDate: MomentDate): Unit = js.native
}

object DateRangePicker {
  import JQueryDateRangePicker._
  
  def apply(element: dom.Element, options: js.UndefOr[js.Any], callback: js.UndefOr[js.Function3[MomentDate, MomentDate, String, Unit]]) = 
    jQuery(element).daterangepicker(options, callback)
}
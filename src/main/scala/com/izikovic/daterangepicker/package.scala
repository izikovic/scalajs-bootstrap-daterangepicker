package com.izikovic

import org.scalajs.jquery._
import scala.language.implicitConversions
import scala.scalajs.js

package object daterangepicker {

  @js.native
  trait JQueryDateRangePicker extends js.Object {
    def daterangepicker(options: js.UndefOr[js.Any], callback: js.UndefOr[js.Function3[MomentDate, MomentDate, String, Unit]]): DateRangePicker = js.native
  }

  object JQueryDateRangePicker {
    implicit def jQueryDateRangePicker(jquery: JQuery) = jquery.asInstanceOf[JQueryDateRangePicker]
  }
}
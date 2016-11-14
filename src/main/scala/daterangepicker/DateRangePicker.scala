package daterangepicker

import org.scalajs.dom
import org.scalajs.jquery._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.UndefOr
import scala.scalajs.js.|

@js.native
trait DateRangePickerObj extends js.Object {
  def setStartDate(startDate: MomentDate): Unit = js.native
  def setEndDate(endDate: MomentDate): Unit = js.native
}

trait DateRangePicker {
  def element: dom.Element
  def apply() = jQuery(element).data("daterangepicker").asInstanceOf[DateRangePickerObj]
  def setStartDate(startDate: MomentDate): Unit = this().setStartDate(startDate)
  def setEndDate(endDate: MomentDate): Unit = this().setEndDate(endDate)
}

object DateRangePicker {
  def apply(element: dom.Element,
            options: js.UndefOr[DateRangePickerProperties] = js.undefined,
            callback: js.UndefOr[js.Function3[js.Date, js.Date, String, Unit]] = js.undefined) =
    jQuery(element).daterangepicker(options, callback).asInstanceOf[DateRangePicker]
}

trait Opens
case object Left { override def toString = "left" }
case object Center { override def toString = "center" }
case object Right { override def toString = "right" }

trait Drops
case object Down { override def toString = "down" }
case object Up { override def toString = "up" }

@ScalaJSDefined
class DateRangePickerProperties extends js.Object {
  var startDate: UndefOr[js.Date | String] = js.undefined
  var endDate: UndefOr[js.Date | String] = js.undefined
  var minDate: UndefOr[js.Date | String] = js.undefined
  var maxDate: UndefOr[js.Date | String] = js.undefined
  var dateLimir: UndefOr[js.Object] = js.undefined
  var showDropdowns: UndefOr[Boolean] = js.undefined
  var showWeekNumbers: UndefOr[Boolean] = js.undefined
  var showISOWeekNumbers: UndefOr[Boolean] = js.undefined
  var timePicker: UndefOr[Boolean] = js.undefined
  var timePickerIncrement: UndefOr[Int] = js.undefined
  var timePicker24Hour: UndefOr[Boolean] = js.undefined
  var timePickerSeconds: UndefOr[Boolean] = js.undefined
  var ranges: UndefOr[js.Object] = js.undefined
  var showCustomRangeLabel: UndefOr[Boolean] = js.undefined
  var alwaysShowCalendars: UndefOr[Boolean] = js.undefined
  var opens: UndefOr[Opens] = js.undefined
  var drops: UndefOr[Drops] = js.undefined
  var buttonClasses: UndefOr[js.Array[String]] = js.undefined
  var applyClass: UndefOr[String] = js.undefined
  var cancelClass: UndefOr[String] = js.undefined
  var locale: UndefOr[js.Object] = js.undefined
  var singleDatePicker: UndefOr[Boolean] = js.undefined
  var autoApply: UndefOr[Boolean] = js.undefined
  var linkedCalendars: UndefOr[Boolean] = js.undefined
  var isInvalidDate: UndefOr[js.Function1[js.Date, Boolean]] = js.undefined
  var isCustomDate: UndefOr[js.Function1[js.Date, String | js.Array[String]]] = js.undefined
  var autoUpdateInput: UndefOr[Boolean] = js.undefined
  var parentEl: UndefOr[String] = js.undefined
}

object DateRangePickerProperties {
  def apply() = new DateRangePickerProperties
}
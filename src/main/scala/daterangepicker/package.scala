import org.scalajs.jquery._
import scala.language.implicitConversions
import scala.scalajs.js

package object daterangepicker {
  @js.native
  trait JQueryDateRangePicker extends js.Object {
    def daterangepicker(options: js.UndefOr[js.Any], callback: js.UndefOr[js.Function3[js.Date, js.Date, String, Unit]]): DateRangePicker = js.native
  }

  implicit def jQueryDateRangePicker(jquery: JQuery) = jquery.asInstanceOf[JQueryDateRangePicker]

}
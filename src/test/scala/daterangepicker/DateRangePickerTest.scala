package daterangepicker

import utest._

import scalatags.JsDom.all._
import scala.scalajs.js
import org.scalajs.dom

object DateRangePickerTest extends TestSuite {
  val tests = this{
    "DateRangePicker should create a DRP component out of an input field" - {
      val testinput = input(id := "component", `type` := "text").render
      DateRangePicker(testinput, js.undefined, js.undefined)

      dom.document.appendChild(testinput)

      val elems = dom.document.getElementsByClassName("calendar")
      assert(
        elems.length > 0)
    }
  }
}
package daterangepicker

import utest._

import scalatags.JsDom.all._
import scala.scalajs.js
import org.scalajs.dom

object DateRangePickerTest extends TestSuite {
  val tests = this{
    "DateRangePicker should create a DRP component out of an input field" - {
      val b = body()
      
      val testinput = input(id := "component", `type` := "text").render
      b.render.appendChild(testinput)
      DateRangePicker(testinput)

      dom.document.appendChild(testinput)

      val elems = dom.document.getElementsByClassName("calendar")
      assert(
        elems.length > 0)
    }
  }
}
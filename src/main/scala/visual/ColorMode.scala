package visual
import scalafx.beans.property.IntegerProperty
enum Mode:
  case Dark, Light

object ColorMode:
  val modes: Array[Mode] = Mode.values
  var modeSelection: IntegerProperty = IntegerProperty(0)

  def switch(selection: Int = modeSelection.value + 1): Unit =
    modeSelection.value = modes.length % selection

trait Coloreable:
  def color: Unit

import scalafx.scene.control.Alert
import scalafx.scene.control.Alert.AlertType
import scalafx.scene.control.ButtonType

def sendErrArlert(header: String, msg: String): Alert =
  new Alert(AlertType.Error) {
    title = "Error"
    headerText = header
    contentText = msg
    buttonTypes = Seq(ButtonType("Aceptar"))
  }

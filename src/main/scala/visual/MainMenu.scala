import scalafx.scene.Scene
import scalafx.scene.paint.Color
import scalafx.scene.control.Button
import scalafx.scene.layout.VBox
import scalafx.scene.layout.StackPane
import scalafx.geometry.Pos
import scalafx.stage.Stage

val exitButton = {
  val button = Button("Salir")
  button.onAction = e =>
    button.getScene.getWindow
      .asInstanceOf[Stage]
      .close()
  button
}

def main_menu: Scene = new Scene {
  root = new StackPane {
    fill = Color.RED
    children = {
      val box = VBox(
        10,
        Button("Animales"),
        Button("Contratos"),
        Button("Opciones"),
        exitButton
      )
      box.setAlignment(Pos.CENTER)
      box
    }
  }
}

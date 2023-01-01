import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.scene.layout.VBox
import javafx.stage.Stage
import org.jnativehook.GlobalScreen


class Window : Application(){
    override fun start(primaryStage: Stage) {
        primaryStage.title = "Simple Macro"

        val fxmlConnexionLoader = FXMLLoader(javaClass.getResource("/main.fxml"))
        val connexionScene = fxmlConnexionLoader.load<VBox>()
//        val controller = fxmlConnexionLoader.getController() as MainController

        primaryStage.scene = Scene(connexionScene, connexionScene.prefWidth, connexionScene.prefHeight)
        primaryStage.icons.add(Image(javaClass.getResourceAsStream("/icons8_sloth_96px.png")))
        primaryStage.show()
    }

    override fun stop() {
        GlobalScreen.unregisterNativeHook()
    }
}

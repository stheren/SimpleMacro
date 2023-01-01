import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.scene.layout.VBox
import javafx.stage.Stage


class Window : Application(){
    override fun start(primaryStage: Stage) {
        primaryStage.title = "Hello World"

        val fxmlConnexionLoader = FXMLLoader(javaClass.getResource("/helloWorld.fxml"))
        val connexionScene = fxmlConnexionLoader.load<VBox>()
        //val connexionController = fxmlConnexionLoader.getController() as HelloWorldController

        primaryStage.scene = Scene(connexionScene, connexionScene.prefWidth, connexionScene.prefHeight)
        primaryStage.icons.add(Image(javaClass.getResourceAsStream("/icons8_sloth_96px.png")))
        primaryStage.show()
    }
}

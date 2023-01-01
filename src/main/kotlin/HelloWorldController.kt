import javafx.event.EventHandler
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Button
import java.net.URL
import java.util.*

class HelloWorldController : Initializable {
    @FXML
    lateinit var button: Button

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        button.onMousePressed = EventHandler {
            button.text = "Hello World!"
        }

        button.onMouseReleased = EventHandler {
            button.text = "Click me!"
        }
    }

}

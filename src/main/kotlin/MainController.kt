import javafx.application.Platform
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import org.jnativehook.GlobalScreen
import org.jnativehook.keyboard.NativeKeyEvent
import org.jnativehook.keyboard.NativeKeyListener
import java.net.URL
import java.util.*
import java.util.logging.Logger

class MainController : Initializable {
    @FXML
    lateinit var label: Label

    var robot = java.awt.Robot()
    var cpt = 0
    override fun initialize(location: URL?, resources: ResourceBundle?) {
        GlobalScreen.unregisterNativeHook()
        Logger.getLogger(GlobalScreen::class.java.getPackage().name).level = java.util.logging.Level.OFF

        // If quote is pressed, print it to the screen.
        GlobalScreen.addNativeKeyListener(object : NativeKeyListener {
            override fun nativeKeyPressed(e: NativeKeyEvent) {
                if(e.keyCode == NativeKeyEvent.VC_QUOTE) {
                    robot.mousePress(java.awt.event.InputEvent.BUTTON1_DOWN_MASK)
                    robot.mouseRelease(java.awt.event.InputEvent.BUTTON1_DOWN_MASK)
                }
            }

            override fun nativeKeyReleased(e: NativeKeyEvent) {
                // Osef
            }

            override fun nativeKeyTyped(e: NativeKeyEvent) {
                // Osef
            }
        })
        GlobalScreen.registerNativeHook()
    }

}

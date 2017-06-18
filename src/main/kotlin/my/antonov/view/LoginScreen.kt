package my.antonov.view

import javafx.geometry.Orientation
import javafx.scene.control.Button
import javafx.scene.control.ProgressIndicator
import my.antonov.app.Styles
import tornadofx.*

class LoginScreen : View("Hello TornadoFX") {
    override val root = Form().addClass(Styles.login)

    init {
        title = "Git hub login"

        with (root) {
            fieldset {
                labelPosition = Orientation.VERTICAL
                field("Username") {
                    textfield {

                    }
                }
                field("Password") {
                    passwordfield {

                    }
                }
                button("Log in") {
                    setOnAction {
                        login()
                    }
                }
            }
        }
    }

    private fun Button.login() {
        graphic = ProgressIndicator()
    }
}
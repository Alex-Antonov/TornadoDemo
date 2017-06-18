package my.antonov.app

import javafx.scene.text.FontWeight
import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.cssclass
import tornadofx.px

class Styles : Stylesheet() {
    companion object {
        val login by cssclass()
        var loginWigth = 300.px
    }

    init {
        form and login {
            padding = box(25.px)
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
            prefWidth = loginWigth
            button { prefWidth = loginWigth }
            progressIndicator {
                prefWidth = 16.px
                prefHeight = prefWidth
            }
        }
    }
}
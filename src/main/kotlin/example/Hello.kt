@file:Suppress("MemberVisibilityCanBePrivate")

package example

import javafx.scene.control.Button
import tornadofx.*

class HelloWorld : View() {

    private var myButton by singleAssign<Button>()

    override val root = vbox {
        myButton = button("111")
        myButton = button("222")
    }

}

class HelloWorldApp : App(HelloWorld::class)

fun main(args: Array<String>) {
    launch<HelloWorldApp>()
}
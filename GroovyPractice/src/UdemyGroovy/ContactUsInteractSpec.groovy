package UdemyGroovy

import geb.spock.GebSpec

class ContactUsInteractSpec extends GebSpec{
    def featureMethod(){
        given:
        to keyboardAction

        when:
        fillForm()

        then:
        println("keyboard opration")
    }
}
package UdemyGroovy

import geb.Page
import org.openqa.selenium.Keys

class keyboardAction extends Page{
    static url = "https://abodeqa.com/contact-us/"
    static content = {
        name {$("#g110-name")}
        email {$("#g110-email")}
        websiteURL {$("#g110-website")}
        comment {$("#contact-form-comment-g110-comment")}
        submit{$("button",text:"Submit")}

    }
    static at = {
        title=="Contact Us | Abode QA"
    }
    def fillForm(){
        name.value "Abodeqa"
        email.value "xyz.com"
        websiteURL.value "https://abodeqa.com"
//ctrl +A
        interact {
            keyDown(Keys.CONTROL)
            sendKeys("A")

        }
//        ctrl+C
        interact {
            keyDown(Keys.CONTROL)
            sendKeys("C")
        }
        comment.click()
        interact {
            keyDown(Keys.CONTROL)
            sendKeys("V")
        }
        submit.click()
    }

}
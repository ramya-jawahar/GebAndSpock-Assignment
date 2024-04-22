package UdemyGroovy

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

def browser = new Browser(driver: new ChromeDriver())
//def browser = new Browser(driver: new FirefoxDriver())
browser.go("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F")
browser.$("input[type ='text']").isDisplayed()
//add value in text field
browser.$("input[type ='text']").value("mrmahesh8191@gmail.com")

//handling radio button
//use .click ()

//select check box
//.click()

//selecting dropdown
//1.browser.$(parent of element).atribute = "value to be retrieve from dropdown"
//2.browser.$("# id atribute").value("value to be retrieve from dropdown")

//how to upload file
//browser.$("#id atribute").value(file path)
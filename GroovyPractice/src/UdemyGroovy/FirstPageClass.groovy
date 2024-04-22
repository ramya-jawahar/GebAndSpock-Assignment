package UdemyGroovy

import UdemyGroovy.ContactUsPages
import geb.Browser

Browser.drive{
//    to - set the page means push the browser
    to ContactUsPages
    println currentUrl
}
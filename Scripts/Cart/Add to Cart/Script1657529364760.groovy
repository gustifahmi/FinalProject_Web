import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/login/')

WebUI.waitForElementPresent(findTestObject('Login Page/Page Title - Login'), 0)

WebUI.setText(findTestObject('Login Page/Input - Username'), username)

WebUI.setText(findTestObject('Login Page/Input - Password'), password)

WebUI.click(findTestObject('Login Page/Button - Login'))

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/login/')

//Initialize boolean
boolean isAlbumExist = false

boolean isBeanieExist = false

boolean isBeltExist = false

//Check Cart
WebUI.click(findTestObject('Navbar/Button - Cart'))

if (WebUI.verifyElementPresent(findTestObject('Cart Page/Text - Album'), 1, FailureHandling.OPTIONAL)) {
    isAlbumExist = true
}

if (WebUI.verifyElementPresent(findTestObject('Cart Page/Text - Beanie'), 1, FailureHandling.OPTIONAL)) {
    isBeanieExist = true
}

if (WebUI.verifyElementPresent(findTestObject('Cart Page/Text - Belt'), 1, FailureHandling.OPTIONAL)) {
    isBeltExist = true
}

//If all items already exist in cart, close browser
if ((isAlbumExist && isBeanieExist) && isBeltExist) {
    WebUI.closeBrowser()
} else {
    WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/shop-2/')

    if (!(isAlbumExist)) {
        WebUI.mouseOver(findTestObject('Shop Page/Image - Album'))

        WebUI.click(findTestObject('Shop Page/Button - Add to Cart Album'))
    }
    
    if (!(isBeanieExist)) {
        WebUI.mouseOver(findTestObject('Shop Page/Image - Beanie'))

        WebUI.click(findTestObject('Shop Page/Button - Add to Cart Beanie'))
    }
    
    if (!(isBeltExist)) {
        WebUI.scrollToElement(findTestObject('Shop Page/Image - Belt'), 0)

        WebUI.mouseOver(findTestObject('Shop Page/Image - Belt'))

        WebUI.click(findTestObject('Shop Page/Button - Add to Cart Belt'))
    }
    
    WebUI.click(findTestObject('Navbar/Button - Cart'))

    WebUI.verifyElementPresent(findTestObject('Cart Page/Text - Album'), 0)

    WebUI.verifyElementPresent(findTestObject('Cart Page/Text - Beanie'), 0)

    WebUI.verifyElementPresent(findTestObject('Cart Page/Text - Belt'), 0)

    WebUI.closeBrowser()
}


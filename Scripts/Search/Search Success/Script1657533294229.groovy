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

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.setText(findTestObject('Navbar/Input - Search'), 't-shirt')

WebUI.click(findTestObject('Navbar/Button - Search'))

WebUI.scrollToElement(findTestObject('Search Page/Image - T-Shirt'), 0)

WebUI.verifyElementPresent(findTestObject('Search Page/Image - T-Shirt'), 0)

WebUI.setText(findTestObject('Navbar/Input - Search'), 'hoodie')

WebUI.click(findTestObject('Navbar/Button - Search'))

WebUI.scrollToElement(findTestObject('Search Page/Image - Hoodie'), 0)

WebUI.verifyElementPresent(findTestObject('Search Page/Image - Hoodie'), 0)

WebUI.setText(findTestObject('Navbar/Input - Search'), 'polo')

WebUI.click(findTestObject('Navbar/Button - Search'))

WebUI.scrollToElement(findTestObject('Search Page/Image - Polo'), 0)

WebUI.verifyElementPresent(findTestObject('Search Page/Image - Polo'), 0)

WebUI.closeBrowser()


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

WebUI.openBrowser(GlobalVariable.base_url_staging)

CustomKeywords.'keyword_FunctionLogin.AutomationLogin.loginWithUserDummy2'()

WebUI.click(findTestObject('Object Learderboards/btn_Leaderboards_Menu'))

WebUI.click(findTestObject('Object Learderboards/dropdown_Program_Leaderboards'))

WebUI.setText(findTestObject('Object Learderboards/input_Search_Program_Leaderboards'), 'cots')

WebUI.click(findTestObject('Object Learderboards/select_Program_Leaderboards'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Learderboards/btn_Leaderboards_Menu'))

WebUI.verifyElementPresent(findTestObject('Object Learderboards/verify_Successfully_Open_Leaderboards - Text title'), 0)

WebUI.verifyElementPresent(findTestObject('Object Learderboards/verify_Successfully_Open_Leaderboards - Dropdown Program'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Learderboards/verify_Successfully_Open_Leaderboards - Podium'), 0)

WebUI.click(findTestObject('Object Learderboards/btn_Leaderboards_Menu'))

WebUI.click(findTestObject('Object Learderboards/dropdown_Organization_Level_Leaderboards'))

WebUI.scrollToElement(findTestObject('Object Learderboards/select_Organization_Level_Leaderboards'), 0)

WebUI.click(findTestObject('Object Learderboards/select_Organization_Level_Leaderboards'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Learderboards/btn_Leaderboards_Menu'))

WebUI.click(findTestObject('Object Learderboards/dropdown_Organization_Level_Leaderboards'))

WebUI.click(findTestObject('Object Learderboards/select_Organization_Level_Leaderboards'))

WebUI.delay(3)

WebUI.closeBrowser()


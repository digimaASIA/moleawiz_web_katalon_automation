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

WebUI.click(findTestObject('Object Help Center/btn_Help_Center_Menu'))

WebUI.click(findTestObject('Object Help Center/btn_Text_List_Privacy_Policy_Help_Center'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_Index_0 - Privacy Policy Description 0'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_Index_0 - Privacy Policy Description 0'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_1 - Privacy Policy Description 1'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_1 - Privacy Policy Description 1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_2 - Privacy Policy Description 2'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_2 - Privacy Policy Description 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_3 - Privacy Policy Description 3'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_3 - Privacy Policy Description 3'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_4'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_4 - Privacy Policy Description 4'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_4 - Privacy Policy Description 4'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_4'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_5'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_5 - Privacy Policy Description 5'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_5 - Privacy Policy Description 5'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_5'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_6'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_6 - Privacy Policy Description 6'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_6 - Privacy Policy Description 6'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_6'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_7'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_7 - Privacy Policy Description 7'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_7 - Privacy Policy Description 7'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_7'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_8'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_8 - Privacy Policy Description 8'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_8 - Privacy Policy Description 8'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_8'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_9'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_9 - Privacy Policy Description 9'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_9 - Privacy Policy Description 9'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_9'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_10'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_10 - Privacy Policy Description 10'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_10 - Privacy Policy Description 10'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_10'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_11'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_11 - Privacy Policy Description 11'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_11 - Privacy Policy Description 11'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_11'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_12'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_12 - Privacy Policy Description 12'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_12 - Privacy Policy Description 12'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()


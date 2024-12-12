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

WebUI.click(findTestObject('Object Help Center/btn_Text_List_Learning_Point_Help_Center'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_Index_0 - Learning Point Descripition 0'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_Index_0 - Learning Point Descripition 0'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_Index_1 - Learning Point Description 1'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_Index_1 - Learning Point Description 1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_2 - Learning Point Description 2'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_2 - Learning Point Description 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_3 - Learning Point Description 3'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_3 - Learning Point Description 3'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_4'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_4 - Learning Point Description 4'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_4 - Learning Point Description 4'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()


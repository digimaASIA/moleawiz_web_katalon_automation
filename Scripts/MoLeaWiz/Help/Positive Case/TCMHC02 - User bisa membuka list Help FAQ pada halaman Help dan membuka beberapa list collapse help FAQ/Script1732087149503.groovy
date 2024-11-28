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

WebUI.click(findTestObject('Object Help Center/btn_Help_Center_Menu'))

WebUI.click(findTestObject('Object Help Center/list_faq_help'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_0'))

WebUI.verifyElementPresent(findTestObject('Object Help Center/list_collapse_help_index_0 - FAQ Description'), 0)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_0'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.verifyElementPresent(findTestObject('Object Help Center/list_collapse_help_index_1 - FAQ Description'), 0)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_2 - FAQ Description'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

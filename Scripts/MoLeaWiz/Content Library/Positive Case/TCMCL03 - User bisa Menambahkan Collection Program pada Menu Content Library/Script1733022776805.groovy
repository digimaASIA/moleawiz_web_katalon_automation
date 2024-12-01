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

WebUI.click(findTestObject('Object Content Library/btn_Content_Library_Menu'))

WebUI.click(findTestObject('Object Content Library/btn_Close_Notif_Content_Library'))

WebUI.scrollToElement(findTestObject('Object Content Library/btn_Enter_Cart_Library_Content_Library'), 0)

WebUI.click(findTestObject('Object Content Library/btn_Enter_Cart_Library_Content_Library'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Content Library/verify_Successfully_Open_Academy_Collection_Content_Library - Text title ACADEMY'), 
    0)

WebUI.click(findTestObject('Object Content Library/btn_Enter_Cart_List_Program_Content_Library'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Content Library/verify_Successfully_Open_Academy_Collection_Content_Library - Text title ACADEMY'), 
    0)

WebUI.click(findTestObject('Object Content Library/btn_Add_Program_Collection_Content_Library'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Content Library/verify_Succesfully_Add_Program_Collection_Content_Library - Toast Success Add Program Collection'), 
    0)

WebUI.click(findTestObject('Object Content Library/btn_Remove_Program_from_Collection_Content_Library'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Content Library/btn_No_Remove_From_Collection_Content_Libarary'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Content Library/btn_Remove_Program_from_Collection_Content_Library'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Content Library/btn_Yes_Remove_From_Collection_Content_Libarary'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Content Library/verify_Succesfully_Remove_Program_Collection_Content_Library - Toast Success Remove Program Collection'), 
    0)

WebUI.click(findTestObject('Object Content Library/btn_Add_Program_Collection_Content_Library'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Content Library/verify_Succesfully_Add_Program_Collection_Content_Library - Toast Success Add Program Collection'), 
    0)

WebUI.click(findTestObject('Object Content Library/btn_Content_Library_Menu'))

WebUI.click(findTestObject('Object Content Library/btn_tab_Collection_Content_Library'))

WebUI.click(findTestObject('Object Content Library/radio_btn_Filter_Program_Collection_Content_Library'))

WebUI.verifyElementPresent(findTestObject('Object Content Library/verify_Succesfully_Add_Program_Collection_Content_Library - Text title cart PROGRAM'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Content Library/btn_Delete_Cart_Collection_Content_Library'), 0)

WebUI.click(findTestObject('Object Content Library/btn_Delete_Cart_Collection_Content_Library'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Content Library/btn_No_Remove_From_Collection_Content_Libarary'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Content Library/btn_Delete_Cart_Collection_Content_Library'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Content Library/btn_Yes_Remove_From_Collection_Content_Libarary'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Content Library/verify_Succesfully_Remove_Program_Collection_Content_Library - Toast Success Remove Program Collection'), 
    0)

WebUI.closeBrowser()


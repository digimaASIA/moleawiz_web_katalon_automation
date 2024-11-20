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

WebUI.delay(2)

WebUI.click(findTestObject('Object My Learning Journey/btn_My_Learning_Journey_Menu'))

WebUI.click(findTestObject('Object My Learning Journey/btn_Cart_Continue_My_Learning_Journey'))

WebUI.verifyElementPresent(findTestObject('Object Program Description/verify_Successfully_Open_Program_Description'), 0)

WebUI.click(findTestObject('Object Program Description/dropdown_list_Course_Index_0_Program_Description_Program'))

WebUI.click(findTestObject('Object Module Description/list_Module_Index_0_Module_Description'))

WebUI.verifyElementPresent(findTestObject('Object Module Description/verify_Successfully_Open_Module_Description - MODULE 1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Module Description/verify_Successfully_Open_Module_Description - Module Type'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Module Description/verify_Successfully_Open_Module_Description - Grading Method'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Module Description/verify_Successfully_Open_Module_Description - Number of Attempt'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Module Description/verify_Successfully_Open_Module_Description - Attempt Limit'), 
    0)


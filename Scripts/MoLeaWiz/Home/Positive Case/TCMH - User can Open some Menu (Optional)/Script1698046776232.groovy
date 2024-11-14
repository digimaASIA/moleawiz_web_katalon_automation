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

WebUI.click(findTestObject('Object Home/Object Menu/btn_My_Learning_Journey_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Home/Object Menu/verify_Successfully_Open_My_Learning_Journey - Title My Learning Journey'))

WebUI.verifyElementVisible(findTestObject('Object Home/Object Menu/verify_Successfully_Open_My_Learning_Journey - Text Filter'))

WebUI.verifyElementVisible(findTestObject('Object Home/Object Menu/verify_Successfully_Open_My_Learning_Journey - Radio button All'))

WebUI.verifyElementVisible(findTestObject('Object Home/Object Menu/verify_Successfully_Open_My_Learning_Journey - Radio button Ongoing'))

WebUI.verifyElementVisible(findTestObject('Object Home/Object Menu/verify_Successfully_Open_My_Learning_Journey - Radio button New'))

WebUI.verifyElementVisible(findTestObject('Object Home/Object Menu/verify_Successfully_Open_My_Learning_Journey - Radio button Completed'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Content_Library_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Home/Object Menu/verify_Successfully_Open_Content Library_Menu - Tab Collection'))

WebUI.verifyElementVisible(findTestObject('Object Home/Object Menu/verify_Successfully_Open_Content Library_Menu - Tab Content Library'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Leaderboards_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Home/Object Menu/verify_Successfully_Open_Content Library_Menu - Tab Content Library'))

WebUI.closeBrowser()


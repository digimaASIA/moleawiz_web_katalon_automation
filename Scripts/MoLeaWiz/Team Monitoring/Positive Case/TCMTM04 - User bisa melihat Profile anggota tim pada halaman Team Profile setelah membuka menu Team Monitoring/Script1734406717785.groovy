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

WebUI.click(findTestObject('Object Team Monitoring/btn_Team_Monitoring_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/verify_Successfully_Open_Team_Monitoring - Text title Team Monitoring'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/verify_Successfully_Open_Team_Monitoring - Icon Member'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/verify_Successfully_Open_Team_Monitoring - Button Show Team Profile'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/verify_Successfully_Open_Team_Monitoring - Text Learning Status'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/verify_Successfully_Open_Team_Monitoring - Button Show All Learning Status'))

WebUI.click(findTestObject('Object Team Monitoring/btn_Show_Team_Profile_Team_Monitoring'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/dropdwon_Selected_Program_Team_Monitoring'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/input_Search_Name_Team_Monitoring'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/verify_Successfully_Open_Team Profile_Team_Monitoring - Title Team Profile'))

WebUI.click(findTestObject('Object Team Monitoring/btn_Name_Profile_Team_Monitoring'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/verify_Successfully_Open_Team_Profile_Team_Monitoring - Role'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/verify_Successfully_Open_Team_Profile_Team_Monitoring - Username'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/verify_Successfully_Open_Team_Profile_Team_Monitoring - Registered on'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/tab_Team_Profile_Certificates_Team_Monitoring'))

WebUI.click(findTestObject('Object Team Monitoring/tab_Team_Profile_Certificates_Team_Monitoring'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/tab_Team_Profile_Badges_Team_Monitoring'))

WebUI.click(findTestObject('Object Team Monitoring/tab_Team_Profile_Badges_Team_Monitoring'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/tab_Team_Profile_Completed_Program_Team_Monitoring'))

WebUI.click(findTestObject('Object Team Monitoring/tab_Team_Profile_Completed_Program_Team_Monitoring'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/tab_Team_Profile_Additional_Learning_Team_Monitoring'))

WebUI.click(findTestObject('Object Team Monitoring/tab_Team_Profile_Additional_Learning_Team_Monitoring'))

WebUI.closeBrowser()


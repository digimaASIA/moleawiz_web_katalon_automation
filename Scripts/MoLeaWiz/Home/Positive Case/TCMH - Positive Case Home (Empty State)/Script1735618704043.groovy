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

CustomKeywords.'keyword_FunctionLogin.AutomationLogin.loginWithUserDummy4'()

WebUI.click(findTestObject('Object My Learning Journey/btn_My_Learning_Journey_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object My Learning Journey/btn_My_Learning_Journey_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object My Learning Journey/btn_My_Learning_Journey_Menu'))

WebUI.verifyElementVisible(findTestObject('Object My Learning Journey/verify_Successfully_Open_My_Learning_Journey - Title My Learning Journey'))

WebUI.verifyElementVisible(findTestObject('Object My Learning Journey/verify_Successfully_Open_My_Learning_Journey - Text Filter'))

WebUI.verifyElementVisible(findTestObject('Object My Learning Journey/verify_Successfully_Open_My_Learning_Journey - Radio button All'))

WebUI.verifyElementVisible(findTestObject('Object My Learning Journey/verify_Successfully_Open_My_Learning_Journey - Radio button Ongoing'))

WebUI.verifyElementVisible(findTestObject('Object My Learning Journey/verify_Successfully_Open_My_Learning_Journey - Radio button New'))

WebUI.verifyElementVisible(findTestObject('Object My Learning Journey/verify_Successfully_Open_My_Learning_Journey - Radio button Completed'))

WebUI.click(findTestObject('Object Content Library/btn_Content_Library_Menu'))

WebUI.click(findTestObject('Object Content Library/btn-Modal-Close-Notif-Content-Library'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Content Library/btn_Content_Library_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Content Library/btn_Content_Library_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Content Library/verify_Successfully_Open_Content Library_Menu - Tab Collection'))

WebUI.verifyElementVisible(findTestObject('Object Content Library/verify_Successfully_Open_Content Library_Menu - Tab Content Library'))

WebUI.click(findTestObject('Object Learderboards/btn_Leaderboards_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Learderboards/btn_Leaderboards_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Learderboards/btn_Leaderboards_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Learderboards/verify_Successfully_Open_Leaderboards - Text title'))

WebUI.click(findTestObject('Object Rewards/btn_Rewards_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Rewards/btn_Rewards_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Rewards/btn_Rewards_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Rewards/verify_Successfully_Open_Rewards - Text title Here exciting rewards for you'))

WebUI.verifyElementVisible(findTestObject('Object Rewards/verify_Successfully_Open_Rewards - Current Balance'))

WebUI.verifyElementVisible(findTestObject('Object Rewards/verify_Successfully_Open_Rewards - Button Link Redeem History'))

WebUI.click(findTestObject('Object Team Monitoring/btn_Team_Monitoring_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Team Monitoring/btn_Team_Monitoring_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Team Monitoring/btn_Team_Monitoring_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Team Monitoring/verify_Successfully_Open_Team_Monitoring - Text title Team Monitoring'))

WebUI.click(findTestObject('Object Reviews/btn_Reviews_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Reviews/btn_Reviews_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Reviews/btn_Reviews_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Reviews/verify_Successfully_Open_Reviews - Text title Review'))

WebUI.click(findTestObject('Object Help Center/btn_Help_Center_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Help Center/btn_Help_Center_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Help Center/btn_Help_Center_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Help Center/verify_Successfully_Open_Help_Center - Text title Help Topics'))

WebUI.verifyElementVisible(findTestObject('Object Help Center/verify_Successfully_Open_Help_Center - Text title Is there anything we can help you'))

WebUI.click(findTestObject('Object Home/btn_Home_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Home/btn_Home_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Home/btn_Home_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Login/dropdown_User_Profile'))

WebUI.delay(2)

WebUI.closeBrowser()


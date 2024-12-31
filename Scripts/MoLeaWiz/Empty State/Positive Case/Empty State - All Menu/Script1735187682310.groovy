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

WebUI.verifyElementVisible(findTestObject('Object Learderboards/verify_Successfully_Open_Leaderboards_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Learderboards/verify_Successfully_Open_Leaderboards - Text title'))

WebUI.verifyElementVisible(findTestObject('Object Learderboards/verify_Successfully_Open_Leaderboards - Podium'))

WebUI.verifyElementVisible(findTestObject('Object Learderboards/verify_Successfully_Open_Leaderboards - Dropdown Program'))

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

WebUI.verifyElementPresent(findTestObject('Object Help Center/verify_Successfully_Open_Help_Center - Title Help Center'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/verify_Successfully_Open_Help_Center - Text title Help Topics'))

WebUI.verifyElementVisible(findTestObject('Object Help Center/verify_Successfully_Open_Help_Center - Text title Is there anything we can help you'))

WebUI.click(findTestObject('Object Help Center/btn_Text_List_FAQ_Help_Center'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_0 - FAQ Description 0'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_0 - FAQ Description 0'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_1 - FAQ Description 1'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_1 - FAQ Description 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_2 - FAQ Description 2'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_2 - FAQ Description 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_3 - FAQ Description 3'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_3 - FAQ Description 3'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_4'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_4 - FAQ Description 4'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_4 - FAQ Description 4'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Help Center/btn_Text_List_Login_Help_Center'), 0)

WebUI.click(findTestObject('Object Help Center/btn_Text_List_Login_Help_Center'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_Index_0 - Login Description 0'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_Index_0 - Login Description 0'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_1 - Login Description 1'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_1 - Login Description 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_2 - Login Description 2'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_2 - Login Description 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Help Center/btn_Text_List_Profile_Help_Center'), 0)

WebUI.click(findTestObject('Object Help Center/btn_Text_List_Profile_Help_Center'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_Index_0 - Profile Description 0'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_Index_0 - Profile Description 0'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_1 - Profile Description 1'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_1 - Profile Description 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_2 - Profile Description 2'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_2 - Profile Description 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Help Center/btn_Text_List_My_Learning_Journey_Help_Center'), 0)

WebUI.click(findTestObject('Object Help Center/btn_Text_List_My_Learning_Journey_Help_Center'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_Index_0 - My Learning Journey Description 0'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_Index_0 - My Learning Journey Description 0'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_1 - My Learning Journey Description 1'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_1 - My Learning Journey Description 1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_2 - My Learning Journey Description 2'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_2 - My Learning Journey Description 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_3 - My Learning Journey Description 3'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_3 - My Learning Journey Description 3'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_4'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_4 - My Learning Journey Description 4'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_4 - My Learning Journey Description 4'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_4'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_5'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_5 - My Learning Journey Description 5'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_5 - My Learning Journey Description 5'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_5'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_6'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_6 - My Learning Journey Description 6'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_6 - My Learning Journey Description 6'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_6'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_7'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_7 - My Learning Journey Descrption 7'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_7 - My Learning Journey Descrption 7'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Help Center/btn_Text_List_Learning_Activity_Help_Center'), 0)

WebUI.click(findTestObject('Object Help Center/btn_Text_List_Learning_Activity_Help_Center'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_Index_0 - Learning Activity Description 0'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_Index_0 - Learning Activity Description 0'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_1 - Learning Activity Descrption 1'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_1 - Learning Activity Descrption 1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_2 - Learning Activity Description 2'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_2 - Learning Activity Description 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_3 - Learning Activity Description 3'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_3 - Learning Activity Description 3'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_4'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_4 - Learning Activity Description 4'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_4 - Learning Activity Description 4'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_4'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_5'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_5 - Learning Activity Description 5'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_5 - Learning Activity Description 5'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_5'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_6'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_6 - Learning Activity Description 6'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_6 - Learning Activity Description 6'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_6'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_7'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_7 - Learning Activity Description 7'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_7 - Learning Activity Description 7'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_7'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_8'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_8 - Learning Activity Description 8'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_8 - Learning Activity Description 8'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_8'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_9'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_9 - Learning Activity Description 9'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_9 - Learning Activity Description 9'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Help Center/btn_Text_List_Learning_Point_Help_Center'), 0)

WebUI.click(findTestObject('Object Help Center/btn_Text_List_Learning_Point_Help_Center'), FailureHandling.STOP_ON_FAILURE)

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

WebUI.scrollToElement(findTestObject('Object Help Center/btn_Text_List_Monitoring_And_Review_Help_Center'), 0)

WebUI.click(findTestObject('Object Help Center/btn_Text_List_Monitoring_And_Review_Help_Center'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_Index_0 - Monitoring and Review Description 0'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_Index_0 - Monitoring and Review Description 0'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_1 - Monitoring and Review Description 1'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_1 - Monitoring and Review Description 1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_2 - Monitoring and Review Description 2'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_2 - Monitoring and Review Description 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Help Center/btn_Text_List_Account_Data_And_Security_Help_Center'), 0)

WebUI.click(findTestObject('Object Help Center/btn_Text_List_Account_Data_And_Security_Help_Center'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_Index_0 - Account Data and Security Description 0'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_Index_0 - Account Data and Security Description 0'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_1 - Account Data and Security Description 1'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_1 - Account Data and Security Description 1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_2 - Account Data and Security Description 2'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_2 - Account Data and Security Description 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_3 - Account Data and Security Description 3'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_3 - Account Data and Security Description 3'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_4'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_4 - Account Data and Security Description 4'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_4 - Account Data and Security Description 4'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_4'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_5'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_5 - Account Data and Security Description 5'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_5 - Account Data and Security Description 5'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Help Center/btn_Text_List_Other_Help_Center'), 0)

WebUI.click(findTestObject('Object Help Center/btn_Text_List_Other_Help_Center'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_Index_0 - Other Description 0'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_Index_0 - Other Description 0'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_1 - Other Description 1'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_1 - Other Description 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_2 - Other Description 2'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_2 - Other Description 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Help Center/btn_Text_List_Term_Of_Service_Help_Center'), 0)

WebUI.click(findTestObject('Object Help Center/btn_Text_List_Term_Of_Service_Help_Center'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_Index_0 - Term of Service Description 0'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_Index_0 - Term of Service Description 0'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_Index_0'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_1 - Term of Service Description 1'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_1 - Term of Service Description 1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_1'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_2 - Term of Service Description 2'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_2 - Term of Service Description 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_2'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_3 - Term of Service Description 3'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_3 - Term of Service Description 3'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_3'))

WebUI.click(findTestObject('Object Help Center/list_collapse_help_index_4'))

WebUI.scrollToElement(findTestObject('Object Help Center/list_collapse_help_index_4 - Term of Service Description 4'), 0)

WebUI.verifyElementVisible(findTestObject('Object Help Center/list_collapse_help_index_4 - Term of Service Description 4'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Help Center/btn_Text_List_Privacy_Policy_Help_Center'), 0)

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

WebUI.click(findTestObject('Object Home/btn_Home_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Home/btn_Home_Menu'))

WebUI.click(findTestObject('Object Home/Object Menu/btn_Collapse_Menu'))

WebUI.click(findTestObject('Object Home/btn_Home_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Login/dropdown_User_Profile'))

WebUI.delay(2)

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Object Rewards/btn_Rewards_Menu'))

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Successfully_Open_Rewards - Button Link Redeem History'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Successfully_Open_Rewards - Current Balance'), 0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Successfully_Open_Rewards - Text title Here exciting rewards for you'), 
    0)

WebUI.click(findTestObject('Object Rewards/btn_Cart_Redeem_Rewards'))

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_Cart_Redeem_Rewards - Text Current Balance'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_Cart_Redeem_Rewards - Text New Balance'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_Cart_Redeem_Rewards - Text Redeem With'), 
    0)

WebUI.click(findTestObject('Object Rewards/button_Cancel_Redeem_Detail_Rewards'))

WebUI.click(findTestObject('Object Rewards/btn_Cart_Redeem_Rewards'))

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_Cart_Redeem_Rewards - Text Current Balance'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_Cart_Redeem_Rewards - Text New Balance'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_Cart_Redeem_Rewards - Text Redeem With'), 
    0)

WebUI.click(findTestObject('Object Rewards/btn_Redeem_Detail_Rewards'))

WebUI.delay(30)

WebUI.click(findTestObject('Object Rewards/btn_Verify_OTP_Rewards'))

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Successfully_Redeem_Rewards - Text Please save this code to claim your reward'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/btn_History_Earn_Rewards'), 0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/btn_Close_Earn_Rewards'), 0)

WebUI.click(findTestObject('Object Rewards/btn_History_Earn_Rewards'))

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_History_Redeem_Rewards - Text title Redeem Histroy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_History_Redeem_Rewards - Text title tabel Date and Time'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_History_Redeem_Rewards - Text title tabel Product'), 
    0)

WebUI.scrollToElement(findTestObject('Object Rewards/verify_Successfully_Redeem_Rewards - List Data Histroy Redeem'), 0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Successfully_Redeem_Rewards - List Data Histroy Redeem'), 
    0)

WebUI.click(findTestObject('Object Rewards/btn_Rewards_Menu'))

WebUI.click(findTestObject('Object Rewards/btn_Cart_Redeem_Rewards'))

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_Cart_Redeem_Rewards - Text Current Balance'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_Cart_Redeem_Rewards - Text New Balance'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_Cart_Redeem_Rewards - Text Redeem With'), 
    0)

WebUI.click(findTestObject('Object Rewards/button_Cancel_Redeem_Detail_Rewards'))

WebUI.click(findTestObject('Object Rewards/btn_Cart_Redeem_Rewards'))

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_Cart_Redeem_Rewards - Text Current Balance'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_Cart_Redeem_Rewards - Text New Balance'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Succesfully_Open_Cart_Redeem_Rewards - Text Redeem With'), 
    0)

WebUI.click(findTestObject('Object Rewards/btn_Redeem_Detail_Rewards'))

WebUI.delay(30)

WebUI.click(findTestObject('Object Rewards/btn_Verify_OTP_Rewards'))

WebUI.verifyElementPresent(findTestObject('Object Rewards/verify_Successfully_Redeem_Rewards - Text Please save this code to claim your reward'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/btn_History_Earn_Rewards'), 0)

WebUI.verifyElementPresent(findTestObject('Object Rewards/btn_Close_Earn_Rewards'), 0)

WebUI.closeBrowser()


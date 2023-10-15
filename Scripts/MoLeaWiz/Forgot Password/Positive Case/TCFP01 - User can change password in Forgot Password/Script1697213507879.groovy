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

WebUI.openBrowser(GlobalVariable.base_url)

WebUI.click(findTestObject('Object Forgot Password/btn_text_Forgot_Your_Password'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Forgot Password/btn_Icon_Back_Forgot_Password'))

WebUI.click(findTestObject('Object Forgot Password/btn_text_Forgot_Your_Password'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Forgot Password/input_Username_Forgot_Password'), 'candra@digimasia.com')

WebUI.click(findTestObject('Object Forgot Password/btn_Request_Password_Forgot_Password'))

WebUI.click(findTestObject('Object Forgot Password/btn_Icon_Back_Forgot_Password'))

WebUI.setText(findTestObject('Object Forgot Password/input_Username_Forgot_Password'), 'candra@digimasia.com')

WebUI.click(findTestObject('Object Forgot Password/btn_Request_Password_Forgot_Password'))

WebUI.click(findTestObject('Object Forgot Password/btn_Send_To_Email_Forgot_Password'))

WebUI.verifyElementVisible(findTestObject('Object Forgot Password/verify_Successfully_Change_Password - Your temporary password will be sent to you shortly'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Forgot Password/verify_Successfully_Change_Password - The password was sent to your email'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.closeBrowser()

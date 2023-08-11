import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Loginsteps {

	@Given("User is on bareksa landing page")
	def navigateToLandingPage(){
		Mobile.startExistingApplication('com.bareksa.app', FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click login")
	def navigateToLoginPage(){
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - Login'), 0)
	}

	@And("User enters (.*) and (.*)")
	def enterCredential(String email, String password){
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Contoh emailgmail.com'), email, 0)
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Masukkan Password'), password, 0)
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - Login (1)'), 0)
		Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton'), 0)
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Contoh emailgmail.com'), email, 0)
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Masukkan Password'), password, 0)
	}

	@And("User click login button")
	def clickLogin(){
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - Login (1)'), 0)
	}

	@And("User click send otp with sms")
	def clickSendOTP(){
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Nomor belum terhubung ke WhatsApp Kirim SMS'), 0)
	}

	@And("User input the pin")
	def entersPIN(){
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 7'), 0)
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 8'), 0)
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 4'), 0)
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 5'), 0)
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 1'), 0)
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 2'), 0)
	}

	@And("User redirect to home page")
	def NavigateToHomePage(){
		Mobile.closeApplication()
	}
}
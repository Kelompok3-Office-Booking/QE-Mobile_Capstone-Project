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

Mobile.startApplication('C:\\Users\\AIDA\\Downloads\\betterspace - update 12-12-22.apk', true)

Mobile.tap(findTestObject('Object Repository/Auth/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Auth/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Auth/android.widget.EditText - Full Name'), 0)

Mobile.setText(findTestObject('Object Repository/Auth/android.widget.EditText - Full Namefullname'), GlobalVariable.globalFullName, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Auth/android.widget.RadioButton'), 0)

Mobile.tap(findTestObject('Object Repository/Auth/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('Object Repository/Auth/android.widget.EditText - Emailexamplegmail.com'), GlobalVariable.globalEmail, 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Auth/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Auth/android.widget.EditText - PasswordPassword'), GlobalVariable.globalPass, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Auth/android.widget.EditText - Confirm Password'), 0)

Mobile.setText(findTestObject('Object Repository/Auth/android.widget.EditText - Confirm PasswordConfirm Password'), GlobalVariable.globalPass, 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Auth/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Auth/android.widget.EditText - Email (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Auth/android.widget.EditText - Emailexamplegmail.com (1)'), GlobalVariable.globalEmail, 
    0)

Mobile.tap(findTestObject('Object Repository/Auth/android.widget.EditText - Password (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Auth/android.widget.EditText - Password (2)'), GlobalVariable.globalPass, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Auth/android.widget.Button (3)'), 0)

Mobile.closeApplication()


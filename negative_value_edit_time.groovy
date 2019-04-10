import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hoclieu.sachmem.vn/folder/0')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail'), 'linhnguyen.uet1210@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp hc ca ti'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Abc'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_S hc sinh vo lm bi 0_optionDropdown'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Chnh sa'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Thi gian lm bi (pht)_form-control ng-untouched ng-valid ng-dirty'), 
    '-1')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__btn btn-primary'))


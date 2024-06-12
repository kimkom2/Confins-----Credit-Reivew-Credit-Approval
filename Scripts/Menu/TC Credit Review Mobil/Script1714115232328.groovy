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

TestData Datahohendy = findTestData('Data Files/Credit Review/Credit Review Non Motor')

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++)
{
	if (Datahohendy.getValue('Use', baris) == 'Yes' && Datahohendy.getValue('Bisnis Unit', baris) == 'Non Motor')
	{
		WebUI.switchToDefaultContent()
		
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Credit Review/Application Number'), Datahohendy.getValue('Application', baris))
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Credit Review/btnSearch'))
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Credit Review/Review'))
		
		WebUI.delay(10)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Credit Review/Tab APPROVAL RECOMMENDATION'))
		
		WebUI.delay(2)
		
		WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Credit Review/Notes'), 3)
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Credit Review/Reason '+ Datahohendy.getValue('Reason Description', baris)))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Credit Review/Approval/Approval '+ Datahohendy.getValue('Next Approval', baris)))
		
		WebUI.delay(2)
		
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Credit Review/Notes'), Datahohendy.getValue('Notes', baris))
		
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Credit Review/STRENGTH'), Datahohendy.getValue('STRENGTH', baris))
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Credit Review/WEAKNESS'), Datahohendy.getValue('WEAKNESS', baris))
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Credit Review/OPPORTUNITY'), Datahohendy.getValue('OPPORTUNITY', baris))
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Credit Review/THREAD'), Datahohendy.getValue('THREAD', baris))
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Credit Review/a_Submit'))
		
	}
}

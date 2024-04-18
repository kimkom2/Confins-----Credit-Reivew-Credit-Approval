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

TestData Datahohendy = findTestData('Data Files/Credit Approval/Credit approval')

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++) {
    if ((Datahohendy.getValue('Use', baris) == 'Yes') && (Datahohendy.getValue('Bisnis Unit', baris) == 'Motor')) {
        WebUI.switchToDefaultContent()

        WebUI.setText(findTestObject('Object Repository/Menu/Credit Approval/AppNo'), Datahohendy.getValue('Application', 
                baris))

        WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/Menu/Credit Approval/btnSearch'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/Menu/Credit Approval/a_Process'))

        WebUI.delay(4)

        WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit Approval/txtNotes'), 3)

        WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/Menu/Credit Approval/Action/Action ' + Datahohendy.getValue(
                    'Action Approval', baris)))

        WebUI.delay(4)

        WebUI.setText(findTestObject('Object Repository/Menu/Credit Approval/txtNotes'), Datahohendy.getValue('Notes', 
                baris))

        WebUI.delay(2)

        if (((Datahohendy.getValue('Use', baris) == 'Yes') && (Datahohendy.getValue('Bisnis Unit', baris) == 'Motor')) && 
        (Datahohendy.getValue('Action Approval', baris) == 'Reject')) {
            WebUI.click(findTestObject('Object Repository/Menu/Credit Approval/Reject Reason/Reason ' + Datahohendy.getValue(
                        'Reason Reject', baris)))

            WebUI.delay(2)
        }
        
        if (((Datahohendy.getValue('Use', baris) == 'Yes') && (Datahohendy.getValue('Bisnis Unit', baris) == 'Motor')) && 
        (Datahohendy.getValue('Action Approval', baris) == 'Return')) {
            WebUI.setText(findTestObject('Object Repository/Menu/Credit Approval/ReturnNotes'), Datahohendy.getValue(
                    'Return Notes', baris))

            WebUI.delay(2)

            WebUI.click(findTestObject('Object Repository/Menu/Credit Approval/Return Action/Return ' + Datahohendy.getValue(
                        'Return Action', baris)))

            WebUI.delay(2)

            WebUI.click(findTestObject('Object Repository/Menu/Credit Approval/Add Return'))

            WebUI.delay(2)
        }
        
        WebUI.click(findTestObject('Object Repository/Menu/Credit Approval/a_Submit'))

        WebUI.delay(5)
		
		WebUI.closeBrowser()

//        WebUI.click(findTestObject('Object Repository/Menu/Credit Approval/a_LOGOUT'))
//
//        WebUI.delay(2)
//		
//		WebUI.acceptAlert(FailureHandling.OPTIONAL)
    } 
	else 	
	{
        'Salah Parameter Excel Binis unit' 
    }
}


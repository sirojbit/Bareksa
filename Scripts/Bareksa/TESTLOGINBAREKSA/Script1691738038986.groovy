import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.startExistingApplication('com.bareksa.app', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('null'), 0)

Mobile.setText(findTestObject('null'), 'test@gmail.com', 
    0)

Mobile.setText(findTestObject('null'), 'test123', 
    0)

Mobile.tap(findTestObject('Object Repository/HAPUS/Bareksa/android.widget.Button - Login (0)'), 0)

Mobile.closeApplication()


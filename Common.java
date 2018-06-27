package ohr;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.URL;
import java.util.Random;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Common {
	
	public static AndroidDriver driver;
	
	// public static WebDriver wdriver;
		 

	public static AndroidDriver getAndroidDriver() {
		return driver;
	}

	@BeforeClass
	public void setUp() throws Exception {
		
		//DesiredCapabilities �������������ʱ�Ĳ�������
		DesiredCapabilities cp = new DesiredCapabilities();
		
		// ��׿�汾
		cp.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		
		//web�Զ������������
		//cp.setCapability(CapabilityType.BROWSER_NAME, "Google Chrome");        

		// ����ϵͳ
		cp.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		
		// �豸����
		cp.setCapability(MobileCapabilityType.DEVICE_NAME,"127.0.0.1:21503 device");
		
		// APP����
		cp.setCapability(MobileCapabilityType.APP_PACKAGE,"com.youna.renzi");
		
		//���ñ�����ǩ��
		cp.setCapability("noSign","true");
		
		//Ӧ�ó����ڲ���ĳ��ҳ���Ԫ��ʱ����λ���ܻ�ʱ�䳬��������30s�Զ��˳�
		cp.setCapability("newCommandTimeout",30);

		
		// APP������
		cp.setCapability(MobileCapabilityType.APP_ACTIVITY,"com.youna.renzi.ui.LoginActivity");
		
		cp.setCapability("unicodeKeyboard", true);
		
		cp.setCapability("resetKeyboard", true);
		
		// ʵ����һ��AndroidDriver����������Ҫָ��URL��ַ�Լ�
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cp);
			
		}

		public static String cellphone() {
			String cellphone = "139";
			Random random = new Random();
			for (int j = 0; j < 8; j++) {
				cellphone += random.nextInt(10);
				
					}
			
					return cellphone;
				}

	// ��װfind����
	/*
	 * public AndroidElement find(String controllnfo){
	 *  AndroidElement
	 * element=null;
	 *  \if(controllnfo.startsWith("//")){ 
	 *  element=(AndroidElement)
	 * driver.findElementByXPath(controllnfo); 
	 * } elseif(controllnfo.contains(":id/")||controllnfo.contains(":String/")){
	 * element=(AndroidElement) driver.findElementById(controllnfo); 
	 * } else{
	 * try{ 
	 * element=(AndroidElement) driver.findElementByName(controllnfo); 
	 * }
	 * catch(NoSuchElementException e){
	 * //System.out.println("can not find by name");
	 *  element=(AndroidElement)
	 * driver.findElementByClassName(controllnfo);
	 * 	 } 
	 * 	 } 
	 *  return element; }
	 */

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
		
		}
}

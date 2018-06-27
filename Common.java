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
		
		//DesiredCapabilities 负责启动服务端时的参数设置
		DesiredCapabilities cp = new DesiredCapabilities();
		
		// 安卓版本
		cp.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		
		//web自动化设置浏览器
		//cp.setCapability(CapabilityType.BROWSER_NAME, "Google Chrome");        

		// 操作系统
		cp.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		
		// 设备名称
		cp.setCapability(MobileCapabilityType.DEVICE_NAME,"127.0.0.1:21503 device");
		
		// APP包名
		cp.setCapability(MobileCapabilityType.APP_PACKAGE,"com.youna.renzi");
		
		//设置避免重签名
		cp.setCapability("noSign","true");
		
		//应用程序在查找某个页面的元素时，定位可能会时间超长，超过30s自动退出
		cp.setCapability("newCommandTimeout",30);

		
		// APP主界面
		cp.setCapability(MobileCapabilityType.APP_ACTIVITY,"com.youna.renzi.ui.LoginActivity");
		
		cp.setCapability("unicodeKeyboard", true);
		
		cp.setCapability("resetKeyboard", true);
		
		// 实例化一个AndroidDriver，构造器需要指定URL地址以及
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

	// 封装find方法
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

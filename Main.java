package ohr;

import java.util.Random;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidElement;

public class Main extends Common {
	
	// 申请加入公司

	@Test
	public void join() throws InterruptedException {

		
		// 注册账号
		try {
			
			Assert.assertEquals("ui.LoginActivity", driver.currentActivity(),"不是登录界面");
			
		} catch (Exception e) {	
			
			System.out.println("不是登录界面!!");
		}
		
//		driver.findElementByName("登录").click();
		
		driver.findElementByName("注册账号").click();
		
		AndroidElement cellphone = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_phone");		
		cellphone.sendKeys(Common.cellphone());
		
		driver.findElementByName("获取验证码").click();
		
		Thread.sleep(2000);
		
		driver.findElementByName("下一步").click();
		
		driver.findElementByName("《曲别针服务协议》").click();
		
		Thread.sleep(2000);
		
		driver.sendKeyEvent(4);
		
		AndroidElement password = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_password");
		
		password.sendKeys("123456");
		
		Thread.sleep(2000);
		
		driver.findElementByName("完成").click();
		
		driver.findElementByName("切换账号").click();
		
		driver.findElementByName("登录").click();
		
		Thread.sleep(3000);
		
		driver.findElementById("com.youna.renzi:id/btn_join_company").click();
		
		driver.findElementById("com.youna.renzi:id/btn_sao_qr_code_join").click();
		
		Thread.sleep(3000);
		
		driver.sendKeyEvent(4);
		
		driver.sendKeyEvent(3);
		
		driver.findElementByName("曲别针").click();

		
		// 申请加入公司
		AndroidElement qrcode = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_input_invitation_code");
		
		qrcode.sendKeys("378525");
		
		Thread.sleep(4000);
		
		driver.findElementByName("下一步").click();
		
		Assert.assertEquals("ui.JoinCompanyActivity", driver.currentActivity());

		
		// 完善个人资料
		driver.findElementByName("加入").click();
		
		Thread.sleep(2000);
		
		driver.findElementById("com.youna.renzi:id/title_right").click();
		
		Thread.sleep(2000);
		
		driver.findElementByName("上传头像").click();
		
		driver.swipe(254, 1155, 402, 1157, 2000);
		
		Thread.sleep(3000);
		
		driver.findElementByName("取消").click();
		
		AndroidElement companyname = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_name");
		
		companyname.sendKeys("暗夜蝙蝠侠");
		
		driver.findElementById("com.youna.renzi:id/tv_birthday").click();
		
		driver.swipe(440, 1250, 582, 1248, 2000);
		
		driver.findElementByName("女").click();
		
		driver.findElementById("com.youna.renzi:id/title_right").click();
		
		Thread.sleep(3000);

		// 等待管理员通过
		driver.findElementByName("刷新界面").click();
	}

	
	// 创建新公司
	@Test
	public void create() throws InterruptedException {

		
		// 注册账号
		Random random = new Random();
		
		driver.findElementByName("注册账号").click();
		
		driver.findElementByName("下一步").click();
		
		driver.findElementByName("获取验证码").click();
		
		AndroidElement cellphone = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_phone");
	
		cellphone.sendKeys(Common.cellphone());
		
		driver.findElementByName("获取验证码").click();
		
		Thread.sleep(2000);
		
		driver.findElementByName("下一步").click();
		
		driver.findElementByName("《曲别针使用协议》").click();
		
		Thread.sleep(2000);
		
		driver.findElementByName("完成").click();
		
		Thread.sleep(3000);
		
		AndroidElement password = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_password");
		
		password.sendKeys("123456");
		
		Thread.sleep(2000);

		
		// 创建公司
		driver.findElementByName("创建一个新公司").click();
		
		AndroidElement cpname = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_phone");
		
		cpname.sendKeys("北京有公司");
		
		driver.findElementById("com.youna.renzi:id/tv_company_industry").click();
		
		AndroidElement industy = (AndroidElement) driver.findElementsById("com.youna.renzi:id/tv_name").get(random.nextInt(10));
		
		industy.click();
		
		Thread.sleep(3000);
		
		driver.findElementByName("确定").click();
		
		driver.findElementById("com.youna.renzi:id/tv_company_scale").click();
		
		driver.findElementByName("41-50人").click();
		
		driver.findElementByName("确定").click();
		
		driver.findElementById("com.youna.renzi:id/tv_region").click();
		
		Thread.sleep(3000);
		
		driver.findElementByName("北京市").click();
		
		driver.findElementByName("确定").click();
		
		driver.findElementByName("完成").click();
				
		Thread.sleep(5000);

		
		// 完善个人资料
		
		driver.findElementByName("更改头像").click();
		
		driver.swipe(254, 1155, 402, 1157, 2000);
		
		Thread.sleep(3000);
		
		driver.swipe(245, 574, 245, 574, 1000);
		
		Thread.sleep(2000);
		
		driver.swipe(331, 653, 331, 653, 1000);
		
		driver.findElementByName("选取").click();
		
		Thread.sleep(6000);

		driver.closeApp();

	}

}

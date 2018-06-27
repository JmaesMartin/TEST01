package ohr;

import java.util.Random;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidElement;

public class Main extends Common {
	
	// ������빫˾

	@Test
	public void join() throws InterruptedException {

		
		// ע���˺�
		try {
			
			Assert.assertEquals("ui.LoginActivity", driver.currentActivity(),"���ǵ�¼����");
			
		} catch (Exception e) {	
			
			System.out.println("���ǵ�¼����!!");
		}
		
//		driver.findElementByName("��¼").click();
		
		driver.findElementByName("ע���˺�").click();
		
		AndroidElement cellphone = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_phone");		
		cellphone.sendKeys(Common.cellphone());
		
		driver.findElementByName("��ȡ��֤��").click();
		
		Thread.sleep(2000);
		
		driver.findElementByName("��һ��").click();
		
		driver.findElementByName("�����������Э�顷").click();
		
		Thread.sleep(2000);
		
		driver.sendKeyEvent(4);
		
		AndroidElement password = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_password");
		
		password.sendKeys("123456");
		
		Thread.sleep(2000);
		
		driver.findElementByName("���").click();
		
		driver.findElementByName("�л��˺�").click();
		
		driver.findElementByName("��¼").click();
		
		Thread.sleep(3000);
		
		driver.findElementById("com.youna.renzi:id/btn_join_company").click();
		
		driver.findElementById("com.youna.renzi:id/btn_sao_qr_code_join").click();
		
		Thread.sleep(3000);
		
		driver.sendKeyEvent(4);
		
		driver.sendKeyEvent(3);
		
		driver.findElementByName("������").click();

		
		// ������빫˾
		AndroidElement qrcode = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_input_invitation_code");
		
		qrcode.sendKeys("378525");
		
		Thread.sleep(4000);
		
		driver.findElementByName("��һ��").click();
		
		Assert.assertEquals("ui.JoinCompanyActivity", driver.currentActivity());

		
		// ���Ƹ�������
		driver.findElementByName("����").click();
		
		Thread.sleep(2000);
		
		driver.findElementById("com.youna.renzi:id/title_right").click();
		
		Thread.sleep(2000);
		
		driver.findElementByName("�ϴ�ͷ��").click();
		
		driver.swipe(254, 1155, 402, 1157, 2000);
		
		Thread.sleep(3000);
		
		driver.findElementByName("ȡ��").click();
		
		AndroidElement companyname = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_name");
		
		companyname.sendKeys("��ҹ������");
		
		driver.findElementById("com.youna.renzi:id/tv_birthday").click();
		
		driver.swipe(440, 1250, 582, 1248, 2000);
		
		driver.findElementByName("Ů").click();
		
		driver.findElementById("com.youna.renzi:id/title_right").click();
		
		Thread.sleep(3000);

		// �ȴ�����Աͨ��
		driver.findElementByName("ˢ�½���").click();
	}

	
	// �����¹�˾
	@Test
	public void create() throws InterruptedException {

		
		// ע���˺�
		Random random = new Random();
		
		driver.findElementByName("ע���˺�").click();
		
		driver.findElementByName("��һ��").click();
		
		driver.findElementByName("��ȡ��֤��").click();
		
		AndroidElement cellphone = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_phone");
	
		cellphone.sendKeys(Common.cellphone());
		
		driver.findElementByName("��ȡ��֤��").click();
		
		Thread.sleep(2000);
		
		driver.findElementByName("��һ��").click();
		
		driver.findElementByName("��������ʹ��Э�顷").click();
		
		Thread.sleep(2000);
		
		driver.findElementByName("���").click();
		
		Thread.sleep(3000);
		
		AndroidElement password = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_password");
		
		password.sendKeys("123456");
		
		Thread.sleep(2000);

		
		// ������˾
		driver.findElementByName("����һ���¹�˾").click();
		
		AndroidElement cpname = (AndroidElement) driver.findElementById("com.youna.renzi:id/edt_phone");
		
		cpname.sendKeys("�����й�˾");
		
		driver.findElementById("com.youna.renzi:id/tv_company_industry").click();
		
		AndroidElement industy = (AndroidElement) driver.findElementsById("com.youna.renzi:id/tv_name").get(random.nextInt(10));
		
		industy.click();
		
		Thread.sleep(3000);
		
		driver.findElementByName("ȷ��").click();
		
		driver.findElementById("com.youna.renzi:id/tv_company_scale").click();
		
		driver.findElementByName("41-50��").click();
		
		driver.findElementByName("ȷ��").click();
		
		driver.findElementById("com.youna.renzi:id/tv_region").click();
		
		Thread.sleep(3000);
		
		driver.findElementByName("������").click();
		
		driver.findElementByName("ȷ��").click();
		
		driver.findElementByName("���").click();
				
		Thread.sleep(5000);

		
		// ���Ƹ�������
		
		driver.findElementByName("����ͷ��").click();
		
		driver.swipe(254, 1155, 402, 1157, 2000);
		
		Thread.sleep(3000);
		
		driver.swipe(245, 574, 245, 574, 1000);
		
		Thread.sleep(2000);
		
		driver.swipe(331, 653, 331, 653, 1000);
		
		driver.findElementByName("ѡȡ").click();
		
		Thread.sleep(6000);

		driver.closeApp();

	}

}

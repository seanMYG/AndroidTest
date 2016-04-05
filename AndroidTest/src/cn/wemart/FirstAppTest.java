package cn.wemart;

import io.appium.java_client.AppiumDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import cn.wemart.pageobject.PageObject;
import cn.wemart.util.LoadInfo;

public class FirstAppTest {

	public static void main(String[] args) throws MalformedURLException,
			InterruptedException {

		// File classpathRoot = new File(System.getProperty("user.dir"));
		// File appDir = new File(classpathRoot, "apps");
		// File app = new File(appDir, "myapp.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Android Emulator");// Coolpad 8297;Android Emulator
		capabilities.setCapability("platformVersion", "6.0");
		// capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.sean.myapp");
		capabilities.setCapability("appActivity", ".MainActivity");

		// support Chinese
		capabilities.setCapability("unicodeKeyboard", "True");
		capabilities.setCapability("resetKeyboard", "True");

		AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.findElement(By.id("com.sean.myapp:id/myButton")).click();
		Thread.sleep(5000);
		Set<String> context = driver.getContextHandles();
		for (String contextName : context) {
			System.out.println(contextName);
		}

		driver.context("WEBVIEW_com.sean.myapp");

		// 获取店铺的信息
		PageObject homepage = new PageObject(driver);
		String shopname = homepage.getShopName(driver);
		System.out.println("shopname: " + shopname);

		// 进入商品详情页面，获取商品名、价格、库存
		homepage.enterGoodsPage(driver);
		Thread.sleep(3000);
		String goodsName = homepage.getGoodsName(driver);
		String goodsprice = homepage.getGoodsPrice(driver);
		String goodsstocks = homepage.getGoodsStocks(driver);
		System.out.println("goodsName: " + goodsName + ", goodsPrice: "+ goodsprice + ", goodsStocks: " + goodsstocks);

		// 添加购物车，获取购物车中商品的数量
		homepage.buyNow(driver);
		homepage.addGoods(driver);
		Thread.sleep(1000);
		homepage.addGoods(driver);
		Thread.sleep(1000);
		String cartgoods = homepage.getCartGoods(driver);
		System.out.println("cartgoods: " + cartgoods);

		// 点击支付
		Thread.sleep(3000);
		homepage.clickPay(driver);

		// 添加收货地址
		Thread.sleep(3000);
		homepage.inputReceiverName(driver, LoadInfo.ReceiverName);
		homepage.inputMobile(driver, LoadInfo.ReceiverMobile);
		homepage.inputReceiverAddress(driver, LoadInfo.ReceiverAddress);
		homepage.clickNextStep(driver);

		// 保存收货信息
		Thread.sleep(2000);
		String AccountMobile = homepage.getAccountMobile(driver);
		System.out.println("AccountMobile: " + AccountMobile);
		homepage.clickSaveReceiverInfoButton(driver);

		// 订单确认
		Thread.sleep(3000);
		String Receiver = homepage.getReceiver(driver);
		String Mobile = homepage.getMobile(driver);
		String ReceiverAddress = homepage.getReceiverAddress(driver);
		String OrderPrice = homepage.getOrderPrice(driver);
		System.out.println("Receiver: " + Receiver + ", Mobile: " + Mobile+ ", ReceiverAddress: " + ReceiverAddress);
		System.out.println("OrderPrice: " + OrderPrice);

		driver.quit();
	}

}

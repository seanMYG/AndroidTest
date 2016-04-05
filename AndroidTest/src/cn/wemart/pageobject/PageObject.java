package cn.wemart.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author sean
 *
 */

public class PageObject extends Page {
	public  String shopNameXpath = "//*[@id=\"wmHomeScreen\"]/div/div[1]/div/div[2]/span";//店铺名
	public  String ShopName = "店铺名";
	public  String goodsXpath = "//*[@id=\"wmHomeScreen\"]/div/div[2]/div/a/div[1]"; //商品链接
	public  String GoodsLink = "获取商品链接";
	public  String goodsName = "//*[@id=\"wmGoodsDetailsScreen\"]/div[2]/div[2]/div[1]/span"; //商品名
	public  String GoodsName = "商品名";
	public  String goodsStocks = "//*[@id=\"wmGoodsDetailsScreen\"]/div[2]/div[2]/div[2]/p[2]/span[2]"; //商品库存
	public  String GoodsStocks = "商品库存";
	public  String goodsPrice = "//*[@id=\"wmGoodsDetailsScreen\"]/div[2]/div[2]/div[2]/p[1]/span[2]"; //商品价格
	public  String GoodsPrice = "商品价格";
	public  String buyNow = "//*[@id=\"m-bar\"]/div/button[2]"; //立即购买
	public  String BuyNow = "添加购物车第一步";
	public  String addGoods = "//*[@id=\"wmGoodsDetailsScreen\"]/div[3]/div[1]/div[2]/div/div[1]/div[2]/i"; //添加商品数量
	public  String AddGoods = "添加商品数量";
	public  String addCartII = "//*[@id=\"wmGoodsDetailsScreen\"]/div[3]/div[1]/div[3]/button";  //加入购物车第二步
	public  String AddCartSecendStep = "添加购物车第二步";
	public  String getCartGoods = "//*[@id=\"wmGoodsDetailsScreen\"]/div[3]/div[1]/div[2]/div/div[1]/input"; //获取购物车中商品数量
	public  String GetCartGoods = "获取购物车中商品数量";
	public  String cartIcon = "//*[@id=\"m-bar\"]/button";  //购物车图标
	public  String CartIcon = "购物车图标";
	public  String pay = "//*[@id=\"wmGoodsDetailsScreen\"]/div[3]/div[1]/div[3]/button"; //支付
	public  String PayFirstStep = "第一个支付按钮";
	public  String inputReceiver = "receiver";  //收货人名
	public  String InputReceiver = "输入收货人名";
	public  String inputMobile = "mobile";  //手机号
	public  String InputMobile = "输入手机号";
	public  String inputReceiverAddress = "/html/body/article[17]/div/div[2]/div/div/div/label[6]/textarea";  //收货地址
	public  String InputReceiverAddress = "输入收货地址";
	public  String nextStep = "//*[@id=\"wmAddressItemScreen\"]/footer/button"; //下一步
	public  String NextStep = "保存地址下一步按钮";
	public  String accountMobile = "accountMobile";  //我的手机号
	public  String AccountMobile = "确定我的手机号码";
	public  String saveReceiverInfo = "//*[@id=\"wmAddressItemScreen\"]/footer/div/button[2]"; //保存收货信息
	public  String SaveReceiverInfo = "保存收货信息按钮";
	public  String getReceiver = "//*[@id=\"wmOrderConfirmScreen\"]/div/div[1]/div/div/div/p[1]/span[1]";  //获取收货人名
	public  String GetReceiver = "获取订单确认页收货人名";
	public  String getMobile = "//*[@id=\"wmOrderConfirmScreen\"]/div/div[1]/div/div/div/p[1]/span[2]";  //获取收货手机
	public  String GetMobile = "获取订单确认页收货手机号码";
	public  String getReceiverAddress = "//*[@id=\"wmOrderConfirmScreen\"]/div/div[1]/div/div/div/p[2]"; //获取收货地址
	public  String GetReceiverAddress = "获取订单确认页收货地址";
	public  String getOrderPrice = "//*[@id=\"wmOrderConfirmScreen\"]/div/div[6]/span[2]"; //获取订单总价
	public  String GetOrderPrice = "获取订单确认页订单总价";
	public  String payOrder = "//*[@id=\"wmOrderConfirmScreen\"]/div/div[7]/button"; //支付订单
	public  String PayOrder = "订单确认页支付订单";
	public  String myOrderCenter = "//*[@id=\"wmHomeScreen\"]/div/div[1]/div/div[2]/a/span"; //我的订单中心
	public  String MyOrderCenter = "我的订单中心";
	public  String getUserName = "//*[@id=\"wmPersonalCenterScreen\"]/div/div[1]/div/div/span"; //获取用户名
	public  String GetUserName = "获取用户名";
	public  String enterUnpaidOrder = "//*[@id=\"wmPersonalCenterScreen\"]/div/div[2]/ul/li[1]/a"; //进入未支付订单页面
	public  String EnterUnpaidOrder = "进入未支付订单页面";
	public  String getUnpaidOrderList = "//*[@id=\"wmOrderListScreen\"]/div/div"; //获取全部未支付订单列表
	public  String GetUnpaidOrderList = "获取全部未支付订单列表";
	public  String getCurrentOrderGoodsName = "//*[@id=\"wmOrderListScreen\"]/div/div[1]/div[2]/ul/li/div/div[2]/p"; //获取当前订单商品名
	public  String GetCurrentOrderGoodsName = "获取未付订单商品名";
	public  String getCurrentOrderPrice = "//*[@id=\"wmOrderListScreen\"]/div/div[1]/div[1]/span/span[2]"; //获取当前订单价格
	public  String GetCurrentOrderPrice = "获取未付订单价格";
	public  String enterAddressManagement = "//*[@id=\"wmPersonalCenterScreen\"]/div/div[3]/a[2]/span"; //进入管理地址页面
	public  String EnterAddressManagement = "进入管理地址页面";
	public  String editAddress = "//*[@id=\"wmAddressListScreen\"]/div/ul/li[1]/i[2]"; //编辑地址
	public  String EditAddress = "编辑地址";
	public  String removeAddress = "//*[@id=\"wmAddressItemScreen\"]/div/p";  //删除地址
	public  String RemoveAddress = "删除地址";
	public  String confirmRemove = "/html/body/div[4]/div[2]/div[2]/button[1]"; //确认删除地址
	public  String ConfirmRemove = "确认删除地址";
	
	
	public  By shopName_xpath = By.xpath(shopNameXpath);
	public  By goodsName_xpath = By.xpath(goodsName);
	public  By goods_xpath = By.xpath(goodsXpath);
	public  By goodsStock_xpath = By.xpath(goodsStocks);
	public  By goodsPrice_xpath = By.xpath(goodsPrice);
	public  By buyNow_xpath = By.xpath(buyNow);
	public  By addGoods_xpath = By.xpath(addGoods);
	public  By getCartGoods_xpath = By.xpath(getCartGoods);
	public  By addCartII_xpath = By.xpath(addCartII);
	public  By cartIcon_xpath = By.xpath(cartIcon);
	public  By pay_xpath = By.xpath(pay);
	public  By receiver_name = By.name(inputReceiver);
	public  By mobile_name = By.name(inputMobile);
	public  By receiverAddress_xpath = By.xpath(inputReceiverAddress);
	public  By nextStep_xpath = By.xpath(nextStep);
	public  By accountMobile_name = By.name(accountMobile);
	public  By saveReceiverInfo_xpath = By.xpath(saveReceiverInfo);
	public  By getReceiver_xpath = By.xpath(getReceiver);
	public  By getMobile_xpath = By.xpath(getMobile);
	public  By getReceiverAddress_xpath = By.xpath(getReceiverAddress);
	public  By getOrderPrice_xpath = By.xpath(getOrderPrice);
	public  By payOrder_xpath = By.xpath(payOrder);
	public  By myOrderCenter_xpath = By.xpath(myOrderCenter);
	public  By getUserName_xpath = By.xpath(getUserName);
	public  By enterUnpaidOrder_xpath = By.xpath(enterUnpaidOrder);
	public  By getUnpaidOrderList_xpath = By.xpath(getUnpaidOrderList);
	public  By getCurrentOrderGoodsName_xpath = By.xpath(getCurrentOrderGoodsName);
	public  By getCurrentOrderPrice_xpath = By.xpath(getCurrentOrderPrice);
	public  By enterAddressManagement_xpath = By.xpath(enterAddressManagement);
	public  By editAddress_xpath = By.xpath(editAddress);
	public  By removeAddress_xpath = By.xpath(removeAddress);
	public  By confirmRemove_xpath = By.xpath(confirmRemove);
	
	public PageObject(WebDriver driver) {
		super(driver);
	}
	
	
	/**
	 * 获取店铺名
	 * @param driver
	 *
	 */
	public String getShopName(WebDriver driver){
		WebElement element = this.getElement(driver, shopName_xpath,ShopName);
		return element.getText();
	}
	
	/**
	 * 进入商品详情页面
	 * @param driver
	 *
	 */
	public void enterGoodsPage(WebDriver driver){
		WebElement element = this.getElement(driver, goods_xpath,GoodsLink);
		element.click();
	}
	
	/**
	 * 获取商品名
	 * @param driver
	 *
	 */
	public String getGoodsName(WebDriver driver){
		WebElement element = this.getElement(driver, goodsName_xpath,GoodsName);
		return element.getText();
	}
	
	/**
	 * 获取商品库存
	 * @param driver
	 *
	 */
	public String getGoodsStocks(WebDriver driver){
		WebElement element = this.getElement(driver, goodsStock_xpath,GoodsStocks);
		return element.getText();
	}
	
	/**
	 * 获取商品价格
	 * @param driver
	 *
	 */
	public String getGoodsPrice(WebDriver driver){
		WebElement element = this.getElement(driver, goodsPrice_xpath,GoodsPrice);
		return element.getText();
	}
	
	
	/**
	 * 加入购物车第一步
	 * @param driver
	 */
	public void buyNow(WebDriver driver){
		WebElement element = this.getElement(driver, buyNow_xpath,BuyNow);
		element.click();
	}
	
	/**
	 * 添加商品数量,每次调用添加一
	 * @param driver
	 */
	public void addGoods(WebDriver driver){
		WebElement element = this.getElement(driver, addGoods_xpath,AddGoods);
		element.click();
	}
	
	/**
	 * 获取购物车中商品数量
	 * @param driver
	 */
	public String getCartGoods(WebDriver driver){
		WebElement element = this.getElement(driver, getCartGoods_xpath,GetCartGoods);
		return element.getAttribute("value");
	}
	
	
	/**
	 * 加入购物车第二步
	 * @param driver
	 */
	public void addCartII(WebDriver driver){
		WebElement element = this.getElement(driver, addCartII_xpath,AddCartSecendStep);
		element.click();
	}
	
	
	/**
	 * 点击购物车ICON
	 * @param driver
	 */
	public void clickCartIcon(WebDriver driver){
		WebElement element = this.getElement(driver, cartIcon_xpath,CartIcon);
		element.click();
	}
	
	/**
	 * 支付
	 * @param driver
	 */
	public void clickPay(WebDriver driver){
		WebElement element = this.getElement(driver, pay_xpath,PayFirstStep);
		element.click();
	}
	
	/**
	 * 收货人输入框
	 * @param driver
	 * @param name
	 */
	public void inputReceiverName(WebDriver driver,String name){
		WebElement element = this.getElement(driver, receiver_name,InputReceiver);
		element.sendKeys(name);
	}
	
	
	/**
	 * 手机输入框
	 * @param driver
	 * @param mobile
	 */
	public void inputMobile(WebDriver driver,String mobile){
		WebElement element = this.getElement(driver, mobile_name,InputMobile);
		element.sendKeys(mobile);
	}
	
	/**
	 * 收货地址输入框
	 * @param driver
	 * @param address
	 */
	public void inputReceiverAddress(WebDriver driver,String address){
		WebElement element = this.getElement(driver, receiverAddress_xpath,InputReceiverAddress);
		element.sendKeys(address);
	}
	
	/**
	 * 下一步
	 * @param driver
	 */
	public void clickNextStep(WebDriver driver){
		WebElement element = this.getElement(driver, nextStep_xpath,NextStep);
		element.click();
	}
	
	
	/**
	 * 获取我的手机号码
	 * @param driver
	 */
	public String getAccountMobile(WebDriver driver){
		WebElement element = this.getElement(driver, accountMobile_name,AccountMobile);
		return element.getAttribute("value");
	}
	
	/**
	 * 保存收货信息
	 * @param driver
	 */
	public void clickSaveReceiverInfoButton(WebDriver driver){
		WebElement element = this.getElement(driver, saveReceiverInfo_xpath,SaveReceiverInfo);
		element.click();
	}
	
	/**
	 * 获取订单确认页收货人
	 * @param driver
	 */
	public String getReceiver(WebDriver driver){
		WebElement element = this.getElement(driver, getReceiver_xpath,GetReceiver);
		return element.getText();
	}
	
	/**
	 * 获取订单确认页手机号码
	 * @param driver
	 */
	public String getMobile(WebDriver driver){
		WebElement element = this.getElement(driver, getMobile_xpath,GetMobile);
		return element.getText();
	}
	
	
	/**
	 * 获取订单确认页收货地址
	 * @param driver
	 */
	public String getReceiverAddress(WebDriver driver){
		WebElement element = this.getElement(driver, getReceiverAddress_xpath,GetReceiverAddress);
		return element.getText();
	}
	
	
	/**
	 * 获取订单总价
	 * @param driver
	 */
	public String getOrderPrice(WebDriver driver){
		WebElement element = this.getElement(driver, getOrderPrice_xpath,GetOrderPrice);
		return element.getText();
	}
	
	
	/**
	 * 支付订单
	 * @param driver
	 */
	public void payOrder(WebDriver driver){
		WebElement element = this.getElement(driver, payOrder_xpath,PayOrder);
		element.click();
	}
	
	
	/**
	 * 进入我的订单中心
	 * @param driver
	 */
	public void myOrderCenter(WebDriver driver){
		WebElement element = this.getElement(driver, myOrderCenter_xpath,MyOrderCenter);
		element.click();
	}
	
	/**
	 * 获取用户名
	 * @param driver
	 */
	public String getUserName(WebDriver driver){
		WebElement element = this.getElement(driver, getUserName_xpath,GetUserName);
		return element.getText();
	}

	
	/**
	 * 进入待付款订单页面
	 * @param driver
	 */
	public void enterUnpaidOrder(WebDriver driver){
		WebElement element = this.getElement(driver, enterUnpaidOrder_xpath,EnterUnpaidOrder);
		element.click();
	}
	
	/**
	 * 获取未支付订单列表
	 * @param driver
	 */
	public List<WebElement> getUnpaidOrderList(WebDriver driver){
		List<WebElement> elements = this.getElements(driver, getUnpaidOrderList_xpath,GetUnpaidOrderList);
		return elements;
	}
	
	/**
	 * 获取当前添加订单商品名
	 * @param driver
	 */
	public String getCurrentOrderGoodsName(WebDriver driver){
		WebElement element = this.getElement(driver, getCurrentOrderGoodsName_xpath,GetCurrentOrderGoodsName);
		return element.getText();
	}
	
	/**
	 * 获取当前添加订单价格
	 * @param driver
	 */
	public String getCurrentOrderPrice(WebDriver driver){
		WebElement element = this.getElement(driver, getCurrentOrderPrice_xpath,GetCurrentOrderPrice);
		return element.getText();
	}
	
	/**
	 * 进入待管理地址页面
	 * @param driver
	 */
	public void enterAddressManagement(WebDriver driver){
		WebElement element = this.getElement(driver, enterAddressManagement_xpath,EnterAddressManagement);
		element.click();
	}
	
	/**
	 * 编辑地址
	 * @param driver
	 */
	public void editAddress(WebDriver driver){
		WebElement element = this.getElement(driver, editAddress_xpath,EditAddress);
		element.click();
	}
	
	/**
	 * 删除地址
	 * @param driver
	 */
	public void removeAddress(WebDriver driver){
		WebElement element = this.getElement(driver, removeAddress_xpath,RemoveAddress);
		element.click();
	}
	
	/**
	 * 确认删除地址
	 * @param driver
	 */
	public void confirmRemove(WebDriver driver){
		WebElement element = this.getElement(driver, confirmRemove_xpath,ConfirmRemove);
		element.click();
	}
	
	
}

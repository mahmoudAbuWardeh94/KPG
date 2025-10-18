package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shipment {
	private WebDriver driver;
	private WebDriverWait wait;
	private Actions actions; // ← single Actions instance

	private By shipperNameLabel = By.xpath("//label[normalize-space()='Shipper Name']");
	private By shipperNameField = By.xpath("//input[@placeholder='Shipper Name']");
	private By shippingDateField = By.xpath("//input[@placeholder='Shipping Date']");
	private By estimatedDeliveryDateField = By.xpath("//input[@placeholder='Estimated Delivery Date']");
	private By customsDeclaredValueField = By.xpath("//input[@name='customsDeclaredValue']");
	private By goodsCurrencyField = By.xpath("//div[@id='pn_id_7']//div[@aria-label='dropdown trigger']");
	private By customerNameField = By.xpath("//span[@aria-label='Customer Name']");
	private By branchNameField = By.xpath("//span[@aria-label='Branch Name']");
	private By productTypeField = By.xpath("//span[@aria-label='Product Type']");
	private By goodsDescriptionField = By.xpath("//textarea[@placeholder='Goods Description']");
	private By shipperTypeField = By.xpath("//textarea[@placeholder='Shipper Type']");
	private By COD_AmountField = By.xpath("//input[@placeholder='COD Amount']");
	private By COD_CurrencyField = By.xpath("//span[@aria-label='COD Currency']");
	private By dutyHandlingField = By.xpath("//span[@aria-label='Duty Handling']");
	private By numberOfPiescesField = By.xpath("//input[@placeholder='Number Of Pieces']");
	private By lengthField = By.xpath("//input[@placeholder='Length']");
	private By widthField = By.xpath("//input[@placeholder='Width']");
	private By heightField = By.xpath("//input[@placeholder='Height']");
	private By dimensionUnitField = By.xpath("//span[@aria-label='Dimension Unit']");
	private By valueField = By.xpath("//input[@placeholder='Value']");
	private By unitofMeasureField = By.xpath("//span[@aria-label='Unit of Measure']");
	private By shipperDetailsTab = By.xpath("//a[@id='pn_id_2_header_action']");
	private By arrowUpButton = By.xpath("//img[@src='./../../../../../assets/images/arrow-up-svgrepo-com.svg']");
	private By addressLine1Field = By.xpath("//div[@id='pn_id_2_content']//input[@placeholder='Address Line1']");
	private By countryField = By
			.xpath("//div[@id='pn_id_24']//span[@aria-label='Country'][normalize-space()='Country']");
	private By cityField = By.xpath("//div[@id='pn_id_26']//span[@aria-label='City'][normalize-space()='City']");
	private By contactPersonNameField = By
			.xpath("//div[@id='pn_id_2_content']//input[@placeholder='Contact Person Name']");
	private By phoneNumber1Field = By.xpath("//input[@id='mat-input-0']");
	private By consigneeDetailsTab = By.xpath("//a[@id='pn_id_3_header_action']");
	private By addressLine1ConsigneeField = By.xpath("//input[@value='line1']");
	private By countryConsigneeField = By
			.xpath("//div[@id='pn_id_28']//span[@aria-label='Country'][normalize-space()='Country']");
	private By cityConsigneeField = By
			.xpath("//div[@id='pn_id_30']//span[@aria-label='City'][normalize-space()='City']");
	private By districtField = By.xpath("//input[@placeholder='District']");
	private By contactPersonNameConsigneeField = By
			.xpath("//div[@id='pn_id_3_content']//div//input[@placeholder='Contact Person Name']");
	private By emailField = By.xpath("(//input[@value='emailAddress'])[2]");
	private By phoneNumber1ConsigneeField = By.xpath("//input[@id='mat-input-2']");
	private By itemTab = By.xpath("//span[normalize-space()='Items']");
	private By goodsDescriptionItemField = By.xpath("//input[@formcontrolname='goodsDescription']");
	private By commodityCodeField = By.xpath("//input[@formcontrolname='commodityCode']");
	private By countryOfOriginField = By.xpath("//span[@aria-label='Country of Origin']");
	private By supplierCodeField = By.xpath("//span[@aria-label='Supplier Code']");
	private By goodsCurrency = By
			.xpath("//div[@id='pn_id_34']//span[@aria-label='Goods Currency'][normalize-space()='Goods Currency']");
	private By saveButton = By.xpath("//div[@class='ng-star-inserted']");

	public Shipment(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.actions = new Actions(driver);

	}

	public boolean shipperNameIsDisplayed() {
		WebElement shipperNme = wait.until(ExpectedConditions.visibilityOfElementLocated(shipperNameLabel));
		return shipperNme.isDisplayed();
	}

	public void enterShipperName(String shipperName) {
		WebElement shippField = wait.until(ExpectedConditions.visibilityOfElementLocated(shipperNameField));
		shippField.sendKeys(shipperName);
	}

	public void enterShippingDate() {
		WebElement shippingDte = wait.until(ExpectedConditions.visibilityOfElementLocated(shippingDateField));
		actions.moveToElement(shippingDte).click().sendKeys("01012029").sendKeys(Keys.TAB).sendKeys("01011").perform();
	}

	public void enterEstimatedDeliveryDate() {
		WebElement shippingEstimatedDte = wait
				.until(ExpectedConditions.visibilityOfElementLocated(estimatedDeliveryDateField));
		actions.moveToElement(shippingEstimatedDte).click().sendKeys("02012029").sendKeys(Keys.TAB).sendKeys("01011")
				.perform();
	}

	public void enterCustomsDeclaredValue(String customsDeclaredValue) {
		WebElement customFld = wait.until(ExpectedConditions.visibilityOfElementLocated(customsDeclaredValueField));
		customFld.sendKeys(customsDeclaredValue);
	}

	public void selectOnGoodsCurrency() {
		WebElement goodsCurrencyFld = wait.until(ExpectedConditions.visibilityOfElementLocated(goodsCurrencyField));
		actions.moveToElement(goodsCurrencyFld).click().sendKeys("CNY").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
				.perform();
	}

	public void selectCustomerName() {
		WebElement customerNameFld = wait.until(ExpectedConditions.visibilityOfElementLocated(customerNameField));
		actions.moveToElement(customerNameFld).click().sendKeys("vogacloset").sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).perform();
	}

	public void selectBranchName() {
		WebElement branchNameFld = wait.until(ExpectedConditions.visibilityOfElementLocated(branchNameField));
		actions.moveToElement(branchNameFld).click().sendKeys("Yutu").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
				.perform();
	}

	public void selectProductType() {
		WebElement productTypeFld = wait.until(ExpectedConditions.visibilityOfElementLocated(productTypeField));
		actions.moveToElement(productTypeFld).click().sendKeys("EC-GET").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
				.perform();
	}

	public void enterGoodsDescription(String goodsDescription) {
		WebElement goodsDescFld = wait.until(ExpectedConditions.visibilityOfElementLocated(goodsDescriptionField));
		goodsDescFld.sendKeys(goodsDescription);
	}

	public void enterShipperType(String shipperType) {
		WebElement shipperTypeFld = wait.until(ExpectedConditions.visibilityOfElementLocated(shipperTypeField));
		shipperTypeFld.sendKeys(shipperType);
	}

	public void enterCODAmount(String codAmount) {
		WebElement codAmountFld = wait.until(ExpectedConditions.visibilityOfElementLocated(COD_AmountField));
		codAmountFld.sendKeys(codAmount);
	}

	public void selectCODCurrency() {
		WebElement codCurrencyFld = wait.until(ExpectedConditions.visibilityOfElementLocated(COD_CurrencyField));
		actions.moveToElement(codCurrencyFld).click().sendKeys("CNY").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
				.perform();
	}

	public void selectSupplierCode() {
		WebElement supplierCodeFld = wait.until(ExpectedConditions.visibilityOfElementLocated(supplierCodeField));
		actions.moveToElement(supplierCodeFld).click().sendKeys("hong kong post").sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).perform();
	}

	public void selectDutyHandling() {
		WebElement dutyHandlingFld = wait.until(ExpectedConditions.visibilityOfElementLocated(dutyHandlingField));
		actions.moveToElement(dutyHandlingFld).click().sendKeys("Paid").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
				.perform();
	}

	public void enterNumberOfPieces(String numberOfPieces) {
		WebElement numberOfPiecesFld = wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfPiescesField));
		numberOfPiecesFld.sendKeys(numberOfPieces);
	}

	public void enterLength(String length) {
		WebElement lengthFld = wait.until(ExpectedConditions.visibilityOfElementLocated(lengthField));
		lengthFld.sendKeys(length);
	}

	public void enterWidth(String width) {
		WebElement widthFld = wait.until(ExpectedConditions.visibilityOfElementLocated(widthField));
		widthFld.sendKeys(width);
	}

	public void enterHeight(String height) {
		WebElement heightFld = wait.until(ExpectedConditions.visibilityOfElementLocated(heightField));
		heightFld.sendKeys(height);
	}

	public void selectDimensionUnit() {
		WebElement dimensionUnitFld = wait.until(ExpectedConditions.visibilityOfElementLocated(dimensionUnitField));
		actions.moveToElement(dimensionUnitFld).click().sendKeys(Keys.ENTER).perform();
	}

	public void enterValue(String value) {
		WebElement valueFld = wait.until(ExpectedConditions.visibilityOfElementLocated(valueField));
		valueFld.sendKeys(value);
	}

	public void selectUnitofMeasureField() {
		WebElement unitOFMeasureFld = wait.until(ExpectedConditions.visibilityOfElementLocated(unitofMeasureField));
		actions.moveToElement(unitOFMeasureFld).click().sendKeys(Keys.ENTER).perform();
	}

	public void clickOnArrowUpButton() {
		WebElement arrowUpBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(arrowUpButton));
		arrowUpBtn.click();
	}

	public void clickOnShipperDetailsTab() {
		WebElement shipperTab = wait.until(ExpectedConditions.visibilityOfElementLocated(shipperDetailsTab));
		shipperTab.click();
	}

	public void enterAddressLine1(String addressLine1) {
		WebElement addressLine1Fld = wait.until(ExpectedConditions.visibilityOfElementLocated(addressLine1Field));
		addressLine1Fld.sendKeys(addressLine1);
	}

	public void selectCountry() {
		WebElement countryFld = wait.until(ExpectedConditions.visibilityOfElementLocated(countryField));
		actions.moveToElement(countryFld).click().sendKeys("China").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
				.perform();
	}

	public void selectCity() {
		WebElement cityFld = wait.until(ExpectedConditions.visibilityOfElementLocated(cityField));
		actions.moveToElement(cityFld).click().sendKeys("Beijing").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
				.perform();
	}

	public void enterContactPersonName(String contactPersonName) {
		WebElement contactPersonNameFld = wait
				.until(ExpectedConditions.visibilityOfElementLocated(contactPersonNameField));
		contactPersonNameFld.sendKeys(contactPersonName);
	}

	public void enterPhoneNumber1(String phoneNumber1) {
		WebElement phoneNumber1Fld = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumber1Field));
		phoneNumber1Fld.sendKeys(phoneNumber1);
	}

	public void clickOnConsigneeDetailsTab() {
		WebElement consigneeDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(consigneeDetailsTab));
		consigneeDetails.click();
	}

	public void enterAddressLine1Consignee(String addressLine1Consignee) {
		WebElement addressLine1ConsigneeFld = wait
				.until(ExpectedConditions.visibilityOfElementLocated(addressLine1ConsigneeField));
		addressLine1ConsigneeFld.sendKeys(addressLine1Consignee);
	}

	public void selectCountryConsignee() {
		WebElement countryConsigneeFld = wait
				.until(ExpectedConditions.visibilityOfElementLocated(countryConsigneeField));
		actions.moveToElement(countryConsigneeFld).click().sendKeys("Spain").sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).perform();
	}

	public void selectCityConsignee() {
		WebElement cityConsigneeFld = wait.until(ExpectedConditions.visibilityOfElementLocated(cityConsigneeField));
		actions.moveToElement(cityConsigneeFld).click().sendKeys("Madrid").sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).perform();
	}

	public void enterDistrict(String district) {
		WebElement districtFld = wait.until(ExpectedConditions.visibilityOfElementLocated(districtField));
		districtFld.sendKeys(district);
	}

	public void enterContactPersonNameConsignee(String contactPersonNameConsignee) {
		WebElement contactPersonNameConsigneeFld = wait
				.until(ExpectedConditions.visibilityOfElementLocated(contactPersonNameConsigneeField));
		contactPersonNameConsigneeFld.sendKeys(contactPersonNameConsignee);
	}

	public void enterEmail(String email) {
		WebElement emailFld = wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
		emailFld.sendKeys(email);
	}

	public void enterPhoneNumber1Consignee(String phoneNumber1consignee) {
		WebElement phoneNumber1ConsigneeFld = wait
				.until(ExpectedConditions.visibilityOfElementLocated(phoneNumber1ConsigneeField));
		phoneNumber1ConsigneeFld.sendKeys(phoneNumber1consignee);
	}

	public void clickOnItemTab() {
		WebElement itemTb = wait.until(ExpectedConditions.visibilityOfElementLocated(itemTab));
		itemTb.click();
	}

	public void enterGoodsDescriptionItemField(String goodsDescriptionItem) {
		WebElement goodsDescriptionItemFld = wait
				.until(ExpectedConditions.visibilityOfElementLocated(goodsDescriptionItemField));
		goodsDescriptionItemFld.sendKeys(goodsDescriptionItem);
	}

	public void enterCommodityCodeField(String commodityCode) {
		WebElement commodityCodeFld = wait.until(ExpectedConditions.visibilityOfElementLocated(commodityCodeField));
		commodityCodeFld.sendKeys(commodityCode);
	}

	public void selectCountryOfOrigin() {
		WebElement countryOfOriginFld = wait.until(ExpectedConditions.visibilityOfElementLocated(countryOfOriginField));
		actions.moveToElement(countryOfOriginFld).click().sendKeys("China").sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).perform();
	}

	public void selectGoodsCurrency() {
		WebElement goodsCurrencyFld = wait.until(ExpectedConditions.visibilityOfElementLocated(goodsCurrency));
		actions.moveToElement(goodsCurrencyFld).click().sendKeys("CNY").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
				.perform();
	}

	public void clickOnSaveButton() {
		WebElement saveBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton));
		saveBtn.click();
	}

}

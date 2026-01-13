package com.stepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.base.Base;
import com.pages.Shipment;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateShipment {
	private WebDriver driver;
	private Shipment shipment;
	private SoftAssert softassert = new SoftAssert();

	@When("the user navigates to the shipment page")
	public void navigateToCreateShipment() throws InterruptedException {
		this.driver = Base.getDriver();
		this.shipment = new Shipment(driver);

		Thread.sleep(4000);
		driver.navigate().to("https://uat-kpg.gnteq.app/#/gnconnect/shipment-new");
		Thread.sleep(2000);

		boolean shipperName = shipment.shipperNameIsDisplayed();
		softassert.assertTrue(shipperName);
		softassert.assertAll();

	}

	@And("the user enters shipment details")
	public void enterShipmentDetails() throws InterruptedException {
		shipment.enterShipperName("Mahmoud");
		shipment.enterShippingDate();
		shipment.enterEstimatedDeliveryDate();
		shipment.enterCustomsDeclaredValue("10");
		shipment.selectOnGoodsCurrency();
		shipment.selectCustomerName();
		Thread.sleep(2000);
		shipment.selectBranchName();
		Thread.sleep(2000);
		shipment.selectProductType();
		shipment.enterGoodsDescription("Test description");
		shipment.enterShipperType("Test Shipper");
		shipment.enterCODAmount("1");
		shipment.selectCODCurrency();
		shipment.selectSupplierCode();
		shipment.selectDutyHandling();
		shipment.enterNumberOfPieces("1");
		shipment.enterLength("1");
		shipment.enterWidth("1");
		shipment.enterHeight("1");
		shipment.selectDimensionUnit();
		shipment.enterValue("1");
		shipment.selectUnitofMeasureField();
		shipment.clickOnArrowUpButton();
		Thread.sleep(1000);
		shipment.clickOnShipperDetailsTab();

		// ----------------Shipper Details--------------------------
		shipment.enterAddressLine1("China - Beijing");
		shipment.selectCountry();
		shipment.selectCity();
		shipment.enterContactPersonName("Mahmoud Abu Wardeh");
		shipment.enterPhoneNumber1("8877445599");
		shipment.clickOnConsigneeDetailsTab();

		// ----------------Consignee Details--------------------------
		shipment.enterAddressLine1Consignee("Spain");
		shipment.selectCountryConsignee();
		Thread.sleep(1000);
		shipment.selectCityConsignee();
		shipment.enterDistrict("Spain - Madrid");
		shipment.enterContactPersonNameConsignee("Pedri");
		shipment.enterEmail("Test@test.com");
		shipment.enterPhoneNumber1Consignee("8877445599");
		shipment.clickOnItemTab();

		// ----------------Items-----------------
		shipment.enterGoodsDescriptionItemField("Test Description");
		shipment.enterCommodityCodeField("123456");
		shipment.selectCountryOfOrigin();
		shipment.selectGoodsCurrency();
//		shipment.clickOnSaveButton();

	}

}
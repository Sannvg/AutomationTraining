package com.POS.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.POS.BaseClass.BaseClass;

public class Customer extends BaseClass {
	@FindBy(css = "select[name='Table_length']")
	private WebElement drpShowCustomer;
	@FindBy(css = "input[type='search']")
	private WebElement txtSearchCustomer;
	@FindBy(css = "table[id='Table']")
	private WebElement tblCustomer;
	@FindBy(xpath = "//button[@data-target='#AddCustomer']")
	private WebElement btnAddCustomer;
	@FindBy(className = "pagination")
	private WebElement tblPaginationCustomer;
	@FindBy(xpath = "(//a[@data-original-title='Delete'])[1]")
	private WebElement btndeleteCustomer;
	@FindBy(xpath = "//a[@class='btn btn-danger']")
	private WebElement btndeleteConfirm;
	@FindBy(xpath = "(//a[@data-original-title='Edit'])[1]")
	private WebElement btneditCustomer;

	public Customer() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement showCustomer() {
		return drpShowCustomer;
	}

	public WebElement searchCustomer() {
		return txtSearchCustomer;
	}

	public WebElement tableCustomer() {
		return tblCustomer;
	}

	public WebElement btnAddCustomer() {
		return btnAddCustomer;
	}

	public WebElement pageIndexCustomer() {
		return tblPaginationCustomer;
	}

	public WebElement btndeleteCustomer() {
		return btndeleteCustomer;
	}

	public WebElement btndeleteConfirm() {
		return btndeleteConfirm;
	}

	public WebElement btneditCustomer() {
		return btneditCustomer;
	}
}

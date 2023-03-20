package com.POS.PageObjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.POS.BaseClass.BaseClass;

public class Supplier extends BaseClass {
	@FindBy(xpath = "//i[@class='fa fa-truck']")
	private WebElement menuSupplier;
	@FindBy(css = "select[name='Table_length']")
	private WebElement drpShowSupplier;
	@FindBy(css = "input[type='search']")
	private WebElement txtSearchSupplier;
	@FindBy(css = "table[id='Table']")
	private WebElement tblSupplier;
	@FindBy(css = "table[id='Table']")
	private List<WebElement> listtblSupplier;
	@FindBy(xpath = "//button[@data-target='#AddSupplier']")
	private WebElement btnAddSupplier;
	@FindBy(className = "pagination")
	private WebElement tblPaginationSupplier;

	public Supplier() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement menuSupplier() {
		return menuSupplier;
	}

	public WebElement drpShowSupplier() {
		return drpShowSupplier;
	}

	public WebElement txtSearchSupplier() {
		return txtSearchSupplier;
	}

	public List<WebElement> listtblSupplier() {
		return listtblSupplier;
	}

	public WebElement tableSupplier() {
		return tblSupplier;
	}

	public WebElement btnAddSupplier() {
		return btnAddSupplier;
	}

	public WebElement tblPaginationSupplier() {
		return tblPaginationSupplier;
	}
}

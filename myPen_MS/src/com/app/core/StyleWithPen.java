package com.app.core;

import java.time.LocalDate;

public class StyleWithPen {

	private static int ID = 0;
	private String stockId;
	private Brand brandName;
	private String color;
	private String inkColor;
	private Material materialName;
	private int stock;
	private LocalDate stockUpdateDate;
	private LocalDate stockListingDate;
	private int price;
	private int discount;

	public StyleWithPen(String stockId, Brand brandName, String color, String inkColor, Material materialName,
			int stock, LocalDate stockUpdateDate, LocalDate stockListingDate, int price) {

		++ID;
		this.stockId = stockId;
		this.brandName = brandName;
		this.color = color;
		this.inkColor = inkColor;
		this.materialName = materialName;
		this.stock = stock;
		this.stockUpdateDate = stockUpdateDate;
		this.stockListingDate = stockListingDate;
		this.price = price;
		this.discount = 0;
	}

	@Override
	public String toString() {
		return "StyleWithPen [stockId=" + stockId + ", brandName=" + brandName + ", color=" + color + ", inkColor="
				+ inkColor + ", materialName=" + materialName + ", stock=" + stock + ", stockUpdateDate="
				+ stockUpdateDate + ", stockListingDate=" + stockListingDate + ", price=" + price + ", discount="
				+ discount + "]";
	}

	public StyleWithPen(String stockId) {
		this.stockId = stockId;
	}

	public static int getID() {
		return ID;
	}

	public String getStockId() {
		return stockId;
	}

	public Brand getBrandName() {
		return brandName;
	}

	public String getColor() {
		return color;
	}

	public String getInkColor() {
		return inkColor;
	}

	public Material getMaterialName() {
		return materialName;
	}

	public int getStock() {
		return stock;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}

	public int getPrice() {
		return price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setStock(int newStock) {

		stock = newStock;

	}

	public void setStockUpdateDate(LocalDate changeDate) {

		stockUpdateDate = changeDate;
		
	}
	
	public void setDiscount(int discounted)
	{
		discount = discounted;
	}

}

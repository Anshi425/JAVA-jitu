package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Map;

import com.app.core.Brand;
import com.app.core.Material;
import com.app.core.StyleWithPen;

import custom_exceptions.PenStockException;

public class PenValidationRules {
	
	public static Brand parseBrandName(String brandName) throws IllegalArgumentException
	{
		return Brand.valueOf(brandName.toUpperCase());
	}
	
	public static Material parseMaterialName(String materialName) throws IllegalArgumentException
	{
		return Material.valueOf(materialName.toUpperCase());
	}
	
	public static LocalDate parseDate(String date) throws DateTimeParseException
	{
		return LocalDate.parse(date);
	}

	public static StyleWithPen validateAllInputs(String stockId, String brandName,String color,String inkColor,String materialName,
			int stock,String stockUpdateDate,String stockListingDate,int price,Map<String, StyleWithPen> penMap) {
		
		Brand parsedBrandName = parseBrandName(brandName);
		Material parsedMaterialName = parseMaterialName(materialName);		
		LocalDate parsedUpdateDate = parseDate(stockUpdateDate);
		LocalDate parsedListingDate = parseDate(stockListingDate);
		
		return new StyleWithPen(stockId, parsedBrandName, color, inkColor, parsedMaterialName, stock, parsedUpdateDate, parsedListingDate, price);
	}
	
	public static void updateStockOfPen(String stockId, int newStock, String changeDate, Map<String, StyleWithPen> penMap) throws PenStockException
	{
		StyleWithPen stockRef = penMap.get(stockId);
		
		if(stockRef == null)
			throw new PenStockException("Stock Id is non-existent, can NOT make Updation !!");
		 
		stockRef.setStockUpdateDate(parseDate(changeDate));
		stockRef.setStock(newStock);
	}
}

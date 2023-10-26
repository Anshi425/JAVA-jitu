package Fashion_utils;

import static java.time.LocalDate.*;

import java.time.Period;
import java.util.Map;

import com.app.core.Brand;
import com.app.core.Category;
import com.app.core.Fashion;

import custom_exceptions.FashionHandlingException;
import static utils.FashionValidationRules.*;

//import java.time.LocalDate;

public class FunctionsOfFashion {

	public static void updateStock(int StockId, int newStock, Map<Integer, Fashion> fMap)
			throws FashionHandlingException {

		if (!fMap.containsKey(StockId))
			throw new FashionHandlingException("Stock Id does NOT exist !!");
		else {
			fMap.get(StockId).setStock(newStock);
			fMap.get(StockId).setStockUpdateDate(now());
			System.out.println(
					"\n Successfully Updated Stock value at date: " + fMap.get(StockId).getStockUpdateDate() + "\n");
		}

	}

	public static void setDiscount(String cat, String brand, int discount, Map<Integer, Fashion> fMap) {

		Category parsedCat = parseCat(cat);
		Brand parsedBrand = parseBrand(brand);

		for (Fashion f : fMap.values()) {

			if (f.getBrandName().equals(parsedBrand) && f.getCategory().equals(parsedCat))
				f.setDiscount(discount);

		}

	}

	public static void removeClothes(Map<Integer, Fashion> fMap) {

		for (Map.Entry<Integer, Fashion> f : fMap.entrySet()) {

			Period diff = Period.between(f.getValue().getStockUpdateDate(), now());
			int months = (diff.getYears() * 12) + diff.getMonths();
			if (months > 2) {
				/* Fashion removedRef = */fMap.remove(f.getKey());
//				System.out.println("details of removed Cloth: \n" + removedRef);
			}
		}
	}
	
	
	public static void listOutClothOutOfStockToday(Map<Integer, Fashion> fMap) {
		
		for(Fashion f : fMap.values()) {
			
			if(f.getStock()==0)
				System.out.println(f);
				
		}
		
		
	}
	

}

package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import com.app.core.Brand;
import com.app.core.Category;
import com.app.core.Fashion;
import com.app.core.Size;

public class FashionValidationRules {

//	Category cloth, int stock, LocalDate stockUpdateDate, Size sizeValue, int price,
//	Brand brandName, String color

	public static Category parseCat(String cat) throws IllegalArgumentException {

		return Category.valueOf(cat.toUpperCase());
	}

	public static LocalDate parseDate(String date) throws DateTimeParseException {

		return LocalDate.parse(date);
	}

	public static Size parseSize(String sizeValue) throws IllegalArgumentException {

		return Size.valueOf(sizeValue.toUpperCase());
	}

	public static Brand parseBrand(String brandName) {
	
		return Brand.valueOf(brandName.toUpperCase());
	}

	public static Fashion validateAllInputs(String cat, int stock, String date, String sizeValue, int price,
			String brandName, String color) {

		Category parsedCat = parseCat(cat);
		LocalDate parsedDate = parseDate(date);
		Size parsedSize = parseSize(sizeValue);
		Brand parsedBrand = parseBrand(brandName);

		return new Fashion(parsedCat, stock, parsedDate, parsedSize, price, parsedBrand, color);
	}

}

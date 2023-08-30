package day3;

import org.openqa.selenium.By;

public class Switch {
	public static void printDayOfWeek(int n) {
		switch(n) {
		case 2: 
			System.out.println("Thứ 2");
			break;
		case 3: 
			System.out.println("Thứ 3");
			break;
		case 4: 
			System.out.println("Thứ 4");
			break;
		case 5: 
			System.out.println("Thứ 5");
			break;
		case 6: 
			System.out.println("Thứ 6");
			break;
		case 7: 
			System.out.println("Thứ 7");
			break;
		case 8: 
			System.out.println("Chủ nhật");
			break;
		default: 
			System.out.println("Nhập lại n");
			break;
		}
		
	}
	
	public static By getLocator(String locatorType, String locatorValue) {
		By result = null;
		switch (locatorType) {
		case "id": {
			result = By.id(locatorValue);
			break;
		}
		case "name": {
			result = By.id(locatorValue);
			break;
		}
		case "linkText": {
			result = By.id(locatorValue);
			break;
		}
		case "cssSelector": {
			result = By.id(locatorValue);
			break;
		}
		case "partialLinkText": {
			result = By.id(locatorValue);
			break;
		}
		case "tagName": {
			result = By.id(locatorValue);
			break;
		}
		case "xpath": {
			result = By.id(locatorValue);
			break;
		}
		default: System.out.println("Locator is invalid");
		}

		return result;
	}

}

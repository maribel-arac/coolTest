package wrapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.testng.Assert;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import globalVariables.GlobalVariables;

public class CommonMethods {
	
	public static void takeScreenshoot(WebDriver driver, String testCaseName) {
		//Toma SS de la pagina sin formato
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Establece la ruta donde se guarda el SS
		String screenshotPath = "./test-output/ExecutionResults";
		
		try {
			//se crea el folder usando la ruta especificada de la variable "screenshotPath"
			FileHandler.createDir(new File(screenshotPath));
			//copiar el SS a la ruta creada
			FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getJSONValue(String jsonFileObj, String jsonKey) {
		try {
			//Es la ruta para leer el archivo de Json
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json" );
			//el archivo json se convierte en un objeto de Json Java
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
			
			//Get Data
			String jsonValue = (String) jsonObject.getJSONObject(jsonFileObj).get(jsonKey);
			return jsonValue;
		} catch (FileNotFoundException e) {
			Assert.fail("JSON file was not found");
			return null;
		}
		
	}
		public static String getCellData(String excelName, int row, int column) {
			//read Data
			try {
				FileInputStream fis = new FileInputStream(GlobalVariables.PATH_EXCEL_DATA + excelName + ".xlsx");
				//Construir un objeto de excel
			
				@SuppressWarnings("resource")
				Workbook workbook = new XSSFWorkbook(fis); 
				Sheet sheet = workbook.getSheetAt(0);
				Row rowObject = sheet.getRow(row);
				Cell cell = rowObject.getCell(column);
				String value = cell.getStringCellValue();
				return value;
				
			} catch (FileNotFoundException e) {
				Assert.fail("Excel file wasn't found");
				return null;
			} catch (IOException e) {
				Assert.fail("Excel file couldn't be read");
				return null;
			}
		}


}

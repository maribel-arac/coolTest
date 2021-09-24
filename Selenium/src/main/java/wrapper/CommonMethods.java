package wrapper;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

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
	
	

}

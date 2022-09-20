package ePlayersTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testEplayers {
	private ChromeDriver driver;
	
	@Before
	public void pretest () {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedrive\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		this.driver.get("http://localhost:4200/login");
  	}
	
	@Test
	public void test() {
		
		String[] listaSenha = {"senha1", "xpto", "outrasenha", "12345678"};
		for(int tentativa =0; tentativa < listaSenha.length; tentativa ++) {
			
			try {
				
				WebElement inputNome = this.driver.findElement(By.id("nome"));
				WebElement inputUsuario = this.driver.findElement(By.id("usuario"));
				WebElement inputSenha = this.driver.findElement(By.id("senha"));
				WebElement inputLogin = this.driver.findElement(By.id("senha")).sendKeys(Keys.ENTER);
				
				inputNome.clear();
				inputUsuario.clear();
				inputSenha.clear();
				

				this.driver.findElement(By.id("nome")).sendKeys("vitor");
				this.driver.findElement(By.id("usuario")).sendKeys("vitor@vitor");
				this.driver.findElement(By.id("senha")).sendKeys(listaSenha[tentativa]);
				this.driver.findElement(By.id("senha")).sendKeys(Keys.ENTER);
				
				Thread.sleep(3000);
				
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
		}
		
		
	}
}

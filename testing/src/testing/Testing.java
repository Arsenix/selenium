/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.concurrent.TimeUnit;
//import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Arsenix
 */

public class Testing {
    
    WebDriver driver;
    WebDriverWait wait;
    
    public void AbrirNavegador1 (){
        System.setProperty("webdriver.chrome.driver","/Users/Arsenix/Documents/Chrome/chromedriver");
    
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait = new WebDriverWait (driver,2);
        driver.get("https://www.youtube.com");
        //driver.get("https://www.google.cl");
        //driver.get("https://backoffice.safecard.cl/");
        //Buscar();
        Youtube();
        //Login();
        //AgregarPropiedad();
        //ListadoPropiedades();
        //ListarResidentes();
        //EliminarResidente();
        //AgregarResidente();
        //BuscarResidentes();
    }
    
    public void AbrirNavegador2 (){
        System.setProperty("webdriver.chrome.driver","/Users/Arsenix/Documents/Chrome/chromedriver");
    
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait = new WebDriverWait (driver,2);
        //driver.get("https://www.youtube.com");
        //driver.get("https://www.google.cl");
        driver.get("https://backoffice.safecard.cl/");
        //Buscar();
        //Youtube();
        Login();
        //AgregarPropiedad();
        //ListadoPropiedades();
        //ListarResidentes();
        //EliminarResidente();
        //AgregarResidente();
        //BuscarResidentes();
    }
    
    void Youtube(){
        driver.findElement(By.id("search")).sendKeys("sensual seduction");
        driver.findElement(By.id("search-icon-legacy")).click();
        driver.findElement(By.id("video-title")).click();
    }
    
    void Login(){
        //Se realiza el login en backend.safecard.cl    
        driver.findElement(By.id("mobile")).sendKeys("951789537");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[5]/button")).click();
        //wait = new WebDriverWait (driver,2);
    }
    
    
    void AgregarPropiedad(){
        //Se agrega una nueva propiedad
        driver.findElement(By.className("btn btn-gray btn-xs hidden-xs hidden-sm")).click();
        driver.findElement(By.name("name")).sendKeys("Pruebas Automatizacion");
        driver.findElement(By.className("class=\"btn dropdown-toggle bs-placeholder btn-default\"")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/form/div[3]/div/div/div/ul/li[1]/a/span[1]")).click();
        driver.findElement(By.name("max_stock")).sendKeys("5"); //Se añade arbitariamente un número
        driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/form/div[5]/div/div/input")).sendKeys("1108");
        driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/form/div[6]/div/button")).click();
        wait = new WebDriverWait (driver,2);
    
    }
    void ListadoPropiedades(){
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[1]/a/span")).click();
        wait = new WebDriverWait (driver,2);
          
    }
    
    void ListarResidentes(){
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[2]/a/span")).click();
        wait = new WebDriverWait (driver,2);
        
    }
    
    void EliminarResidente(){
        driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/table[2]/tbody/tr[5]/td[9]/div[1]/button/span[1]")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/table[2]/tbody/tr[5]/td[9]/div[1]/ul/li[3]/a")).click();
    
    
    }
    
    void AgregarResidente(){
        driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div[3]/div/div[1]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/form/div[1]/div/div/button/span[1]")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/form/div[1]/div/div/div/ul/li[1]/a")).click();
        driver.findElement(By.name("mobile")).sendKeys("976357409");
        driver.findElement(By.name("name")).sendKeys("Soporte");
        driver.findElement(By.name("last_name")).sendKeys("Safecard");
        //driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/form/div[5]/div/label[1]/span[2]")).click();
        driver.findElement(By.name("submit")).click();
        wait = new WebDriverWait (driver,2);
         
    }
            
   
    void BuscarResidentes(){
        driver.findElement(By.xpath("/html/body/div/div[3]/div[4]/div/div/div/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[1]/input")).sendKeys("Soporte");
        driver.findElement(By.className("btn btn-orange btn-sm btn-buscar")).click();
        //driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[2]/button")).click(); 
        wait = new WebDriverWait (driver,2);
    }
    
    
    
    void Buscar(){
        driver.findElement(By.id("mobile")).sendKeys("976357409");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.id("submit")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div/div[1]/a[1]")).click();
        driver.findElement(By.id("name")).sendKeys("Pruebas");
        driver.findElement(By.id("rol")).sendKeys("Automatizacion");
        driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/form/div[3]/div/div/button/span[1]")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/form/div[3]/div/div/div/ul/li/a")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/form/div[6]/div/button")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div[3]/div/div[1]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/form/div[1]/div/div/button/span[1]")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div/div/div[2]/form/div[1]/div/div[1]/div/ul/li[1]/a/span[1]")).click();
        driver.findElement(By.name("mobile")).sendKeys("976357409");
        driver.findElement(By.name("name")).sendKeys("PaBlo");
        driver.findElement(By.name("last_name")).sendKeys("ReYeS");
        driver.findElement(By.name("submit")).click(); 
        
        driver.findElement(By.xpath("/html/body/div/div[3]/div[4]/div/div/div/div[2]/table[2]/tbody/tr[5]/td[9]/div[1]/button/span[1]")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/div[4]/div/div/div/div[2]/table[2]/tbody/tr[5]/td[9]/div[1]/ul/li[3]/a")).click();
           
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Testing navegador = new Testing(); 
        //navegador.AbrirNavegador1();
        navegador.AbrirNavegador2();
    }
    
}

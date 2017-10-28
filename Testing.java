/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.concurrent.TimeUnit;
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
    
    public void AbrirYoutube () throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","/Users/Arsenix/Documents/Chrome/chromedriver");
        driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait = new WebDriverWait (driver,2);
        driver.get("https://www.youtube.com");
        Youtube();
 
    }
    
    public void AbrirBackofficeSafecard (){
        System.setProperty("webdriver.chrome.driver","/Users/Arsenix/Documents/Chrome/chromedriver");
    
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait = new WebDriverWait (driver,2);
        driver.get("https://backoffice.safecard.cl/");
        Login();

    }
    
    public void AbrirDutchPassion (){
        System.setProperty("webdriver.chrome.driver","/Users/Arsenix/Documents/Chrome/chromedriver");
    
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait = new WebDriverWait (driver,2);
        driver.get("https://www.dutch-passion.com/es/");
        Cotizar();
        
    }
    
    public void AbrirSafecard(){
      System.setProperty("webdriver.chrome.driver","/Users/Arsenix/Documents/Chrome/chromedriver");
    
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait = new WebDriverWait (driver,2);
        driver.get("https://www.safecard.cl");
        Manuales();  
        
        
    }
    
    
    void Youtube() {
        // Se el buscador de youtube se escribe la cancion a buscar, posterior a esto se hace click en la lupa, buscador
        // luego se selecciona la primera opcion para la busqueda realizada.
        driver.findElement(By.id("search")).sendKeys("sensual seduction");
        driver.findElement(By.id("search-icon-legacy")).click();
        driver.findElement(By.className("style-scope ytd-item-section-renderer")).click();
    }
    
    void Login(){
        //Se realiza el login en backend.safecard.cl con telefono y contraseña de una de las promotoras   
        //Se valida que la prueba sea valida con el hecho de que haga login de forma correcta.
        driver.findElement(By.id("mobile")).sendKeys("951789537");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[5]/button")).click();
    }
    
    void Cotizar(){
        //Se realiza una busqueda sobre DutchPassion y se realiza la busqueda en sobre la semilla Auto Xtreme
        //posterior a esto se hace click en la busqueda y se selecciona el primer elemento de la busqueda, que corresponde a las semillas
        //Se añade una semilla de 3 unidades al carro de compra y se finaliza la compra
        //La prueba se valida con que se cumplan los pasos anteriormente descritos.
        driver.findElement(By.name("s")).sendKeys("Auto Xtreme");
        driver.findElement(By.id("zoekhet")).click();
        driver.findElement(By.xpath("//*[@id=\"kweekinfo\"]/div/div[1]/div[2]/p/a")).click();
        driver.findElement(By.xpath("//*[@id=\"bestelopties\"]/ul/li[3]/select/option[2]")).click();
        driver.findElement(By.className("cta_button_2")).click();
        driver.findElement(By.xpath("//*[@id=\"cart_container\"]/div[6]/div[2]/a")).click();
        
     
    }
    
    void Manuales(){
        //Desde el footer de la pagina se selecciona el link de manuales se seleciona y busca el manual de instalación.
        driver.findElement(By.xpath("form-control ng-pristine ng-empty ng-valid-email ng-invalid ng-invalid-required ng-touched")).sendKeys("pablo.reyes@safecard.cl");
        driver.findElement(By.id("submit")).click();
            
    }
    

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Testing navegador = new Testing(); 
        navegador.AbrirYoutube();
        navegador.AbrirBackofficeSafecard();
        navegador.AbrirDutchPassion();
        navegador.AbrirSafecard();

    }
    
// Archivos de Selenium IDE
// Backoffice.safecard.cl    
//  <?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
//<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
//<head profile="http://selenium-ide.openqa.org/profiles/test-case">
//<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
//<link rel="selenium.base" href="https://backoffice.safecard.cl/" />
//<title>backoffice.safecard</title>
//</head>
//<body>
//<table cellpadding="1" cellspacing="1" border="1">
//<thead>
//<tr><td rowspan="1" colspan="3">backoffice.safecard</td></tr>
//</thead><tbody>
//<tr>
//	<td>open</td>
//	<td>/</td>
//	<td></td>
//</tr>
//<tr>
//	<td>clickAndWait</td>
//	<td>//button[@type='submit']</td>
//	<td></td>
//</tr>
//</tbody></table>
//</body>
//</html>
    
//Safecard.cl
//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
//<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
//<head profile="http://selenium-ide.openqa.org/profiles/test-case">
//<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
//<link rel="selenium.base" href="https://safecard.cl/" />
//<title>safecard</title>
//</head>
//<body>
//<table cellpadding="1" cellspacing="1" border="1">
//<thead>
//<tr><td rowspan="1" colspan="3">safecard</td></tr>
//</thead><tbody>
//<tr>
//	<td>open</td>
//	<td>/</td>
//	<td></td>
//</tr>
//<tr>
//	<td>click</td>
//	<td>id=nav-prensa</td>
//	<td></td>
//</tr>
//<tr>
//	<td>click</td>
//	<td>css=h2.ng-binding</td>
//	<td></td>
//</tr>
//
//</tbody></table>
//</body>
//</html>
    
//youtube.com    
//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
//<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
//<head profile="http://selenium-ide.openqa.org/profiles/test-case">
//<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
//<link rel="selenium.base" href="https://www.youtube.com/" />
//<title>youtube</title>
//</head>
//<body>
//<table cellpadding="1" cellspacing="1" border="1">
//<thead>
//<tr><td rowspan="1" colspan="3">youtube</td></tr>
//</thead><tbody>
//<tr>
//	<td>open</td>
//	<td>/</td>
//	<td></td>
//</tr>
//<tr>
//	<td>type</td>
//	<td>name=search_query</td>
//	<td>volver</td>
//</tr>
//<tr>
//	<td>click</td>
//	<td>id=search-icon-legacy</td>
//	<td></td>
//</tr>
//<tr>
//	<td>click</td>
//	<td>xpath=(//a[contains(text(),'SFDK - Volver')])[2]</td>
//	<td></td>
//</tr>

//</tbody></table>
//</body>
//</html>

//Dutch-Passion
   
    //<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
//<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
//<head profile="http://selenium-ide.openqa.org/profiles/test-case">
//<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
//<link rel="selenium.base" href="https://www.dutch-passion.com/" />
//<title>Dutch-passion</title>
//</head>
//<body>
//<table cellpadding="1" cellspacing="1" border="1">
//<thead>
//<tr><td rowspan="1" colspan="3">Dutch-passion</td></tr>
//</thead><tbody>
//<tr>
//	<td>open</td>
//	<td>/en/</td>
//	<td></td>
//</tr>
//<tr>
//	<td>clickAndWait</td>
//	<td>css=img[alt=&quot;Afghani Kush&quot;]</td>
//	<td></td>
//</tr>
//<tr>
//	<td>clickAndWait</td>
//	<td>//body/div[4]/div/div/div[2]/a/div/div[2]</td>
//	<td></td>
//</tr>

//</tbody></table>
//</body>
//</html>

}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/johan/IdeaProjects/clase1calidad/src/main/resources/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize();

        String usuario = "standard_user";
        String contrasenia = "secret_sauce";

        //localizador de elemento

        WebElement usuentrada = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement contrasena = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement btninicio = driver.findElement(By.xpath("//input[@id='login-button']"));

        usuentrada.sendKeys((usuario));
        contrasena.sendKeys(contrasenia);
        btninicio.click();

        WebElement compra1 = driver.findElement(By.xpath("//div[4]//button[@class='btn_primary btn_inventory']"));
        WebElement compra2 = driver.findElement(By.xpath("//div[@class='inventory_list']/div[1]//button[@class='btn_primary btn_inventory']"));

        compra1.click();
        compra2.click();

        WebElement carro = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
        carro.click();

        WebElement check = driver.findElement(By.xpath("//a[.='CHECKOUT']"));
        check.click();

        String nombre = "Luis";
        String apellido = "Chaves";
        String direccion = "Zipaquira";

        WebElement nom = driver.findElement(By.xpath("//input[@id='first-name']"));
        WebElement ape = driver.findElement(By.xpath("//input[@id='last-name']"));
        WebElement dire = driver.findElement(By.xpath("//input[@id='postal-code']"));
        WebElement btnconti = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));

        nom.sendKeys(nombre);
        ape.sendKeys(apellido);
        dire.sendKeys(direccion);
        btnconti.click();

        WebElement btnFinalizar = driver.findElement(By.xpath("//a[.='FINISH']"));
        btnFinalizar.click();

        JavascriptExecutor scrool = (JavascriptExecutor) driver;
        scrool.executeAsyncScript("window.scrollTo(0, document.body.scrollHeight)");


    }
}
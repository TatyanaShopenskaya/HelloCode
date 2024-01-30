// 5.4 Напишите автоматизированный тест, который выполнит следующие шаги:
//1. Открывает главную страницу Google.
//2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
//3. В результатах поиска ищет ссылку на официальный сайт Selenium
//(https://www.selenium.dev) и проверяет, что ссылка действительно присутствует среди
//результатов поиска.
package seminars.five;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.junit.jupiter.api.Assertions.*;


public class SeleniumTest {
    @Test
    public void testRunChromeAndSearchGB() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();    //submit() - это Enter
        WebElement selenium = driver.findElement(By.partialLinkText("https://www.selenium.dev"));
        selenium.isEnabled();
        assertEquals(true, selenium.isEnabled());
    }

//5.5 Нужно написать сквозной тест с использованием Selenium, который авторизует пользователя на
//сайте https://www.saucedemo.com/.
//Данные для входа - логин: "standard_user", пароль: "secret_sauce".
//Проверить, что авторизация прошла успешно и отображаются товары.
//Вам необходимо использовать WebDriver для открытия страницы и методы sendKeys() для ввода
//данных в поля формы, и submit() для отправки формы. После этого, проверьте, что на странице
//отображаются продукты (productsLabel.getText() = "Products")


    @Test
    public void testAuthorization() throws InterruptedException {   //открытие страницы, логинг/пароль и поиск слова "Products" на страницы

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000); // Let the user actually see something!
        WebElement loginBox = driver.findElement(By.name("user-name"));
        WebElement passwordBox = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.name("login-button"));
        loginBox.sendKeys("standard_user");
        passwordBox.sendKeys("secret_sauce");
        loginButton.submit();   //авторизация
        Thread.sleep(2000); // Let the user actually see something!
        WebElement productsLabel = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
// WebElement productsLabel = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
        assertEquals("Products", productsLabel.getText());
        driver.quit();   //выход
    }
}
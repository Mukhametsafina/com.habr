package mybook;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SignUp extends WebDriverSettings {

    @Test
    public void signUp() {
        String email = "rose.rose44@yandex.ru";
        String password = "rose1234";
        String title = "Вжух, и прогоны автотестов оптимизированы. Intellij IDEA плагины на службе QA Automation";
        String text;

        driver.get("https://habr.com/");
        driver.findElement(By.cssSelector("[id='login']")).click();
        driver.findElement(By.cssSelector("[name='email']")).sendKeys(email);
        driver.findElement(By.cssSelector("[id='password_field']")).sendKeys(password);
        driver.findElement(By.cssSelector("[name='go']")).click();
        driver.findElement(By.cssSelector("[id='search-form-btn']")).click();
        driver.findElement(By.cssSelector("[id='search-form-field']")).sendKeys(title);
        driver.findElement(By.cssSelector("[id='search-form-field']")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector("[href='https://habr.com/ru/company/wrike/blog/532704/']")).click();
        text = driver.findElement(By.cssSelector("[class='post__title-text']")).getText();
        Assert.assertTrue(title.equals(text));
        driver.findElement(By.xpath("//span[@title='Подписаться на компанию']")).click();
        driver.findElement(By.xpath("//span[text()='Отписаться']")).click();

    }
}

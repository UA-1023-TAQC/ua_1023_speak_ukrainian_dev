package com.ssa.edu.teachua.ui;

import com.ssa.edu.teachua.ui.testrunners.BaseTestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTestRunner {
    @Test
    public void testHomePage() {
        String title = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title, "Інтернет-магазин ROZETKA™: офіційний сайт найпопулярнішого онлайн-гіпермаркету в Україні", "bead title");
        softAssert.assertAll();
    }
    @Test
    public void testOpenLogin() {
        String title = driver.getTitle();
        WebElement userBtn = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button"));
        userBtn.click();
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"auth_email\"]"));
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"auth_pass\"]"));
        WebElement rememberMe = driver.findElement(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[3]/label"));
        emailInput.sendKeys("Foo");
        passwordInput.sendKeys("Boo");
        rememberMe.click();
        WebElement loginBtn = driver.findElement(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]"));
        loginBtn.click();


    }
}

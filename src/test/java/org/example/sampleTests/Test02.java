package org.example.sampleTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.assertj.core.api.Assertions.assertThat;

public class Test02 {
    @Test
    public void T02(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
[]
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        assertThat(title).contains("Google");

        driver.quit();
    }

}

package com.sparta.jlb;

import com.sparta.jlb.bbcSite.BbcSite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static void main( String[] args ){
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\TECH-W87\\Downloads\\chromedriver_win32\\chromedriver.exe");
       ChromeDriver chromeDriver = new ChromeDriver();
       BbcSite bbcSite = new BbcSite(chromeDriver);
       bbcSite.bbcSignInPage().goToSignInPage();
       bbcSite.bbcSignInPage().inputUserName("jasonblee@aol.com");
       bbcSite.bbcSignInPage().inputPassword("password");
       bbcSite.bbcSignInPage().clickSubmitButton();
       System.out.println(bbcSite.bbcSignInPage().getPasswordErrorText());
       bbcSite.quit();

    }
}

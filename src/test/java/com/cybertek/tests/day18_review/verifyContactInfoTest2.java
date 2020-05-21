package com.cybertek.tests.day18_review;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class verifyContactInfoTest2 extends TestBase {

    @Test

    public void  contactDetailsTest() {

        extentLogger = report.createTest("Contact Info Verification");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");

        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        extentLogger.info("")







    }


    }


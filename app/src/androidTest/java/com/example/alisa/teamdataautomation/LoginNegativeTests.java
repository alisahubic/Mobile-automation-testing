package com.example.alisa.teamdataautomation;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;


/**
 * Created by alisa on 6/28/16.
 */
public class LoginNegativeTests extends InstrumentationTestCase {

    private UiDevice device;
    static final String applicationName = "TeamData";

    @Override
    public void setUp() throws Exception {
        device = UiDevice.getInstance(getInstrumentation());
        device.pressHome();

        device.wait(Until.hasObject(By.text(applicationName)), 5000);
        UiObject2 DataVault = device.findObject(By.text(applicationName));
        DataVault.click();
    }


    public void testLoginWithIncorrectUsername() throws Exception {
        
    }

    public void testLoginWithIncorrectPassword() throws Exception {

    }

    public void testLoginWithShortPassword() throws  Exception {

    }

}
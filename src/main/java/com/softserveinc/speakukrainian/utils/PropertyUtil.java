package com.softserveinc.speakukrainian.utils;

import lombok.experimental.UtilityClass;

import java.util.ResourceBundle;

@UtilityClass
public class PropertyUtil {
    private static final ResourceBundle bundle = ResourceBundle.getBundle("config");


    private static String getProperty(String name) {
        var systemEnvVariable = System.getProperty(name);
        if (systemEnvVariable != null && !systemEnvVariable.isEmpty() && !systemEnvVariable.isBlank()) {
            return systemEnvVariable;
        } else {
            return bundle.getString(name);
        }

    }

    public static String getHomePageUrl() {
        return getProperty("home.base.url");
    }

    public static int getDefaultTimeOut() {
        return Integer.parseInt(getProperty("default.driver.timeout"));
    }

    public static String getDefaultBrowser() {
        return getProperty("default.browser");
    }

    public static String getVisitorEmail() {
        return getProperty("user.email");
    }

    public static String getVisitorPassword() {
        return getProperty("user.password");
    }

    public static String getDirectorEmail() {
        return getProperty("lead.email");
    }

    public static String getDirectorPassword() {
        return getProperty("lead.password");
    }

}

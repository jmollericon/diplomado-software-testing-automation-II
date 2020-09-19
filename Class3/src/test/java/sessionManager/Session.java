package sessionManager;

import deviceFactory.FactoyDevice;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class Session {
    // Constructor privado
    // Atributo del mismo tipo
    // metodo statico público - mismo tipo

    private static Session session = null;
    private AppiumDriver driver;

    private Session () throws MalformedURLException {
        driver = FactoyDevice.make("android").create();
    }

    public  static Session getInstance() throws MalformedURLException {
        if(session == null)
            session = new Session();

        return session;
    }

    public void closeSession() {
        driver.quit();
        session = null;
    }

    public AppiumDriver getDriver() {
        return driver;
    }
}

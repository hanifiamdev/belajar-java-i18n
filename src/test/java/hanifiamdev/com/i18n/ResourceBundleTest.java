package hanifiamdev.com.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

    @Test
    void testResourceBundle() {

        var resourceBundle = ResourceBundle.getBundle("message");

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));

    }

    @Test
    void testResourceBundleIndonesia() {
        var indonesia =  new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));

    }

    @Test
    void testResourceBundleNotFound() {
        var notFound =  new Locale("en", "US");
        var resourceBundle = ResourceBundle.getBundle("message", notFound);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));

    }


    @Test
    void testResourceBundleMutipleTimes() {
        var indonesia =  new Locale("in", "ID");
        var resourceBundle1 = ResourceBundle.getBundle("message", indonesia);
        var resourceBundle2 = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundle1 == resourceBundle2); //true,, karena masih menggunkan object yang sama

    }
}

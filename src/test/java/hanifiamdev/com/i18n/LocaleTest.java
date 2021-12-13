package hanifiamdev.com.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {

    @Test
    void testNewLocale() {
        var language = "in"; // id untuk format barunya namun agar compatible dengan versi java lama bisa tetap menggunakan in
        var country = "ID";
        var locale = new Locale(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayName());
        System.out.println(locale.getDisplayCountry());

    }
}

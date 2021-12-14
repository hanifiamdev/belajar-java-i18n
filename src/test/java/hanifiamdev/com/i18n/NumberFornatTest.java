package hanifiamdev.com.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFornatTest {

    @Test
    void testNumberFormat() {
        var numberFormat = NumberFormat.getInstance();
        var format = numberFormat.format(1000000.255);
        System.out.println(format);
    }

    @Test
    void testNumberFormatIndonesia() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getInstance(indonesia);
        var format = numberFormat.format(1000000.255);
        System.out.println(format);
    }

    @Test
    void testNumberFormatParseIndonesia() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getInstance(indonesia);

        try {
            var result = numberFormat.parse("10.000.000,255").doubleValue();
            System.out.println(result);
        } catch (ParseException e) {
            System.out.println("Eror parse : " + e.getMessage());
        }

    }
}

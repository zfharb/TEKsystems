import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    @Test
    public void testValidCityCode() {
        String result = ApiReader.getCapitalCity("372");
        Assert.assertTrue(result.contains("Tallinn"));
    }

    @Test
    public void testInValidCityCode() {
        String result = ApiReader.getCapitalCity("$$$$$$");
        Assert.assertTrue(result.contains("Invalid city code"));
    }

    @Test
    public void testEmptyCityCode() {
        String result = ApiReader.getCapitalCity("");
        Assert.assertTrue(result.contains("Invalid city code"));
    }
}

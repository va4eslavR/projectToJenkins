import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
    @Test
    public void Test(){
        Assert.assertEquals(HelloWorldPrinter.hello(), "hello jenkins");
    }

}

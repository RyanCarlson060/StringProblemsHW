import org.junit.Test;

import static org.junit.Assert.*;

public class StringProblemsTest {

    @Test
    public void alternateStringsTest1() {
        String result = StringProblems.alternateStrings("abc", "xyz");
        assertEquals("axbycz",result);
    }

    @Test
    public void alternateStringsTest2() {
        String result = StringProblems.alternateStrings("Hi", "There");
        assertEquals("HTihere",result);
    }

    @Test
    public void alternateStringsTest3() {
        String result = StringProblems.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee",result);
    }

    @Test
    public void alternateStringsTest4() {
        String result = StringProblems.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee",result);
    }

    @Test
    public void alternateStringsTest5() {
        String result = StringProblems.alternateStrings("", "");
        assertEquals("",result);
    }

    @Test
    public void abcTest1() {
        boolean result = StringProblems.abcTest("123abc");
        assertEquals(true,result);
    }

    @Test
    public void abcTest2() {
        boolean result = StringProblems.abcTest("123.abc");
        assertEquals(false,result);
    }

    @Test
    public void abcTest3() {
        boolean result = StringProblems.abcTest("abc.123");
        assertEquals(true,result);
    }

    @Test
    public void abcTest4() {
        boolean result = StringProblems.abcTest("");
        assertEquals(false,result);
    }

}
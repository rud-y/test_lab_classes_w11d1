import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 80);
    }

    @Test
    public void hasPaper() {
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void canPrint() {
        printer.print(5, 3);
        assertEquals(85, printer.getSheets());
    }

    @Test
    public void cannotPrintNotEnoughPaper() {
        printer.print(10, 13);
        assertEquals( 100, printer.getSheets());
    }

    @Test
    public void canReduceTonerByOneForEveryPage() {
        printer.print(2, 5);
        assertEquals(70, printer.getTonerVolume());
    }


}

package src.exampleRefactor.version2;

public class PrinterExample {
    public static void main(String[] args) {
        InkjetPrinter inj = new InkjetPrinter("101");
        DotPrinter dot = new DotPrinter("102");
        LaserPrinter las = new LaserPrinter("103");
        PDFWriter pdf = new PDFWriter("101.pdf");

        inj.testPrinting();
        dot.testPrinting();
        las.testPrinting();
        pdf.print("테스트 중");

    }
}

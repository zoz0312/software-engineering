package src.exampleRefactor.version2;

public class PDFWriter {
    private String fileName;

    public PDFWriter(String filename) {
        this.fileName = filename;
    }

    public void setFileName(String filename) {
        this.fileName = filename;
    }

    public void print(Object document) {
        System.out.println(fileName + "으로 출력하기");
        System.out.println(document);
        System.out.println("*문서 내용을 PDF포맷으로 출력을 완료했습니다.");
    }
}

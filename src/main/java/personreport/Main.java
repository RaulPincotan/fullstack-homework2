package personreport;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FilePersonReportGenerator filePersonReportGenerator = new FilePersonReportGenerator("src/main/resources/people.txt");
        filePersonReportGenerator.generatePersonsReport("young.txt", 0, 30);
        filePersonReportGenerator.generatePersonsReport("stillyoung.txt", 31, 50);
        filePersonReportGenerator.generatePersonsReport("notsoold.txt", 50, 120);


        new InMemoryPersonReportGenerator().generatePersonsReport("inmemoryreportyoung", 0, 30);
        new InMemoryPersonReportGenerator().generatePersonsReport("inmemoryreportnotold", 50, 120);


    }
}

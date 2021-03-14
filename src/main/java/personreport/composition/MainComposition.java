package personreport.composition;

import java.io.IOException;

public class MainComposition {

    public static void main(String[] args) throws IOException {
        ReportGeneratorComposition reportGeneratorComposition = new ReportGeneratorComposition(new FileProvider("src/main/resources/people.txt"));
        reportGeneratorComposition.generateReport("youwithcomposition", 0, 30);
    }
}

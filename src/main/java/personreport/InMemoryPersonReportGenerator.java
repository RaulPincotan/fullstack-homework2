package personreport;

import java.util.List;

public class InMemoryPersonReportGenerator extends PersonReportGenerator {
    @Override
    protected List<Person> readPersons() {
        return List.of(new Person("Raul", "Pincotan", 29),
                new Person("Dorina", "Pincotan", 57)
        );
    }
}

package personreport.composition;

import personreport.Person;

import java.util.List;

public class InMemoryProvider implements PersonReportProvider {
    @Override
    public List<Person> readPersons() {
        return List.of(new Person("Raul", "Adrian", 30));
    }
}

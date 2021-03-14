package personreport.composition;

import personreport.Person;

import java.util.List;

public interface PersonReportProvider {

    List<Person> readPersons();


}

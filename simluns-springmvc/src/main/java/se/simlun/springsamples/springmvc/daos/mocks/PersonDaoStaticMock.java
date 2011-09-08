package se.simlun.springsamples.springmvc.daos.mocks;

import java.util.ArrayList;
import java.util.List;

import se.simlun.springsamples.springmvc.daos.PersonDao;
import se.simlun.springsamples.springmvc.models.Person;

public class PersonDaoStaticMock implements PersonDao {

	private static List<Person> mockedPeopleDatabase = new ArrayList<Person>();
	static {
		mockedPeopleDatabase.add(new Person("Simon Lundmark", 23));
		mockedPeopleDatabase.add(new Person("Erika Ornstein", 25));
	}

	public List<Person> getAll() {
		return mockedPeopleDatabase;
	}

	public Person getById(int id) {
		return mockedPeopleDatabase.get(id);
	}

}

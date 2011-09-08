package se.simlun.springsamples.springmvc.daos;

import java.util.List;

import se.simlun.springsamples.springmvc.models.Person;

public interface PersonDao {

	List<Person> getAll();

	Person getById(int id);

}

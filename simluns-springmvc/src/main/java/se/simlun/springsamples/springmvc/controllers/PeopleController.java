package se.simlun.springsamples.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import se.simlun.springsamples.springmvc.daos.PersonDao;
import se.simlun.springsamples.springmvc.models.Person;

@Controller
@RequestMapping("/people")
public class PeopleController {

	private final PersonDao personDao;

	@Autowired
	public PeopleController(PersonDao personDao) {
		this.personDao = personDao;
	}

	@RequestMapping
	public String index() {
		return "redirect:/people/list";
	}

	@RequestMapping("/list")
	public ModelMap list() {
		return new ModelMap("people", personDao.getAll());
	}

	@RequestMapping("/show")
	public Person show(@RequestParam("personId") int personId) {
		return personDao.getById(personId);
	}

}

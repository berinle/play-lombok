package controllers;

import play.mvc.*;

import views.html.*;
import java.util.*;

import models.*;
import views.html.person.list;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

  public static Result persons(){

	List<Person> persons = Person.find.all();

  	System.out.println(persons.size());

  	return ok(list.render(persons));
//      return TODO;
  }
  
}
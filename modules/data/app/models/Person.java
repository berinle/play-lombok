package models;

import play.db.ebean.*;

import javax.persistence.*;
import lombok.*;


@Entity
@Getter @Setter
public class Person extends Model {

	@Id
	private Long id;
	private String name;

	public static Finder<Long, Person> find = new Finder<Long, Person>(Long.class, Person.class);
}
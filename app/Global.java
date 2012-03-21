import com.avaje.ebean.Ebean;
import models.Person;
import play.Application;
import play.GlobalSettings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author berinle
 */
public class Global extends GlobalSettings {
    @Override
    public void onStart(Application application) {
        AppBootStrap.init(application);
    }

    static class AppBootStrap {

        public static void init(Application application) {
            if(Ebean.find(Person.class).findRowCount() == 0){
                List<Person> persons = new ArrayList<Person>();
                Person person = new Person();
                person.setName("forest gump");
                persons.add(person);

                person = new Person();
                person.setName("bubba shrimp");
                persons.add(person);

                Ebean.save(persons);

                assert Person.find.findRowCount() == 2;

            }
        }

    }
}

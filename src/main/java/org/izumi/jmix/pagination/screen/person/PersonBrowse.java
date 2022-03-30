package org.izumi.jmix.pagination.screen.person;

import io.jmix.ui.screen.*;
import org.izumi.jmix.pagination.entity.Person;

@UiController("Person.browse")
@UiDescriptor("person-browse.xml")
@LookupComponent("personsTable")
public class PersonBrowse extends StandardLookup<Person> {
}

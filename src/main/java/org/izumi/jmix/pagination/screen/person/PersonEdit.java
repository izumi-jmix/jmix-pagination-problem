package org.izumi.jmix.pagination.screen.person;

import io.jmix.ui.screen.*;
import org.izumi.jmix.pagination.entity.Person;

@UiController("Person.edit")
@UiDescriptor("person-edit.xml")
@EditedEntityContainer("personDc")
public class PersonEdit extends StandardEditor<Person> {
}

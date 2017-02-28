package org.tswright.learn.openmbean;

import static java.util.Comparator.comparing;

import java.util.Comparator;

/**
 * @author tswright
 */
public class PersonComparators
{
	static public final Comparator<Person> BY_AGE_ASCENDING = comparing( Person::getBirthDate ).reversed();
	static public final Comparator<Person> BY_AGE_DESCENDING = comparing( Person::getBirthDate );
	static public final Comparator<Person> BY_SURNAME_ASCENDING = comparing( Person::getLastName ).thenComparing( Person::getFirstName );
	static public final Comparator<Person> BY_SURNAME_DESCENDING = comparing( Person::getLastName ).thenComparing( Person::getFirstName ).reversed();
	static public final Comparator<Person> BY_GIVEN_NAME_ASCENDING = comparing( Person::getFirstName ).thenComparing( Person::getLastName );
	static public final Comparator<Person> BY_GIVEN_NAME_DESCENDING = comparing( Person::getFirstName ).thenComparing( Person::getLastName ).reversed();
}

package org.tswright.learn.openmbean;

import java.util.List;

/**
 * @author tswright
 */
public interface PersonRegistryMXBean
{
	List<Person> getPersons();
	List<Person> byAgeAscending();
	List<Person> byAgeDescending();
	List<Person> bySurnameAscending();
	List<Person> bySurnameDescending();
	List<Person> byGivenNameAscending();
	List<Person> byGivenNameDescending();
}

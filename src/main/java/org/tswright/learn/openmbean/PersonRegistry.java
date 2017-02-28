package org.tswright.learn.openmbean;

import static java.util.stream.Collectors.toList;
import static org.tswright.learn.openmbean.PersonComparators.*;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author tswright
 */
public class PersonRegistry implements PersonRegistryMXBean
{
	private final ConcurrentMap<UUID, Person> persons = new ConcurrentHashMap<>();

	public Person addPerson( final Person person )
	{
		return persons.put( person.getUniqueId(), person );
	}

	@Override
	public List<Person> getPersons()
	{
		Comparator<Person> bySurnameAscending = BY_SURNAME_ASCENDING;
		return getPersonsSortedByComparator( bySurnameAscending );
	}

	@Override
	public List<Person> byAgeAscending()
	{
		return getPersonsSortedByComparator( BY_AGE_ASCENDING );
	}

	@Override
	public List<Person> byAgeDescending()
	{
		return getPersonsSortedByComparator( BY_AGE_DESCENDING );
	}

	@Override
	public List<Person> bySurnameAscending()
	{
		return getPersonsSortedByComparator( BY_SURNAME_ASCENDING );
	}

	@Override
	public List<Person> bySurnameDescending()
	{
		return getPersonsSortedByComparator( BY_SURNAME_DESCENDING );
	}

	@Override
	public List<Person> byGivenNameAscending()
	{
		return getPersonsSortedByComparator( BY_GIVEN_NAME_ASCENDING );
	}

	@Override
	public List<Person> byGivenNameDescending()
	{
		return getPersonsSortedByComparator( BY_GIVEN_NAME_DESCENDING );
	}

	private List<Person> getPersonsSortedByComparator( Comparator<Person> personComparator )
	{
		return persons.values().stream()
			.sorted( personComparator )
			.collect( toList() );
	}
}

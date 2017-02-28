package org.tswright.learn.openmbean;

import static java.util.Objects.requireNonNull;

import java.beans.ConstructorProperties;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

/**
 * @author tswright
 */
public class Person
{
	private final UUID uniqueId = UUID.randomUUID();
	private final String lastName;
	private final String firstName;
	private final LocalDate birthDate;

	@ConstructorProperties( { "lastName", "firstName", "birthDate" } )
	public Person( final String lastName, final String firstName, final LocalDate birthDate )
	{
		this.lastName = requireNonNull( lastName );
		this.firstName = requireNonNull( firstName );
		this.birthDate = requireNonNull( birthDate );
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public LocalDate getBirthDate()
	{
		return birthDate;
	}

	public UUID getUniqueId()
	{
		return uniqueId;
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode( uniqueId  );
	}

	@Override
	public boolean equals( final Object otherObject )
	{
		if ( this == otherObject )
		{
			return true;
		}

		if ( ( otherObject == null ) || ( getClass() != otherObject.getClass() ) )
		{
			return false;
		}

		final Person otherPerson = (Person) otherObject;
		return Objects.equals( uniqueId, otherPerson.uniqueId );
	}

	@Override
	public String toString()
	{
		return "Person [uniqueId=" + uniqueId + ", lastName=" + lastName + ", firstName=" + firstName + ", birthDate=" + birthDate + "]";
	}
}

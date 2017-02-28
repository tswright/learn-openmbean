package org.tswright.learn.openmbean;

import static java.lang.System.out;
import static java.lang.Thread.sleep;
import static java.lang.management.ManagementFactory.getPlatformMBeanServer;

import java.time.LocalDate;
import java.time.Month;
import javax.management.ObjectName;

/**
 * @author tswright
 */
public class OpenMBeanTest
{
	public static void main( final String[] args ) throws Exception
	{
		// Create the MBean
		final PersonRegistry registry = new PersonRegistry();
		populateRegistry( registry );

		// Get the Platform MBean Server and register our MBean
		getPlatformMBeanServer().registerMBean( registry, new ObjectName( "org.tsw.explore.openmbean:type=PersonRegistry" ) );

		// Wait forever
		out.println( "Waiting for incoming requests..." );
		sleep( Long.MAX_VALUE );
	}

	private static void populateRegistry( final PersonRegistry registry )
	{
		registry.addPerson( new Person( "Washington", "George", LocalDate.of( 1732, Month.FEBRUARY, 22 ) ) );
		registry.addPerson( new Person( "Adams", "John", LocalDate.of( 1735, Month.OCTOBER, 30 ) ) );
		registry.addPerson( new Person( "Jefferson", "Thomas", LocalDate.of( 1743, Month.APRIL, 13 ) ) );
		registry.addPerson( new Person( "Madison", "James", LocalDate.of( 1751, Month.MARCH, 16 ) ) );
		registry.addPerson( new Person( "Monroe", "James", LocalDate.of( 1758, Month.APRIL, 28 ) ) );
		registry.addPerson( new Person( "Adams", "John Quincy", LocalDate.of( 1767, Month.JULY, 11 ) ) );
		registry.addPerson( new Person( "Jackson", "Andrew", LocalDate.of( 1767, Month.MARCH, 15 ) ) );
		registry.addPerson( new Person( "Van Buren", "Martin", LocalDate.of( 1782, Month.DECEMBER, 5 ) ) );
		registry.addPerson( new Person( "Harrison", "William Henry", LocalDate.of( 1773, Month.FEBRUARY, 9 ) ) );
		registry.addPerson( new Person( "Tyler", "John", LocalDate.of( 1790, Month.MARCH, 29 ) ) );
		registry.addPerson( new Person( "Polk", "James Knox", LocalDate.of( 1795, Month.NOVEMBER, 2 ) ) );
		registry.addPerson( new Person( "Taylor", "Zachary", LocalDate.of( 1784, Month.NOVEMBER, 24 ) ) );
		registry.addPerson( new Person( "Fillmore", "Millard", LocalDate.of( 1800, Month.JANUARY, 7 ) ) );
		registry.addPerson( new Person( "Pierce", "Franklin", LocalDate.of( 1804, Month.NOVEMBER, 23 ) ) );
		registry.addPerson( new Person( "Buchanan", "James", LocalDate.of( 1791, Month.APRIL, 23 ) ) );
		registry.addPerson( new Person( "Lincoln", "Abraham", LocalDate.of( 1809, Month.FEBRUARY, 12 ) ) );
		registry.addPerson( new Person( "Johnson", "Andrew", LocalDate.of( 1808, Month.DECEMBER, 29 ) ) );
		registry.addPerson( new Person( "Grant", "Ulysses S.", LocalDate.of( 1822, Month.APRIL, 27 ) ) );
		registry.addPerson( new Person( "Hayes", "Rutherford Birchard", LocalDate.of( 1822, Month.OCTOBER, 4 ) ) );
		registry.addPerson( new Person( "Garfield", "James Abram", LocalDate.of( 1831, Month.NOVEMBER, 19 ) ) );
		registry.addPerson( new Person( "Arthur", "Chester Alan", LocalDate.of( 1829, Month.OCTOBER, 5 ) ) );
		registry.addPerson( new Person( "Cleveland", "Grover", LocalDate.of( 1837, Month.MARCH, 18 ) ) );
		registry.addPerson( new Person( "McKinley", "William", LocalDate.of( 1843, Month.JANUARY, 29 ) ) );
		registry.addPerson( new Person( "Roosevelt", "Theodore", LocalDate.of( 1858, Month.OCTOBER, 27 ) ) );
		registry.addPerson( new Person( "Taft", "William Howard", LocalDate.of( 1857, Month.SEPTEMBER, 15 ) ) );
		registry.addPerson( new Person( "Wilson", "Woodrow", LocalDate.of( 1856, Month.DECEMBER, 28 ) ) );
		registry.addPerson( new Person( "Harding", "Warren Gamaliel", LocalDate.of( 1865, Month.NOVEMBER, 2 ) ) );
		registry.addPerson( new Person( "Coolidge", "Calvin", LocalDate.of( 1872, Month.JULY, 4 ) ) );
		registry.addPerson( new Person( "Hoover", "Herbert Clark", LocalDate.of( 1874, Month.AUGUST, 10 ) ) );
		registry.addPerson( new Person( "Roosevelt", "Franklin Delano", LocalDate.of( 1882, Month.JANUARY, 30 ) ) );
		registry.addPerson( new Person( "Truman", "Harry S.", LocalDate.of( 1884, Month.MAY, 8 ) ) );
		registry.addPerson( new Person( "Eisenhower", "Dwight David", LocalDate.of( 1890, Month.OCTOBER, 14 ) ) );
		registry.addPerson( new Person( "Kennedy", "John Fitzgerald", LocalDate.of( 1917, Month.MAY, 29 ) ) );
		registry.addPerson( new Person( "Johnson", "Lyndon Baines", LocalDate.of( 1908, Month.AUGUST, 27 ) ) );
		registry.addPerson( new Person( "Nixon", "Richard Milhous", LocalDate.of( 1913, Month.JANUARY, 9 ) ) );
		registry.addPerson( new Person( "Ford", "Gerald Rudolph", LocalDate.of( 1913, Month.JULY, 14 ) ) );
		registry.addPerson( new Person( "Carter", "James Earl", LocalDate.of( 1924, Month.OCTOBER, 1 ) ) );
		registry.addPerson( new Person( "Reagan", "Ronald Wilson", LocalDate.of( 1911, Month.FEBRUARY, 6 ) ) );
		registry.addPerson( new Person( "Bush", "George Herbert Walker", LocalDate.of( 1924, Month.JUNE, 12 ) ) );
		registry.addPerson( new Person( "Clinton", "William Jefferson", LocalDate.of( 1946, Month.AUGUST, 19 ) ) );
		registry.addPerson( new Person( "Bush", "George Walker", LocalDate.of( 1946, Month.JULY, 6 ) ) );
		registry.addPerson( new Person( "Obama", "Barack Hussein", LocalDate.of( 1961, Month.AUGUST, 4 ) ) );
		registry.addPerson( new Person( "Trump", "Donald John", LocalDate.of( 1946, Month.JUNE, 14 ) ) );
	}
}

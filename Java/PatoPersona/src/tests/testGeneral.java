package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Interfaces.Walkable;
import Person.Person;
import duck.Duck;

public class testGeneral {

	@Test
	public void testGeneral() {
		Walkable[] w = new Walkable[3];
		w[0] = new Person("Jack");
		w[1] = new Duck("Jeff");
		w[2] = new Person("John");
		// Let everyone walk
		assertEquals(w[0], );

		for (Walkable object : w) {
			object.walk();
	}

}
}


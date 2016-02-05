package org.gradle;

import org.junit.Test;
import org.gradle.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class AppTest {
	
	@Test
	public void canIntersectTwoCollections(){
		Collection<String> result = App.getIntersection(
				Arrays.asList("Hans", "Paul", "Richard", "Knödelkopf"),
				Arrays.asList("Hans", "Käse", "Anton", "Richard")
		);
		assertThat(result, containsInAnyOrder("Hans", "Richard"));
	}
	
//    @Test
//    public void canConstructAPersonWithAName() {
//        Person person = new Person("Larry");
//        assertEquals("Larry", person.getName());
//    }
}

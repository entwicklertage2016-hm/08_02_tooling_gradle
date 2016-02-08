package org.gradle;

import org.junit.Test;
import org.gradle.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class UtilsTest {
	
	@Test
	public void canIntersectTwoCollections(){
		Collection<String> result = Utils.getIntersection(
				Arrays.asList("Hans", "Paul", "Richard", "Kn�delkopf"),
				Arrays.asList("Hans", "K�se", "Anton", "Richard")
		);
		assertThat(result, containsInAnyOrder("Hans", "Richard"));
	}
}

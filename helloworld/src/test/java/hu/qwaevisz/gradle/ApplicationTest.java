package hu.qwaevisz.gradle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplicationTest {

	@Test
	public void addNumbers() {
		Application app = new Application();
		Assert.assertEquals(app.add(2, 3), 5);
	}

}

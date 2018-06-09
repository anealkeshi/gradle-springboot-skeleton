package me.anilkc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FooServiceImplTest {

	FooService subject;

	@Before
	public void setup() {
		subject = new FooServiceImpl();
	}

	@Test
	public void fooServePrintsServingFromFoo() {

		String result = subject.fooServe();

		assertEquals("Serving from Foo", result);
	}
}

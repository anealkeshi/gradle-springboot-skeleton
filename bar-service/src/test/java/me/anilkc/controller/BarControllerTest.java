package me.anilkc.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import me.anilkc.FooService;

@RunWith(MockitoJUnitRunner.class)
public class BarControllerTest {

	@InjectMocks
	BarController barController = new BarController();

	@Mock
	FooService fooService;

	@Test
	public void barReturnsAppendedTextFromFooService() {
		// given
		when(fooService.fooServe()).thenReturn("from Foo");

		// when
		Map<String, String> result = barController.bar();

		// then
		assertEquals("Bar Controller returns from Foo", result.get("message"));
	}

	@Test
	public void barReturnsNullFromFooService() {
		// given
		// check return null
		when(fooService.fooServe()).thenReturn(null);

		// when
		Map<String, String> result = barController.bar();

		// then
		assertEquals("Bar Controller returns null", result.get("message"));
	}
}

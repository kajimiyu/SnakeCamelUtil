package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakecamelTest {


	@Test
	public void snakeToCamel‚Åabc‚ª•ÏŠ·‚³‚ê‚é‚©() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = sc.snakeToCamelcase("abc");
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void snakeToCamel‚Åabc_def_ghi‚ª•ÏŠ·‚³‚ê‚é‚©() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = sc.snakeToCamelcase("abc_def_ghi");
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void CamelToSnake‚ÅAbc‚ª•ÏŠ·‚³‚ê‚é‚©() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "abc";
		String actual = sc.camelToSnakecase("Abc");
		assertThat(actual,is(expected));
		
	}
	

	@Test
	public void CamelToSnake‚ÅAbcDefGhi‚ª•ÏŠ·‚³‚ê‚é‚©() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = sc.camelToSnakecase("AbcDefGhi");
		assertThat(actual,is(expected));
		
	}

}

package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakecamelTest {


	@Test
	public void snakeToCamelでabcが変換されるか() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = sc.snakeToCamelcase("abc");
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void snakeToCamelでabc_def_ghiが変換されるか() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = sc.snakeToCamelcase("abc_def_ghi");
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void CamelToSnakeでAbcが変換されるか() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "abc";
		String actual = sc.camelToSnakecase("Abc");
		assertThat(actual,is(expected));
		
	}
	

	@Test
	public void CamelToSnakeでAbcDefGhiが変換されるか() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = sc.camelToSnakecase("AbcDefGhi");
		assertThat(actual,is(expected));
		
	}

}

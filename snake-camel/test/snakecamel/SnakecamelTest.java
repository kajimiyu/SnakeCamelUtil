package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakecamelTest {


	@Test
	public void snakeToCamel��abc���ϊ�����邩() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = sc.snakeToCamelcase("abc");
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void snakeToCamel��abc_def_ghi���ϊ�����邩() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = sc.snakeToCamelcase("abc_def_ghi");
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void CamelToSnake��Abc���ϊ�����邩() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "abc";
		String actual = sc.camelToSnakecase("Abc");
		assertThat(actual,is(expected));
		
	}
	

	@Test
	public void CamelToSnake��AbcDefGhi���ϊ�����邩() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = sc.camelToSnakecase("AbcDefGhi");
		assertThat(actual,is(expected));
		
	}

}

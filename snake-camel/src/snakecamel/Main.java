package snakecamel;

import java.*;

public class Main  {

	public static void main(String args[]){
		
		SnakeCamelUtil scu = new SnakeCamelUtil();
		
		String a = scu.snakeToCamelcase("abc_def_ghi");
		String b =  scu.camelToSnakecase("AbcDefGhi");
		
		System.out.println(a);
		System.out.println(b);
	}
}

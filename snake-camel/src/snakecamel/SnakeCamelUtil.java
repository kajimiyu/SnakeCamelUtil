package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= words.length - 1; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;

		String[] newwords = camelcase.split("(?<=[a-z])(?=[A-Z])");
	
	
			
		
		for (int i = 0; i <= newwords.length - 1; i++) {
			
			if(i == newwords.length-1){
				sb.append(uncapitalize(newwords[i]));
			}else{
				sb.append(uncapitalize(newwords[i]));
				sb.append("_");
				
			}
		}

	
		return new String(sb);
	}
	
	static String capitalize(String s) {
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}

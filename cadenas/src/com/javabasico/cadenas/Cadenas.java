package com.javabasico.cadenas;

public class Cadenas {
	
	public static void main(String[] args) {
		String cadena ="hh";
		char[] car =cadena.toLowerCase().toCharArray();
		int i =cadena.toLowerCase().toCharArray().length;
		cadena = cadena.toUpperCase();
		System.out.println(cadena);
		//Pag 85
		/*
		 * System.out.println(1 + 2); // 3 
		 * System.out.println("a" + "b"); // ab
		 * System.out.println("a" + "b" + 3); // ab3 
		 * System.out.println(1 + 2 + "c"); //
		 * 3c
		 */
	
		//Pag 88
		/*
		 * String string = "animals"; System.out.println(string.indexOf('a')); // 0
		 * System.out.println(string.indexOf("al")); // 4
		 * System.out.println(string.indexOf('a', 4)); // 4
		 * System.out.println(string.indexOf("al", 5)); // -1
		 * 
		 * System.out.println(string.substring(3)); // mals 
		 * System.out.println(string.substring(string.indexOf('m'))); // mals 
		 * System.out.println(string.substring(3, 4)); // m 
		 * System.out.println(string.substring(3, 7)); // mals
		 */
		
		//Pag 89 y 90
		/*
		 * String string = "animals"; 
		 * System.out.println(string.toUpperCase()); //ANIMALS 
		 * System.out.println("Abc123".toLowerCase()); // abc123
		 * 
		 * System.out.println("abc".equals("ABC")); // false 
		 * System.out.println("ABC".equals("ABC")); // true 
		 * System.out.println("abc".equalsIgnoreCase("ABC")); // true
		 * 
		 * System.out.println("abc".startsWith("a")); // true 
		 * System.out.println("abc".startsWith("A")); // false 
		 * System.out.println("abc".endsWith("c")); // true 
		 * System.out.println("abc".endsWith("a")); // false
		 * 
		 * System.out.println("abc".contains("b")); // true 
		 * System.out.println("abc".contains("B")); // false
		 */
		
		//Pag 91 y 92		
		/*
		 * System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		 * System.out.println("abcabc".replace("a", "A")); // AbcAbc
		 * 
		 * System.out.println("abc".trim()); // abc 
		 * System.out.println("\t a b c\n".trim()); // a b c
		 * 
		 * String start = "AniMaL";
		 * String trimmed = start.trim(); // "AniMaL" 
		 * String lowercase = trimmed.toLowerCase(); // "animal" 
		 * String result = lowercase.replace('a', 'A'); // "Animal"
		 * System.out.println(result);
		 * 
		 * String result = "AniMaL".trim().toLowerCase().replace('a', 'A'); 
		 * System.out.println(result);
		 */
		
		StringBuilder sb = new StringBuilder("Hola");
		sb.append(" ");
		sb.append("Clase");
		System.out.println(sb);
		
		//Pag 94
		/*
		 * StringBuilder sb = new StringBuilder("animals"); 
		 * String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); 
		 * int len = sb.length(); 
		 * char ch = sb.charAt(6); 
		 * System.out.println(sub + " " + len + " " + ch);
		 */
		
		//Pag 96
		
		/*
		 * StringBuilder sb = new StringBuilder("abcdef"); sb.delete(1,3); // sb = adef
		 * sb.deleteCharAt(5); // devuelve una excepción
		 * 
		 * StringBuilder sb = new StringBuilder("ABC"); 
		 * sb.reverse(); 
		 * System.out.println(sb);
		 */
		
		//Pag 97
		
		/*
		 * StringBuilder one = new StringBuilder(); 
		 * StringBuilder two = new StringBuilder(); 
		 * StringBuilder three = one.append("a");
		 * System.out.println(one == two); // false 
		 * System.out.println(one == three); //true
		 * 
		 * String x = "Hello World"; 
		 * String y = "Hello World"; 
		 * System.out.println(x == y); // true
		 * 
		 * String x = "Hello World";
		 * String z = " Hello World".trim();
		 * System.out.println(x == z); // false
		 * 
		 * String x = new String("Hello World"); 
		 * String y = "Hello World"; 
		 * System.out.println(x == y); // false
		 * 
		 * String x = "Hello World"; 
		 * String z = " Hello World".trim(); 
		 * System.out.println(x.equals(z)); // true
		 */
		
		
		
		
		
		
	}

}

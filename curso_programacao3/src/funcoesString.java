
public class funcoesString {
	/*
	 Este tipo de comentário é chamado de comentário de bloco.
	 Utilizado desta para indicar o que se trata o código a seguir.
	 Diferente de comentario de duas barras utilizado para explicar  uma linha específica. 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "abcde FGHIJ ABC abc DEFG   ";
		String s01 = original.toLowerCase();// letra maiuscula
		String s02 = original.toUpperCase();// letra minuscula
		String s03 = original.trim();// retira os espaços
		String s04 = original.substring(2);// imprime a partir da letra selecionada pelo numero
		String s05 = original.substring(2, 9);// ^^ ^^ só que com um limite
		String s06 = original.replace('a', 'x');// substitui letras selecionadas
		String s07 = original.replace("abc", "xy");// ^^

		int i = original.indexOf("bc");// indica a posição inicial
		int j = original.lastIndexOf("bc");// ^^ posição final

		String s = "potato apple lemon";//divide as palavras de uma String
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println();
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		System.out.println();
		System.out.println(s);
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}

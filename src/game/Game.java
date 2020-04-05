package game;

import java.util.*;

public class Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ListCategories List = new ListCategories();
		ArrayList<Categories> ListCategorie = new ArrayList<Categories>();
		ListCategorie = List.Remplie(List.c,List.c2,List.c3,List.c4,List.c5);

		Methods method1 = new Methods();

		boolean gameOn = true;

		while (gameOn) {
			
			char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','n','m','u','p','q','r','s','t','o','v','w','x','y','z'};
			
			System.out.println(" \t***************************************** ");
			System.out.println(" \t\tWelcome to HangMan Game ! ");
			System.out.println(" \t***************************************** \n");

			Categories randomList = method1.rand(ListCategorie);
			
			String randomWord = method1.rand1(randomList);
			
			char[] randomWordList = method1.convertStringToArray(randomWord); // entrer le mot g�n�r� dans une chaine.

			char[] guessedWord = new char[randomWordList.length]; // cr�ation d'une chaine avec les m�mes dimensions de celle du mot g�n�r�.

			method1.initialiseInput(guessedWord);

			boolean guessedChar = false; // initialiser la variable par "faulse" car au d�but du jeu le mot n'est pas devin�.
			
			int turns = 8; // le nombre de tours.

			method1.gameStart(guessedChar, gameOn, turns, randomWord, sc, randomWordList, guessedWord, method1, alphabet, randomList); //appel de la methode du jeu.
		}

	}
}
package game;

import java.util.*;
import java.util.ArrayList;

public class Methods {

	// methode pour tirer un categorie al�atoire de la liste.
	public Categories rand(ArrayList<Categories> list) {
		Random r = new Random();
		int index1 = r.nextInt(list.size());
		 return list.get(index1);
	}
	
	// methode pour tirer un mot al�atoire de la cat�gorie.
	public String rand1(Categories list) {
		Random r2 = new Random();
		int index = r2.nextInt(list.LesMot.length);
		return list.LesMot[index];
	}
	
	// methode pour convertir le mot tir� en chaine.
	char[] convertStringToArray(String word) {
		char[] wordArray = word.toCharArray();
		return wordArray;
	}

	// methode pour remplire les cases de la chaine ressemblante � celle du mot avec des tirets.
	public void initialiseInput(char[] wordInput) {
		for (int i = 0; i < wordInput.length; i++) {
			wordInput[i] = '_';
		}
	}

	// methode pour afficher la chaine cr��e.
	public void wordToGuess(char[] wordArray) {
		for (int i = 0; i < wordArray.length; i++) {
			System.out.print(" "+wordArray[i]);
		}
		System.out.println();
	}

	// methode pour verifier si le mot est devin� ou non.
	public boolean guessedWordVerification(char[] wordList) {
		for (int i = 0; i < wordList.length; i++) {
			if (wordList[i] == '_')
		return false;
		}
		return true;
	}
	
	// methode pour afficher l'alphabet.
	public void affichage(char[] alphabet) {
		for(int i=0; i<26; i++) {
			System.out.print(" "+alphabet[i]);
		}
		System.out.println("\n");
		
	}
	
	// methode du jeu.
	public void gameStart(boolean guessedChar, boolean gameOn, int turns, String randomWord, Scanner sc, char[] randomWordList, char[] guessedWord, Methods method1, char[] alphabet, Categories randomList) {
		while (!guessedChar && turns > 0) {	// 'guessedChar' variable qui nous informe si le mot est devin� ou non.
			
			System.out.println(" The word you must guess contains " + randomWord.length() + " letters "); // afficher la longueur du mot g�n�r�.
			System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("\t");
			System.out.println("The word is from category : "+randomList.NomCategorie);	
			method1.wordToGuess(guessedWord); // afficher les tirets.

			method1.draw(turns); // affichage du dessin.
			System.out.println(" You have " + turns + " turns left\n"); // les tours restants au joueur.
			
			
			
			method1.affichage(alphabet); // affichage de l'alphabet.
			
			
			System.out.println(" Enter a single Character :");
			System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~ \n");
			char charInput = sc.nextLine().charAt(0);
			
			for(int j=0; j<26; j++) { // supprimer le caract�re entr� de liste des lettres.
				if (charInput == alphabet[j])
					alphabet[j]='_';
			}
			
			turns--;
			
			
			
			if (!Character.isAlphabetic(charInput)) { //si le caract�re entr� par le joueur n'est pas une lettre. 
				guessedChar = true;	// on consid�re que le mot est trouv�, pour finir le jeu.
				System.out.println(" You entered an invalid character ! Replay the game !");
			}

			else { //si le caract�re appartient � l'alphabet.

				for (int i = 0; i < randomWordList.length; i++) { //boucle pour verifier si le caract�re appartient au mot.

					if (randomWordList[i] == charInput) { //si oui
						guessedWord[i] = charInput; //le caract�re s'affiche au bonne position.
					}

				}

				if (method1.guessedWordVerification(guessedWord)) { // si le mot est devin�

					guessedChar = true;
					System.out.println("\n\t\t\t"+randomWord);
					System.out.println("\n\t Word guessed ! Congratulations ! \n\n");
				}
			}

		} // le jeu fini ici.
	
		
		// les lignes suivantes pour rejouer soit au cas de victoire ou d�faite.
		
		if (!guessedChar) { // si le mot n'est pas devin� soit car les tours sont finis ou le joueur a entr� un carac�tre invalide.
			
			System.out.println("\n ******** You lost ! You've finished your turns ! ******** \n");
			System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			method1.draw(turns);
			System.out.println(" If you want to play another game press 'yes' :");
			System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			
			String replay = sc.nextLine();
			
			if (replay.equals("yes")) { // si le joueur entre "yes", un autre jeu va d�marr�.
				gameOn = true;
			} 
			else { // si le joueur entre quelque chose diff�rente de "yes" le programme s'arr�te.
				System.exit(0);
			}
		}

		else { // si le mot est devin�
			
			System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			System.out.println(" If you want to play another game press 'yes' :");
			System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			
			String replay = sc.nextLine();
			
			if (replay.equals("yes")) { // si le joueur entre "yes", un autre jeu va d�marr�.
				gameOn = true;
				
			} 
			else { //si non le programme s'arr�te.
				System.exit(0);
			}

		}
	}
	
	
	// methode pour afficher le dessin � chaque tour de jeu.
	public void draw(int turns) {
		switch (turns) {
		case 8:
			System.out.println("-----------------");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|               0");
			System.out.println("|              /|\\");
			System.out.println("|               |");
			System.out.println("|              / \\");
			System.out.println("----------------------");
			break;
			
		case 7:
			System.out.println("-----------------");
			System.out.println("|               |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|               0");
			System.out.println("|              /|\\");
			System.out.println("|               |");
			System.out.println("|              / \\");
			System.out.println("----------------------");
			break;
			
		case 6:
			System.out.println("-----------------");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|               0");
			System.out.println("|              /|\\");
			System.out.println("|               |");
			System.out.println("|              / \\");
			System.out.println("----------------------");
			break;
			
		case 5:
			System.out.println("-----------------");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|               0");
			System.out.println("|              /|\\");
			System.out.println("|               |");
			System.out.println("|              / \\");
			System.out.println("----------------------");
			break;
			
		case 4:
			System.out.println("-----------------");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|               0");
			System.out.println("|              /|\\");
			System.out.println("|               |");
			System.out.println("|              / \\");
			System.out.println("----------------------");
			break;
		
		case 3:
			System.out.println("-----------------");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|               0");
			System.out.println("|              /|\\");
			System.out.println("|               |");
			System.out.println("|              / \\");
			System.out.println("----------------------");
			break;
			
		case 2:
			System.out.println("-----------------");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|");
			System.out.println("|               0");
			System.out.println("|              /|\\");
			System.out.println("|               |");
			System.out.println("|              / \\");
			System.out.println("----------------------");
			break;
			
		case 1:
			System.out.println("-----------------");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|              [ ]");
			System.out.println("|               0");
			System.out.println("|              /|\\");
			System.out.println("|               |");
			System.out.println("|              / \\");
			System.out.println("----------------------");
			break;
			
		case 0:
			System.out.println("-----------------");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|               |");
			System.out.println("|              [0]");
			System.out.println("|              /|\\");
			System.out.println("|               |");
			System.out.println("|              / \\");
			System.out.println("|");
			System.out.println("----------------------");
			break;	
		default:
			break;
		}
	}
	
}

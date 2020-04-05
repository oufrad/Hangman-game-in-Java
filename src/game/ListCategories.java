package game;

import java.util.ArrayList;


public class ListCategories {
	  //les variables: 

	  String[] animal = {"cat","crow","wolf","dog","eagle"};
      String[] sport = {"football","basketball","baseball","tennis","racket"};
      String[] colors = {"white","red","black","yellow","orange"};
      String[] clothes= {"jacket","jeans","cap","shirt","coat"};
      String[] HumanBody= {"brain","feet","teeth","eye","nose"};
	  Categories c = new Categories(animal,"animal");
	  Categories c2 = new Categories(sport,"sport");
	  Categories c3 = new Categories(colors,"colors");
	  Categories c4 = new Categories(clothes,"clothes");
	  Categories c5 = new Categories(HumanBody,"HumanBody");
 
 
	   //le constracteur : 
	   
	  public ListCategories() 
	     {
	     }
	
	      ArrayList<Categories> Remplie(Categories c,Categories c2,Categories c3,Categories c4,Categories c5)
	     {
		
		  ArrayList<Categories> List = new ArrayList<Categories>();
		    List.add(c);
		    List.add(c2);
		    List.add(c3);
		    List.add(c4);
		    List.add(c5);
		      return List;
	     }

}

package game;


public class Categories 
{
	
		//les variables :
	
		public String NomCategorie;
		public String[] LesMot;
		
        //le constracteur :
		
		public Categories(String[] LesMot, String NomCategorie)
		   {	
		        for (int i = 0; i < LesMot.length; i++) 
		           {
			           this.LesMot=LesMot;
		           }
		
		               this.NomCategorie=NomCategorie;
		   }
		
	    
		//les getters and setters :	
		
		
		public String getNomCategorie() 
		  {
			 return NomCategorie;
		  }
		
		public void setNomCategorie(String nomCategorie) 
		  {
			NomCategorie = nomCategorie;
		  }
	
}




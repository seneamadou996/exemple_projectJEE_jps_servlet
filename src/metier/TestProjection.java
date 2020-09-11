package metier;

public class TestProjection {
	
	//Test sans junit avec la methode main 

	public static void main(String[] args) {
		//injection de l'implementaion de la methode projectionPop 
		ProjectionPopMetierImpl proj = new ProjectionPopMetierImpl();
		
		//declaration et initialisation des variables qui seront utilisés comme arguments dans la methode
		int popr=15000000;
		double taux = 2.8;
		int an1=2020;
		int an2=2025;
		int diffAn=  an2-an1;
		
		//calcul de la projection en faisant appelle a la methode projectionPopulation
		int popp=proj.projectionPopulation(popr, taux, diffAn);
		
		//affichage du résultat obtenu
		System.out.println(popp);
	}

}

package metier;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculProjection {
	
	//Test en utilisant Junit
	private IProjectionPopMetier project;

	@Before
	public void setUp() throws Exception {
		//injection de la méthode projectionPopulation 
		project = new ProjectionPopMetierImpl();
	}

	//realisation du test du resultat obtenue avec un resultat attendu qui est  17220939
	@Test
	public void testProjectionPopulation() {
		// declation et initialisation des des variables
		int popr=15000000;
		double taux = 2.8;
		int an1=2020;
		int an2=2025;
		int diffAn=  an2-an1;
		
		//le resultat attendu
		int restatAttendu = 17220939;
		
		//calacul de la projection en faisant appelle a la methode projectionPopulation
		int resultatCalculer= project.projectionPopulation(popr, taux, diffAn);
		
		//verication de l'egalite avec assertEquals 
		assertEquals(restatAttendu, resultatCalculer); //True/false
		
		
		
	}

}

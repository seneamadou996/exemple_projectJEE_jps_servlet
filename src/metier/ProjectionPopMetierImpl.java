package metier;

public class ProjectionPopMetierImpl implements IProjectionPopMetier{

	//implémentation de la methode projectionPopulation 
	@Override
	public int projectionPopulation(int populationRef, double taux, int diffDate) {
		double t= taux/100;
		int populationProj = (int)(populationRef*Math.pow(1+t, diffDate));
		return populationProj;
	}

}

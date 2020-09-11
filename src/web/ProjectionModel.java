package web;

public class ProjectionModel {
	
	//déclaration des attributs
	private int popRef;
	private double Taux;
	private int anRef;
	private int anCib;
	private int popProj;
	
	//constructeur sans paramètre
	public ProjectionModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Contructeur avec paramètre
	public ProjectionModel(int popRef, double taux, int anRef, int anCib, int popProj) {
		super();
		this.popRef = popRef;
		Taux = taux;
		this.anRef = anRef;
		this.anCib = anCib;
		this.popProj = popProj;
	}

	//Getters et Setteurs
	
	public int getPopRef() {
		return popRef;
	}

	public void setPopRef(int popRef) {
		this.popRef = popRef;
	}

	public double getTaux() {
		return Taux;
	}

	public void setTaux(double taux) {
		Taux = taux;
	}

	public int getAnRef() {
		return anRef;
	}

	public void setAnRef(int anRef) {
		this.anRef = anRef;
	}

	public int getAnCib() {
		return anCib;
	}

	public void setAnCib(int anCib) {
		this.anCib = anCib;
	}

	public int getPopProj() {
		return popProj;
	}

	public void setPopProj(int popProj) {
		this.popProj = popProj;
	}
	
}

package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.IProjectionPopMetier;
import metier.ProjectionPopMetierImpl;

@WebServlet(name = "cs",urlPatterns = {"/controleur","*.do"})//publication de la servlet 
public class ControllerServlet extends HttpServlet{

	//importaion de l'interface de la couche metier
	private IProjectionPopMetier project;
	
	@Override
	public void init() throws ServletException {
		
		//initialisation de la methode
		project = new ProjectionPopMetierImpl();
	}
	
	//definition de la methode doGet
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//initialisation du model
		request.setAttribute("projectionModel", new ProjectionModel());
		//appelle à la vue utilisant les forword
		request.getRequestDispatcher("VueProject.jsp").forward(request, response);
	}
	
	//Definition de la methode doPost
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Lire les données de le requête 
		int popRef = Integer.parseInt(request.getParameter("popRef"));
		double taux = Double.parseDouble(request.getParameter("taux"));   
		int an1 = Integer.parseInt(request.getParameter("anRef"));
		int an2 = Integer.parseInt(request.getParameter("anCib"));
		int diffAn = an2-an1;
		
		//Stocker les données dans le modèle
		ProjectionModel model = new ProjectionModel();
		model.setPopRef(popRef);
		model.setTaux(taux);
		model.setAnRef(an1);
		model.setAnCib(an2);
		
		// Faire appel à la couche métier
		int popProj = project.projectionPopulation(popRef, taux, diffAn);
		
		//stocker le résultat dans le model
		model.setPopProj(popProj);
		
		//stocker le model dans l'objet request
		request.setAttribute("projectionModel", model);
		
		//Faire un forword vers la vue JSP
		request.getRequestDispatcher("VueProject.jsp").forward(request, response);
	}
}

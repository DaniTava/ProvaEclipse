package myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MyServlet() 
    {
        super();
    }
    //se si esegue l'applicazione facendo run dal Servlet viene eseguito in automatico il metodo
    //to get per questo ho inserito all'inizio il comando che permette di passare al file .jsp
	//uso errato dei metodi doGet e doPost(sicuramente)
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	response.sendRedirect("file.jsp");
    	String var=request.getParameter("button");//button è il nome della variabile assegnata al bottone
    	if(var==null)							  //request.getParameter() permette di salvare il contenuto di una variabile html in una stringa su java
    	{}
    	else if(var.equals("Get"))//Call Servlet è il valore assegnato alla variabile del bottone dopo che questi è stato premuto
    	{
    		JFrame finestra = new JFrame("Metodo Get");
    		finestra.setVisible(true);
    		//response.sendRedirect("file.jsp");//dopo aver premuto il bottone viene chiuso il file .jsp e la finestra carica MyServlet.java questo comando permette di tornare al file .jsp
    	}
	}
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String var=request.getParameter("button");
		if(var==null)
		{}
		else if(var.equals("Post"))
		{
			JFrame finestra = new JFrame("Metodo Post");
			finestra.setVisible(true);
			response.sendRedirect("file.jsp");
		}
	}
    
}

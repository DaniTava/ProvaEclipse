package web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;

import elementi.Oggetto;
import elementi.Scelta;
import esecuzione.Struttura;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	ArrayList<Oggetto> elenco;
    
    public Servlet1()
    {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		main();
		int i;
		int n=elenco.size();
		ArrayList<String> lista=new ArrayList();
		for(i=0;i<n;i++)
		{
			lista.add(elenco.get(i).getNome());
		}
		request.setAttribute("ele",lista);
		request.setAttribute("num",n);
		RequestDispatcher Dispatcher = getServletContext().getRequestDispatcher("/Home.jsp");
		Dispatcher.forward(request, response);
		
		

		response.sendRedirect("Home.jsp");
		
		String var = request.getParameter("popo");
		if(var==null)
		{}
		else if(var.equals("volvo"))
		{
			JFrame finestra = new JFrame();
			finestra.setVisible(true);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}
	
	public void main() throws IOException
	{
		Struttura p=new Struttura();
		p.letturaOggetti();	
		elenco=p.getElencoOggetti();
	}

}

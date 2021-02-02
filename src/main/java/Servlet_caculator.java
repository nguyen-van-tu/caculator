import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/calculator")
public class Servlet_caculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double sothunhat=Double.parseDouble(request.getParameter("sothunhat"));
        double sothuhai=Double.parseDouble(request.getParameter("sothuhai"));
        String operator=request.getParameter("operator");
        double result=0;
        switch (operator){
            case "+":
                result=sothunhat+sothuhai;
                break;
            case "-":
                result=sothunhat-sothuhai;
                break;
            case "x":
                result=sothunhat*sothuhai;
                break;
            case "/":
                result=sothunhat/sothuhai;
                break;
        }
        request.setAttribute("result",result);
        RequestDispatcher dispatcher= request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
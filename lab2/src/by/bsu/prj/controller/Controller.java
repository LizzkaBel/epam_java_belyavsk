package by.bsu.prj.controller;

        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;


@WebServlet(urlPatterns = "/controller")
public class Controller extends HttpServlet {
    static Logger log = LogManager.getLogger(Controller.class.getName());


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String numberStr1 = request.getParameter("firstNumber");
        String numberStr2 = request.getParameter("secondNumber");
        int num1 = Integer.parseInt(numberStr1);
        int num2 = Integer.parseInt(numberStr2);
        int result = num1 * num2;



        request.setAttribute("res",result);
        request.getRequestDispatcher("pages/main.jsp").forward(request, response);
    }
}
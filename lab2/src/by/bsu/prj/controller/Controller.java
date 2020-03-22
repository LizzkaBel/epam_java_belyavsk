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


    Logger logger = LogManager.getLogger();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstNumberStr = request.getParameter("num1");
        String secondNumberStr = request.getParameter("num2");
        logger.info("Got 2 strings");
        int firstNumber = Integer.parseInt(firstNumberStr);
        int secondNumber = Integer.parseInt(secondNumberStr);
        logger.info("Parsed strings to numbers");
        int sum = firstNumber + secondNumber;
        request.setAttribute("num1", firstNumber);
        request.setAttribute("num2", secondNumber);
        request.setAttribute("sum", sum);
        request.getRequestDispatcher("pages/main.jsp").forward(request, response);
        logger.info("Sent request");


        request.setAttribute("num1", firstNumber);
        request.setAttribute("num2", secondNumber);
        request.setAttribute("sum", sum);
        request.getRequestDispatcher("pages/main.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
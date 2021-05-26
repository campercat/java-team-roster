import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.commons.beanutils.BeanUtils;

@WebServlet(urlPatterns = {"/player/new", "/player"})
public class PlayerServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    if (req.getServletPath().equals("/player/new")) {
      RequestDispatcher dispatcher = req.getRequestDispatcher("/views/players/new.jsp");
      dispatcher.forward(req, resp);
    } else {
      resp.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
  }

  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    if (req.getServletPath().equals("/player")) {
      String playerName = req.getParameter("name");
      String playerPosition = req.getParameter("position");
      Player player = new Player(playerPosition, playerName);
//      Player player = new Player();
//      try {
//        BeanUtils.populate(player, req.getParameterMap());
//      } catch (IllegalAccessException e) {
//        e.printStackTrace();
//      } catch (InvocationTargetException e) {
//        e.printStackTrace();
//      }
      req.setAttribute("player", player);

      RequestDispatcher dispatcher = req.getRequestDispatcher("/views/players/show.jsp");
      dispatcher.forward(req, resp);
    } else {
      resp.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
  }
}

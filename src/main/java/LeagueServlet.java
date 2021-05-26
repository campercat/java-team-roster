import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/")
public class LeagueServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    League league = League.getLeague();
    req.setAttribute("league", league);
    req.setAttribute("teams", league.getTeams());

    RequestDispatcher dispatcher = req.getRequestDispatcher("/views/teams/index.jsp");
    dispatcher.forward(req, resp);
  }
}

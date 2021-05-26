import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/team")
public class TeamServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    if(req.getParameter("teamIndex") != null) {
      int teamIndex = Integer.parseInt(req.getParameter("teamIndex"));
      League league = League.getLeague();
      if (teamIndex < league.getTeams().size()) {
        req.setAttribute("team", league.getTeams().get(teamIndex));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/teams/show.jsp");
        dispatcher.forward(req, resp);
      } else {
        resp.sendError(HttpServletResponse.SC_NOT_FOUND);
      }
    }
  }
}

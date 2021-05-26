import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/positions", "/position"})
public class PosServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    League league = League.getLeague();
    List<Position> positions = new ArrayList<>();
    List<Player> players = new ArrayList<>();
    for (Player player : league.getTeams().get(0).getPlayers()) {
      Position position = new Position();
      position.setName(player.getPosition());
      positions.add(position);
    }

    if (req.getServletPath().equals("/positions")) {
      req.setAttribute("positions", positions);
      RequestDispatcher dispatcher = req.getRequestDispatcher("/views/positions/index.jsp");
      dispatcher.forward(req, resp);
    } else if (req.getParameter("name") != null) {
      String positionName = req.getParameter("name");
      for (Team team : league.getTeams()) {
        for (Player player : team.getPlayers()) {
          if (player.getPosition().equals(positionName)) {
            players.add(player);
          }
        }
      }
      req.setAttribute("players", players);
      req.setAttribute("positionName", positionName);
      RequestDispatcher dispatcher = req.getRequestDispatcher("/views/positions/show.jsp");
      dispatcher.forward(req, resp);
    }
  }
}

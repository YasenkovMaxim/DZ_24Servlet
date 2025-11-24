import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.time.ZoneId;
@WebServlet("/minsk")
public class MinskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ZoneId minskTimeZone = ZoneId.of("Europe/Moscow");
        Writer w = resp.getWriter();
        w.write(minskTimeZone.toString());
        super.doGet(req, resp);
    }
}

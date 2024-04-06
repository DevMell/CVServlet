package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cv")
public class Servlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        // System.out.println("Requisição recebida em Servlet");

        req.setAttribute("title", "Melissa Gonçalves Mendes");
        req.setAttribute("h11", "Melissa Gonçalves Mendes");
        req.setAttribute("subtitulo", "Análise e Desenvolvimento de Sistemas");
        req.setAttribute("contato2", "melissagmendes1.mm@gmail.com");
        req.setAttribute("contato4", "github.com/DevMell");

        req.setAttribute("h13", "Formação Acadêmica");
        req.setAttribute("formacao1", "Graduação em Análise e Desenvolvimento de Sistemas");
        req.setAttribute("formacao2", "Centro Universitário Senac (Cursando)");


        req.setAttribute("h15", "Habilidades");
        req.setAttribute("habilidade1", "Pacote Office Intermediário (Word, Excel, Power Point");
        req.setAttribute("habilidade2", "Inglês Intermediário (cursando)");

        req.setAttribute("h17", "Projetos");
        req.setAttribute("projeto1", "Você pode encontrar alguns dos meus projetos no GitHub, acessando o meu perfil em: <a href=\"https://github.com/wlln148\">https://github.com/DevMell</a>");

        req.getRequestDispatcher("cv.jsp").forward(req, resp);
    }
}

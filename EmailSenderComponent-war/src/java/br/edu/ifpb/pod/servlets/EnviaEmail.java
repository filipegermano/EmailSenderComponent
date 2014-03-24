package br.edu.ifpb.pod.servlets;

import br.edu.ifpb.pod.email.ConfiguraEmail;
import br.edu.ifpb.pod.email.Email;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author filipe
 */
public class EnviaEmail extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ConfiguraEmail configuraEmail = new ConfiguraEmail();
        Email email = new Email();
        
        configuraEmail.setEmailRemetente(request.getParameter("eRemetente"));
        configuraEmail.setNomeRemetente(request.getParameter("nRemetente"));
        configuraEmail.setEmailDestinatario(request.getParameter("eDestinatario"));
        configuraEmail.setNomeDestinatario(request.getParameter("nDestinatario"));
        configuraEmail.setHost(request.getParameter("host"));
        configuraEmail.setPorta(Integer.parseInt(request.getParameter("porta")));
        configuraEmail.setSsl(true);
        configuraEmail.setSenha(request.getParameter("senha"));
        configuraEmail.setAssunto(request.getParameter("assunto"));
        configuraEmail.setMensagem(request.getParameter("msg"));
        
        String result = email.enviarEmail(configuraEmail);
        
        request.setAttribute("result", result);
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

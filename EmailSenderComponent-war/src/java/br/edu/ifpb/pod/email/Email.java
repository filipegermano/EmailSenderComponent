package br.edu.ifpb.pod.email;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author filipe
 */
public class Email {

//    public void enviaEmail() throws EmailException {
//        SimpleEmail email = new SimpleEmail();
//        email.setHostName("smtp.gmail.com");
//        email.setSmtpPort(465);
//        email.addTo("filipegermano89@gmail.com", "Filipe");
//        email.setFrom("ifpbpod@gmail.com", "Filipe");
//        email.setSubject("Email Java");
//        email.setMsg("Testando email com java");
//
//        System.out.println("autenticando...");
//        email.setSSL(true);
//        email.setAuthentication("ifpbpod@gmail.com", "rmi12345");
//        System.out.println("enviando...");
//        email.send();
//        System.out.println("Email enviado!");
//
//    }
    
    public String enviarEmail(ConfiguraEmail configuraEmail){
        try {
            SimpleEmail email = new SimpleEmail();
            email.setHostName(configuraEmail.getHost());
            email.setSmtpPort(configuraEmail.getPorta());
            email.setFrom(configuraEmail.getEmailRemetente(), configuraEmail.getNomeRemetente());
            email.addTo(configuraEmail.getEmailDestinatario(), configuraEmail.getNomeDestinatario());
            
            email.setSubject(configuraEmail.getAssunto());
            email.setMsg(configuraEmail.getMensagem());
            
            email.setSSL(configuraEmail.isSsl());
            email.setAuthentication(configuraEmail.getEmailRemetente(), configuraEmail.getSenha());
            
            email.send();
            return "E-mail enviado com sucesso!!!";
        } catch (EmailException ex) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
            return "E-mail não enviado, tente novamente.";
        }

    }
}

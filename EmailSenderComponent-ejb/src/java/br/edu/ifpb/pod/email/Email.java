package br.edu.ifpb.pod.email;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author filipe
 */
public class Email {

    public void enviaEmail() throws EmailException {
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.addTo("filipegermano89@gmail.com", "Filipe");
        email.setFrom("ifpbpod@gmail.com", "Filipe");
        email.setSubject("Email Java");
        email.setMsg("Testando email com java");

        System.out.println("autenticando...");
        email.setSSL(true);
        email.setAuthentication("ifpbpod@gmail.com", "rmi12345");
        System.out.println("enviando...");
        email.send();
        System.out.println("Email enviado!");

    }
}

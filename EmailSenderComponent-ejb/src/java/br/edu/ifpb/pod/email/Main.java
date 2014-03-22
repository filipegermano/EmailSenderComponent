package br.edu.ifpb.pod.email;

import org.apache.commons.mail.EmailException;

/**
 *
 * @author filipe
 */
public class Main {

    public static void main(String[] args) throws EmailException {
        ConfiguraEmail configuraEmail = new ConfiguraEmail();
        
        configuraEmail.setEmailDestinatario("filipegermano89@gmail.com");
        configuraEmail.setNomeRemetente("Filipe");
        
        
        Email email = new Email();

        email.enviaEmail();
    }
}

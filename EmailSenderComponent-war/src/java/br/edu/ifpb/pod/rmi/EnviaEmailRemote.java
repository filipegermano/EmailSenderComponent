package br.edu.ifpb.pod.rmi;

import br.edu.ifpb.pod.email.ConfiguraEmail;

/**
 *
 * @author filipe
 */
interface EnviaEmailRemote {
    
    public void enviaEmail(ConfiguraEmail configuraEmail);
    
}

package br.edu.ifpb.pod.rmi;

import br.edu.ifpb.pod.email.ConfiguraEmail;
import br.edu.ifpb.pod.email.Email;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author filipe
 */
public class EnviaEmailRemoteImpl extends UnicastRemoteObject implements EnviaEmailRemote{
    
    public EnviaEmailRemoteImpl() throws RemoteException{
        super();
    }

    @Override
    public void enviaEmail(ConfiguraEmail configuraEmail) {
        Email email = new Email();
        email.enviarEmail(configuraEmail);
    }
    
}

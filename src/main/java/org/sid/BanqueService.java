package org.sid;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

// POJO
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion (@WebParam(name= "Montant") double mt){
        return mt*10.54;   //Convertir  euro/DH
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "Code") int code) {
        return new Compte(code, Math.random()*9898,new Date()) ;

    }
    @WebMethod
    public List<Compte> Listcomptes(){
            return  List.of(
                    new Compte(1,Math.random()*9898,new Date()),
                    new Compte(2,Math.random()*9898,new Date()),
                    new Compte(3,Math.random()*9898,new Date())



                    );
    }

}

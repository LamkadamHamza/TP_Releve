package ws;


import entities.Operation;
import entities.Operations;
import entities.Releve;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "ReleveWS")
public class ReleveService {


    @WebMethod
    public List<Operation> ListOperations(){
        return List.of(

                new Operation("CREDIT", new Date(), 1200 , "Vers Espece") ,
                new Operation("DEBIT",new Date(),3400,"Cheque Guichet"),
                new Operation("DEBIT",new Date(),120,"Assurance"),
                new Operation("CREDIT",new Date(),70000,"Virement")

        );
    }




    @WebMethod
    public Releve getRelve() {
        return  new Releve("123" , new Date(), Math.random()*123,
                new Operations(new Date() , new Date() ,
                        ListOperations())) ;
                   }
    }

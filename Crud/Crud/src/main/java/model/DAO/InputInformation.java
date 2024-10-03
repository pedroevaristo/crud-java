package model.DAO;

import java.sql.SQLException;
import java.util.Scanner;

import Controller.DAOoperation;

public class InputInformation {
    public void New_User_information() throws SQLException {
        DAOoperation dao_op= new DAOoperation();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua informações para cadastrar no banco de dados");
        //Nome completo
        System.out.println("Digite seu nome");
        String name_user_input= scan.next();
        //Email
        System.out.println("Email");
        String email_user_input= scan.next();
        //Data de nascimento
        System.out.println("Data de nascimento");
        Integer date_of_birth_user_input= scan.nextInt();
        //CEP (Com a api)
        System.out.println("CEP");
        String cep_user_input = scan.next();
        //address
        System.out.println("Endereço");
        String address_user_input = scan.next();
        //complement_address
        System.out.println("Complemento do endereço");
        String complement_address = scan.next();


        User user_infor = new User(name_user_input, date_of_birth_user_input,email_user_input,cep_user_input,address_user_input,complement_address);
        dao_op.create(user_infor);



    }
}

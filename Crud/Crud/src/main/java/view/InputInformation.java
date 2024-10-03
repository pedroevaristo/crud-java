package view;

import java.util.Scanner;

public class InputInformation {
    public void New_User_information(){
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
    }
}

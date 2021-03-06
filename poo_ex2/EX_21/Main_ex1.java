package poo_ex2.Ex_21;
//importes
import java.util.Scanner;

public class Main_ex1 {
    
    public static void main(String[] args) {

        Agenda agenda= new Agenda();
        Contato contatotemp= new Contato();

        Scanner scanner = new Scanner(System.in);
        String scantemp;
        String[] stringtemp;

        while(true){

            System.out.println("Informe o nome, seguido do telefone celular e tel. fixo do contato " 
                                + (agenda.getSize()+1) + ":");

            scantemp = scanner.nextLine();
            
            if (scantemp.isEmpty()) break; //condição de parada

            stringtemp=scantemp.split(" ");//criando cada contato
            if(stringtemp.length==2){ //telefone fixo opcional
                contatotemp.setNome(stringtemp[0]);
                contatotemp.setTelcel(stringtemp[1]);
            }
            else {contatotemp.setContato(stringtemp[0], stringtemp[1],stringtemp[2]);}
                
            agenda.adicionar(contatotemp);
        }
        
        agenda.imprimir();
    }
}

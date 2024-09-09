import java.util.Scanner;
public class banco{
    public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);
    conta c1 = new conta();
    
      while (true) {
            System.out.println("Digite seu nome: ");
            c1.nome = entrada.nextLine();
            if (c1.nome.trim().isEmpty()) { 
                System.out.println("O nome da conta não pode ser vazio. Por favor, insira um nome válido.");
            } else {
                break; 
            }
        }
    System.out.println("Deseja fazer deposito inicial, sim para realizar o deposito, digite nao para continuar sem deposito ");
    String dp = entrada.nextLine();
    if (dp.equals( "sim" )){
    System.out.println("digite o deposito inicial ");
    c1.saldo = entrada.nextDouble();}
    else 
        c1.deposito=0;
        c1.sdt = c1.saldo + c1.deposito;
        System.out.println("nome da conta eh " + c1.nome);
        System.out.println("saldo total da conta " + c1.sdt);
        System.out.println("numero da conta " + c1.id);
         while(true){
        System.out.println("");
        System.out.println("qual opcao voce deseja realizar agora: ");
        System.out.println("1 deposito");
        System.out.println("2 saque");
        System.out.println("3 extrato");
        System.out.println("4 trocar nome do titular");
        System.out.println("5 sair");
        System.out.println("");
        
        int escolha = entrada.nextInt();
        
        switch(escolha){
        
            case 1:
                System.out.println("digite o deposito");
                c1.deposito = entrada.nextDouble();
                c1.sdt += c1.deposito;
                System.out.println("saldo total da conta " + c1.sdt);
            
            break;    
            
            
            case 2: 
                System.out.println("digite o valor do saque: ");
                c1.saque = entrada.nextDouble();
                c1.sdt = c1.saldo - (c1.saque + 3);
                System.out.println("saldo total da conta: " + c1.sdt);
            
            break;
                
            case 3:
                if(c1.sdt == 0){
                System.out.println("saldo total da conta: " + c1.saldo);
                System.out.println("nome da conta: " + c1.nome);
                System.out.println("codigo da conta: " + c1.id);}
                else{
                System.out.println("saldo total da conta: " + c1.sdt);
                System.out.println("nome da conta: " + c1.nome);
                System.out.println("codigo da conta: " + c1.id);
            }
            
            break;
        
            case 4: 
                  while (true) {
                        System.out.println("Digite o novo nome: ");
                        String novoNome = entrada.nextLine();
                        if (novoNome.trim().isEmpty()) {
                            System.out.println("O nome da conta não pode ser vazio. Por favor, insira um nome válido.");
                        } else {
                            c1.nome = novoNome;
                            System.out.println("Novo nome da conta: " + c1.nome);
                            break; 
                        }
                    }
                    break;
            
            
             case 5:
                    System.out.println("Saindo... Obrigado por utilizar nossos serviços.");
                    entrada.close();
                    return;
                
            default:
                    System.out.println("Opção inválida, por favor, tente novamente.");
            
            
            
        
        }
    }

}











}
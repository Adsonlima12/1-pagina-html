package aula;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Cliente[] clientes = new Cliente[3];
		
		do{
			System.out.println("================ MENU PRINCIPAL ================");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Mostrar Todos os Clientes");
			System.out.println("3 - Selecionar Cliente");
			System.out.println("4 - Alterar Dados do Cliente");
			System.out.println("5 - Sair do Sistema");
			System.out.print("Digite a opção desejada: ");
			int opcao = leitor.nextInt();
			
			switch(opcao){
				case 1:
					System.out.println("************************");
					System.out.println("CADASTRANDO O CLIENTE!!!");
					System.out.println("************************");
					
					for(int i=0;i<clientes.length;i++){
						
						System.out.print("Nome: ");
						String nome = leitor.next();
						
						System.out.print("Salário: ");
						double salario = leitor.nextDouble();
						
						System.out.print("Idade: ");
						int idade = leitor.nextInt();
						
						clientes[i] = new Cliente(nome,salario,idade);
						System.out.println();
					}
					
					break;	
				case 2:
					System.out.println("******************************");
					System.out.println("MOSTRANDO TODOS OS CLIENTES!!!");
					System.out.println("******************************");
					
					for(int i=0;i<clientes.length;i++){
						
						System.out.println("Nome: " + clientes[i].getNome());
						System.out.println("Salário: " + clientes[i].getSalario());
						System.out.println("Idade: " + clientes[i].getIdade());
						System.out.println();
						
					}
					
					break;
				case 3:
					System.out.println("**********************************");
					System.out.println("SELECIONANDO O CLIENTE DESEJADO!!!");
					System.out.println("**********************************");
					
					System.out.print("Digite o nome do cliente: ");
					String nome = leitor.next();
					
					for(int i=0;i<clientes.length;i++){
						
						if(nome.equals(clientes[i].getNome())){
							System.out.println("Nome: " + clientes[i].getNome());
							System.out.println("Salário: " + clientes[i].getSalario());
							System.out.println("Idade: " + clientes[i].getIdade());
						}
						
					}
					
					break;
				case 4:
					System.out.println("**************************************");
					System.out.println("ALTERANDO DADOS DO CLIENTE DESEJADO!!!");
					System.out.println("**************************************");
					
					System.out.print("Digite o nome do cliente: ");
					nome = leitor.next();
					
					for(int i=0;i<clientes.length;i++){
						
						if(nome.equals(clientes[i].getNome())){
							
							System.out.println("Nome: " + clientes[i].getNome());
							System.out.println("Salário: " + clientes[i].getSalario());
							System.out.println("Idade: " + clientes[i].getIdade());
							
							System.out.println();

							System.out.println("Novo Salário: ");
							clientes[i].setSalario(leitor.nextDouble());
							System.out.println("Idade: ");
							clientes[i].setIdade(leitor.nextInt());
							
						}
						
					}
					break;
					
				case 5:
					System.out.println("************************");
					System.out.println("FINALIZANDO O SISTEMA!!!");
					System.out.println("************************");
					System.exit(0);
					
				default:
					System.out.println("*****************");
					System.out.println("OPÇÃO INVÁLIDA!!!");
					System.out.println("*****************");
					break;
			}
			
		}while(true);
		
	}

}

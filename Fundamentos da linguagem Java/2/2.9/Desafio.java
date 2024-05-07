public class Desafio {

// Um comerciante está curioso para saber o ticket médio das últimas 3 
// vendas que fez em sua loja e contratou você para desenvolver um programa que resolva isso.
// Como você ainda não aprendeu a receber entrada de dados pelo usuário, 
// você pediu ao comerciante os valores das 3 últimas vendas para incluir 
// dentro do código-fonte do programa (mas prometeu arrumar isso assim que aprendesse).
// O comerciante te passou os seguintes valores: 20, 30 e 100.

   public static void main(String[] args) {
	int primeiraVenda = 20;
	int segundaVenda = 30;
	int terceiraVenda = 100;
	
	int ticketMedio = (primeiraVenda + segundaVenda+ terceiraVenda)/3;
	System.out.println("O ticket médio da últimas 3 venda é: " + ticketMedio);
	
    }
	
}


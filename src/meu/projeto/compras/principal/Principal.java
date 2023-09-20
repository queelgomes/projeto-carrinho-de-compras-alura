package meu.projeto.compras.principal;

import meu.projeto.compras.modelo.Compra;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        Compra carrinho = new Compra();

        carrinho.adicionarItemCarrinho();
        int continuar = 0;
        do{
            System.out.print("""
                    [ 1 ] - Adicionar mais produtos
                    [ 2 ] - Exibir lista
                    [ 3 ] - Exibir limite disponivel
                    [ 4 ] - Sair
                    >> Sua opção:\s""");
            continuar = prompt.nextInt();
            if(continuar == 1){
                carrinho.adicionarItemCarrinho();
            }else if (continuar == 2){
                carrinho.exibirLista();
                continuar = 1;
            }else if (continuar == 3){
                carrinho.exibirLimite();
                continuar = 1;
            }
        }while (continuar == 1);
    }
}

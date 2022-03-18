package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("valor do Produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.println("Digite a Quantidade do Produto: ");
        Double quantidadedoProduto = scanner.nextDouble();

        Boolean temDesconto = quantidadedoProduto > 10;

        Double subtotal = valorProduto * quantidadedoProduto;

        if (temDesconto){

            Double desconto = (subtotal * 10) / 100;
            subtotal = subtotal - desconto;
            System.out.println("O cliente comprou " + quantidadedoProduto + " produto,\nlogo recebera um desconto de 10%, pagando " + subtotal);
        } else {
            System.out.println(" O cliente não comprou mais de 10 unidades pagara " + subtotal);
        }
    }
}
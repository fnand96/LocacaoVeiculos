package org.example;

import java.util.Scanner;

public class Aplicacao
{
    public static void main( String[] args )
    {

        System.out.println( "--Bem vindo ao sistema de locação de veículos--" );

        Scanner scan = new Scanner(System.in);
        System.out.println( "--Por favor, digite qual tipo de veículo entre pequeno, médio e SUV--" );
        String tipoVeiculo = scan.next();

        System.out.println( "--Por favor, digite se você é pessoa física ou jurídica--" );
        String tipoPessoa = scan.next();

        System.out.println( "--Por favor, digite quantos dias será a locação--" );
        Integer diasLocacao = scan.nextInt();


        Aluguel calculaAluguel = new Aluguel();
        calculaAluguel.obtemValorLocacao(tipoVeiculo, tipoPessoa, diasLocacao);
    }
}

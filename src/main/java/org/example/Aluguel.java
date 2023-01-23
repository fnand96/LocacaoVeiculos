package org.example;

public class Aluguel {

        private String tipoVeiculo;
        private String tipoPessoaCliente;
        private Integer diasLocacao;
        //private Double precoLocacao;

        double obtemValorLocacao(String tipoVeiculo,String tipoPessoaCliente, Integer diasLocacao ){
                double precoBaseDiaria = 0;
                double valorTotalAluguel = 0;
                System.out.println( "----Calculando valor da locação ----" );

                if (tipoVeiculo.equalsIgnoreCase("pequeno")){
                        precoBaseDiaria = 100;
                        if (tipoPessoaCliente.equalsIgnoreCase("física") && diasLocacao > 5){
                                precoBaseDiaria = precoBaseDiaria - precoBaseDiaria * 0.05;
                        } else if(tipoPessoaCliente.equalsIgnoreCase("jurídica") && diasLocacao > 3) {
                                precoBaseDiaria = precoBaseDiaria - precoBaseDiaria * 0.10;
                        }
                        valorTotalAluguel = precoBaseDiaria * diasLocacao;
                        System.out.println("--O valor final do aluguel é: " + valorTotalAluguel);


                } else if (tipoVeiculo.equalsIgnoreCase("médio")) {
                        precoBaseDiaria = 150;
                        if (tipoPessoaCliente.equalsIgnoreCase("física") && diasLocacao > 5){
                                precoBaseDiaria = precoBaseDiaria - precoBaseDiaria * 0.05;
                        } else if(tipoPessoaCliente.equalsIgnoreCase("jurídica") && diasLocacao > 3) {
                                precoBaseDiaria = precoBaseDiaria - precoBaseDiaria * 0.10;
                        }
                        valorTotalAluguel = precoBaseDiaria * diasLocacao;
                        System.out.println("--O valor final do aluguel é: " + valorTotalAluguel);

                } else if (tipoVeiculo.equalsIgnoreCase("SUV")) {
                        precoBaseDiaria = 200;
                        if (tipoPessoaCliente.equalsIgnoreCase("física") && diasLocacao > 5){
                                precoBaseDiaria = precoBaseDiaria - precoBaseDiaria * 0.05;
                        } else if(tipoPessoaCliente.equalsIgnoreCase("jurídica") && diasLocacao > 3) {
                                precoBaseDiaria = precoBaseDiaria - precoBaseDiaria * 0.10;
                        }
                        valorTotalAluguel = precoBaseDiaria * diasLocacao;
                        System.out.println("--O valor final do aluguel é: " + valorTotalAluguel);


                }

        return valorTotalAluguel;
        }

}

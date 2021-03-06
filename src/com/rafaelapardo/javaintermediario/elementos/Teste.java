package com.rafaelapardo.javaintermediario.elementos;

@InformacaoAula(
        autor = "Loiane",
        aulaNumero = 65,
        blog = "loiane.com"
)

public class Teste {

    @InformacaoAula(
            autor = "Loiane",
            aulaNumero = 65,
            blog = "loiane.com"
    )

    public static void main(String[] args) {

        EscopoVariaveis escopo = new EscopoVariaveis();
        escopo.setValor(10);

        System.out.println(escopo.getValor()); //10

        System.out.println(escopo.calculaValor(20)); //20 ou 30?

        System.out.println(escopo.getValor()); //10 ou 20?

        System.out.println(escopo.teste()); //4 ou 9

        System.out.println(escopo.getValor());



    }
}

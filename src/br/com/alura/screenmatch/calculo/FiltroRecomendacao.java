package br.com.alura.screenmatch.calculo;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificado classificado){
        if (classificado.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificado.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento!");
        } else{
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}

package edu.rodrigo.primeirasemana;
public class MinhaClasse{

    public static void main(String[] args) {

        String primeiroNome= "Rodrigo";
        String segundoNome= "";
        String terceiroNome= "Rosa";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome);
        
        System.out.println(nomeCompleto);
        
            }

            public static String nomeCompleto(String primeiroNome, String segundoNome, String terceiroNome){
                return primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome);
            }
}
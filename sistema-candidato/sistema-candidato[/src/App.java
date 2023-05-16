import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;



public class App {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
        imprimirSelecionados();
        ligarParaSelecionados("FELIPE");
    }
    static String[]candidatosAprovados = new String[5];
    

    

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase=2000.0;
        

        while(candidatosSelecionados<5 && candidatoAtual<candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato "+candidato+" solicitou este valor de salário "+salarioPretendido);
            if(salarioBase>salarioPretendido){
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
                candidatosAprovados[candidatosSelecionados]=candidato;
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

       
    }

    static void imprimirSelecionados(){
        for(String aprovados : candidatosAprovados){
            System.out.println(aprovados);
        }
    }

    static void ligarParaSelecionados(String candidato){
         
		
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu=false;
            do {
                atendeu= atender();
                continuarTentando = !atendeu;
                if(continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("CONTATO REALIZADO COM SUCESSO");
                
            }while(continuarTentando && tentativasRealizadas<3);
            
            if(atendeu)
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
            else
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
            
            
        }

        
        

   

   
static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}

static void analisarCandidato(double salarioPretendido){
    double salarioBase = 2000.0;
    if(salarioBase<salarioPretendido){
        System.out.println("LIGAR PARA O CANDIDATO");
    
    }else if(salarioBase==salarioPretendido){
        System.out.println("LIGAR PARA O CONDIDATO COM CONTRA PROPOSTA");
    }else{
        System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
}

static boolean atender() {
    return new Random().nextInt(3)==1;	
}
}

import java.util.Scanner;
import java.util.Random;

public class App {
    static int lerOpcao(Scanner leitura){
        System.out.println("[ 1 ] Pedra \n[ 2 ] Papel \n[ 3 ] Tesoura \n[ 4 ] Sair do jogo");

        int resposta;
        while (true){
            resposta = leitura.nextInt();
            if (resposta == 1 || resposta == 2 || resposta == 3 || resposta == 4){
                return resposta;
            }
        }
    }

    static int jogarComputador(String opcoes[]){
        Random aleatorio = new Random();
        int indiceAleatorio = aleatorio.nextInt(3); // 0 a 2
        System.out.println("Vou de " + opcoes[indiceAleatorio] + " dessa vez.");
        return indiceAleatorio + 1; // 1 a 3, mesma ordem
    }
    
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        

        String opcoes[] = {"Pedra", "Papel", "Tesoura"};
        int jogadaComputador; 
        int jagadaJogador;
        int qtdVitoriasJogador = 0;
        int qtdVitoriasComputador = 0;

        while(true){
            System.out.println("-----------------------------------------------");

            jagadaJogador = lerOpcao(leitura);
            if (jagadaJogador == 4){
                break;
            }

            jogadaComputador = jogarComputador(opcoes);
            
            // condições de vitória do jogador
            if (jagadaJogador == 1 && jogadaComputador == 3){
                qtdVitoriasJogador += 1;
                System.out.println("Você venceu");
            }else if (jagadaJogador == 2 && jogadaComputador == 1){
                qtdVitoriasJogador += 1;
                System.out.println("Você venceu");
            }else if (jagadaJogador == 3 && jogadaComputador == 2){
                qtdVitoriasJogador += 1;
                System.out.println("Você venceu");
            }
            else if (jagadaJogador == jogadaComputador){
                System.out.println("Empate");
            }else{
                System.out.println("Venci!");
                qtdVitoriasComputador += 1;
            }

        }
        System.out.println("Você venceu " + qtdVitoriasJogador + " vezes!");
        System.out.println("Eu venci " + qtdVitoriasComputador + " vezes!");
        System.out.println("Até a próxima!");
    }
}

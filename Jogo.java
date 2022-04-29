import java.util.Random;

//Alta coesão
//Desejamos classes altamente coesas (resolve somente um problema)
public class Jogo {
    public static void main(String[] args) throws Exception {
        //Essa é uma variável de referência
        //Personagem p;
        //p = new Personagem();
        Personagem p = new Personagem();

        //Operador de acesso a membro: .
        p.nome = "João";

        //Operador de acesso a membro
        //p.cacar();
        Random gerador = new Random();
        //1: caçar
        //2: comer
        //3: dormir
        //loop do jogo
        while(true){
            int oQueFazer = gerador.nextInt(3) + 1;
            //fall-through
            switch(oQueFazer){
                case 1:
                    p.cacar();
                    break;
                case 2:
                    p.comer();
                    break;
                case 3:
                    p.dormir();
                    break;
            }
            System.out.printf("Energia: %d. Fome: %d. Sono: %d%n", p.energia, p.fome, p.sono);
            System.out.println("==============================================================");
            Thread.sleep(1000);
        }
    }
}

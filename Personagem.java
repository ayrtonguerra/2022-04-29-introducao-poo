public class Personagem {
    //Membros
    //Atributos (variáveis)
    public String nome;
    public int energia = 10;
    public int fome = 0;
    public int sono = 0;

    //métodos (comportamentos)
    //tipo de retorno
    //nome
    //lista de parâmetros
    //corpo
    //public final abstract native
    void cacar(){
        if(energia >= 2){
            System.out.println(nome + " caçando...");
            //energia = energia - 2;
            energia-=2;
        } else {
            System.out.printf("%s sem energia para caçar...%n", nome);
        }
        fome = fome + 1 <= 10 ? fome + 1 : 10;
        sono = Math.min(sono + 1, 10);
    }

    void comer(){
        if(fome >= 1){
            System.out.println(nome + " comendo...");
            energia = Math.min(energia + 1, 10);
            fome--;
        } else {
            System.out.printf("%s sem fome...%n", nome);
        }
    }

    void dormir(){
        if(sono >= 1){
            System.out.printf("%s dormindo...%n", nome);
            energia = energia + 1 <= 10 ? energia + 1 : 10;
            //sono = sono - 1;
            //sono -= 1;
            //sono--;
            --sono;
        } else {
            System.out.printf("%s sem sono...%n", nome);
            //String s = String.format("%s sem sono...", nome);
        }
    }
}

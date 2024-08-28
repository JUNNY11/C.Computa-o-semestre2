class Idade {
    public static void main(String[] args) {
        int idade;
        idade = 21;

        int idadeNoAnoQueVem = idade + 1;

        int metadeIdade = idadeNoAnoQueVem / 2;

        boolean maiorIdade; 
        maiorIdade = idade >= 18; 

        //char tipoSangue = 'a';
        boolean tipoDeSangue;
        tipoDeSangue = 'a' == 'A';

        int i = 5;
        int j = i;
        i = i + 1;

        System.out.println(i);
        System.out.println(j);
        System.out.println(idade);
        System.out.println(idadeNoAnoQueVem);
        System.out.println(metadeIdade); 
        System.out.println(maiorIdade);
        //System.out.println(tipoSangue);
        System.out.println(tipoDeSangue);
    }
}
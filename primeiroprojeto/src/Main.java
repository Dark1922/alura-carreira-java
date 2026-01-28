public class Main {
    public static void main(String[] args) {
        System.out.printf("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        System.out.println("Ano do lançamento: " +  anoLancamento);
        boolean incluirNoPlano = true;
        double notaFilme = 8.2;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = "Filme de aventura com galâ dos ano 80";
        System.out.println(sinopse);

        sinopse = """
                Filme de aventura
                Com galâ 
                Dos ano 80
                """;
        System.out.println(sinopse);
    }
}
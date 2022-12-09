public class Sessao {
    public static void main(String[] args) {

        Cinema [] cinemas = new Cinema[3];

        cinemas[0] = new Cinema("Trem Bala", 15.00);
        cinemas[1] = new Cinema("One piece", 7.50);
        cinemas[2] = new Cinema("Ritmo Quente", 12.60);

        Interator cinemaInterator = new CinemaInterator(cinemas);

        while(cinemaInterator.hasNext()){
            Cinema cinema = (Cinema)cinemaInterator.next();
            System.out.println(cinema.nome + "= R$" + cinema.preco);
        }


    }
}

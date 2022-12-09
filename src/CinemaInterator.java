public class CinemaInterator implements  Interator {

    Cinema[] itens;
    int posicao = 0;

    public CinemaInterator(Cinema[] itens){
        this.itens = itens;
    }


    @Override
    public boolean hasNext() {
        if (posicao >= itens.length || itens[posicao] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Cinema cinema = itens[posicao];
        posicao++;
        return cinema;
    }
}

package lista.encadeada;

public class ListaEncadeada<T> {


    No<T> referenciaEntrada;


    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;

    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index) {
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorn = null;
        for (int i = 0; i <=index; i++) {
            noRetorn = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;

    }

    public T remove(int index) {

        No<T> noPivon = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivon.getProximoNo();
            return noPivon.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivon.getProximoNo());
        return noPivon.getConteudo();
    }
    public int size() {
        int tamanhoLista = 0;

        No<T> referenciaAuxiliar = referenciaEntrada;

        while (true) {

            if (referenciaAuxiliar != null) {
                tamanhoLista++;
                if (referenciaAuxiliar.getProximoNo() != null) {
                    referenciaAuxiliar = referenciaEntrada.getProximoNo();
                } else {
                    break;
                }

            } else {
                break;
            }
        }

        return tamanhoLista;
    }

    private  void  validaIndice(int index){
        if (index >=size()){
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice "+index+" desta lista"+ " Limite="+ultimoIndice);
        }

    }

    public T get(int index){
        return getNo(index).getConteudo();

    }

    public String toString (){

        String strRetorn ="";
        No<T> noAuxiliar  = referenciaEntrada ;
        for (int i = 0 ; i<this.size(); i++){
            strRetorn += "No{Conteudo = "+ noAuxiliar.getConteudo() +"} ---->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorn = "null";
        return strRetorn;
    }


}

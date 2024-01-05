public class SmartTv {
     /// Definindo objeto 
    boolean ligada = false;
    int canal = 1;
    int volume = 56;



    /// Alterando objeto 
    public void ligar(){
        ligada = true;

    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void dimiminuirVolume(){
        volume--;
    }

    public void canalSeguinte(){
        canal++;
    }
    public void canalAnterior(){
        canal--;
    }
    public void mudarCanal(){
        canal = 32;
    }
}



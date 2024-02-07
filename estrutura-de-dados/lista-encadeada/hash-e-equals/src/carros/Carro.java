package carros;

import java.util.Objects;

public class Carro implements Comparable<Carro> {

    public Carro(String marca) {
        Marca = marca;
    }

    String Marca;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Carro carro = (Carro) object;
        return Objects.equals(Marca, carro.Marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Marca='" + Marca + '\'' +
                '}';
    }

    @Override
    public int compareTo(Carro o) {
        if (this.Marca.length()< o.Marca.length()) {
            return -1;
        } else if (this.Marca.length()> o.Marca.length()){
            return 1 ;
        } else {
           return  0;
        }
    }
}

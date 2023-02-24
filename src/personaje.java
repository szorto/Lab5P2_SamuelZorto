public class personaje {
    private String nombre, universo, debilidad, poder;
    private int agFisica, fuerza, agMental, hp;

    public personaje() {
    }

    public personaje(String nombre, String universo, String debilidad, String poder, int agFisica, int fuerza, int agMental, int hp) {
        this.nombre = nombre;
        this.universo = universo;
        this.debilidad = debilidad;
        this.poder = poder;
        this.agFisica = agFisica;
        this.fuerza = fuerza;
        this.agMental = agMental;
        this.hp = hp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getAgFisica() {
        return agFisica;
    }

    public void setAgFisica(int agFisica) {
        this.agFisica = agFisica;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgMental() {
        return agMental;
    }

    public void setAgMental(int agMental) {
        this.agMental = agMental;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "personaje{" + "nombre=" + nombre + ", universo=" + universo + ", debilidad=" + debilidad + ", poder=" + poder + ", agFisica=" + agFisica + ", fuerza=" + fuerza + ", agMental=" + agMental + ", hp=" + hp + '}';
    }
    
    
    
}

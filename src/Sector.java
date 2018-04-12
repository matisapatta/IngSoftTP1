import java.util.ArrayList;

public class Sector extends Campo {

    private ArrayList<Campo> hijos;
    private float count;

    public Sector(){
        this.hijos = new ArrayList<>();
        this.count = 0;
    }

    public Class getTipo(Class c){
        return this.getClass();
    }

    public float getCountAgua(){
        float auxCount = 0;
        for(int i=0;i<4;i++) {
            if(this.getHijo(i) instanceof Agua){
                count++;
            } else if (this.getHijo(i) instanceof Sector){
                auxCount = ((Sector) this.getHijo(i)).getCountAgua();
            }
        }
        count = count + auxCount;
        count = count/4;
        return count;
    }


    public Campo getHijo(int i){
        return this.hijos.get(i);
    }

    public void agregarHoja(Campo c){
        this.hijos.add(c);
    }
}

import java.util.ArrayList;

public class Sector extends Campo {

    private ArrayList<Campo> hijos;
    private float countAgua;
    private float countTierra;

    public Sector(){
        this.hijos = new ArrayList<>();
        this.countAgua = 0;
        this.countTierra = 0;
    }

    public Class getTipo(Class c){
        return this.getClass();
    }

    /*public float getCountAgua(){
        float auxCount = 0;
        for(int i=0;i<4;i++) {
            if(this.getHijo(i) instanceof Agua) {
                countAgua++;
            } else if (this.getHijo(i) instanceof Sector){
                auxCount = ((Sector) this.getHijo(i)).getCountAgua();
            }
        }
        countAgua = countAgua + auxCount;
        countAgua = countAgua/4;
        return countAgua;
    }
    public float getCountTierra(){
        float auxCount = 0;
        for(int i=0;i<4;i++) {
            if(this.getHijo(i) instanceof Tierra) {
                countTierra++;
            } else if (this.getHijo(i) instanceof Sector){
                auxCount = ((Sector) this.getHijo(i)).getCountTierra();
            }
        }
        countTierra = countTierra + auxCount;
        countTierra = countTierra/4;
        return countTierra;
    }*/
    public float getCountAgua(){
        for(int i = 0;i<hijos.size();i++){
            float countAux = hijos.get(i).getCountAgua()/4;
            countAgua = countAgua + countAux;
        }
        return countAgua;
    }
    public float getCountTierra(){
        for(int i = 0;i<hijos.size();i++){
            float countAux = hijos.get(i).getCountTierra()/4;
            countTierra = countTierra + countAux;
        }
        return countTierra;
    }




    public Campo getHijo(int i){
        return this.hijos.get(i);
    }

    public void agregarHoja(Campo c){
        this.hijos.add(c);
    }
}

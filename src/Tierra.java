public class Tierra extends Campo {

    private float tierra;
    private float agua;

    public Tierra(){
        this.agua = 0;
        this.tierra = 1;
    }
    public Class getTipo(Class c){
        return this.getClass();
    }

    public float getCountAgua(){
        return agua;
    }
    public float getCountTierra(){
        return tierra;
    }

}

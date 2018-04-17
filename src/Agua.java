public class Agua extends Campo{

    private float agua;
    private float tierra;

    public Agua(){
        this.agua = 1;
        this.tierra = 0;

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

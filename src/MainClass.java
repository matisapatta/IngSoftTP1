public class MainClass {

    public static void main(String[] args){


        /* Campo de prueba */
        Campo campo = new Sector();
        Campo a1 = new Agua();
        Campo a2 = new Agua();
        Campo t1 = new Tierra();
        Campo s1 = new Sector();
        Campo sa1 = new Agua();
        Campo st1 = new Tierra();
        Campo st2 = new Tierra();
        Campo st3 = new Tierra();
        campo.agregarHoja(a1);
        campo.agregarHoja(a2);
        campo.agregarHoja(t1);
        campo.agregarHoja(s1);
        s1.agregarHoja(sa1);
        s1.agregarHoja(st1);
        s1.agregarHoja(st2);
        s1.agregarHoja(st3);
        /* Fin campo de prueba */

        float cantAnegado = 0;
        cantAnegado = ((Sector)campo).getCountAgua();

        System.out.println("Porcentaje de agua = ");
        System.out.print(cantAnegado*100);
        System.out.println("%");


    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Smarthome!!");

        MikroOvn nOvn = new MikroOvn();//Instantiate an object from a class, in this example it's MikroOvn.java

        nOvn.turningSpeed = 50;
        nOvn.temperatur = 200;
        nOvn.ydelse = 300;
        nOvn.start();

        MikroOvn mOvn = new MikroOvn();//Instantiate an object from a class, in this example it's MikroOvn.java

        mOvn.turningSpeed = 75;
        mOvn.temperatur = 200;
        mOvn.ydelse = 300;
        mOvn.start();

        System.out.println("Nicki's ovn har en effekt på " + nOvn.temperatur);
        System.out.println();
        System.out.println("Mik's ovn har en effekt på " + mOvn.temperatur);
    }

}

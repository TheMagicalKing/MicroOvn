public class MikroOvn {
    //Variables

    double temperatur;//Celsius
    short timer;//microseconds
    byte funktioner;// What the microwave kan.
    boolean turningPlate;// Drejer, drejer ikke
    byte turningSpeed;//% 0-100 each way
    short ydelse; // how much wattage

    //Methods
    boolean start(){
        //@TODO flicks a switch to tun on the microwave
        System.out.println("Microwave is running");
        return true;
    }
    void stop(){
        //@TODO flick the switch back
    }
}

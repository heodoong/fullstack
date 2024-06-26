package ch08.sec04;


import ch08.sec02.Audio;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

//        rc= new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}

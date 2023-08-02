package src.main;

public class Chandrayaan {

    private int xDirect, yDirect, zDirect;
    private char direction;

    public Chandrayaan() {

        this.xDirect = 0;
        this.yDirect = 0;
        this.zDirect = 0;
        this.direction = ' ';
    }

    public Chandrayaan(int x, int y, int z, char intialPostion) {
        this.xDirect = x;
        this.yDirect = y;
        this.zDirect = z;
        direction = intialPostion;
    }

    public void finalDestination(char[] seriesOfCommands) {
        System.out.println("Commands receieved succesfully");
    }

}
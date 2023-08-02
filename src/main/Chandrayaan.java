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

    public Chandrayaan(int xDirect, int yDirect, int zDirect, char intialPostion) {
        this.xDirect = xDirect;
        this.yDirect = yDirect;
        this.zDirect = zDirect;
        direction = intialPostion;
    }

    public int finalDestination(char[] seriesOfCommands) {
         return -1;
    }

}

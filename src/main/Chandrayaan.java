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

    public String finalDestination(char[] seriesOfCommands) {
        String finalans = "";
        for (char command : seriesOfCommands) {
            switch (command) {
                case 'f':
                    moveForward();
                    break;
                case 'r':
                    turnRight();
                    break;
                default:
                    System.out.println("Invalid command: " + command);
                    break;
            }
        }
        return finalans = Integer.toString(xDirect) +
                Integer.toString(yDirect) +
                Integer.toString(zDirect) +
                Character.toString(direction);

    }
        private void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'U':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'W':
                direction = 'N';
                break;
            case 'D':
                direction = 'E';
                break;
        }
    }

    public void moveForward() {
        switch (direction) {
            case 'N':
                yDirect += 1;
                break;
            case 'E':
                xDirect += 1;
                break;
            case 'U':
                zDirect += 1;
                break;
            case 'S':
                yDirect -= 1;
                break;
            case 'W':
                xDirect -= 1;
                break;
            case 'D':
                zDirect -= 1;
                break;
        }
    }
}

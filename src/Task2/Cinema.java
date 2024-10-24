package Task2;

public class Cinema {
    private String[][] seats;
    private String reserved = "X";
    private String notReserved = "O";

    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0; j < seats ; j++){

                if(i == 0 && j == 0){
                    this.seats[0][0] = reserved;
                }
                else {
                    this.seats[i][j] = notReserved;
                }
            }
        }
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    public boolean reserve(int row, int seat) {
        if(row == getRows()){
            row--;
        }
        if (seat == getSeats()){
            seat--;
        }
        if (seats[row][seat].equals(notReserved)) {
            seats[row][seat] = reserved;
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals(reserved)) {
            seats[row][seat] = notReserved;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
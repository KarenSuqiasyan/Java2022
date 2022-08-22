package Lesson3BankApplication;

import java.util.Random;

public class Acra {



    private boolean isBlocked;
    Random random = new Random();
    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int scoreCounterMethod(Customer customer) {
        isBlocked = random.nextBoolean();

        return random.nextInt(800) + 400;
    }

}

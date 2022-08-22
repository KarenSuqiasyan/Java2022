package Lesson1;

public class WinLoseClass implements WinLoseListener {

    private NumberGenerateClass numberGenerateClass;


    @Override
    public void win()  {
        numberGenerateClass.randomNumberMethod();
    }

    @Override
    public void lose() {
        System.out.println(" u lose");
    }
}

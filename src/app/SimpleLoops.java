package app;

public class SimpleLoops {
    private final int numOfCycles;
    private final LoopType loopType;

    private static final String strTemplate = "%d) Num is %d, sum is %d\n";
    public SimpleLoops(int numOfCycles, LoopType loopType) {
        this.numOfCycles = numOfCycles;
        this.loopType = loopType;
    }

    public void startLoop() {
        switch (loopType){
            case FOR_LOOP -> simpleForLoop();
            case WHILE-> simpleWhileLoop();
            case DO_WHILE -> simpleDoWhileLoop();
        }
    }

    private void simpleForLoop() {
        int count = 0;

        System.out.println("----------FOR-LOOP----------");
        for(int i = 0; i <= numOfCycles; i++){
            count += i;
            System.out.printf(strTemplate, i, i, count);
        }

        System.out.println("----------------------------");
        System.out.println("Sum of numbers is " + count + "\n\n\n");
    }

    private void simpleWhileLoop() {
        int i = 0;
        int count = 0;

        System.out.println("----------WHILE-LOOP----------");
        while(i <= numOfCycles){
            i++;
            count += i;
            System.out.printf(strTemplate, i, i, count);
        }

        System.out.println("----------------------------");
        System.out.println("Sum of numbers is " + count + "\n\n\n");
    }

    private void simpleDoWhileLoop() {
        int i = 0;
        int count = 0;

        System.out.println("----------DO-WHILE-LOOP----------");
        do{
            i++;
            count += i;
            System.out.printf(strTemplate, i, i, count);
        } while (i <= numOfCycles);

        System.out.println("----------------------------");
        System.out.println("Sum of numbers is " + count + "\n\n\n");
    }
}

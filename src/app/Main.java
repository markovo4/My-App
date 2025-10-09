package app;

public class Main {
    public static void main(String[] args) {
        SimpleLoops simpleForLoop = new SimpleLoops(6, LoopType.FOR_LOOP);
        SimpleLoops simpleWhileLoop = new SimpleLoops(6, LoopType.FOR_LOOP);
        SimpleLoops simpleDoWhileLoop = new SimpleLoops(6, LoopType.FOR_LOOP);

        simpleForLoop.startLoop();
        simpleWhileLoop.startLoop();
        simpleDoWhileLoop.startLoop();
    }
}

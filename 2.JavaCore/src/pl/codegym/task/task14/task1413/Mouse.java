package pl.codegym.task.task14.task1413;

public class Mouse implements CompItem {
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}

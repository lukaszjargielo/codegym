package pl.codegym.task.task14.task1408;

public class NorthAmericanHen extends Hen {

    @Override
    int getMonthlyEggCount() {
        return 30;
    }

    @Override
    String getDescription() {

        return super.getDescription() + String.format(" Pochodzę z %s. Znoszę %d jaj na miesiąc.",Continent.NORTHAMERICA, getMonthlyEggCount());


    }
}

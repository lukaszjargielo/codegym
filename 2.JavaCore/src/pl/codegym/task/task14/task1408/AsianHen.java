package pl.codegym.task.task14.task1408;

public class AsianHen extends Hen {
    @Override
    int getMonthlyEggCount() {

        return 25;
    }

    @Override
    String getDescription() {

        return super.getDescription() +
                String.format(" Pochodzę z %s. Znoszę %d jaj na miesiąc.", Continent.ASIA, getMonthlyEggCount());

    }
}

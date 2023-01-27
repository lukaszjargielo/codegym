package pl.codegym.task.task14.task1408;

public class AfricanHen extends Hen {
    @Override
    int getMonthlyEggCount() {
        return 60;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Pochodzę z " + Continent.AFRICA + ". Znoszę " + getMonthlyEggCount() + " jaj na miesiąc.";


    }
}

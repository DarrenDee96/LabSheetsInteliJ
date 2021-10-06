package Lab5.exercise3;

public class Thermometer {
    private int currentTemp;
    private int maxTemp;
    private int minTemp;

    public Thermometer() {
        currentTemp = 0;
        maxTemp = Integer.MIN_VALUE;
        minTemp = Integer.MAX_VALUE;

    }

    public Thermometer(int currentTemp) {
        this.currentTemp = currentTemp;
        this.minTemp = currentTemp;
        this.maxTemp = currentTemp;

    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }
    public String toString () {
        return "Current Temp " + currentTemp + " Max Temp " + maxTemp + "Min Temp " + minTemp;
    }

    public void setTemperature(int currentTemp) {
        int max,min;
        min= getMinTemp();
        max = getMaxTemp();
        if (currentTemp < min) {
            min = currentTemp;
            setMinTemp(min);
        }
        if (currentTemp > max) {
            max = currentTemp;
        setMaxTemp(max);
        }

        this.currentTemp = currentTemp;

    }

    private void updateMaxMinTemp(){

    }
}

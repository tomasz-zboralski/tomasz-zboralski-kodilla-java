package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast(){
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()){

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage(){
        double addedTemperatures = 0;
        for (Map.Entry<String, Double> entry: temperatures.getTemperatures().entrySet()){
            Double tempValue = entry.getValue();
            addedTemperatures += tempValue;
        }
        double result = addedTemperatures / temperatures.getTemperatures().size();
        return result;
    }

    public double calculateMedian(){
        ArrayList<Double> TempList=new ArrayList<Double>();
        for (Map.Entry<String, Double> entry: temperatures.getTemperatures().entrySet()) {
            Double tempValue = entry.getValue();
            TempList.add(tempValue);
        }
        Collections.sort(TempList);
        double median;
        if (TempList.size() % 2 == 0) {
            median = (TempList.get(TempList.size() / 2) + TempList.get(TempList.size() / 2 - 1)) / 2;
        } else {
            median = TempList.get(TempList.size() / 2);
        }
        return median;
    }

    }

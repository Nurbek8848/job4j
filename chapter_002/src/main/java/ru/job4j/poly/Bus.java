package ru.job4j.poly;

public class Bus implements Transport {

    int place = 50;
    float priceTicket  = 195;
    float pricePetrol = 45.8f;
    int tank = 200;
    float consumption = 1.7f;
    int distance = 0;

    @Override
    public void drive() {
        if (((place * priceTicket) - fillUp(tank)) >= 0) {
            while (tank > 0) {
                distance++;
                tank -= consumption;
            }
        }
    }

    @Override
    public void passengers(int amount) {
        if (amount == place) {
            drive();
        }
    }

    @Override
    public float fillUp(int petrol) {
       return petrol * pricePetrol;
    }
}

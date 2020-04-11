package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Kalkulator KalkulatorPodstawowy = new Kalkulator();
        System.out.println(KalkulatorPodstawowy.Dodawanie(2,4));
        System.out.println(KalkulatorPodstawowy.Odejmowanie(2,4));


        KalkulatorStatystyczny kalkulatorStatystyczny = new KalkulatorStatystyczny();
        System.out.println(kalkulatorStatystyczny.Dodawanie(2,4));
        System.out.println(kalkulatorStatystyczny.Odejmowanie(2,4));
        System.out.println(kalkulatorStatystyczny.sinus());


    }
}

class Kalkulator {
    int x;
    int y;
    int Dodawanie(int x, int y)
    {
        return x+y;
    }
    int Odejmowanie(int x, int y)
    {
        return x-y;
    }


}

class KalkulatorStatystyczny extends Kalkulator {
    int z=30;
    double sinus() {
        return Math.sin(z);
    }

}

package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by drogan on 23.10.15.
 */
public abstract class DrinkMaker
{
    public abstract void getRightCup();

    public abstract void putIngredient();

    public abstract void pour();

    public void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
/*oid getRightCup() - выбрать подходящую чашку
- void putIngredient() - положить ингредиенты
- void pour() - залить жидкостью
2. В классе DrinkMaker создать и реализовать метод void makeDrink(), который готовит напиток в такой
последовательности: выбирает чашку, кладет ингредиенты, заливает жидкостью.
*/

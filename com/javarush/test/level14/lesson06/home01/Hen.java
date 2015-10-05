package com.javarush.test.level14.lesson06.home01;

/**
 * Created by drogan on 13.09.15.
 */
public abstract class Hen
{
        private String name;

        protected Hen(String name)
        {
            this.name = name;
        }

        public abstract int getCountOfEggsPerMonth();
        public String getDescription()
        {
            return "Я курица.";
        }
}

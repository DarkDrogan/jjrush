package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg z1 = new Zerg();
        z1.name = "uName";
        Zerg z2 = new Zerg();
        z2.name = "uNa";
        Zerg z3 = new Zerg();
        z3.name = "me";
        Zerg z4 = new Zerg();
        z4.name = "uNe";
        Zerg z5 = new Zerg();
        z5.name = "ame";
        Zerg z6 = new Zerg();
        z6.name = "Name";
        Zerg z7 = new Zerg();
        z7.name = "uame";
        Zerg z8 = new Zerg();
        z8.name = "uNae";
        Zerg z9 = new Zerg();
        z9.name = "uNadsfme";
        Zerg z10 = new Zerg();
        z10.name = "uNameaa";

        Protos protos1 = new Protos();
        protos1.name = "asc";
        Protos protos2 = new Protos();
        protos2.name = "assc";
        Protos protos3 = new Protos();
        protos3.name = "asasdc";
        Protos protos4 = new Protos();
        protos4.name = "assdahjsdc";
        Protos protos5 = new Protos();
        protos5.name = "aswqeyc";

        Terran terran1 = new Terran();
        terran1.name = "1cd";
        Terran terran2 = new Terran();
        terran2.name = "cd2";
        Terran terran3 = new Terran();
        terran3.name = "c3d";
        Terran terran4 = new Terran();
        terran4.name = "4cd";
        Terran terran5 = new Terran();
        terran5.name = "c52d";
        Terran terran6 = new Terran();
        terran6.name = "64cd";
        Terran terran7 = new Terran();
        terran7.name = "cd77";
        Terran terran8 = new Terran();
        terran8.name = "cd09";
        Terran terran9 = new Terran();
        terran9.name = "c9d";
        Terran terran10 = new Terran();
        terran10.name = "c10d";
        Terran terran11 = new Terran();
        terran11.name = "cd11";
        Terran terran12 = new Terran();
        terran12.name = "12cd";


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}
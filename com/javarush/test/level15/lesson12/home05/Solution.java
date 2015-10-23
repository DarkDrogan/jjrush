package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса
Solution.
*/

public class Solution {
    public Solution(){

    }

    public Solution(String s, String xc){

    }

    public Solution(String s, int i, int dc){

    }

    protected Solution(String s){

    }

    protected Solution(String x, long id, int i){

    }

    protected Solution(long id, String x, int i){

    }

    Solution(int id){

    }

    Solution(long id, int idc){

    }

    Solution(long id, int idc, String iDontCare){

    }

    private Solution(boolean logic){
    }

    private Solution(boolean logic, String dot){

    }

    private Solution(boolean logic, String dot, String net){

    }
}
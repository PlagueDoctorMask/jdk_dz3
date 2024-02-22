/*Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.

Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае.
Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
То есть тип элемента в первом массиве под нулевым индексом такой же как тип элемента во втором массиве под нулевым индексом
(и под всеми остальными индексами аналогично)*/

import java.util.Arrays;

public class Task12 {
    public static < T extends Number> double sum (T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

    public static < T extends Number> double subtract (T a, T b){
        return a.doubleValue() - b.doubleValue();
    }

    public static < T extends Number> double multiply (T a, T b){
        return a.doubleValue() * b.doubleValue();
    }

    public static < T extends Number> double divide (T a, T b){
        if(b.doubleValue() == 0){
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static <T> boolean compareArrays(T[] list1, T[] list2){
        if (list1.length == list2.length) {
            boolean flag = true;
            for (int i = 0; i < list1.length; i++) {
                if (!list1[i].getClass().equals(list2[i].getClass())) {
                    flag = false;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;

    }
}


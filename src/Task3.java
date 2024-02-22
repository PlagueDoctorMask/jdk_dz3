/*Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
а также переопределение метода toString(), возвращающее строковое представление пары.*/

public class Task3<T, K> {
    private T t;
    private K k;

    public Task3(T t, K k) {
        this.t = t;
        this.k = k;
    }

    public T getT() {
        return t;
    }
    public K getK() {
        return k;
    }
    @Override
    public String toString() {
        return "t=" + t + ", k=" + k;
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Проверка создания MyArrayList
        MyArrayList array = new MyArrayList(3);

        //Проверка добавления элемента
        System.out.printf("\nДобавления элемента в массив");
        array.add(3);
        array.add(2);
        array.add(1);
        array.output();

        //Проверка получения элемента из массива
        System.out.printf("\nПолучение одного элемента из массива: " + array.get(0).toString());

        //Проверка добавления всех элементов с одного массива в другой
        MyArrayList anotherArray = new MyArrayList(4);
        anotherArray.add(9);
        anotherArray.add(10);
        anotherArray.add(2);
        anotherArray.add(5);
        array.addAll(anotherArray);
        System.out.printf("\nДобавления всех элементов с одного массива в другой");
        array.output();

        //Проверка удаления элемента с массива
        System.out.printf("\nУдаление элемента по индексу");
        array.remove(2);
        array.output();

        //Проверка сортировки пузырьком
        System.out.printf("\nДо сортировки");
        array.output();
        array.sort();
        System.out.printf("\nПосле сортировки");
        array.output();
    }
}
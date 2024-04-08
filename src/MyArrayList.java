public class MyArrayList<T> {

    private int size;
    private int pointer = 0;
    private Object[] array;
    public MyArrayList(int size)
    {
        if (size >= 0)
        {
            this.array = new Object[size];
            this.size = size;
        }
        else
            System.out.printf("Невозможно создать такой объект");
    }

    public void add(T element)
    {
        if (pointer == array.length - 1) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, pointer);
            array = newArray;
        }
        array[pointer++] = element;
    }

    public T get(int index)
    {
        return (T) array[index];
    }

    public void remove(int index)
    {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        Object[] newArray = new Object[array.length / 2];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public void addAll(MyArrayList anotherCollection)
    {
        if (pointer < (array.length + anotherCollection.size) - 1)
        {
            Object[] newArray = new Object[(array.length + anotherCollection.size) * 2];
            System.arraycopy(array, 0, newArray, 0, pointer);
            array = newArray;
        }
        for (int i = 0; i < anotherCollection.size; i++)
            array[pointer++] = anotherCollection.get(i);
    }

    public void sort()
    {
        for (int i = 0; i < pointer; i++)
        {
            boolean swapped = false;
            for (int j = 0; j < pointer - 1; j++) {
                if (((Comparable) array[j]).compareTo(array[j + 1]) > 0)
                {
                    Object temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public void output()
    {
        for (int i = 0; i < pointer; ++i)
            System.out.printf("\nЭлемент: " + array[i].toString());
    }
}

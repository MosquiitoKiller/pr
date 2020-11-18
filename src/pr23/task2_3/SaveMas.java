package pr23.task2_3;

import pr15.VecException;

public  class SaveMas<E> {
    private E mas[];

    public SaveMas(E[] mas) {
        this.mas = mas;
    }

    public E[] getMas() {
        return mas;
    }

    public E get(int index) throws VecException {
        if(mas==null) throw new VecException("Массив не инициализирован");
        else if(index<0||index>=mas.length) throw new VecException("Выход за пределы индексации");
        return mas[index];
    }

    public int getLength(){
        return mas.length;
    }
}

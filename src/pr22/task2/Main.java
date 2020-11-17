package pr22.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.Scanner;

public class Main extends JFrame {
    private static Getters[] getters;
    private JTextArea textArea = new JTextArea();
    private JTextArea textInfo = new JTextArea();
    private JTextArea textInput = new JTextArea();
    private JButton sortButton = new JButton("Отсортировать");
    private JButton findButton = new JButton("Найти");
    private JButton mergeButton = new JButton("Сортировка слиянием");
    private JButton quickButton = new JButton("Быстрая сортировка");
    private JButton binButton = new JButton("Бинарный поиск(Gpa)");
    private JButton linButton = new JButton("Линейный поиск(Id)");
    private JButton back = new JButton("Назад");
    private JButton fioFindButton = new JButton("Поиск по ФИО");

    private JTextArea textN = new JTextArea();
    private JTextArea textId = new JTextArea();
    private JTextArea textGPA = new JTextArea();
    private JTextArea textName = new JTextArea();

    private JButton push = new JButton("Отправить");

    private boolean nIsPushed = false;
    private int count = 0;

    private void outGetters(){
        textArea.setVisible(true);
        textArea.setText("ID\tName\tGPA\n\n");
        for(Getters g:getters){
            textArea.append(g.getId()+"\t"+g.getName()+"\t"+g.getGpa()+"\n");
        }
    }

    private void outFinded(int index){
        textArea.setVisible(true);
        if(index==-1) textArea.setText("Студент не найден");
        else{
            textArea.setText("Искомый студент:\n");
            textArea.append("ID\tName\tGPA\n\n");
            textArea.append(getters[index].getId()+"\t"+getters[index].getName()+"\t"+getters[index].getGpa());
        }
    }

    public Main(){
        setTitle("Students");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500,1000);
        textInfo.setBounds(700,30,300,20);
        //
        textInfo.setText("Введите кол-во студентов");
        textN.setBounds(730,100,170,20);

        textId.setBounds(530,100,150,20);
        textId.setVisible(false);
        textGPA.setBounds(730,100,170,20);
        textGPA.setVisible(false);
        textName.setBounds(930,100,170,20);
        textName.setVisible(false);

        push.setBounds(730,150,170,20);

        add(textN);
        add(textId);
        add(textGPA);
        add(textName);
        add(push);

        Rectangle left=new Rectangle(600,100,170,20);
        Rectangle right=new Rectangle(800,100,170,20);

        back.setBounds(0,0,100,20);
        textArea.setBounds(650,150,300,300);
        textInput.setBounds(300,150,150,20);

        textInfo.setEditable(false);
        textArea.setVisible(false);
        textArea.setEditable(false);
        textInput.setVisible(false);

        sortButton.setBounds(left);
        findButton.setBounds(right);

        mergeButton.setBounds(left);
        quickButton.setBounds(right);

        binButton.setBounds(left);
        linButton.setBounds(right);
        fioFindButton.setBounds(1000,100,170,20);

        add(textInfo);
        add(textArea);
        add(textInput);
        add(back);

        add(sortButton);
        add(findButton);

        add(mergeButton);
        add(quickButton);

        add(binButton);
        add(linButton);
        add(fioFindButton);

        mergeButton.setVisible(false);
        quickButton.setVisible(false);

        binButton.setVisible(false);
        linButton.setVisible(false);
        fioFindButton.setVisible(false);

        back.setVisible(false);
        findButton.setVisible(false);
        sortButton.setVisible(false);

        push.addActionListener(e->{
            if (!nIsPushed) {
                    try {
                        getters = new Getters[parseId(textN)];
                        nIsPushed = true;
                        textN.setVisible(false);
                        textId.setVisible(true);
                        textGPA.setVisible(true);
                        textName.setVisible(true);
                        textInfo.setText("Вводите тройки(Id,Gpa,name). Студент№"+(count+1));
                    } catch (UnSerchedException ex) {
                        JOptionPane.showMessageDialog(null,"Вы попытались ввести значение не того типа\nВНИМАТЕЛЬНЕЙ!!!");
                        textN.setText("");
                    }
                }
            else {
                if (textName.getText().length() != 0) {
                    try {

                        getters[count] = new Student(parseId(textId), parseId(textGPA), textName.getText());
                        ++count;
                        textId.setText("");
                        textGPA.setText("");
                        textName.setText("");
                        if(count==getters.length){
                            textInfo.setText("Что вы хотите сделать?");

                            textId.setVisible(false);
                            textGPA.setVisible(false);
                            textName.setVisible(false);
                            push.setVisible(false);

                            findButton.setVisible(true);
                            sortButton.setVisible(true);
                        }
                        else textInfo.setText("Вводите тройки(Id,Gpa,name). Студент№"+(count+1));
                    } catch (UnSerchedException ex) {
                        textId.setText("");
                        textGPA.setText("");
                        textName.setText("");
                        JOptionPane.showMessageDialog(null,"Вы попытались ввести значение не того типа\nВНИМАТЕЛЬНЕЙ!!!");
                    }
                }
            }
        });

        sortButton.addActionListener(e -> {
            textInfo.setText("Каким методом сортировки хотите воспользоваться?");
            findButton.setVisible(false);
            sortButton.setVisible(false);
            fioFindButton.setVisible(false);

            mergeButton.setVisible(true);
            quickButton.setVisible(true);

            back.setVisible(true);
        });

        findButton.addActionListener(e -> {
            textInfo.setText("Каким методом поиска хотите воспользоваться?");
            findButton.setVisible(false);
            sortButton.setVisible(false);

            binButton.setVisible(true);
            linButton.setVisible(true);
            fioFindButton.setVisible(true);

            back.setVisible(true);
            textInput.setVisible(true);
        });

        back.addActionListener(e -> {
            textInfo.setText("Что вы хотите сделать?");
            mergeButton.setVisible(false);
            quickButton.setVisible(false);

            binButton.setVisible(false);
            linButton.setVisible(false);
            fioFindButton.setVisible(false);

            back.setVisible(false);
            textArea.setVisible(false);
            textInput.setVisible(false);

            findButton.setVisible(true);
            sortButton.setVisible(true);
        });

        mergeButton.addActionListener(e -> {
            getters=sortMerge(getters);
            outGetters();
        });

        quickButton.addActionListener(e -> {
            quickSort(getters,0,getters.length-1);
            outGetters();
        });

        binButton.addActionListener(e->{
            try {
                outFinded(binSearchRec(getters,parseId(textInput),0,getters.length));
            }
            catch (UnSerchedException ex) {
                outFinded(-1);
            }
        });

        linButton.addActionListener(e->{
            try {
                outFinded(linearSearch(getters, parseId(textInput)));
            }
            catch (UnSerchedException ex) {
                outFinded(-1);
            }
        });

        fioFindButton.addActionListener(e->{
            try {
                outFinded(searchByFIO(getters,textInput.getText()));
            }
            catch (UnSerchedException ex) {
                outFinded(-1);
            }
        });
    }

    private int parseId(JTextArea text) throws UnSerchedException {
        String s=text.getText();
        if(s.length()==0) throw new UnSerchedException("Это не int");
        int id=0;
        for(int i=0;i<s.length();++i){
            if(s.toCharArray()[i]>='0'&&s.toCharArray()[i]<='9') id=id*10+s.toCharArray()[i]-'0';
            else if(!(s.toCharArray()[i]==' ' || s.toCharArray()[i]=='\n')) throw new UnSerchedException("Это не int");
        }
        return id;
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }

    Comparator<Getters> comparator = new Comparator<Getters>() {

        @Override
        public int compare(Getters o1, Getters o2) {
            return Integer.compare(o1.getGpa(),o2.getGpa());
        }
    };

    private Getters[] sortMerge(Getters[] arrayA){
        if (arrayA == null) return null;
        if (arrayA.length < 2)return arrayA;

        Getters [] left = new Getters[arrayA.length / 2];
        System.arraycopy(arrayA, 0, left, 0, arrayA.length / 2);

        Getters [] right = new Getters[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, right, 0, arrayA.length - arrayA.length / 2);

        left = sortMerge(left);
        right = sortMerge(right);

        return mergeArray(left, right);
    }

    private Getters [] mergeArray(Getters[] left, Getters[] right) {
        Getters[] merged = new Student[left.length+right.length];
        for (int i = 0; i < merged.length; i++) merged[i]=new Student(0,0,"");
        int lengthLeft = left.length;
        int lengthRight = right.length;
        while (lengthLeft > 0 && lengthRight > 0){
            if (this.comparator.compare(left[left.length - lengthLeft],right[right.length - lengthRight]) > 0){
                merged[merged.length -lengthLeft-lengthRight] = left[left.length - lengthLeft];
                lengthLeft--;
            }
            else{
                merged[merged.length - lengthLeft-lengthRight] = right[right.length - lengthRight];
                lengthRight--;
            }
        }
        while (lengthLeft > 0){
            merged[merged.length - lengthLeft] = left[left.length-lengthLeft];
            lengthLeft--;
        }
        while (lengthRight > 0){
            merged[merged.length - lengthRight] = right[right.length-lengthRight];
            lengthRight--;
        }
        return merged;
    }

    private void quickSort(Getters[] array, int low, int high) {
        if (array.length == 0) return;
        if (low >= high) return;
        int middle = low + (high - low) / 2;
        Getters opora =new Student(0,0,"");
        opora = array[middle];
        Getters temp=new Student(0,0,"");
        int i = low, j = high;
        while (i <= j) {
            while (this.comparator.compare(array[i],opora) > 0) {
                i++;
            }

            while (this.comparator.compare(array[j],opora) < 0) {
                j--;
            }

            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(array, low, j);
        if (high > i) quickSort(array, i, high);
    }

    private static int linearSearch(Getters[] getters, int id) throws UnSerchedException {
        for (int i = 0; i < getters.length; i++) {
            if(getters[i].getId()==id) return i;
        }
        throw new UnSerchedException("Студент не найден");
    }

    private static int binSearchRec(Getters[] getters, double gpa,int min,int max) throws UnSerchedException {
        int mid=(max-min)/2+min;
        if((mid==min)||(mid==max)){
            if(getters[mid].getGpa()==gpa) return mid;
            else throw new UnSerchedException("Студент не найден");
        }
        else if(gpa<=getters[mid].getGpa()) return binSearchRec(getters,gpa,mid,max);
        else return binSearchRec(getters,gpa,min,mid);
    }

    private static int searchByFIO(Getters[] getters, String name) throws UnSerchedException {
        for (int i = 0; i < getters.length; i++) {
            if(getters[i].getName().equals(name)) return i;
        }
        throw new UnSerchedException("Студент не найден");
    }
}

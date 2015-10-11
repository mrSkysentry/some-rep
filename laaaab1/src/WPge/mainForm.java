package WPge;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class mainForm extends JFrame{

    /*private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JTable table = new JTable(5, 5);

    public mainForm() {
        super("Simple Example");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(table);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button was pressedn";
            message += "Text is " + input.getText() + "\n";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
    public static void main(String[] args) {
        mainForm app = new mainForm();
        app.setVisible(true);
    }*/
    private Object[][] colors = new String[][] {
            { "Красный", "Зеленый", "Синий" },
            { "Желтый", "Оранжевый", "Белый" },
    };
    // названия заголовков столбцов
    private Object[] colorsHeader = new String[] {
            "Цвет", "Еще цвет", "Тоже цвет"
    };
    public mainForm() {
        super("SimpleTables"); setDefaultCloseOperation(EXIT_ON_CLOSE);
// несколько простых таблиц
        JTable table1 = new JTable(colors, colorsHeader);
        table1.setGridColor(Color.black);
        table1.setShowGrid(true);
        JTable table2 = new JTable(5, 5);
// таблица на основе вектора, состоящего из векторов
        Vector data = new Vector();
        Vector row1 = new Vector();
        Vector row2 = new Vector();
// вектор с заголовками столбцов
        Vector columnNames = new Vector();
// наполнение данными
        for (int i=0; i<3; i++) {
            row1.add("Ячейка 1." + i); row2.add("Ячейка 2." + i); columnNames.add("Столбец #" + i);
        }
        data.add(row1);
        data.add(row2);
        JTable table3 = new JTable(data, columnNames);
        table2.setGridColor(Color.black);
        table2.setShowGrid(true);
// добавляем таблицы в панель с блочным расположением
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table1));
        contents.add(new JScrollPane(table2));
        contents.add(table3);
// выводим окно на экран
        setContentPane(contents);
        setSize(350, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        mainForm app=new mainForm();
        app.setVisible(true);
    }
}

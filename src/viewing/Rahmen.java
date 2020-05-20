package viewing;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rahmen extends JFrame {

    JTextField stringEingabe = new JTextField("");
    JLabel textAusgabe = new JLabel("");

    public Rahmen(){

        JLabel beschreibung1 = new JLabel("Bitte String eingeben:");
        JButton optionStringLength = new JButton("length()");
        JButton optionStringCharAT = new JButton("charAt()");
        JButton optionStringIndexOf = new JButton("indexOf()");
        JButton optionStringSubstring = new JButton("substring()");
        JButton optionStringToLowerCase = new JButton("toLowerCase()");
        JButton optionStringToUpperCase = new JButton("toUpperCase()");
        JButton optionStringEquals = new JButton("equals()");
        JButton optionStringEqualsIgnoreCase = new JButton("equalsIgnoreCase()");
        JButton optionStringStartsWith = new JButton("startsWith()");
        JButton optionStringEndsWith = new JButton("endsWith()");
        JButton optionStringContains = new JButton("contains()");
        JButton optionStringReplace = new JButton("replace()");
        JButton optionStringTrim = new JButton("trim()");


        JPanel buttonRow1 = new JPanel();
        buttonRow1.setLayout(new GridLayout(1,4));
        buttonRow1.add(optionStringLength);buttonRow1.add(optionStringCharAT);buttonRow1.add(optionStringIndexOf);buttonRow1.add(optionStringSubstring);

        JPanel buttonRow2 = new JPanel();
        buttonRow2.setLayout(new GridLayout(1,4));
        buttonRow2.add(optionStringToLowerCase);buttonRow2.add(optionStringToUpperCase);buttonRow2.add(optionStringEquals);buttonRow2.add(optionStringEqualsIgnoreCase);

        JPanel buttonRow3 = new JPanel();
        buttonRow3.setLayout(new GridLayout(1,5));
        buttonRow3.add(optionStringStartsWith); buttonRow3.add(optionStringEndsWith);buttonRow3.add(optionStringContains);buttonRow3.add(optionStringReplace);
        buttonRow3.add(optionStringTrim);

        this.setLayout(new GridLayout(6,1));
        this.add(beschreibung1);
        this.add(stringEingabe);
        this.add(textAusgabe);
        this.add(buttonRow1);
        this.add(buttonRow2);
        this.add(buttonRow3);



        this.setSize(550,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        optionStringLength.addActionListener(Controller :: controllerLength);
        optionStringCharAT.addActionListener(e -> new EingabeRahmenCharAT());
        optionStringToLowerCase.addActionListener(e -> Controller.controllerToLowerCase());
        optionStringToUpperCase.addActionListener(e -> Controller.controllerToUpperCase());
        optionStringIndexOf.addActionListener(e -> new EingabeRahmenIndexOf());
        optionStringSubstring.addActionListener(e -> new SubstringRahmen());
        optionStringTrim.addActionListener(Controller :: controllerTrim);
        optionStringEquals.addActionListener(e -> new EingabeEquals());
        optionStringEqualsIgnoreCase.addActionListener(e -> new EingabeEqualsIgnoreCase());
        optionStringStartsWith.addActionListener(e -> new startsWith());
        optionStringEndsWith.addActionListener(e -> new endsWith());
        optionStringContains.addActionListener(e -> new EingabeContains());
        optionStringReplace.addActionListener(e -> new EingabeReplace());
    }

    public String getStringEingabe() {
        return stringEingabe.getText();
    }

    public void setTextAusgabe(String textAusgabe) {
        this.textAusgabe.setText(textAusgabe);
    }
}

class EingabeRahmenCharAT extends JFrame{

    public EingabeRahmenCharAT(){

        JLabel beschreibung1 = new JLabel("Bitte Zahl eingeben:");
        JTextField stringEingabe = new JTextField("");
        JButton ok = new JButton("ok");

        this.setLayout(new GridLayout(3,1));
        this.add(beschreibung1); this.add(stringEingabe); this.add(ok);
        this.setSize(50,100);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 9999;
                try{
                    i = Integer.parseInt(stringEingabe.getText());
                }catch (Exception E){}
                finally{
                  Controller.controllerCharAT(i);
                }
                dispose();
            }
        });
    }

}
class EingabeRahmenIndexOf extends JFrame{

    public EingabeRahmenIndexOf(){

        JLabel beschreibung1 = new JLabel("Bitte String eingeben:");
        JLabel beschreibung2 = new JLabel("Zahleneingabe möglich:");
        JTextField stringEingabe = new JTextField("");
        JTextField zahlEingabe = new JTextField("");
        JButton ok = new JButton("ok");

        this.setLayout(new GridLayout(5,1));
        this.add(beschreibung1); this.add(stringEingabe); this.add(beschreibung2); this.add(zahlEingabe);
        this.add(ok);
        this.setSize(60,150);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = -1;
                String s = stringEingabe.getText();
                try{
                    i = Integer.parseInt(zahlEingabe.getText());
                }catch (Exception E){}
                finally{
                    Controller.controllerIndexOf(s,i);
                }
                dispose();
            }
        });
    }

}
class SubstringRahmen extends JFrame{

    public SubstringRahmen(){

        JLabel beschreibung1 = new JLabel("Bitte Zahl1 eingeben:");
        JLabel beschreibung2 = new JLabel("Zahl2 möglich:");
        JTextField zahl1Eingabe = new JTextField("");
        JTextField zahl2Eingabe = new JTextField("");
        JButton ok = new JButton("ok");

        this.setLayout(new GridLayout(5,1));
        this.add(beschreibung1); this.add(zahl1Eingabe); this.add(beschreibung2); this.add(zahl2Eingabe);
        this.add(ok);
        this.setSize(60,150);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 999;
                int j = -1;

                try{
                    i = Integer.parseInt(zahl1Eingabe.getText());
                    j = Integer.parseInt(zahl2Eingabe.getText());
                }catch (Exception E){}
                finally{
                    Controller.controllerSubstring(i,j);
                }
                dispose();
            }
        });
    }

}
class EingabeEquals extends JFrame{

    public EingabeEquals(){

        JLabel beschreibung1 = new JLabel("Bitte String eingeben:");
        JTextField stringEingabe = new JTextField("");
        JButton ok = new JButton("ok");

        this.setLayout(new GridLayout(3,1));
        this.add(beschreibung1); this.add(stringEingabe); this.add(ok);
        this.setSize(50,100);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.controllerEquals(stringEingabe.getText());
                dispose();
            }
        });
    }

}
class EingabeEqualsIgnoreCase extends JFrame{

    public EingabeEqualsIgnoreCase(){

        JLabel beschreibung1 = new JLabel("Bitte String eingeben:");
        JTextField stringEingabe = new JTextField("");
        JButton ok = new JButton("ok");

        this.setLayout(new GridLayout(3,1));
        this.add(beschreibung1); this.add(stringEingabe); this.add(ok);
        this.setSize(50,100);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.controllerEqualsIgnoreCase(stringEingabe.getText());
                dispose();
            }
        });
    }

}
class startsWith extends JFrame{

    public startsWith(){

        JLabel beschreibung1 = new JLabel("Bitte String eingeben:");
        JTextField stringEingabe = new JTextField("");
        JButton ok = new JButton("ok");

        this.setLayout(new GridLayout(3,1));
        this.add(beschreibung1); this.add(stringEingabe); this.add(ok);
        this.setSize(50,100);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.controllerStartsWith(stringEingabe.getText());
                dispose();
            }
        });
    }

}
class endsWith extends JFrame{

    public endsWith(){

        JLabel beschreibung1 = new JLabel("Bitte String eingeben:");
        JTextField stringEingabe = new JTextField("");
        JButton ok = new JButton("ok");

        this.setLayout(new GridLayout(3,1));
        this.add(beschreibung1); this.add(stringEingabe); this.add(ok);
        this.setSize(50,100);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.controllerEndsWith(stringEingabe.getText());
                dispose();
            }
        });
    }

}
class EingabeContains extends JFrame{

    public EingabeContains(){

        JLabel beschreibung1 = new JLabel("Bitte String eingeben:");
        JTextField stringEingabe = new JTextField("");
        JButton ok = new JButton("ok");

        this.setLayout(new GridLayout(3,1));
        this.add(beschreibung1); this.add(stringEingabe); this.add(ok);
        this.setSize(50,100);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.controllerContains(stringEingabe.getText());
                dispose();
            }
        });
    }

}
class EingabeReplace extends JFrame{

    public EingabeReplace(){

        JLabel beschreibung1 = new JLabel("Bitte String1 eingeben:");
        JLabel beschreibung2 = new JLabel("Bitte String2 eingeben:");
        JTextField String1Eingabe = new JTextField("");
        JTextField String2Eingabe = new JTextField("");
        JButton ok = new JButton("ok");

        this.setLayout(new GridLayout(5,1));
        this.add(beschreibung1); this.add(String1Eingabe); this.add(beschreibung2); this.add(String2Eingabe);
        this.add(ok);
        this.setSize(60,150);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.controllerReplace(String1Eingabe.getText(),String2Eingabe.getText());
                dispose();
            }
        });
    }

}

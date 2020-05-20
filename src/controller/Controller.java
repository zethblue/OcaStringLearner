package controller;

import viewing.Rahmen;

import java.awt.event.ActionEvent;

public class Controller {

    public static Rahmen R1 = null;

    public static void controllerLength(ActionEvent E){
        R1.setTextAusgabe(String.valueOf(R1.getStringEingabe().length()));
    }
    public static void controllerCharAT(int i){
        R1.setTextAusgabe(String.valueOf(R1.getStringEingabe().length() > i ?  R1.getStringEingabe().charAt(i) : "Out of Bounds"));
    }
    public static void controllerToLowerCase(){
        R1.setTextAusgabe(R1.getStringEingabe().toLowerCase());
    }
    public static void controllerToUpperCase() {
        R1.setTextAusgabe(R1.getStringEingabe().toUpperCase());
    }
    public static void controllerIndexOf(String s, int i){
        R1.setTextAusgabe(
                String.valueOf(i != -1 ? R1.getStringEingabe().indexOf(s,i) : R1.getStringEingabe().indexOf(s))
        );
    }
    public static void controllerSubstring(int i, int j){
        try{
        R1.setTextAusgabe(j != -1 ? R1.getStringEingabe().substring(i,j) : R1.getStringEingabe().substring(i));
    }catch (Exception E){
            R1.setTextAusgabe("Out of Bounds");}
    }
    public static void controllerTrim(ActionEvent E){
        R1.setTextAusgabe(R1.getStringEingabe().trim());
    }
    public static void controllerEquals(String s){
        R1.setTextAusgabe(s.equals(R1.getStringEingabe()) ? "true" : "false");
    }
    public static void controllerEqualsIgnoreCase(String s){
        R1.setTextAusgabe(s.equalsIgnoreCase(R1.getStringEingabe()) ? "true" : "false");
    }
    public static void controllerStartsWith(String s){
        R1.setTextAusgabe(R1.getStringEingabe().startsWith(s) ? "true" : "false");
    }
    public static void controllerEndsWith(String s){
        R1.setTextAusgabe(R1.getStringEingabe().endsWith(s) ? "true" : "false");
    }
    public static void controllerContains(String s){
        R1.setTextAusgabe(R1.getStringEingabe().contains(s) ? "true" : "false");
    }
    public static void controllerReplace(String s, String t){
        R1.setTextAusgabe(R1.getStringEingabe().replace(s,t));
    }


}

/*
* File: MainConsole.java
* Author: Laczkó Henrietta
* Copyright: 2023, Laczkó Henrietta
* Group: Szoft V
* Date: 2023-01-06
* Github: https://github.com/LHENI/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class MainConsole{

    public MainConsole() {
         task();
         about();
         doit();
    }
    private void task(){
        System.out.println("Feladat 251");
        System.out.println("Paralelogramma területe: ");
        //System.out.println();
    }
    private void about(){
        System.out.println("Laczkó Henrietta");
    }

    private String input() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        return value;
    }
    private void doit() {
        String asideStr = input("A oldal");
        String bsideStr = input("B oldal");
        String gammaStr = input(" SZÖG  ");

        double aside= Double.parseDouble(asideStr);
        double bside= Double.parseDouble(bsideStr);
        double gamma= Double.parseDouble(asideStr);

        Paralelogramma para= new Paralelogramma();
        double area = para.calcArea(aside, bside, gamma);
        System.out.printf("S.2f\n", area);
    }


}
        
    
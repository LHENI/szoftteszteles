import javax.sql.rowset.spi.SyncResolver;

/*
* File: Paralelogramma.java
* Author: Laczkó Henrietta
* Copyright: 2023, Laczkó Henrietta
* Group: Szoft V
* Date: 2023-01-06
* Github: https://github.com/LHENI/
* Licenc: GNU GPL
*/

public class Paralelogramma {
    
    
    public Paralelogramma() {
    }
    
    public double calcArea(double aside, double bside, double gamma){
            double rad = gamma * Math.PI /180;
            double area = aside * bside * Math.sin(rad) ;
        return area;
    }
}

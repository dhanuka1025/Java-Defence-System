/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defencesystem;

/**
 *
 * @author Dhanuka
 */
public class DefenceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefenceUnitList newobj = new DefenceUnitList();

        newobj.addDefenceUnit(new Tank(newobj, "Tank"));
        newobj.addDefenceUnit(new Helicopter(newobj, "Helicopter"));
        newobj.addDefenceUnit(new Submarine(newobj, "Submarine"));
        newobj.addDefenceUnit(new MainController(newobj, "Main Controller"));
    }
}

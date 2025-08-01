/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem;

import java.util.*;

/**
 *
 * @author Dhanuka
 */
public class DefenceUnitList {

    ArrayList<DefenceUnit> DefenceUniList = new ArrayList<DefenceUnit>();

    public void addDefenceUnit(DefenceUnit defenceunit) {
        DefenceUniList.add(defenceunit);
    }

    public void updateMsg(String Msg, String name, String Unit) {
        for (DefenceUnit observer : DefenceUniList) {
            switch (Unit) {
                case "Helicopter":
                    if (observer instanceof Helicopter) {
                        observer.setMsg(Msg, name);
                    }
                    break;
                case "Tank":
                    if (observer instanceof Tank) {
                        observer.setMsg(Msg, name);
                    }
                    break;
                case "Submarine":
                    if (observer instanceof Submarine) {
                        observer.setMsg(Msg, name);
                    }
                    break;
                case "All":
                    observer.setMsg(Msg, name);
            }
        }
    }

    public void enableBtn(int sliderValue) {
        for (DefenceUnit defenceUnit : DefenceUniList) {
            defenceUnit.enableBtn(sliderValue);
        }
    }

    public void setArea(String txt) {
        for (DefenceUnit defenceUnit : DefenceUniList) {
            defenceUnit.setArea(txt);
        }
    }
}

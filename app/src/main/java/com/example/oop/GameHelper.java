package com.example.oop;

import android.widget.TextView;
import android.widget.Toast;

public class GameHelper {
    public static void attackAction(Unit main, Unit enemy, MainActivity activity) {
        main.attack(enemy);
        Toast.makeText(activity, main.getName() + " " +
                        activity.getResources().getString(R.string.attackMessage)
                        + " " + enemy.getName(),
                Toast.LENGTH_SHORT).show();
    }
    public static void attackAction(Unit main, Unit enemy, TextView tv) {
        main.attack(enemy);
        String msg =  main.getName() + " " +
                        tv.getContext()
                                .getResources()
                                .getString(R.string.attackMessage)
                        + " " + enemy.getName();
        tv.append(msg + "\n");
    }
}

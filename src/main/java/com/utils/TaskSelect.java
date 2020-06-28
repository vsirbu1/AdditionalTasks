package main.java.com.utils;

import static main.java.com.messages.WelcomeMessage.getINVALIDDATA;
import static main.java.com.tasks.starts.Task11Start.startTask11Manual;
import static main.java.com.tasks.starts.Task11Start.startTask11Test;
import static main.java.com.tasks.starts.Task1Start.*;
import static main.java.com.tasks.starts.Task2Start.*;
import static main.java.com.tasks.starts.Task3Start.*;
import static main.java.com.tasks.starts.Task4And5Start.*;
import static main.java.com.tasks.starts.Task6Start.*;
import static main.java.com.tasks.starts.Task7Start.*;
import static main.java.com.tasks.starts.Task8Start.*;
import static main.java.com.tasks.starts.Task9Start.*;
import static main.java.com.tasks.starts.Task10Start.*;
import static main.java.com.tasks.starts.Task12Start.*;
import static main.java.com.tasks.starts.Task13Start.*;
import static main.java.com.tasks.starts.Task14Start.*;
import static main.java.com.tasks.starts.Task15Start.*;
import static main.java.com.tasks.starts.Task16Start.*;
import static main.java.com.tasks.starts.Task17Start.*;
import static main.java.com.tasks.starts.Task18Start.*;
import static main.java.com.tasks.starts.Task19Start.*;
import static main.java.com.tasks.starts.Task20Start.*;

class TaskSelect {
    static void selectTask(Integer number, Integer checkingType) {
        switch (number) {
            case 1: {
                if (checkingType.equals(1)) startTask1Manual();
                else startTask1Test();
                break;
            }
            case 2: {
                if (checkingType.equals(1)) startTask2Manual();
                else startTask2Test();
                break;
            }
            case 3: {
                if (checkingType.equals(1)) startTask3Manual();
                else startTask3Test();
                break;
            }
            case 4: {
                if (checkingType.equals(1)) startTask4And5Manual();
                else startTask4AndTest();
                break;
            }
            case 5: {
                if (checkingType.equals(1)) selectTask(4, 1);
                else selectTask(4, 2);
                break;
            }
            case 6: {
                if (checkingType.equals(1)) startTask6Manual();
                else startTask6Test();
                break;
            }
            case 7: {
                if (checkingType.equals(1)) startTask7Manual();
                else startTask7Test();
                break;
            }
            case 8: {
                if (checkingType.equals(1)) startTask8Manual();
                else startTask8Test();
                break;
            }
            case 9: {
                if (checkingType.equals(1)) startTask9Manual();
                else startTask9Test();
                break;
            }
            case 10: {
                if (checkingType.equals(1)) startTask10Manual();
                else startTask10Test();
                break;
            }
            case 11: {
                if (checkingType.equals(1)) startTask11Manual();
                else startTask11Test();
                break;
            }
            case 12: {
                if (checkingType.equals(1)) startTask12Manual();
                else startTask12Test();
                break;
            }
            case 13: {
                if (checkingType.equals(1)) startTask13Manual();
                else startTask13Test();
                break;
            }
            case 14: {
                if (checkingType.equals(1)) startTask14Manual();
                else startTask14Test();
                break;
            }
            case 15: {
                if (checkingType.equals(1)) startTask15Manual();
                else startTask15Test();
                break;
            }
            case 16: {
                if (checkingType.equals(1)) startTask16Manual();
                else startTask16Test();
                break;
            }
            case 17: {
                if (checkingType.equals(1)) startTask17Manual();
                else startTask17Test();
                break;
            }
            case 18: {
                if (checkingType.equals(1)) startTask18Manual();
                else selectTask(18, 1);
                break;
            }
            case 19: {
                if (checkingType.equals(1)) startTask19Manual();
                else selectTask(19, 1);
                break;
            }
            case 20: {
                if (checkingType.equals(1)) startTask20Manual();
                else selectTask(20, 1);
                break;
            }
            default: {
                System.out.println(getINVALIDDATA());
            }
        }
    }
}

package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isExitMenu=Boolean.TRUE;
        Map<String, Integer> menuMap = new HashMap<>();
        menuMap.put("M1", 0);
        menuMap.put("M2", 0);
        menuMap.put("M3", 0);
        menuMap.put("M4", 0);
        menuMap.put("M5", 0);

        while (isExitMenu) {
            System.out.println("1-Count M1");
            System.out.println("2-Count M2");
            System.out.println("3-Count M3");
            System.out.println("4-Count M4");
            System.out.println("5-Count M5");
            System.out.println("please enter option:");
            Integer num = sc.nextInt();
            switch (num) {
                case 1:
                    menuMap.put("M1", menuMap.get("M1") + 1);
                    break;

                case 2:
                    menuMap.put("M2", menuMap.get("M2") + 1);
                    break;

                case 3:
                    menuMap.put("M3", menuMap.get("M3") + 1);
                    break;
                case 4:
                    menuMap.put("M4", menuMap.get("M4") + 1);
                    break;
                case 5:
                    menuMap.put("M5", menuMap.get("M5") + 1);
                    break;

                case 6:
                    for (Map.Entry<String, Integer> showCount : menuMap.entrySet()) {
                        String key = showCount.getKey();
                        Integer value = showCount.getValue();
                        System.out.println(key + ":" + value);
                    }
                    break;

            }
        }
    }

}

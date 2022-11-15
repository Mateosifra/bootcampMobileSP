import java.util.Scanner;

public class StringMethod {

    Scanner sc = new Scanner(System.in);
    int[] array = new int[10];
    int aux;

    public void stringOfNumbers() {
        System.out.println("Type an entry");
        String sc1 = sc.next();

        while ((!sc1.equals("TipoA")) && (!sc1.equals("TipoB"))) {
            System.out.println("Type a valid input");
            sc1 = sc.next();
        }

        if (sc1.equals("TipoA")) {
            System.out.print("54");
            for (int i = 0; i < 10; i++) {
                array[i]=  (int)(Math.random()*10);
                System.out.print(array[i]);
            }
        }
        if (sc1.equals("TipoB")) {
            System.out.print("08");
            for (int i = 0; i < 10; i++) {
                array[i]=  (int)(Math.random()*10);
                System.out.print(array[i]);
            }
        }
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (array[j]>array[j+1]){
                    aux = array[j];
                    array[j]=array[j+1];
                    array[j+1]= aux;

                }
            }
        }
        System.out.println("\nAsc or Desc ");
        sc1 = sc.next();
        while ((!sc1.equals("Asc")) && (!sc1.equals("Desc"))) {
            System.out.println("Type a valid input");


            sc1 = sc.next();}
            if (sc1.equals("Asc")) {
                for (int i = 0; i < 10; i++) {
                    System.out.print(array[i] + ",");
                }
            }
            if (sc1.equals("Desc")){
                for (int i = 9; i >= 0; i--) {
                    System.out.print(array[i] + ",");
                }
            }
        }
    }

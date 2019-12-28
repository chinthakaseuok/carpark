package com.company;

import java.lang.reflect.Type;
import java.sql.Struct;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 1, x = 0;
        int y = 0;
        Scanner scan = new Scanner(System.in);
        int vehi[] = new int[20];
        for(int i=0;i<20;i++){vehi[i]=-1;}
        van v[] = new van[20];
        car c[] = new car[20];
        motorbike[] m = new motorbike[20];
        System.out.println("\n");
        while (y != 3) {
            System.out.print("Enter your choice(1-enter vehicle , 2-Delete a vehicle , 3-show current list , 4-print statics , 5-Exit) - ");
            y = scan.nextInt();
            System.out.println();

            switch (y) {

                case 1:
                    System.out.print("Enter type of vehicle (1-van , 2-car , 3-motorbike) - ");
                    a = scan.nextInt();
                    System.out.println("plate ID");
                    x = scan.nextInt();
                    if(vehi[x-1]==-1){
                    vehi[x-1] = a;
                    switch (a) {
                        case 1:
                            v[x-1] = new van();
                            System.out.println("van");
                            v[x-1].setPlaceID(x);
                            if(vehi[(x)]==-1 ) {
                                System.out.print("Brand          =");
                                v[x-1].setBrnd(scan.next());
                                System.out.print("Enterd time    =");
                                v[x-1].setEtime(scan.nextFloat());
                                System.out.print("Date           =");
                                v[x-1].setDate(scan.next());
                                System.out.print("vol of corch   =");
                                v[x-1].setCavol(scan.nextInt());
                                System.out.println();
                                vehi[x]=0;

                            }else System.out.println("not enough space.try another place.");
                            break;

                        case 2:
                            c[x-1] = new car();
                            System.out.println("car");
                            c[x-1].setPlaceID(x);
                            System.out.print("Brand          =");
                            c[x-1].setBrnd(scan.next());
                            System.out.print("Enterd time    =");
                            c[x-1].setEtime(scan.nextFloat());
                            System.out.print("Date           =");
                            c[x-1].setDate(scan.next());
                            System.out.print("no of doors    =");
                            c[x-1].setNodoor(scan.nextInt());
                            System.out.print("colour         =");
                            c[x-1].setColour(scan.next());
                            System.out.println();

                            break;


                        case 3:
                            m[x-1] = new motorbike();
                            System.out.println("Motorbike");
                            m[x-1].setPlaceID(x);
                            System.out.print("Brand           =");
                            m[x-1].setBrnd(scan.next());
                            System.out.print("Enterd time     =");
                            m[x-1].setEtime(scan.nextFloat());
                            System.out.print("Date            =");
                            m[x-1].setDate(scan.next());
                            System.out.print("size of engine=");
                            m[x-1].setSizeofen(scan.nextInt());
                            System.out.println();

                            break;

                    }}else System.out.println("Parking plate already full! ");
                    break;
                case 2:
                    System.out.println("plate ID");
                    x = scan.nextInt();
                    if(vehi[x-1]==-1){
                        System.out.println("already empty plate");}
                    else
                    vehi[x-1]=-1;
                case 3:

                    for (int i = 0; i < 20; i++) {

                        if (vehi[i] == 1) {

                            System.out.println("parking ID      =" + v[i].getPlaceID() + "," + (v[i].getPlaceID()+1));
                            System.out.println("Vehicle  type   =Van:");
                            System.out.println("Brand           =" + v[i].getBrnd());
                            System.out.println("Enterd time     =" + v[i].getEtime());
                            System.out.println("Date            =" + v[i].getDate());
                            System.out.println("size of engine  =" + v[i].getCavol());
                            System.out.println();
                            i++;
                        } else if (vehi[i] == 2) {

                            System.out.println("parking ID      =" + c[i].getPlaceID());
                            System.out.println("Vehicle  type   =car");
                            System.out.println("Brand           =" + c[i].getBrnd());
                            System.out.println("Enterd time     =" + c[i].getEtime());
                            System.out.println("Date            =" + c[i].getDate());
                            System.out.println("no of doors     =" + c[i].getNodoor());
                            System.out.println("colour          =" + c[i].getColour());
                            System.out.println();
                        } else if (vehi[i] == 3) {

                            System.out.println("parking ID      =" + m[i].getPlaceID());
                            System.out.println("Vehicle  type   =motorbike:");
                            System.out.println("Brand           =" + m[i].getBrnd());
                            System.out.println("Enterd time     =" + m[i].getEtime());
                            System.out.println("Date            =" + m[i].getDate());
                            System.out.println("engine capacity =" + m[i].getSizeofen());
                            System.out.println();
                        } else if(vehi[i]==-1)

                        { System.out.println("parking ID " + (i + 1) + " = NULL");}
                        else System.out.println();


                    }
                    break;
                case 4:
                    int va=0,ca=0,mo=0,tot=0;
                    for(int i=0;i<20;i++){
                        switch (vehi[i]){
                            case 1 : va++;tot++;break;
                            case 2 : ca++;tot++;break;
                            case 3 : mo++;tot++;break;
                        }

                        System.out.println("Vans = "+(va/(tot*100)));
                        System.out.println("cars = "+(ca/(tot*100)));
                        System.out.println("motorbike = "+(mo/(tot*100)));
                    }
                case 5:
                    System.out.println("Bye!");
                    System.exit(0);
            }
        }
    }
}
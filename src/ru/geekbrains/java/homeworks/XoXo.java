package ru.geekbrains.java.homeworks;


import java.util.Random;
import java.util.Scanner;

public class XoXo {
    public static char map[][];
    public static final int SIZE =3;
    public static final int DOT_TO_WIN =3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O='0';
    public static Scanner scanner=new Scanner(System.in);
    public static Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true){
            makeHumanTurn();
            printMap();
            if(isWinnerExist(DOT_X)){
                System.out.println("Победил человек");
                break;
            } if(isNoWinner()){
                System.out.println ("Ничья");
                break;
            }
            makeComputerTurn();
            printMap();
            if(isWinnerExist(DOT_O)){
                System.out.println ("Победил компьютер");
                break;
            }
            if (isNoWinner()){
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println ("Игра закончена");

    }
    public static void initMap (){
        map = new char [SIZE][SIZE];
        for (int i =0; i <SIZE; i++){
            for (int j =0; j<SIZE;j++){
                map[i][j]=DOT_EMPTY;
            }
        }
    }
    public static void printMap(){
        for (int i =0; i<=SIZE;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i =0; i<SIZE;i++){
            System.out.print((i+1) + " ");
            for (int j = 0; j<map[i].length;j++){
                System.out.print(map [i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void makeHumanTurn(){
        int x,y;
        do{
            System.out.println ("Введите координаты своего хода в формате Х У");
            x = scanner.nextInt()-1;
            y=scanner.nextInt()-1;
        } while(isCellValid (y,x)==false);
        map [y][x]=DOT_X;
    }
    public static boolean isCellValid(int x, int y){
        if (x <0 || x>=SIZE ||y<0 || y >=SIZE){
            return false;
        }
        if (map[x][y]==DOT_EMPTY){
            return true;
        } else {
            return false;
        }
    }
    public static void makeComputerTurn(){
        int x;
        int y;
        for (int i=0; i<SIZE;i++){// блокировка выигрышного хода соперника
            for (int j=0;j<map[i].length;j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (isWinnerExist(DOT_X)) {
                        x=i;
                        y=j;
                        System.out.println ("Компьютер походил в точку х " + (y+1)+" и в точку y " + (x+1));
                        map[x][y] = DOT_O;
                        return;

                    }else {
                        map[i][j] = DOT_EMPTY;
                    }

                }
            }

        }
        for (int i=0; i<SIZE;i++){//поик выиграшного хода для компьютера
            for(int j=0; j<map[i].length;j++){
                if (isCellValid(i,j)){
                    map[i][j]=DOT_O;
                    if(isWinnerExist(DOT_O)){
                        x=i;
                        y=j;
                        System.out.println ("Компьютер походил в точку х " + (y+1)+" и в точку y " + (x+1));
                        map[x][y] = DOT_O;
                        return;
                    } else{
                        map[i][j]=DOT_EMPTY;
                    }
                }

            }


        }

        do { // поиск рандомной ячейки для хода, если одно из предыдущих условий не выпонилось.
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку x " + (x + 1) + " и в точку y " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean isWinnerExist (char symbol){

        for (int i=0;i<map.length;i++){
            if((map[i][0]==symbol&&map[i][1]==symbol&&map[i][2]==symbol|| map[0][i]==symbol&&map[1][i]==symbol
                    &&map[2][i]==symbol)){
                return true;
            }
        }
        if ((map[0][0]==symbol&&map[1][1]==symbol&&map[2][2]==symbol||map[0][2]==symbol&&map[1][1]==symbol
                &&map[2][0]==symbol)){
            return true;
        }
        return false;
    }

    public static boolean isNoWinner(){
        for (int i=0;i<SIZE;i++){
            for(int j=0; j<SIZE;j++){
                if (map [i][j]==DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

}


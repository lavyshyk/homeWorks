package hanoi;

import java.util.Arrays;

public class GamePlay {

    private  int [][] playfField = {{1,2,3,4},{0,0,0,0},{0,0,0,0}};
    private  int count = 0;

    public GamePlay(int[][] playfField, int count) {
        this.playfField = playfField;
        this.count = count;
    }
    public GamePlay(){

    }

    /**
     *
     * @return
     */

    public GamePlay startGame(){
        return new GamePlay(this.playfField, count) ;
    }

    public int[][] getPlayfField() {
        return playfField;
    }

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count++;
    }

    /**
     * выполнение хода, проверка правильности хода игрока
     * @param i номер стержня с которого надо взять кольцо
     * @param j номер стержня на который надо положить  кольцо
     * @return  ход прощел успешно
     */
    public boolean game(int i, int j){
        int temp = 0;
        int tempK = 0;
        int[] n = playfField[i-1];
        for (int k = 0; k < n.length; k++) {
            if (n[k] != 0){
                temp = n[k];
                tempK = k;
                break;
            }

        }
        int [] m = playfField[j-1];
        for (int k = 0; k < m.length; k++) {
            if(m[k] != 0){                             // не пустое место на стержне
                if(m[k] > temp){
                    playfField[j-1][k - 1] = temp;
                    playfField[i-1][tempK] = 0;
                    return true;                       // правило игры - большее кольцо нельзя класт на меньшее
                }
            }else{
                if(k == m.length-1){
                    playfField[j-1][playfField[j-1].length-1] = temp;
                    playfField[i-1][tempK] = 0;
                    return true;
                }
            }


        }
        return false;
    }

    /**
     * проверка окончание игры
     * @return true - вы выйграли!!!  , false - еще игра не окончена
     */
    public boolean checkGoal(){
        return playfField[2][0] == 1;
    }

    public void printField(){
        int [][] field = playfField;
        int j = 0;

        for (int i = 0; i < field[j].length; i++){
            for(;j < field.length;j++){
                if(field[j][i] == 0){
                    System.out.print(" * ");
                }else {
                    System.out.print(" " + field[j][i] + " ");
                }
            }
            j = 0;
            System.out.println();
        }

    }
}

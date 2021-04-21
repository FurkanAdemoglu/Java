/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ıfkeywordandcodeblocks;

/**
 *
 * @author Lenovo
 */
public class IfKeywordAndCodeBlocks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean gameOver=true;
        int score=800;
        int levelComplated=5;
        int bonus=100;
       // if(score<5000 && score>1000){
         //   System.out.println("Your score was less than 5000 but greater than 1000");
            
       // }
        //else if(score<1000){
        //    System.out.println("Your score was less than 1000");
        //}
        //else{
        //    System.out.println("Got here");
        //}
        if(gameOver){
            int finalScore=score+(levelComplated*bonus);
            System.out.println("Your final score was"+finalScore);
        }
        int score2=10000;
        int levelComplated2=8;
        int bonus2=200;
        if(gameOver){
            int finalScore2=score2+(levelComplated2*bonus2);
            System.out.println("Your final score is"+finalScore2);
        }
    }
    
}

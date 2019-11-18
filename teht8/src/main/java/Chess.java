
import java.util.ArrayList;
import java.util.Scanner;

public class Chess extends Game{
    ArrayList<Nappula> nappulat;
    Scanner sc = new Scanner(System.in);
    
    @Override
    void initializeGame() {
        nappulat = new ArrayList<>();
        nappulat.add(new Nappula("n",0,1,0));
        nappulat.add(new Nappula("n",0,6,0));
        nappulat.add(new Nappula("N",7,1,1));
        nappulat.add(new Nappula("N",7,6,1));
        nappulat.add(new Nappula("b",0,2,0));
        nappulat.add(new Nappula("b",0,5,0));
        nappulat.add(new Nappula("B",7,2,1));
        nappulat.add(new Nappula("B",7,5,1));
        nappulat.add(new Nappula("r",0,0,0));
        nappulat.add(new Nappula("r",0,7,0));
        nappulat.add(new Nappula("R",7,0,1));
        nappulat.add(new Nappula("R",7,7,1));
        nappulat.add(new Nappula("q",0,3,0));
        nappulat.add(new Nappula("Q",7,3,1));
        nappulat.add(new Nappula("k",0,4,0));
        nappulat.add(new Nappula("K",7,4,1));
        for (int i = 0; i <8; i++) {
                nappulat.add(new Nappula("p",1,i,0));
                nappulat.add(new Nappula("P",6,i,1));
        }
    }

    @Override
    void makePlay(int player) {
        int mistäx;
        int mistäy;
        int mihinx;
        int mihiny;
        
        System.out.println("Player "+player+" turn");
        
        System.out.println("------------------");
        System.out.println(" A B C D E F G H");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" "+pieceHere(i, j));
            }
            System.out.println(" "+(i+1));
        }
        System.out.print("mistä x? :");
        mistäx = Integer.parseInt(sc.nextLine());
        System.out.println("");
        System.out.print("mistä y? :");
        mistäy = Integer.parseInt(sc.nextLine());
        System.out.println("");
        System.out.print("mihin x? :");
        mihinx = Integer.parseInt(sc.nextLine());
        System.out.println("");
        System.out.print("mihin y? :");
        mihiny = Integer.parseInt(sc.nextLine());
        System.out.println("");
        
        move(mistäx, mistäy, mihinx, mihiny);
    }

    @Override
    boolean endOfGame() {
        int i = 0;
        for (Nappula nappula : nappulat) {
            if (nappula.toString().equals("K")) i++;
            if (nappula.toString().equals("k")) i++;
        }
        return i != 2;
    }

    @Override
    void printWinner() {
        for (Nappula nappula : nappulat) {
            if (nappula.toString().equals("K")) System.out.println( nappula.pelaaja + " Voitti!");
        }
    }
    
    String pieceHere(int x,int y){
        for (Nappula nappula : nappulat) {
            if (nappula.x == x && nappula.y == y) return nappula.toString();
        }
        return " ";
    }
    
    public void move(int x1, int y1, int x2, int y2){
        Nappula toBeDestroyed = null;
        for (Nappula nappula : nappulat) {
            
            if (nappula.x == x2 && nappula.y == y2) {
                toBeDestroyed = nappula;
            }
            
            if (nappula.x == x1 && nappula.y == y1) {
                nappula.x = x2;
                nappula.y = y2;
            } 
        }
        boolean remove = nappulat.remove(toBeDestroyed);
    }
    
}

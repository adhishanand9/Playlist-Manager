import java.util.*;
class PlayList {
    String name;
    PlayList(){

    }
    public void setName(String name){
        this.name=name;
    }
    public void displayName(){
        clearScreen();
        System.out.println(name);
    }
    PlayList(String name){
        this.name=name;
    }
    class Songs {
            
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
class Player extends PlayList{
    Scanner sc=new Scanner(System.in);
    int value;
    static int flag=0;
    public void checkFlag(){
        if(flag==0) {
            displayFirst();
        }
        else{
            display();
        }
    }
    public void displayFirst(){
        flag=1;
        System.out.println("Welcome!");
        System.out.println("1.Create Playlist.");
        System.out.println("2.Exit");
        value=sc.nextInt();
        if(value==1){
            createPlaylist();
        }
        else if(value==2)
        {
            System.exit(0);
        }
    }
    void createPlaylist(){
        clearScreen();
        System.out.println("Enter Name:");
        String namePly=sc.nextLine();
        //PlayList pList = new PlayList(namePly);
        super.setName(namePly);
        super.displayName();

    }
    public void display(){

    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
public class Main {

    public static void main(String[] args) {
        Player ply=new Player();
        ply.checkFlag();
    }
}

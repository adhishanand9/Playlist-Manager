import java.util.*;
import java.io.*;
//import Adhish.DS.*;
class PlayList implements Serializable{
    String name;

    public void setName(String name){
        this.name=name;
    }
    public void displayName(){
        clearScreen();
        System.out.println(name);
    }
    PlayList(){
        //this.name=name;
    }
    private static class Songs {
        String songName;
        int songId;
        void setSongName(String songName){
            this.songName=songName;

        }
        void setSongId(int songId){
            this.songId=songId;
        }

    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
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
        Scanner sc=new Scanner(System.in);
        clearScreen();
        System.out.println("Enter Name:");
        String namePly=sc.nextLine();
        setName(namePly);
        
        displayMenu();
        //displayName();

    }
    public void displayMenu(){
        System.out.println("1.Add Song.");
        System.out.println("2.Delete Song.");
        System.out.println("3.Play Song");
        System.out.println("4.Set Mode");
        System.out.println("5.Back To Main Menu");
        value=sc.nextInt();
        switch (value){
            case 1:addSong();
                    break;
            case 2:deleteSong();
                break;
            case 3:playSong();
                break;
            case 4:setMode();
                break;
            case 5:display();
                break;
            default:System.exit(0);
                break;
        }


    }
    public void addSong(){

    }
    public void deleteSong(){

    }
    public void playSong(){

    }
    public void setMode(){

    }
    public void display(){
        System.out.println("Welcome!");
        System.out.println("1.Create Playlist.");
        System.out.println("2.Goto Playlist.");
        System.out.println("3.Exit");
        value=sc.nextInt();
        if(value==1){
            createPlaylist();
        }
        else if(value==2)
        {
            displayMenu();
        }
        else if(value==3)
        {
            System.exit(0);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        PlayList ply=new PlayList();
        ply.checkFlag();

    }
}

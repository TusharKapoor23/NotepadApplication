package notepadapplication;
import java.util.*;
import java.io.*;
public class NotepadApplication {
    public static void displayMenu() throws IOException{
        Scanner s = new Scanner(System.in);
        int ans;
        do{
            System.out.println("1. Create a file");
            System.out.println("2. Write in a file");
            System.out.println("3. Read a file");
            System.out.println("4. Delete a file");
            System.out.println("5. Copy a file");
            System.out.println("6. Move a file");
            System.out.println("7. Exit");
            System.out.println("Enter your choice");
            ans = s.nextInt();
            switch (ans){
                case 1: createFile();
                        break;
                case 2: writeFile();
                        break;
                case 3: readFile();
                        break;
                case 4: deleteFile();
                        break;
                case 5: copyFile();
                        break;
                case 6: moveFile();
                        break;
                case 7: break;
                default:System.out.println("Worng choice enter again");
            }
        }while(ans>7);
    }
    public static void createFile() throws IOException{
        System.out.println("Enter the name of the file you want to create along with the extension");
        System.out.println("For EG. Example.java");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println("Enter the path where you want the file");
        //String path = s.next();
        File f = new File("F:\\NotepadApplication\\"+name);
        f.createNewFile();
        System.out.println("Your file "+name+" has been created in the directory: D:\\NotepadApplication");
    }
    public static void writeFile() throws IOException {
        System.out.println("Enter the file name in which you want to write");
    }
    public static void readFile() throws IOException {
        
    }
    public static void deleteFile() throws IOException {
        
    }
    public static void moveFile() throws IOException {
        
    }
    public static void copyFile() throws IOException {
        
    }
     public static void main(String[] args) throws IOException{
        displayMenu();
    }
}
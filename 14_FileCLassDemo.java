
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */

import java.io.File;
import java.util.Scanner;

public class FileClassDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter file or directory name :");
        
        analyzePath(input.nextLine());
    }
    
    public static void analyzePath(String path) {
        File name=new File(path);
        
        if(name.exists()) {
            System.out.printf("%s\n",name.getName());
            System.out.printf("Is file ?? %s\n",name.isFile()==true?"Yes":"No");
            System.out.printf("Is DIrectory ?? %s\n",name.isDirectory()==true?"YES":"NO");
            System.out.printf("Last Modifies : %s\n",name.lastModified());
            System.out.printf("Is Absolute Path ?? %s\n",name.isAbsolute()==true?"Yes":"No");
            System.out.printf("Absolute Path : %s\n",name.getAbsolutePath());
            
            if(name.isDirectory()) {
                String directory[]=name.list();
                
                System.out.println("Directory Content");
                for(String dir:directory) {
                    System.out.println(dir);
                }
            }
        }
        else {
            System.out.printf("Path %s doesn't exists ...!!!\n",path);
        }
    }
}

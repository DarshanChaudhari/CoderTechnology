package com.darshan;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.logging.Logger;

public class PathDemo {

    public static void main(String[] args) {
//        Path path = FileSystems.getDefault().getPath("/users/Public"); it will show the path of working directory
//        Path path = FileSystems.getDefault().getPath("/users/Public");
        Path path = Paths.get("C:\\users\\Public");  // showing absolute path

        System.out.println(path);

        System.out.println(path.toUri());

        Iterator it = FileSystems.getDefault().getRootDirectories().iterator();
        System.out.println("Root directories (Drives in Windows)");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

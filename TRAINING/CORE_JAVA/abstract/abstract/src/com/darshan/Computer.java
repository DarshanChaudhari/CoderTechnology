package com.darshan;

public class Computer {
    private Storage disk;
    private Display display;

    public Computer (Display display, Storage disk){
     this.display = display;
     this.disk = disk;
     // test
     this.disk.read();
     this.display.show();
    }
}

package nix13.com.bkryvetskyi.levelthree.launcher;

import nix13.com.bkryvetskyi.levelthree.io.ReadFile;

public class Application {
    public static void main(String[] args) {

        ReadFile readFile = new ReadFile();
        readFile.readFile("input.txt");
    }
}

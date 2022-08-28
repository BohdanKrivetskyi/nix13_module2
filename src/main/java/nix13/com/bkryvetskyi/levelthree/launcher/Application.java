package nix13.com.bkryvetskyi.levelthree.launcher;

import nix13.com.bkryvetskyi.levelthree.io.ReadAndWriteFile;

public class Application {
    public static void main(String[] args) {

        ReadAndWriteFile readFile = new ReadAndWriteFile();
        readFile.readAndWriteFile("input.txt", "output.txt");
    }
}

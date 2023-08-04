package de.telran.khakov.rustam.classworks.cw3;

public class JumpTest {

    public static void main(String[] args) {
        Person person = new Person();
        Frog frog = new Frog();

        Jumpable[] jumps = new Jumpable[2];
        jumps[0] = person;
        jumps[1] = frog;
        for (int i = 0; i < jumps.length; i++) {
            jumps[i].jump();
        }
    }

    void main() {

    }
}

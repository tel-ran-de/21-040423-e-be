package de.telran.khakov.rustam.homeworks.homework4;

public enum Alphabet {
    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

    Alphabet() {
    }

    public int getNumber() {
        return this.ordinal() + 1;
    }


    public static void main(String[] args) {
        System.out.println(Alphabet.A.ordinal());
        System.out.println(Alphabet.A.getNumber());
        System.out.println(Alphabet.F.getNumber());
        Alphabet symbol = Alphabet.C;
        System.out.println(symbol == Alphabet.C);
    }
}

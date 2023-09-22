package de.telran.khakov.rustam.classworks.cw17;

public class Arhive<Type> {
    Type arhivedType;
    int sizeOfArhive;

    public Arhive(Type arhivedType, int sizeOfArhive) {
        this.arhivedType = arhivedType;
        this.sizeOfArhive = sizeOfArhive;
    }

    public Type getArhivedType() {
        return arhivedType;
    }

    public int getSizeOfArhive() {
        return sizeOfArhive;
    }

    public void setArhivedType(Type arhivedType) {
        this.arhivedType = arhivedType;
    }

    public void setSizeOfArhive(int sizeOfArhive) {
        this.sizeOfArhive = sizeOfArhive;
    }
}

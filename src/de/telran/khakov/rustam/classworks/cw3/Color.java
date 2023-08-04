package de.telran.khakov.rustam.classworks.cw3;

public enum Color {
    GREEN(0,255,0),
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    WHITE(255,255,255);
    // public final static Color RED = new Color("RED",0)
    // public final static Color GREEN = new Color("GREEN",1)
    // public final static Color YELLOW = new Color("YELLOW",2)
// месяцы - 28, 31, 30

    private int redColor;
    private int greenColor;
    private int blueColor;

    Color(int redColor, int greenColor, int blueColor) {
        this.redColor = redColor;
        this.greenColor = greenColor;
        this.blueColor = blueColor;
    }

    public static void main(String[] args) {
        Color[] values = Color.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            System.out.println(values[i].ordinal());
            System.out.printf("%d, %d, %d%n", values[i].blueColor, values[i].redColor,values[i].greenColor);
        }
    }

}

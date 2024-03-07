class Inki {

    public Inki(String Z) {
        System.out.println(Z);
    }

    public Inki(String X, String Y, String V) {
        System.out.println(X + " " + Y);
        System.out.println(X + " " + V);
        System.out.println(X + " " + Y + " " + V);
    }

    public static void main(String args[]) {
        String pinky = "inky";

        Inki ponky = new Inki(pinky);

        String blinky = "pinky";
        String rinky = "ponky";

        Inki ponky02 = new Inki(pinky, blinky, rinky);
    }
}

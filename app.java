public class app {
    public static void main(String[] args) {

        String[] banner = new String[5];

        banner[0] = " *****   *****  *******  *****";
        banner[1] = "*     * *     * *     *  *     ";
        banner[2] = "*     * *     * *******  *****";
        banner[3] = "*     * *     * *            *";
        banner[4] = " *****   *****  *        *****";

        for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }
    }
}
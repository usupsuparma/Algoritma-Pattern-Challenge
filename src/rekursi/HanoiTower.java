package rekursi;

public class HanoiTower {
    static  int nDisks = 6;
    public static void main(String[] args) {
        doTowers(nDisks,'A','B','C');
    }

    private static void doTowers(int topN, char from, char inter, char to) {
        if (topN ==1)
            System.out.println("Disk 1 dari "+from+" ke "+to);
        else {
            // dari --> tengah.
            doTowers(topN-1, from, to, inter);
            System.out.println("Disk "+topN+" dari "+from+" ke "+to);
        }
    }
}

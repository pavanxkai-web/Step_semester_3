public class HackathonSeatingGridOptimizer {
    static String classifyRow(int[] row) {
        double sum=0;
        for(int x:row) sum+=x;
        double avg=sum/row.length;
        return avg < 50 ? "Needs Help" : "Doing Well";
    }
    public static void main(String[] args) {
        int[][] grid={{30,40,45},{70,80,90}};
        for(int i=0;i<grid.length;i++) System.out.println("Row " + (i+1) + ": " + classifyRow(grid[i]));
    }
}

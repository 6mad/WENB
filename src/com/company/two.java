package  com.company;

public class two{
    private static int id=2;
    public static void maTable() {
        System.out.println("??有毒");
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"x"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
    /**
     * @return the id
     */
    public static int getId() {
        return id;
    }
}
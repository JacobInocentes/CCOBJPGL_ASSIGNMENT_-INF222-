public class exercise1 {

    static boolean iWillBehave = true;
    static boolean iWillGraduate = true;

    public static void main(String []args) throws Exception{
        assert iWillBehave == true : "Puro valorant";

        college();

        assert iWillGraduate == true : "Tamad";
    }
    static void college(){
        iWillGraduate = false;
        System.out.println("Hello mam/sir welcome to Jollibee may I take your order?");
    }
    

}

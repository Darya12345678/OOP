public class Dragon implements SwimmingSpeed{
    public void swimmable(){
        System.out.println("bul-bul");
    }
    public static void main(String[] args){
        Dragon nightFury = new Dragon();
        nightFury.swimmable();
    }
}

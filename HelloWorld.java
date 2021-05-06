public class HelloWorld {
    public static void main(String[]args){
        HelloWorld h = new HelloWorld();
        h.hello();
    }

    public void hello(){
        print("Hello World!");
    }

    public void print(String p){
        System.out.println(p);
    }
}

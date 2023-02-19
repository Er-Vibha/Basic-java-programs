package BasicPr;
//using conditional statements with simple example
public class firstpr {
    public static void main(String ar[]){
        String name= "Java, Python, SQL";
        if(name.endsWith("SQL")){
            if (name.contains("SQL"))
                System.out.println("It is SQL");
            else if(name.contains("C"))
                System.out.println("C");
            else
                System.out.println(name.split(",")[1]);
        }
        else{
            System.out.println("You are not a programmer");
        }
    }
}

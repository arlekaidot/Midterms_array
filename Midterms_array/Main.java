
import java.util.*;
public class Main{

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<String>();
        ArrayList<Integer> age = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;


        int choice;
        while(true){
            System.out.println("=====Options=====");
            System.out.print("1.) Add Entry \n");
            System.out.print("2.) Delete Entry \n");
            System.out.print("3.) View All Entries \n");
            System.out.print("4.) Update An Entry\n");
            System.out.print("5.) Exit");
            System.out.print("\nSelect an Option: ");

            choice = input.nextInt();




            switch(choice){

                case 1:
                    System.out.println("=======Add Entry=======");
                    System.out.println("Please enter your name: ");
                    name.add(sc.next());
                    System.out.println("Please enter your age: ");
                    age.add(sc.nextInt());
                    break;

                case 2:
                    System.out.println("=======Delete Entry======");
                    System.out.println("Enter name to be deleted: ");
                    String delUser = sc.next();

                    if (name.contains(delUser))
                        for (int i = 0; i < name.size(); i++)
                            name.remove(delUser);
                        for (int i = 0; i < name.size(); i++)
                            age.remove(delUser);
                    break;

                case 3:
                    System.out.println("=====View all Entries=====");
                    System.out.println("Name Followed by Age:");
                    for (int i = 0; i < name.size(); i++)
                        System.out.println(name.get(i) + " is " + age.get(i));
                    break;

                case 4:

                    System.out.print("Enter a Name to Update: ");
					        String userUpdate = sc.next();

					        if (name.contains(userUpdate)) {
					            for (int i = 0; i < name.size(); i++) {
					                if (userUpdate.equals(name.get(i))) {
					                    System.out.print("Enter New Name: ");
					                    String newN = sc.next();
					                    name.set(i, newN);
					                    System.out.print("Enter New Age: ");
					                    int newA = sc.nextInt();
					                    age.set(i, newA);
					                    break;
					                }
					            }
					        } else {
					            System.out.println("No " + userUpdate + " in the list");
					        }
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
                default :
                    System.out.println("This is not a valid Menu Option! Please Select Another");
                    break;
            }
        }
    }
}
package lgs.lviv.ua;

import java.util.Scanner;

public class Application {
    public static void menu() {
        System.out.println("Enter 1 to add a member to club");
        System.out.println("Enter 2 to add a pet to member of the club");
        System.out.println("Enter 3 to remove pet from member");
        System.out.println("Enter 4 to remove member from club");
        System.out.println("Enter 5 to remove pet from all of members");
        System.out.println("Enter 6 to see all information about zoo club");
        System.out.println("Enter 0 to exit");
    }

    public static void main(String[] args) throws WrongInputException {
        Zoo z = new Zoo();

        while (true) {
            menu();
            System.out.println(" ");
            System.out.println("What do you want to do?: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    z.addMember(z.map);
                    break;
                }
                case 2: {
                    z.addPetToMember(z.map);
                    break;
                }
                case 3: {
                    z.removePetFromMember(z.map);
                    break;
                }
                case 4: {
                    z.removeMemberFromClub(z.map);
                    break;
                }
                case 5: {
                    z.removePetFromAllMembers(z.map);
                    break;
                }
                case 6: {
                    z.ShowZooClub(z.map);
                    break;
                }
                case 0:
                    System.exit(1);
            }
        }
    }


}

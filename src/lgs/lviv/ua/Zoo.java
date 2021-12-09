package lgs.lviv.ua;

import javax.swing.*;
import java.util.*;

public class Zoo {
    public Map<human, List<Pet>> map = new HashMap<>();

    public Map<human, List<Pet>> addMember(Map<human, List<Pet>> m) {
        System.out.println("Enter name of club member");
        Scanner sc = new Scanner(System.in);
        String mName = sc.next();
        System.out.println("Enter age of member: ");
        Scanner sc2 = new Scanner(System.in);
        int mAge = sc2.nextInt();

        System.out.println(" ");

        m.put(new human(mName, mAge), new ArrayList<>());

        return m;
    }

    public Map<human, List<Pet>> addPetToMember(Map<human, List<Pet>> m) throws WrongInputException {
        System.out.println("Enter member name: ");
        Scanner sc = new Scanner(System.in);
        String mName = sc.next();

        System.out.println("done!");

        System.out.println(" ");

        System.out.println("Enter pet type: ");
        Scanner sc3 = new Scanner(System.in);
        String pType = sc3.next();

        System.out.println("Enter pet name: ");
        Scanner sc4 = new Scanner(System.in);
        String pName = sc3.next();

        Pet p = new Pet(pType, pName);

        Iterator<Map.Entry<human, List<Pet>>> iterator = m.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<human, List<Pet>> next = iterator.next();
            if (next.getKey().getName().equals(mName)) {
                List<Pet> value = next.getValue();
                value.add(p);
                next.setValue(value);
            }
        }
        return m;
    }

    public Map<human, List<Pet>> removePetFromMember(Map <human, List<Pet>> m) throws WrongInputException {
        System.out.println("Enter member name: ");
        Scanner sc = new Scanner(System.in);
        String memberName = sc.next();

        System.out.println("Enter pet name: ");
        Scanner sc2 = new Scanner(System.in);
        String pName = sc2.next();

        Iterator<Map.Entry<human, List<Pet>>> iterator = m.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<human, List<Pet>> next = iterator.next();
            List<Pet> petList = next.getValue();
            Iterator<Pet> petIterator = petList.iterator();
            while (petIterator.hasNext()) {
                Pet next2 = petIterator.next();
                if (next2.getName().equals(pName)) {
                    petIterator.remove();
                }
            }
        }
        return m;
    }

    public Map<human, List<Pet>> removeMemberFromClub(Map <human, List<Pet>> m) {
        System.out.println("Enter name of the club member: ");
        Scanner sc = new Scanner(System.in);
        String mName = sc.next();

        Iterator<Map.Entry<human, List<Pet>>> entry = m.entrySet().iterator();

        while (entry.hasNext()) {
            Map.Entry<human, List<Pet>> next = entry.next();
            if (next.getKey().getName().equals(mName)) {
                entry.remove();
            }
        }
        return m;
    }

    public Map<human, List<Pet>> removePetFromAllMembers(Map <human, List<Pet>> m) {
        System.out.println("Enter pet type(It will be deleted): ");
        Scanner sc = new Scanner(System.in);
        String pType = sc.next();

        Iterator<Map.Entry<human, List<Pet>>> iterator = m.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<human, List<Pet>> next = iterator.next();
            List<Pet> petList = next.getValue();
            Iterator<Pet> iterator2 = petList.iterator();
            while (iterator2.hasNext()) {
                Pet pet = iterator2.next();
                if (pet.getType().equals(pType)) {
                    iterator2.remove();
                }
            }
        }
        return m;
    }

    public void ShowZooClub(Map<human, List<Pet>> m) {
        Set<Map.Entry<human, List<Pet>>> entrySet = m.entrySet();

        for (Map.Entry<human, List<Pet>> humanListEntry : entrySet) {
            System.out.println(humanListEntry.getKey() + " His(Her) pet(s): " + humanListEntry.getValue());
        }

    }
}


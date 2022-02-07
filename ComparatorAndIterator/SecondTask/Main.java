package ComparatorAndIterator.SecondTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Chats> chatsList = new ArrayList<>();
        chatsList.add(new Chats("first", new User(1, "Casper", 23)));
        chatsList.add(new Chats("first", new User(1, "Casper", 24)));
        chatsList.add(new Chats("first", new User(1, "Casper", 22)));
        chatsList.add(new Chats("first", new User(1, "Casper", 43)));
        chatsList.add(new Chats("second", new User(2, "Nelly", 14)));
        chatsList.add(new Chats("second", new User(2, "Nelly", 14)));
        chatsList.add(new Chats("third", new User(3, "John", 17)));
        chatsList.add(new Chats("third", new User(3, "John", 16)));

        var chats = elderThan18(chatsList);
        System.out.println(chats);
        avgAge(chats);

    }

    public static List<Chats> elderThan18(List<Chats> listOfChats) {
        List<Chats> list = new ArrayList<>();
        for (Iterator<Chats> iterator = listOfChats.iterator(); iterator.hasNext(); ) {
            var next = iterator.next();

            if (next.getUser().getAge() > 18) {
                var next1 = next;
                list.add(next1);
            }
        }
        return list;
    }

    public static void avgAge(List<Chats> list) {
        int age = 0;
        for (Chats chats : list) {
            age = age + chats.getUser().getAge();
        }
        System.out.println("Average age is " + age / list.size());
    }

}

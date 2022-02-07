package ComparatorAndIterator.FirstTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1. Дан список чатов. Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * <p>
 * Задача:
 * <p>
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * <p>
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей,
 * а если это количество совпадает, то по названию в алфавитном порядке.
 * <p>
 * - Также предоставить сортировку чатов по названию по умолчанию.
 * <p>
 * <p>
 * <p>
 */
public class Runner {

    public static void main(String[] args) {

        List<Chats> chatsList = new ArrayList<>();
        chatsList.add(new Chats("first", 2000));
        chatsList.add(new Chats("second", 3000));
        chatsList.add(new Chats("third", 4000));
        chatsList.add(new Chats("fourth", 5000));
        chatsList.add(new Chats("another", 5000));
        chatsList.add(new Chats("abc", 5000));
        chatsList.add(new Chats("five", 100));
        chatsList.add(new Chats("sixth", 200));
        chatsList.add(new Chats("seventh", 300));
        chatsList.add(new Chats("eighth", 400));

        delete(chatsList);
        chatsList.sort(new ChatsUserCountCompare().thenComparing(new ChatsNameCompare()));
        chatsList.sort(new ChatsNameCompare());
        System.out.println(chatsList);

    }

    public static void delete(List<Chats> list) {
        for (Iterator<Chats> iterator = list.iterator(); iterator.hasNext(); ) {
            var next = iterator.next();
            if (next.getUserCount() < 1000) {
                iterator.remove();
            }
        }
    }
}

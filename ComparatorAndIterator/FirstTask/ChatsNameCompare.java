package ComparatorAndIterator.FirstTask;

import java.util.Comparator;

public class ChatsNameCompare implements Comparator<Chats> {
    @Override
    public int compare(Chats o1, Chats o2) {
        return o1.getChatName().compareTo(o2.getChatName());
    }
}

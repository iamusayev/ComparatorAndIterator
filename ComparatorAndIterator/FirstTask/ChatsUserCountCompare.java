package ComparatorAndIterator.FirstTask;

import java.util.Comparator;

public class ChatsUserCountCompare implements Comparator<Chats> {
    @Override
    public int compare(Chats o1, Chats o2) {
        return Integer.compare(o2.getUserCount(),o1.getUserCount());
    }
}

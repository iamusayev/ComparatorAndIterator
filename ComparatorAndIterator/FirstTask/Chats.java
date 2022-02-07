package ComparatorAndIterator.FirstTask;

public class Chats {
    private String chatName;
    private int userCount;

    public Chats(String chatName, int userCount) {
        this.chatName = chatName;
        this.userCount = userCount;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public int getUserCount() {
        return userCount;
    }

    @Override
    public String toString() {
        return "Chats{" +
               "chatName='" + chatName + '\'' +
               ", userCount='" + userCount + '\'' +
               '}';
    }
}

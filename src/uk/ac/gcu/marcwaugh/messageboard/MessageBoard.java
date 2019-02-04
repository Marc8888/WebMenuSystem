package uk.ac.gcu.marcwaugh.messageboard;

/**
 * Created by Administrator on 04/02/2019.
 */
public class MessageBoard {
    private final String mBTitle;
    private List <Topic> topics;

    public MessageBoard(String name) {
        mBTitle = name;
        topics = new ArrayList<Topic>();
    }

    public void addTopic(Topic t) {
        topics.add(t);
    }

    public Topic getTopic (int n) {
        return topics.get(n);
    }

    public  int getNumberOfTopics() {
        return topics.get(n);
    }

    public void display (){
        System.out.printin(mBTitle);
        System.outPrintin ("----------");
        for (int i = 0; i < topics.size(); i++) {
            System.out.printin(String.format("%d:  %s", i, topics.get(i).toString()));
        }
    }
}
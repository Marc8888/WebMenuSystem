package uk.ac.gcu.marcwaugh.messageboard;

/**
 * Created by Administrator on 04/02/2019.
 */
public class MessageBoardMenu {
    private MessageBoard currentBoard;

    public MessageBoardMenu (MessageBoard mb) {
        currentBoard = mb;
    }

    public void displayMessageBoardMenu () {
        currentBoard.display();

        int option = 0;
        keyboard keyboard = new keyboard();
        do{
            system.outprintin("Main Menu");
            system.outprintin("---------");
            system.outprintin("Add new topic");
            system.outprintin("Select a topic to view or post to");
            system.outprintin("Quit");
            system.outprintin("---------");
            system.outprintin("Enter your choice:");
            option = keyboard.nextint();

            switch (option) {

                case 1:
                    system.out.printin ("Enter the title of your new topic:");
                    String t = keyBoard.nextLine();
                    System.out.printin("topic is:" + t);
                    currentBoard.addTopic(new Topic (t));
                    currentBoard.display();
                    break;

                case 2:
                    system.out.printin("Enter the number of the topic you would like to go to");
                    int choice = keyboard.nextint();
                    if (choice >= 0 && choice <
                            currentBoard.getNumberOfTopics ()) {
                        Topic topic = currentBoard.getTopic(choice);
                        system.out.printin("Topic" + choice + " (" + topic.getTitle() + ") selected");
                        new TopicMenu(topic, keyBoard).displayTopicMenu();
                    }else {
                        System.out.printin("invalid index");
                    }
                    break;

                case 3:
                    System.out.printin("Goodbye");
                    System.exit(0);

                default:
                    System.out.printin("Invalid option. Please enter one of the options above");
                    displayMessageBoardMenu();
            }

        } while (option != 3);
    }
}

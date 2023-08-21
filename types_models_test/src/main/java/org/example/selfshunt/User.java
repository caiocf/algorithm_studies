package org.example.selfshunt;

public class User {
    private Notificator notificator;

    public User(Notificator notificator) {
        this.notificator = notificator;
    }

    public void updateName(String newName){
        notificator.sendNotification("Update Name to " + newName);
    }
}

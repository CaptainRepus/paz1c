package sk.upjs.ics;

import java.awt.geom.GeneralPath;
import java.util.List;

public class UserService {
    private final List<User> database;

    public UserService(List<User> database) {
        this.database = database;
    }

    public GenderRatio computeGenderRatio() {
        double boys = 0;
        double girls = 0;
        double unkowns = 0;

        for (User user : database) {
            if(user.gender().equals("MALE")) {
                boys++;
            } else if(user.gender().equals("FEMALE")) {
                girls++;
            }else{
                unkowns++;
            }
        }

        boys = boys/database.size();
        girls = girls /  database.size();
        unkowns = unkowns/database.size();

        return new GenderRatio(boys, girls, unkowns);
    }
}

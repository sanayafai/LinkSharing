package com.Dao;

import com.entities.Topic;
import com.entities.User;

/**
 * Created by dash on 7/20/2017.
 */
public interface SubcriptionDao {

    boolean Subscribe(User user, Topic topic, String seriousness);
}

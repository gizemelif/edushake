package com.codeshake.edushake.firebase;

import com.codeshake.edushake.dao.UserDao;
import com.codeshake.edushake.model.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FBUserDataAccessService implements UserDao {

    public static final String columnName = "users";

    @Override
    public int insertUser(User user) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(columnName)
                .document().set(user);
        return 0;
    }

    @Override
    public List<User> selectAllUsers() {
        return null;
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return Optional.empty();
    }
}

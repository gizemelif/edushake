package com.codeshake.edushake.firebase;

import com.codeshake.edushake.dao.ParentDao;
import com.codeshake.edushake.model.Parent;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class FBParentDataAccessService implements ParentDao {

    public static final String columnName = "parents";
    @Override
    public int insertParent(Parent parent) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(columnName)
                .document(parent.getName())
                .set(parent);

        return 1;
    }

    @Override
    public List<Parent> selectAllParents() {
        return null;
    }

    @Override
    public Optional<Parent> selectParentById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Parent selectParentDetailsById(UUID id) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection(columnName).document();
        ApiFuture<DocumentSnapshot> future = documentReference.get();

        DocumentSnapshot document = null;
        try {
            document = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        Parent parent = null;

        if(document.exists()) {
            parent = document.toObject(Parent.class);
            return parent;
        }else {
            return null;
        }
    }
}

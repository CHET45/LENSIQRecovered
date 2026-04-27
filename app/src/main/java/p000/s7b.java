package p000;

import com.google.firebase.Timestamp;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface s7b {
    void acknowledgeBatch(n7b n7bVar, vj1 vj1Var);

    n7b addMutationBatch(Timestamp timestamp, List<m7b> list, List<m7b> list2);

    List<n7b> getAllMutationBatches();

    List<n7b> getAllMutationBatchesAffectingDocumentKey(ci4 ci4Var);

    List<n7b> getAllMutationBatchesAffectingDocumentKeys(Iterable<ci4> iterable);

    List<n7b> getAllMutationBatchesAffectingQuery(nld nldVar);

    int getHighestUnacknowledgedBatchId();

    vj1 getLastStreamToken();

    @hib
    n7b getNextMutationBatchAfterBatchId(int i);

    boolean isEmpty();

    @hib
    n7b lookupMutationBatch(int i);

    void performConsistencyCheck();

    void removeMutationBatch(n7b n7bVar);

    void setLastStreamToken(vj1 vj1Var);

    void start();
}

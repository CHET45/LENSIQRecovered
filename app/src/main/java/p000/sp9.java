package p000;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes5.dex */
public interface sp9 {
    void forEachOrphanedDocumentSequenceNumber(su2<Long> su2Var);

    void forEachTarget(su2<vmg> su2Var);

    long getByteSize();

    wp9 getGarbageCollector();

    long getSequenceNumberCount();

    int removeOrphanedDocuments(long j);

    int removeTargets(long j, SparseArray<?> sparseArray);
}

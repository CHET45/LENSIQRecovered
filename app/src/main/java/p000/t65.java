package p000;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
@xqi
public interface t65 extends Closeable {
    int cleanUp();

    long getNextCallTime(chh chhVar);

    boolean hasPendingEventsFor(chh chhVar);

    Iterable<chh> loadActiveContexts();

    Iterable<gqc> loadBatch(chh chhVar);

    @hib
    gqc persist(chh chhVar, a65 a65Var);

    void recordFailure(Iterable<gqc> iterable);

    void recordNextCallTime(chh chhVar, long j);

    void recordSuccess(Iterable<gqc> iterable);
}

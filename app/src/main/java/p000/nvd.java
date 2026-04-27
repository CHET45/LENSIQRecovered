package p000;

/* JADX INFO: loaded from: classes5.dex */
public interface nvd {
    void addReference(ci4 ci4Var);

    long getCurrentSequenceNumber();

    void onTransactionCommitted();

    void onTransactionStarted();

    void removeMutationReference(ci4 ci4Var);

    void removeReference(ci4 ci4Var);

    void removeTarget(vmg vmgVar);

    void setInMemoryPins(rvd rvdVar);

    void updateLimboDocument(ci4 ci4Var);
}

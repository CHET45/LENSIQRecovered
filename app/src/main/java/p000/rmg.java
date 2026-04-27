package p000;

/* JADX INFO: loaded from: classes5.dex */
public interface rmg {
    void addMatchingKeys(qy7<ci4> qy7Var, int i);

    void addTargetData(vmg vmgVar);

    boolean containsKey(ci4 ci4Var);

    void forEachTarget(su2<vmg> su2Var);

    long getHighestListenSequenceNumber();

    int getHighestTargetId();

    euf getLastRemoteSnapshotVersion();

    qy7<ci4> getMatchingKeysForTargetId(int i);

    long getTargetCount();

    @hib
    vmg getTargetData(kmg kmgVar);

    void removeMatchingKeys(qy7<ci4> qy7Var, int i);

    void removeMatchingKeysForTargetId(int i);

    void removeTargetData(vmg vmgVar);

    void setLastRemoteSnapshotVersion(euf eufVar);

    void updateTargetData(vmg vmgVar);
}

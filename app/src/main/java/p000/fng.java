package p000;

import p000.lmg;
import p000.mmg;

/* JADX INFO: loaded from: classes5.dex */
public interface fng extends rsa {
    mmg.C9417c getDocuments();

    f2h getLastLimboFreeSnapshotVersion();

    long getLastListenSequenceNumber();

    mmg.C9419e getQuery();

    vj1 getResumeToken();

    f2h getSnapshotVersion();

    int getTargetId();

    lmg.EnumC8904c getTargetTypeCase();

    boolean hasDocuments();

    boolean hasLastLimboFreeSnapshotVersion();

    boolean hasQuery();

    boolean hasSnapshotVersion();
}

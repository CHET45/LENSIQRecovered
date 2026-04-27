package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface jsi extends rsa {
    f2h getCommitTime();

    String getStreamId();

    vj1 getStreamIdBytes();

    vj1 getStreamToken();

    ksi getWriteResults(int i);

    int getWriteResultsCount();

    List<ksi> getWriteResultsList();

    boolean hasCommitTime();
}

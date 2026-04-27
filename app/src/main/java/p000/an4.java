package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface an4 extends gd1 {
    @hib
    bd1 getAfterCompleted(int i);

    boolean markFileClear(int i);

    boolean markFileDirty(int i);

    void onSyncToFilesystemSuccess(@efb bd1 bd1Var, int i, long j) throws IOException;

    void onTaskEnd(int i, @efb x15 x15Var, @hib Exception exc);

    void onTaskStart(int i);
}

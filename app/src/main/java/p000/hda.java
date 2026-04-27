package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public interface hda {
    void flush();

    void maybeThrowException();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void queueSecureInputBuffer(int i, int i2, f93 f93Var, long j, int i3);

    void setParameters(Bundle bundle);

    void shutdown();

    void start();

    void waitUntilQueueingComplete() throws InterruptedException;
}

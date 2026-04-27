package p000;

import p000.pl3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface il3<I, O, E extends pl3> {
    @hib
    I dequeueInputBuffer() throws pl3;

    @hib
    O dequeueOutputBuffer() throws pl3;

    void flush();

    String getName();

    void queueInputBuffer(I i) throws pl3;

    void release();
}

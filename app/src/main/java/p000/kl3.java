package p000;

import p000.ql3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface kl3<I, O, E extends ql3> {
    @hib
    I dequeueInputBuffer() throws ql3;

    @hib
    O dequeueOutputBuffer() throws ql3;

    void flush();

    String getName();

    void queueInputBuffer(I i) throws ql3;

    void release();

    void setOutputStartTimeUs(long j);
}

package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface zj5 extends ah3 {
    void advancePeekPosition(int i) throws IOException;

    boolean advancePeekPosition(int i, boolean z) throws IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] bArr, int i, int i2) throws IOException;

    void peekFully(byte[] bArr, int i, int i2) throws IOException;

    boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException;

    @Override // p000.ah3, p000.en7
    int read(byte[] bArr, int i, int i2) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;

    boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable;

    int skip(int i) throws IOException;

    void skipFully(int i) throws IOException;

    boolean skipFully(int i, boolean z) throws IOException;
}

package p000;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface yfg extends Closeable {
    void bindBlob(int i, @yfb byte[] bArr);

    void bindDouble(int i, double d);

    void bindLong(int i, long j);

    void bindNull(int i);

    void bindString(int i, @yfb String str);

    void clearBindings();
}

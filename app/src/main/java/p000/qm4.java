package p000;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface qm4 {

    /* JADX INFO: renamed from: qm4$a */
    public interface InterfaceC11553a {
        qm4 create(Context context, Uri uri, int i) throws FileNotFoundException;

        qm4 create(Context context, File file, int i) throws FileNotFoundException;

        boolean supportSeek();
    }

    void close() throws IOException;

    void flushAndSync() throws IOException;

    void seek(long j) throws IOException;

    void setLength(long j) throws IOException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}

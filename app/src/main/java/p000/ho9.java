package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface ho9 extends Closeable {
    @efb
    InputStream bodyByteStream() throws IOException;

    @hib
    String contentType();

    @hib
    String error();

    boolean isSuccessful();
}

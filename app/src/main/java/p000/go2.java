package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1704")
public interface go2 {
    OutputStream compress(OutputStream outputStream) throws IOException;

    String getMessageEncoding();
}

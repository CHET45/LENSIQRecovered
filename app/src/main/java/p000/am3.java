package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1704")
public interface am3 {
    InputStream decompress(InputStream inputStream) throws IOException;

    String getMessageEncoding();
}

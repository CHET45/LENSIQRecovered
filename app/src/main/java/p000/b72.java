package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1704")
public interface b72 extends go2, am3 {

    /* JADX INFO: renamed from: b72$a */
    public static final class C1760a implements b72 {
        @Override // p000.go2
        public OutputStream compress(OutputStream outputStream) throws IOException {
            return new GZIPOutputStream(outputStream);
        }

        @Override // p000.am3
        public InputStream decompress(InputStream inputStream) throws IOException {
            return new GZIPInputStream(inputStream);
        }

        @Override // p000.go2, p000.am3
        public String getMessageEncoding() {
            return "gzip";
        }
    }

    /* JADX INFO: renamed from: b72$b */
    public static final class C1761b implements b72 {

        /* JADX INFO: renamed from: a */
        public static final b72 f12832a = new C1761b();

        private C1761b() {
        }

        @Override // p000.go2
        public OutputStream compress(OutputStream outputStream) {
            return outputStream;
        }

        @Override // p000.am3
        public InputStream decompress(InputStream inputStream) {
            return inputStream;
        }

        @Override // p000.go2, p000.am3
        public String getMessageEncoding() {
            return "identity";
        }
    }
}

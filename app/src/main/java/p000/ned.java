package p000;

import java.io.File;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ned extends RequestBody {

    /* JADX INFO: renamed from: a */
    public final File f64173a;

    /* JADX INFO: renamed from: b */
    public final String f64174b;

    /* JADX INFO: renamed from: c */
    public final long f64175c;

    /* JADX INFO: renamed from: d */
    public final boolean f64176d;

    /* JADX INFO: renamed from: e */
    public BufferedSink f64177e = null;

    public ned(File file, String str, long j, boolean z) {
        this.f64173a = file;
        this.f64174b = str;
        this.f64175c = j;
        this.f64176d = z;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        return (!this.f64176d || this.f64175c <= 0) ? this.f64173a.length() : this.f64173a.length() - this.f64175c;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        String str = this.f64174b;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    public abstract void onProgress(long j, long j2);

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        if (this.f64177e == null) {
            this.f64177e = bufferedSink.buffer();
        }
        Source source = Okio.source(this.f64173a);
        BufferedSource bufferedSourceBuffer = Okio.buffer(source);
        Buffer buffer = new Buffer();
        long jContentLength = contentLength();
        long j = 0;
        if (this.f64176d && this.f64175c > 0) {
            while (true) {
                long j2 = this.f64175c;
                if (j >= j2) {
                    j = j2;
                    break;
                }
                long j3 = bufferedSourceBuffer.read(buffer, Math.min(8192L, j2 - j));
                if (j3 == -1) {
                    throw new IOException("文件已被修改，无法继续上传");
                }
                j += j3;
                buffer.clear();
            }
        }
        while (true) {
            long j4 = source.read(buffer, 8192L);
            if (j4 == -1) {
                bufferedSink.flush();
                return;
            } else {
                if (Thread.currentThread().isInterrupted()) {
                    source.close();
                    throw new IOException("Upload cancelled");
                }
                bufferedSink.write(buffer, j4);
                j += j4;
                onProgress(j, jContentLength);
            }
        }
    }
}

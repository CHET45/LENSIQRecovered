package p000;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

/* JADX INFO: loaded from: classes7.dex */
public class j23 extends RequestBody {

    /* JADX INFO: renamed from: a */
    public RequestBody f49408a;

    /* JADX INFO: renamed from: b */
    public InterfaceC7726b f49409b;

    /* JADX INFO: renamed from: c */
    public C7725a f49410c;

    /* JADX INFO: renamed from: j23$a */
    public final class C7725a extends ForwardingSink {

        /* JADX INFO: renamed from: a */
        public long f49411a;

        public C7725a(Sink sink) {
            super(sink);
            this.f49411a = 0L;
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            super.write(buffer, j);
            long j2 = this.f49411a + j;
            this.f49411a = j2;
            j23 j23Var = j23.this;
            j23Var.f49409b.onRequestProgress(j2, j23Var.contentLength());
        }
    }

    /* JADX INFO: renamed from: j23$b */
    public interface InterfaceC7726b {
        void onRequestProgress(long j, long j2);
    }

    public j23(RequestBody requestBody, InterfaceC7726b interfaceC7726b) {
        this.f49408a = requestBody;
        this.f49409b = interfaceC7726b;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        try {
            return this.f49408a.contentLength();
        } catch (IOException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f49408a.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        C7725a c7725a = new C7725a(bufferedSink);
        this.f49410c = c7725a;
        BufferedSink bufferedSinkBuffer = Okio.buffer(c7725a);
        this.f49408a.writeTo(bufferedSinkBuffer);
        bufferedSinkBuffer.flush();
    }
}

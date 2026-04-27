package p000;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes6.dex */
public class oed extends ResponseBody {

    /* JADX INFO: renamed from: d */
    public static final String f67435d = "oed";

    /* JADX INFO: renamed from: a */
    public ResponseBody f67436a;

    /* JADX INFO: renamed from: b */
    public med f67437b;

    /* JADX INFO: renamed from: c */
    public BufferedSource f67438c;

    /* JADX INFO: renamed from: oed$a */
    public class C10353a extends ForwardingSource {

        /* JADX INFO: renamed from: a */
        public long f67439a;

        /* JADX INFO: renamed from: b */
        public int f67440b;

        public C10353a(Source source) {
            super(source);
            this.f67439a = 0L;
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            long j2 = super.read(buffer, j);
            long jContentLength = oed.this.f67436a.contentLength();
            if (j2 == -1) {
                this.f67439a = jContentLength;
            } else {
                this.f67439a += j2;
            }
            int i = (int) ((this.f67439a * 100) / jContentLength);
            if (oed.this.f67437b != null && i != this.f67440b) {
                oed.this.f67437b.onProgress(i);
            }
            if (oed.this.f67437b != null && this.f67439a == jContentLength) {
                oed.this.f67437b = null;
            }
            this.f67440b = i;
            return j2;
        }
    }

    public oed(String str, ResponseBody responseBody) {
        this.f67436a = responseBody;
        this.f67437b = led.f57405a.get(str);
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f67436a.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.f67436a.contentType();
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        if (this.f67438c == null) {
            this.f67438c = Okio.buffer(new C10353a(this.f67436a.source()));
        }
        return this.f67438c;
    }
}

package p000;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class l69 {

    /* JADX INFO: renamed from: a */
    public final Readable f56338a;

    /* JADX INFO: renamed from: b */
    @wx1
    public final Reader f56339b;

    /* JADX INFO: renamed from: c */
    public final CharBuffer f56340c;

    /* JADX INFO: renamed from: d */
    public final char[] f56341d;

    /* JADX INFO: renamed from: e */
    public final Queue<String> f56342e;

    /* JADX INFO: renamed from: f */
    public final f69 f56343f;

    /* JADX INFO: renamed from: l69$a */
    public class C8640a extends f69 {
        public C8640a() {
        }

        @Override // p000.f69
        /* JADX INFO: renamed from: c */
        public void mo10674c(String line, String end) {
            l69.this.f56342e.add(line);
        }
    }

    public l69(Readable readable) {
        CharBuffer charBufferM14361c = jw1.m14361c();
        this.f56340c = charBufferM14361c;
        this.f56341d = charBufferM14361c.array();
        this.f56342e = new ArrayDeque();
        this.f56343f = new C8640a();
        this.f56338a = (Readable) v7d.checkNotNull(readable);
        this.f56339b = readable instanceof Reader ? (Reader) readable : null;
    }

    @op1
    @wx1
    public String readLine() throws IOException {
        int i;
        while (true) {
            if (this.f56342e.peek() != null) {
                break;
            }
            ki8.m14757a(this.f56340c);
            Reader reader = this.f56339b;
            if (reader != null) {
                char[] cArr = this.f56341d;
                i = reader.read(cArr, 0, cArr.length);
            } else {
                i = this.f56338a.read(this.f56340c);
            }
            if (i == -1) {
                this.f56343f.m10673b();
                break;
            }
            this.f56343f.m10672a(this.f56341d, 0, i);
        }
        return this.f56342e.poll();
    }
}

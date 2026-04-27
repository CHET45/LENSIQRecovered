package p000;

import java.io.Writer;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
@p7e({p7e.EnumC10826a.f69936c})
public class aj9 extends Writer {

    /* JADX INFO: renamed from: a */
    public final String f1759a;

    /* JADX INFO: renamed from: b */
    public StringBuilder f1760b = new StringBuilder(128);

    public aj9(String str) {
        this.f1759a = str;
    }

    private void flushBuilder() {
        if (this.f1760b.length() > 0) {
            this.f1760b.toString();
            StringBuilder sb = this.f1760b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flushBuilder();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        flushBuilder();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                flushBuilder();
            } else {
                this.f1760b.append(c);
            }
        }
    }
}

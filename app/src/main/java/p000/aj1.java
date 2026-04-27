package p000;

import android.graphics.Rect;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class aj1 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f1709a;

    /* JADX INFO: renamed from: b */
    public final int f1710b;

    /* JADX INFO: renamed from: c */
    public final int f1711c;

    /* JADX INFO: renamed from: d */
    public final int f1712d;

    /* JADX INFO: renamed from: e */
    public int f1713e = 0;

    /* JADX INFO: renamed from: f */
    public Rect f1714f;

    public aj1(@efb ByteBuffer byteBuffer, int i, int i2, int i3) {
        this.f1709a = byteBuffer;
        this.f1710b = i;
        this.f1711c = i2;
        this.f1712d = i3;
        this.f1714f = new Rect(0, 0, i, i2);
    }

    @efb
    public owa build() {
        return new owa(new m8j(this.f1709a, this.f1712d), this.f1713e, this.f1714f, 0L, this.f1710b, this.f1711c);
    }

    @efb
    public aj1 setRotation(int i) {
        owa.m19068c(i);
        this.f1713e = i;
        return this;
    }
}

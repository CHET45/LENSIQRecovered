package p000;

import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class yi8 implements ya8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vw1 f101701a;

    public yi8(@yfb InputStream inputStream) {
        md8.checkNotNullParameter(inputStream, "stream");
        this.f101701a = new vw1(inputStream, xw1.f99524b);
    }

    @Override // p000.ya8
    public int read(@yfb char[] cArr, int i, int i2) {
        md8.checkNotNullParameter(cArr, "buffer");
        return this.f101701a.read(cArr, i, i2);
    }

    public final void release() {
        this.f101701a.release();
    }
}

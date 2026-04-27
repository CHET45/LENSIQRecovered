package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class pf3 extends gz1 {

    /* JADX INFO: renamed from: l */
    public static final int f70586l = 16384;

    /* JADX INFO: renamed from: j */
    public byte[] f70587j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f70588k;

    public pf3(gh3 gh3Var, xh3 xh3Var, int i, C1213a c1213a, int i2, @hib Object obj, @hib byte[] bArr) {
        pf3 pf3Var;
        byte[] bArr2;
        super(gh3Var, xh3Var, i, c1213a, i2, obj, -9223372036854775807L, -9223372036854775807L);
        if (bArr == null) {
            bArr2 = t0i.f83321f;
            pf3Var = this;
        } else {
            pf3Var = this;
            bArr2 = bArr;
        }
        pf3Var.f70587j = bArr2;
    }

    private void maybeExpandData(int i) {
        byte[] bArr = this.f70587j;
        if (bArr.length < i + 16384) {
            this.f70587j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void m19456a(byte[] bArr, int i) throws IOException;

    @Override // p000.uc9.InterfaceC13493e
    public final void cancelLoad() {
        this.f70588k = true;
    }

    public byte[] getDataHolder() {
        return this.f70587j;
    }

    @Override // p000.uc9.InterfaceC13493e
    public final void load() throws IOException {
        try {
            this.f41850i.open(this.f41843b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f70588k) {
                maybeExpandData(i2);
                i = this.f41850i.read(this.f70587j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f70588k) {
                m19456a(this.f70587j, i2);
            }
            wh3.closeQuietly(this.f41850i);
        } catch (Throwable th) {
            wh3.closeQuietly(this.f41850i);
            throw th;
        }
    }
}

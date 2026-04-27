package p000;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class of3 extends fz1 {

    /* JADX INFO: renamed from: l */
    public static final int f67484l = 16384;

    /* JADX INFO: renamed from: j */
    public byte[] f67485j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f67486k;

    public of3(ih3 ih3Var, yh3 yh3Var, int i, kq6 kq6Var, int i2, @hib Object obj, @hib byte[] bArr) {
        of3 of3Var;
        byte[] bArr2;
        super(ih3Var, yh3Var, i, kq6Var, i2, obj, -9223372036854775807L, -9223372036854775807L);
        if (bArr == null) {
            bArr2 = x0i.f95983f;
            of3Var = this;
        } else {
            of3Var = this;
            bArr2 = bArr;
        }
        of3Var.f67485j = bArr2;
    }

    private void maybeExpandData(int i) {
        byte[] bArr = this.f67485j;
        if (bArr.length < i + 16384) {
            this.f67485j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void m18619a(byte[] bArr, int i) throws IOException;

    @Override // p000.vc9.InterfaceC13997e
    public final void cancelLoad() {
        this.f67486k = true;
    }

    public byte[] getDataHolder() {
        return this.f67485j;
    }

    @Override // p000.vc9.InterfaceC13997e
    public final void load() throws IOException {
        try {
            this.f38051i.open(this.f38044b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f67486k) {
                maybeExpandData(i2);
                i = this.f38051i.read(this.f67485j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f67486k) {
                m18619a(this.f67485j, i2);
            }
            vh3.closeQuietly(this.f38051i);
        } catch (Throwable th) {
            vh3.closeQuietly(this.f38051i);
            throw th;
        }
    }
}

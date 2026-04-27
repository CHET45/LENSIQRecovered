package p000;

import java.util.Arrays;
import p000.InterfaceC6430gn;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class mm3 implements InterfaceC6430gn {

    /* JADX INFO: renamed from: h */
    public static final int f61464h = 100;

    /* JADX INFO: renamed from: a */
    public final boolean f61465a;

    /* JADX INFO: renamed from: b */
    public final int f61466b;

    /* JADX INFO: renamed from: c */
    @hib
    public final byte[] f61467c;

    /* JADX INFO: renamed from: d */
    public int f61468d;

    /* JADX INFO: renamed from: e */
    public int f61469e;

    /* JADX INFO: renamed from: f */
    public int f61470f;

    /* JADX INFO: renamed from: g */
    public C4874dn[] f61471g;

    public mm3(boolean z, int i) {
        this(z, i, 0);
    }

    @Override // p000.InterfaceC6430gn
    public synchronized C4874dn allocate() {
        C4874dn c4874dn;
        try {
            this.f61469e++;
            int i = this.f61470f;
            if (i > 0) {
                C4874dn[] c4874dnArr = this.f61471g;
                int i2 = i - 1;
                this.f61470f = i2;
                c4874dn = (C4874dn) u80.checkNotNull(c4874dnArr[i2]);
                this.f61471g[this.f61470f] = null;
            } else {
                c4874dn = new C4874dn(new byte[this.f61466b], 0);
                int i3 = this.f61469e;
                C4874dn[] c4874dnArr2 = this.f61471g;
                if (i3 > c4874dnArr2.length) {
                    this.f61471g = (C4874dn[]) Arrays.copyOf(c4874dnArr2, c4874dnArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c4874dn;
    }

    @Override // p000.InterfaceC6430gn
    public int getIndividualAllocationLength() {
        return this.f61466b;
    }

    @Override // p000.InterfaceC6430gn
    public synchronized int getTotalBytesAllocated() {
        return this.f61469e * this.f61466b;
    }

    @Override // p000.InterfaceC6430gn
    public synchronized void release(C4874dn c4874dn) {
        C4874dn[] c4874dnArr = this.f61471g;
        int i = this.f61470f;
        this.f61470f = i + 1;
        c4874dnArr[i] = c4874dn;
        this.f61469e--;
        notifyAll();
    }

    public synchronized void reset() {
        if (this.f61465a) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i) {
        boolean z = i < this.f61468d;
        this.f61468d = i;
        if (z) {
            trim();
        }
    }

    @Override // p000.InterfaceC6430gn
    public synchronized void trim() {
        try {
            int i = 0;
            int iMax = Math.max(0, x0i.ceilDivide(this.f61468d, this.f61466b) - this.f61469e);
            int i2 = this.f61470f;
            if (iMax >= i2) {
                return;
            }
            if (this.f61467c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    C4874dn c4874dn = (C4874dn) u80.checkNotNull(this.f61471g[i]);
                    if (c4874dn.f30167a == this.f61467c) {
                        i++;
                    } else {
                        C4874dn c4874dn2 = (C4874dn) u80.checkNotNull(this.f61471g[i3]);
                        if (c4874dn2.f30167a != this.f61467c) {
                            i3--;
                        } else {
                            C4874dn[] c4874dnArr = this.f61471g;
                            c4874dnArr[i] = c4874dn2;
                            c4874dnArr[i3] = c4874dn;
                            i3--;
                            i++;
                        }
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.f61470f) {
                    return;
                }
            }
            Arrays.fill(this.f61471g, iMax, this.f61470f, (Object) null);
            this.f61470f = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    public mm3(boolean z, int i, int i2) {
        u80.checkArgument(i > 0);
        u80.checkArgument(i2 >= 0);
        this.f61465a = z;
        this.f61466b = i;
        this.f61470f = i2;
        this.f61471g = new C4874dn[i2 + 100];
        if (i2 <= 0) {
            this.f61467c = null;
            return;
        }
        this.f61467c = new byte[i2 * i];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f61471g[i3] = new C4874dn(this.f61467c, i3 * i);
        }
    }

    @Override // p000.InterfaceC6430gn
    public synchronized void release(@hib InterfaceC6430gn.a aVar) {
        while (aVar != null) {
            try {
                C4874dn[] c4874dnArr = this.f61471g;
                int i = this.f61470f;
                this.f61470f = i + 1;
                c4874dnArr[i] = aVar.getAllocation();
                this.f61469e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }
}

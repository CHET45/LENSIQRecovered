package p000;

import java.util.Arrays;
import p000.InterfaceC5892fn;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class nm3 implements InterfaceC5892fn {

    /* JADX INFO: renamed from: h */
    public static final int f64977h = 100;

    /* JADX INFO: renamed from: a */
    public final boolean f64978a;

    /* JADX INFO: renamed from: b */
    public final int f64979b;

    /* JADX INFO: renamed from: c */
    @hib
    public final byte[] f64980c;

    /* JADX INFO: renamed from: d */
    public int f64981d;

    /* JADX INFO: renamed from: e */
    public int f64982e;

    /* JADX INFO: renamed from: f */
    public int f64983f;

    /* JADX INFO: renamed from: g */
    public C5399en[] f64984g;

    public nm3(boolean z, int i) {
        this(z, i, 0);
    }

    @Override // p000.InterfaceC5892fn
    public synchronized C5399en allocate() {
        C5399en c5399en;
        try {
            this.f64982e++;
            int i = this.f64983f;
            if (i > 0) {
                C5399en[] c5399enArr = this.f64984g;
                int i2 = i - 1;
                this.f64983f = i2;
                c5399en = (C5399en) v80.checkNotNull(c5399enArr[i2]);
                this.f64984g[this.f64983f] = null;
            } else {
                c5399en = new C5399en(new byte[this.f64979b], 0);
                int i3 = this.f64982e;
                C5399en[] c5399enArr2 = this.f64984g;
                if (i3 > c5399enArr2.length) {
                    this.f64984g = (C5399en[]) Arrays.copyOf(c5399enArr2, c5399enArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c5399en;
    }

    @Override // p000.InterfaceC5892fn
    public int getIndividualAllocationLength() {
        return this.f64979b;
    }

    @Override // p000.InterfaceC5892fn
    public synchronized int getTotalBytesAllocated() {
        return this.f64982e * this.f64979b;
    }

    @Override // p000.InterfaceC5892fn
    public synchronized void release(C5399en c5399en) {
        C5399en[] c5399enArr = this.f64984g;
        int i = this.f64983f;
        this.f64983f = i + 1;
        c5399enArr[i] = c5399en;
        this.f64982e--;
        notifyAll();
    }

    public synchronized void reset() {
        if (this.f64978a) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i) {
        boolean z = i < this.f64981d;
        this.f64981d = i;
        if (z) {
            trim();
        }
    }

    @Override // p000.InterfaceC5892fn
    public synchronized void trim() {
        try {
            int i = 0;
            int iMax = Math.max(0, t0i.ceilDivide(this.f64981d, this.f64979b) - this.f64982e);
            int i2 = this.f64983f;
            if (iMax >= i2) {
                return;
            }
            if (this.f64980c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    C5399en c5399en = (C5399en) v80.checkNotNull(this.f64984g[i]);
                    if (c5399en.f33561a == this.f64980c) {
                        i++;
                    } else {
                        C5399en c5399en2 = (C5399en) v80.checkNotNull(this.f64984g[i3]);
                        if (c5399en2.f33561a != this.f64980c) {
                            i3--;
                        } else {
                            C5399en[] c5399enArr = this.f64984g;
                            c5399enArr[i] = c5399en2;
                            c5399enArr[i3] = c5399en;
                            i3--;
                            i++;
                        }
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.f64983f) {
                    return;
                }
            }
            Arrays.fill(this.f64984g, iMax, this.f64983f, (Object) null);
            this.f64983f = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    public nm3(boolean z, int i, int i2) {
        v80.checkArgument(i > 0);
        v80.checkArgument(i2 >= 0);
        this.f64978a = z;
        this.f64979b = i;
        this.f64983f = i2;
        this.f64984g = new C5399en[i2 + 100];
        if (i2 <= 0) {
            this.f64980c = null;
            return;
        }
        this.f64980c = new byte[i2 * i];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f64984g[i3] = new C5399en(this.f64980c, i3 * i);
        }
    }

    @Override // p000.InterfaceC5892fn
    public synchronized void release(@hib InterfaceC5892fn.a aVar) {
        while (aVar != null) {
            try {
                C5399en[] c5399enArr = this.f64984g;
                int i = this.f64983f;
                this.f64983f = i + 1;
                c5399enArr[i] = aVar.getAllocation();
                this.f64982e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }
}

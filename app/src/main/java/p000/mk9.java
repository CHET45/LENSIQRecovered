package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p000.cag;

/* JADX INFO: loaded from: classes5.dex */
@xx4
public final class mk9 extends cag implements Serializable, ik9 {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {
        s.defaultReadObject();
        this.f16126c = 0;
        this.f16124a = null;
        this.f16125b = s.readLong();
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeLong(sum());
    }

    @Override // p000.ik9
    public void add(long x) {
        int length;
        cag.C2256b c2256b;
        cag.C2256b[] c2256bArr = this.f16124a;
        if (c2256bArr == null) {
            long j = this.f16125b;
            if (m3877b(j, j + x)) {
                return;
            }
        }
        int[] iArr = cag.f16120d.get();
        boolean zM3882a = true;
        if (iArr != null && c2256bArr != null && (length = c2256bArr.length) >= 1 && (c2256b = c2256bArr[(length - 1) & iArr[0]]) != null) {
            long j2 = c2256b.f16136h;
            zM3882a = c2256b.m3882a(j2, j2 + x);
            if (zM3882a) {
                return;
            }
        }
        m3881f(x, iArr, zM3882a);
    }

    @Override // p000.cag
    /* JADX INFO: renamed from: d */
    public final long mo3879d(long v, long x) {
        return v + x;
    }

    public void decrement() {
        add(-1L);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return sum();
    }

    @Override // p000.ik9
    public void increment() {
        add(1L);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    public void reset() {
        m3880e(0L);
    }

    @Override // p000.ik9
    public long sum() {
        long j = this.f16125b;
        cag.C2256b[] c2256bArr = this.f16124a;
        if (c2256bArr != null) {
            for (cag.C2256b c2256b : c2256bArr) {
                if (c2256b != null) {
                    j += c2256b.f16136h;
                }
            }
        }
        return j;
    }

    public long sumThenReset() {
        long j = this.f16125b;
        cag.C2256b[] c2256bArr = this.f16124a;
        this.f16125b = 0L;
        if (c2256bArr != null) {
            for (cag.C2256b c2256b : c2256bArr) {
                if (c2256b != null) {
                    j += c2256b.f16136h;
                    c2256b.f16136h = 0L;
                }
            }
        }
        return j;
    }

    public String toString() {
        return Long.toString(sum());
    }
}

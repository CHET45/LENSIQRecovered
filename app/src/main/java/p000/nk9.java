package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p000.dag;

/* JADX INFO: loaded from: classes5.dex */
@sx4
@gd7(emulated = true)
public final class nk9 extends dag implements Serializable, jk9 {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {
        s.defaultReadObject();
        this.f29121c = 0;
        this.f29119a = null;
        this.f29120b = s.readLong();
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeLong(sum());
    }

    @Override // p000.jk9
    public void add(long x) {
        int length;
        dag.C4712b c4712b;
        dag.C4712b[] c4712bArr = this.f29119a;
        if (c4712bArr == null) {
            long j = this.f29120b;
            if (m9035b(j, j + x)) {
                return;
            }
        }
        int[] iArr = dag.f29115d.get();
        boolean zM9040a = true;
        if (iArr != null && c4712bArr != null && (length = c4712bArr.length) >= 1 && (c4712b = c4712bArr[(length - 1) & iArr[0]]) != null) {
            long j2 = c4712b.f29131h;
            zM9040a = c4712b.m9040a(j2, j2 + x);
            if (zM9040a) {
                return;
            }
        }
        m9039f(x, iArr, zM9040a);
    }

    @Override // p000.dag
    /* JADX INFO: renamed from: d */
    public final long mo9037d(long v, long x) {
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

    @Override // p000.jk9
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
        m9038e(0L);
    }

    @Override // p000.jk9
    public long sum() {
        long j = this.f29120b;
        dag.C4712b[] c4712bArr = this.f29119a;
        if (c4712bArr != null) {
            for (dag.C4712b c4712b : c4712bArr) {
                if (c4712b != null) {
                    j += c4712b.f29131h;
                }
            }
        }
        return j;
    }

    public long sumThenReset() {
        long j = this.f29120b;
        dag.C4712b[] c4712bArr = this.f29119a;
        this.f29120b = 0L;
        if (c4712bArr != null) {
            for (dag.C4712b c4712b : c4712bArr) {
                if (c4712b != null) {
                    j += c4712b.f29131h;
                    c4712b.f29131h = 0L;
                }
            }
        }
        return j;
    }

    public String toString() {
        return Long.toString(sum());
    }
}

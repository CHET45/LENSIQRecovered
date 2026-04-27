package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;
import okhttp3.HttpUrl;
import p000.nx7;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public class qb0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public transient AtomicLongArray f73798a;

    public qb0(int length) {
        this.f73798a = new AtomicLongArray(length);
    }

    private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {
        s.defaultReadObject();
        int i = s.readInt();
        nx7.C10103c c10103cBuilder = nx7.builder();
        for (int i2 = 0; i2 < i; i2++) {
            c10103cBuilder.add(Double.doubleToRawLongBits(s.readDouble()));
        }
        this.f73798a = new AtomicLongArray(c10103cBuilder.build().toArray());
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        int length = length();
        s.writeInt(length);
        for (int i = 0; i < length; i++) {
            s.writeDouble(get(i));
        }
    }

    @op1
    public double addAndGet(int i, double delta) {
        long j;
        double dLongBitsToDouble;
        do {
            j = this.f73798a.get(i);
            dLongBitsToDouble = Double.longBitsToDouble(j) + delta;
        } while (!this.f73798a.compareAndSet(i, j, Double.doubleToRawLongBits(dLongBitsToDouble)));
        return dLongBitsToDouble;
    }

    public final boolean compareAndSet(int i, double expect, double update) {
        return this.f73798a.compareAndSet(i, Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public final double get(int i) {
        return Double.longBitsToDouble(this.f73798a.get(i));
    }

    @op1
    public final double getAndAdd(int i, double delta) {
        long j;
        double dLongBitsToDouble;
        do {
            j = this.f73798a.get(i);
            dLongBitsToDouble = Double.longBitsToDouble(j);
        } while (!this.f73798a.compareAndSet(i, j, Double.doubleToRawLongBits(dLongBitsToDouble + delta)));
        return dLongBitsToDouble;
    }

    public final double getAndSet(int i, double newValue) {
        return Double.longBitsToDouble(this.f73798a.getAndSet(i, Double.doubleToRawLongBits(newValue)));
    }

    public final void lazySet(int i, double newValue) {
        this.f73798a.lazySet(i, Double.doubleToRawLongBits(newValue));
    }

    public final int length() {
        return this.f73798a.length();
    }

    public final void set(int i, double newValue) {
        this.f73798a.set(i, Double.doubleToRawLongBits(newValue));
    }

    public String toString() {
        int length = length();
        int i = length - 1;
        if (i == -1) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(length * 19);
        sb.append(C4584d2.f28242k);
        int i2 = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.f73798a.get(i2)));
            if (i2 == i) {
                sb.append(C4584d2.f28243l);
                return sb.toString();
            }
            sb.append(C4584d2.f28238g);
            sb.append(' ');
            i2++;
        }
    }

    public final boolean weakCompareAndSet(int i, double expect, double update) {
        return this.f73798a.weakCompareAndSet(i, Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public qb0(double[] array) {
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = Double.doubleToRawLongBits(array[i]);
        }
        this.f73798a = new AtomicLongArray(jArr);
    }
}

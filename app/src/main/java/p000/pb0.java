package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
@qx4
public class pb0 extends Number implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public transient AtomicLong f70201a;

    public pb0(double initialValue) {
        this.f70201a = new AtomicLong(Double.doubleToRawLongBits(initialValue));
    }

    private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {
        s.defaultReadObject();
        this.f70201a = new AtomicLong();
        set(s.readDouble());
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeDouble(get());
    }

    @op1
    public final double addAndGet(double delta) {
        long j;
        double dLongBitsToDouble;
        do {
            j = this.f70201a.get();
            dLongBitsToDouble = Double.longBitsToDouble(j) + delta;
        } while (!this.f70201a.compareAndSet(j, Double.doubleToRawLongBits(dLongBitsToDouble)));
        return dLongBitsToDouble;
    }

    public final boolean compareAndSet(double expect, double update) {
        return this.f70201a.compareAndSet(Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return get();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) get();
    }

    public final double get() {
        return Double.longBitsToDouble(this.f70201a.get());
    }

    @op1
    public final double getAndAdd(double delta) {
        long j;
        double dLongBitsToDouble;
        do {
            j = this.f70201a.get();
            dLongBitsToDouble = Double.longBitsToDouble(j);
        } while (!this.f70201a.compareAndSet(j, Double.doubleToRawLongBits(dLongBitsToDouble + delta)));
        return dLongBitsToDouble;
    }

    public final double getAndSet(double newValue) {
        return Double.longBitsToDouble(this.f70201a.getAndSet(Double.doubleToRawLongBits(newValue)));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) get();
    }

    public final void lazySet(double newValue) {
        this.f70201a.lazySet(Double.doubleToRawLongBits(newValue));
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) get();
    }

    public final void set(double newValue) {
        this.f70201a.set(Double.doubleToRawLongBits(newValue));
    }

    public String toString() {
        return Double.toString(get());
    }

    public final boolean weakCompareAndSet(double expect, double update) {
        return this.f70201a.weakCompareAndSet(Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public pb0() {
        this(0.0d);
    }
}

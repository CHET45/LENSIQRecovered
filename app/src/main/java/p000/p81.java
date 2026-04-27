package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import p000.u81;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@w01
public final class p81<T> implements l8d<T>, Serializable {

    /* JADX INFO: renamed from: a */
    public final u81.C13398c f69949a;

    /* JADX INFO: renamed from: b */
    public final int f69950b;

    /* JADX INFO: renamed from: c */
    public final s07<? super T> f69951c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC10832c f69952d;

    /* JADX INFO: renamed from: p81$b */
    public static class C10831b<T> implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a */
        public final long[] f69953a;

        /* JADX INFO: renamed from: b */
        public final int f69954b;

        /* JADX INFO: renamed from: c */
        public final s07<? super T> f69955c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC10832c f69956d;

        public C10831b(p81<T> bf) {
            this.f69953a = u81.C13398c.toPlainArray(bf.f69949a.f87033a);
            this.f69954b = bf.f69950b;
            this.f69955c = bf.f69951c;
            this.f69956d = bf.f69952d;
        }

        public Object readResolve() {
            return new p81(new u81.C13398c(this.f69953a), this.f69954b, this.f69955c, this.f69956d);
        }
    }

    /* JADX INFO: renamed from: p81$c */
    public interface InterfaceC10832c extends Serializable {
        <T> boolean mightContain(@hgc T object, s07<? super T> funnel, int numHashFunctions, u81.C13398c bits);

        int ordinal();

        <T> boolean put(@hgc T object, s07<? super T> funnel, int numHashFunctions, u81.C13398c bits);
    }

    public static <T> p81<T> create(s07<? super T> funnel, int expectedInsertions, double fpp) {
        return create(funnel, expectedInsertions, fpp);
    }

    @gdi
    /* JADX INFO: renamed from: f */
    public static <T> p81<T> m19325f(s07<? super T> funnel, long expectedInsertions, double fpp, InterfaceC10832c strategy) {
        v7d.checkNotNull(funnel);
        v7d.checkArgument(expectedInsertions >= 0, "Expected insertions (%s) must be >= 0", expectedInsertions);
        v7d.checkArgument(fpp > 0.0d, "False positive probability (%s) must be > 0.0", Double.valueOf(fpp));
        v7d.checkArgument(fpp < 1.0d, "False positive probability (%s) must be < 1.0", Double.valueOf(fpp));
        v7d.checkNotNull(strategy);
        if (expectedInsertions == 0) {
            expectedInsertions = 1;
        }
        long jM19326g = m19326g(expectedInsertions, fpp);
        try {
            return new p81<>(new u81.C13398c(jM19326g), m19327h(expectedInsertions, jM19326g), funnel, strategy);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Could not create BloomFilter of " + jM19326g + " bits", e);
        }
    }

    @gdi
    /* JADX INFO: renamed from: g */
    public static long m19326g(long n, double p) {
        if (p == 0.0d) {
            p = Double.MIN_VALUE;
        }
        return (long) (((-n) * Math.log(p)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    @gdi
    /* JADX INFO: renamed from: h */
    public static int m19327h(long n, long m) {
        return Math.max(1, (int) Math.round((m / n) * Math.log(2.0d)));
    }

    public static <T> p81<T> readFrom(InputStream in, s07<? super T> funnel) throws IOException {
        int i;
        int i2;
        DataInputStream dataInputStream;
        byte b;
        v7d.checkNotNull(in, "InputStream");
        v7d.checkNotNull(funnel, "Funnel");
        int i3 = -1;
        try {
            dataInputStream = new DataInputStream(in);
            b = dataInputStream.readByte();
            try {
                i2 = hvh.toInt(dataInputStream.readByte());
            } catch (RuntimeException e) {
                e = e;
                i2 = -1;
                i3 = b;
                i = -1;
            }
        } catch (RuntimeException e2) {
            e = e2;
            i = -1;
            i2 = -1;
        }
        try {
            i3 = dataInputStream.readInt();
            u81 u81Var = u81.values()[b];
            u81.C13398c c13398c = new u81.C13398c(nl9.checkedMultiply(i3, 64L));
            for (int i4 = 0; i4 < i3; i4++) {
                c13398c.m23133g(i4, dataInputStream.readLong());
            }
            return new p81<>(c13398c, i2, funnel, u81Var);
        } catch (RuntimeException e3) {
            e = e3;
            int i5 = i3;
            i3 = b;
            i = i5;
            throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + i3 + " numHashFunctions: " + i2 + " dataLength: " + i, e);
        }
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new C10831b(this);
    }

    @Override // p000.l8d
    @Deprecated
    public boolean apply(@hgc T input) {
        return mightContain(input);
    }

    public long approximateElementCount() {
        double dM23128b = this.f69949a.m23128b();
        return dk4.roundToLong(((-Math.log1p(-(this.f69949a.m23127a() / dM23128b))) * dM23128b) / ((double) this.f69950b), RoundingMode.HALF_UP);
    }

    public p81<T> copy() {
        return new p81<>(this.f69949a.m23129c(), this.f69950b, this.f69951c, this.f69952d);
    }

    @gdi
    /* JADX INFO: renamed from: e */
    public long m19328e() {
        return this.f69949a.m23128b();
    }

    @Override // p000.l8d
    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof p81)) {
            return false;
        }
        p81 p81Var = (p81) object;
        return this.f69950b == p81Var.f69950b && this.f69951c.equals(p81Var.f69951c) && this.f69949a.equals(p81Var.f69949a) && this.f69952d.equals(p81Var.f69952d);
    }

    public double expectedFpp() {
        return Math.pow(this.f69949a.m23127a() / m19328e(), this.f69950b);
    }

    public int hashCode() {
        return okb.hashCode(Integer.valueOf(this.f69950b), this.f69951c, this.f69952d, this.f69949a);
    }

    public boolean isCompatible(p81<T> that) {
        v7d.checkNotNull(that);
        return this != that && this.f69950b == that.f69950b && m19328e() == that.m19328e() && this.f69952d.equals(that.f69952d) && this.f69951c.equals(that.f69951c);
    }

    public boolean mightContain(@hgc T object) {
        return this.f69952d.mightContain(object, this.f69951c, this.f69950b, this.f69949a);
    }

    @op1
    public boolean put(@hgc T object) {
        return this.f69952d.put(object, this.f69951c, this.f69950b, this.f69949a);
    }

    public void putAll(p81<T> that) {
        v7d.checkNotNull(that);
        v7d.checkArgument(this != that, "Cannot combine a BloomFilter with itself.");
        int i = this.f69950b;
        int i2 = that.f69950b;
        v7d.checkArgument(i == i2, "BloomFilters must have the same number of hash functions (%s != %s)", i, i2);
        v7d.checkArgument(m19328e() == that.m19328e(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", m19328e(), that.m19328e());
        v7d.checkArgument(this.f69952d.equals(that.f69952d), "BloomFilters must have equal strategies (%s != %s)", this.f69952d, that.f69952d);
        v7d.checkArgument(this.f69951c.equals(that.f69951c), "BloomFilters must have equal funnels (%s != %s)", this.f69951c, that.f69951c);
        this.f69949a.m23132f(that.f69949a);
    }

    public void writeTo(OutputStream out) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(out);
        dataOutputStream.writeByte(hcf.checkedCast(this.f69952d.ordinal()));
        dataOutputStream.writeByte(hvh.checkedCast(this.f69950b));
        dataOutputStream.writeInt(this.f69949a.f87033a.length());
        for (int i = 0; i < this.f69949a.f87033a.length(); i++) {
            dataOutputStream.writeLong(this.f69949a.f87033a.get(i));
        }
    }

    private p81(u81.C13398c bits, int numHashFunctions, s07<? super T> funnel, InterfaceC10832c strategy) {
        v7d.checkArgument(numHashFunctions > 0, "numHashFunctions (%s) must be > 0", numHashFunctions);
        v7d.checkArgument(numHashFunctions <= 255, "numHashFunctions (%s) must be <= 255", numHashFunctions);
        this.f69949a = (u81.C13398c) v7d.checkNotNull(bits);
        this.f69950b = numHashFunctions;
        this.f69951c = (s07) v7d.checkNotNull(funnel);
        this.f69952d = (InterfaceC10832c) v7d.checkNotNull(strategy);
    }

    public static <T> p81<T> create(s07<? super T> funnel, long expectedInsertions, double fpp) {
        return m19325f(funnel, expectedInsertions, fpp, u81.f87030b);
    }

    public static <T> p81<T> create(s07<? super T> funnel, int expectedInsertions) {
        return create(funnel, expectedInsertions);
    }

    public static <T> p81<T> create(s07<? super T> funnel, long expectedInsertions) {
        return create(funnel, expectedInsertions, 0.03d);
    }
}

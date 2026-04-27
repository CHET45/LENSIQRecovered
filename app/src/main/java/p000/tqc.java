package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class tqc {

    /* JADX INFO: renamed from: tqc$a */
    public static final class C13165a<K, V> implements InterfaceC13168d<K, V> {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ boolean f85610c = false;

        /* JADX INFO: renamed from: a */
        public final K[] f85611a;

        /* JADX INFO: renamed from: b */
        public final V[] f85612b;

        public C13165a(K k, V v, K k2, V v2) {
            this(new Object[]{k, k2}, new Object[]{v, v2});
        }

        private int indexOfKey(K k) {
            int i = 0;
            while (true) {
                K[] kArr = this.f85611a;
                if (i >= kArr.length) {
                    return -1;
                }
                if (kArr[i] == k) {
                    return i;
                }
                i++;
            }
        }

        @Override // p000.tqc.InterfaceC13168d
        public V get(K k, int i, int i2) {
            int i3 = 0;
            while (true) {
                K[] kArr = this.f85611a;
                if (i3 >= kArr.length) {
                    return null;
                }
                if (kArr[i3] == k) {
                    return this.f85612b[i3];
                }
                i3++;
            }
        }

        @Override // p000.tqc.InterfaceC13168d
        public InterfaceC13168d<K, V> put(K k, V v, int i, int i2) {
            int iHashCode = this.f85611a[0].hashCode();
            if (iHashCode != i) {
                return C13166b.m22751a(new C13167c(k, v), i, this, iHashCode, i2);
            }
            int iIndexOfKey = indexOfKey(k);
            if (iIndexOfKey != -1) {
                K[] kArr = this.f85611a;
                Object[] objArrCopyOf = Arrays.copyOf(kArr, kArr.length);
                Object[] objArrCopyOf2 = Arrays.copyOf(this.f85612b, this.f85611a.length);
                objArrCopyOf[iIndexOfKey] = k;
                objArrCopyOf2[iIndexOfKey] = v;
                return new C13165a(objArrCopyOf, objArrCopyOf2);
            }
            K[] kArr2 = this.f85611a;
            Object[] objArrCopyOf3 = Arrays.copyOf(kArr2, kArr2.length + 1);
            Object[] objArrCopyOf4 = Arrays.copyOf(this.f85612b, this.f85611a.length + 1);
            K[] kArr3 = this.f85611a;
            objArrCopyOf3[kArr3.length] = k;
            objArrCopyOf4[kArr3.length] = v;
            return new C13165a(objArrCopyOf3, objArrCopyOf4);
        }

        @Override // p000.tqc.InterfaceC13168d
        public int size() {
            return this.f85612b.length;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CollisionLeaf(");
            for (int i = 0; i < this.f85612b.length; i++) {
                sb.append("(key=");
                sb.append(this.f85611a[i]);
                sb.append(" value=");
                sb.append(this.f85612b[i]);
                sb.append(") ");
            }
            sb.append(c0b.f15434d);
            return sb.toString();
        }

        private C13165a(K[] kArr, V[] vArr) {
            this.f85611a = kArr;
            this.f85612b = vArr;
        }
    }

    /* JADX INFO: renamed from: tqc$b */
    public static final class C13166b<K, V> implements InterfaceC13168d<K, V> {

        /* JADX INFO: renamed from: d */
        public static final int f85613d = 5;

        /* JADX INFO: renamed from: e */
        public static final int f85614e = 31;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ boolean f85615f = false;

        /* JADX INFO: renamed from: a */
        public final int f85616a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC13168d<K, V>[] f85617b;

        /* JADX INFO: renamed from: c */
        public final int f85618c;

        private C13166b(int i, InterfaceC13168d<K, V>[] interfaceC13168dArr, int i2) {
            this.f85616a = i;
            this.f85617b = interfaceC13168dArr;
            this.f85618c = i2;
        }

        /* JADX INFO: renamed from: a */
        public static <K, V> InterfaceC13168d<K, V> m22751a(InterfaceC13168d<K, V> interfaceC13168d, int i, InterfaceC13168d<K, V> interfaceC13168d2, int i2, int i3) {
            int iIndexBit = indexBit(i, i3);
            int iIndexBit2 = indexBit(i2, i3);
            if (iIndexBit == iIndexBit2) {
                InterfaceC13168d interfaceC13168dM22751a = m22751a(interfaceC13168d, i, interfaceC13168d2, i2, i3 + 5);
                return new C13166b(iIndexBit, new InterfaceC13168d[]{interfaceC13168dM22751a}, interfaceC13168dM22751a.size());
            }
            if (uncompressedIndex(i, i3) > uncompressedIndex(i2, i3)) {
                interfaceC13168d2 = interfaceC13168d;
                interfaceC13168d = interfaceC13168d2;
            }
            return new C13166b(iIndexBit | iIndexBit2, new InterfaceC13168d[]{interfaceC13168d, interfaceC13168d2}, interfaceC13168d.size() + interfaceC13168d2.size());
        }

        private int compressedIndex(int i) {
            return Integer.bitCount((i - 1) & this.f85616a);
        }

        private static int indexBit(int i, int i2) {
            return 1 << uncompressedIndex(i, i2);
        }

        private static int uncompressedIndex(int i, int i2) {
            return (i >>> i2) & 31;
        }

        @Override // p000.tqc.InterfaceC13168d
        public V get(K k, int i, int i2) {
            int iIndexBit = indexBit(i, i2);
            if ((this.f85616a & iIndexBit) == 0) {
                return null;
            }
            return this.f85617b[compressedIndex(iIndexBit)].get(k, i, i2 + 5);
        }

        @Override // p000.tqc.InterfaceC13168d
        public InterfaceC13168d<K, V> put(K k, V v, int i, int i2) {
            int iIndexBit = indexBit(i, i2);
            int iCompressedIndex = compressedIndex(iIndexBit);
            int i3 = this.f85616a;
            if ((i3 & iIndexBit) != 0) {
                InterfaceC13168d<K, V>[] interfaceC13168dArr = this.f85617b;
                InterfaceC13168d[] interfaceC13168dArr2 = (InterfaceC13168d[]) Arrays.copyOf(interfaceC13168dArr, interfaceC13168dArr.length);
                interfaceC13168dArr2[iCompressedIndex] = this.f85617b[iCompressedIndex].put(k, v, i, i2 + 5);
                return new C13166b(this.f85616a, interfaceC13168dArr2, (size() + interfaceC13168dArr2[iCompressedIndex].size()) - this.f85617b[iCompressedIndex].size());
            }
            int i4 = i3 | iIndexBit;
            InterfaceC13168d<K, V>[] interfaceC13168dArr3 = this.f85617b;
            InterfaceC13168d[] interfaceC13168dArr4 = new InterfaceC13168d[interfaceC13168dArr3.length + 1];
            System.arraycopy(interfaceC13168dArr3, 0, interfaceC13168dArr4, 0, iCompressedIndex);
            interfaceC13168dArr4[iCompressedIndex] = new C13167c(k, v);
            InterfaceC13168d<K, V>[] interfaceC13168dArr5 = this.f85617b;
            System.arraycopy(interfaceC13168dArr5, iCompressedIndex, interfaceC13168dArr4, iCompressedIndex + 1, interfaceC13168dArr5.length - iCompressedIndex);
            return new C13166b(i4, interfaceC13168dArr4, size() + 1);
        }

        @Override // p000.tqc.InterfaceC13168d
        public int size() {
            return this.f85618c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CompressedIndex(");
            sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.f85616a)));
            for (InterfaceC13168d<K, V> interfaceC13168d : this.f85617b) {
                sb.append(interfaceC13168d);
                sb.append(C2473f.f17566z);
            }
            sb.append(c0b.f15434d);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: tqc$c */
    public static final class C13167c<K, V> implements InterfaceC13168d<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f85619a;

        /* JADX INFO: renamed from: b */
        public final V f85620b;

        public C13167c(K k, V v) {
            this.f85619a = k;
            this.f85620b = v;
        }

        @Override // p000.tqc.InterfaceC13168d
        public V get(K k, int i, int i2) {
            if (this.f85619a == k) {
                return this.f85620b;
            }
            return null;
        }

        @Override // p000.tqc.InterfaceC13168d
        public InterfaceC13168d<K, V> put(K k, V v, int i, int i2) {
            int iHashCode = this.f85619a.hashCode();
            return iHashCode != i ? C13166b.m22751a(new C13167c(k, v), i, this, iHashCode, i2) : this.f85619a == k ? new C13167c(k, v) : new C13165a(this.f85619a, this.f85620b, k, v);
        }

        @Override // p000.tqc.InterfaceC13168d
        public int size() {
            return 1;
        }

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", this.f85619a, this.f85620b);
        }
    }

    /* JADX INFO: renamed from: tqc$d */
    public interface InterfaceC13168d<K, V> {
        V get(K k, int i, int i2);

        InterfaceC13168d<K, V> put(K k, V v, int i, int i2);

        int size();
    }

    private tqc() {
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> V m22749a(InterfaceC13168d<K, V> interfaceC13168d, K k) {
        if (interfaceC13168d == null) {
            return null;
        }
        return interfaceC13168d.get(k, k.hashCode(), 0);
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> InterfaceC13168d<K, V> m22750b(InterfaceC13168d<K, V> interfaceC13168d, K k, V v) {
        return interfaceC13168d == null ? new C13167c(k, v) : interfaceC13168d.put(k, v, k.hashCode(), 0);
    }
}

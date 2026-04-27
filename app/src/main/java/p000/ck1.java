package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ox4
public final class ck1 {

    /* JADX INFO: renamed from: ck1$a */
    @gd7
    public static class C2340a extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final byte[] f16795a;

        /* JADX INFO: renamed from: b */
        public final int f16796b;

        /* JADX INFO: renamed from: c */
        public final int f16797c;

        public C2340a(byte[] array) {
            this(array, 0, array.length);
        }

        /* JADX INFO: renamed from: a */
        public byte[] m4008a() {
            return Arrays.copyOfRange(this.f16795a, this.f16796b, this.f16797c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@wx1 Object target) {
            return (target instanceof Byte) && ck1.indexOf(this.f16795a, ((Byte) target).byteValue(), this.f16796b, this.f16797c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@wx1 Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof C2340a)) {
                return super.equals(object);
            }
            C2340a c2340a = (C2340a) object;
            int size = size();
            if (c2340a.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f16795a[this.f16796b + i] != c2340a.f16795a[c2340a.f16796b + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i = this.f16796b; i < this.f16797c; i++) {
                iHashCode = (iHashCode * 31) + ck1.hashCode(this.f16795a[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@wx1 Object target) {
            int iIndexOf;
            if (!(target instanceof Byte) || (iIndexOf = ck1.indexOf(this.f16795a, ((Byte) target).byteValue(), this.f16796b, this.f16797c)) < 0) {
                return -1;
            }
            return iIndexOf - this.f16796b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@wx1 Object target) {
            int iLastIndexOf;
            if (!(target instanceof Byte) || (iLastIndexOf = ck1.lastIndexOf(this.f16795a, ((Byte) target).byteValue(), this.f16796b, this.f16797c)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.f16796b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f16797c - this.f16796b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int fromIndex, int toIndex) {
            v7d.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.emptyList();
            }
            byte[] bArr = this.f16795a;
            int i = this.f16796b;
            return new C2340a(bArr, fromIndex + i, i + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append(C4584d2.f28242k);
            sb.append((int) this.f16795a[this.f16796b]);
            int i = this.f16796b;
            while (true) {
                i++;
                if (i >= this.f16797c) {
                    sb.append(C4584d2.f28243l);
                    return sb.toString();
                }
                sb.append(", ");
                sb.append((int) this.f16795a[i]);
            }
        }

        public C2340a(byte[] array, int start, int end) {
            this.f16795a = array;
            this.f16796b = start;
            this.f16797c = end;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte get(int index) {
            v7d.checkElementIndex(index, size());
            return Byte.valueOf(this.f16795a[this.f16796b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte set(int index, Byte element) {
            v7d.checkElementIndex(index, size());
            byte[] bArr = this.f16795a;
            int i = this.f16796b;
            byte b = bArr[i + index];
            bArr[i + index] = ((Byte) v7d.checkNotNull(element)).byteValue();
            return Byte.valueOf(b);
        }
    }

    private ck1() {
    }

    public static List<Byte> asList(byte... backingArray) {
        return backingArray.length == 0 ? Collections.emptyList() : new C2340a(backingArray);
    }

    public static byte[] concat(byte[]... arrays) {
        int length = 0;
        for (byte[] bArr : arrays) {
            length += bArr.length;
        }
        byte[] bArr2 = new byte[length];
        int length2 = 0;
        for (byte[] bArr3 : arrays) {
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        return bArr2;
    }

    public static boolean contains(byte[] array, byte target) {
        for (byte b : array) {
            if (b == target) {
                return true;
            }
        }
        return false;
    }

    public static byte[] ensureCapacity(byte[] array, int minLength, int padding) {
        v7d.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        v7d.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static int hashCode(byte value) {
        return value;
    }

    public static int indexOf(byte[] array, byte target) {
        return indexOf(array, target, 0, array.length);
    }

    public static int lastIndexOf(byte[] array, byte target) {
        return lastIndexOf(array, target, 0, array.length);
    }

    public static void reverse(byte[] array) {
        v7d.checkNotNull(array);
        reverse(array, 0, array.length);
    }

    public static void rotate(byte[] array, int distance) {
        rotate(array, distance, 0, array.length);
    }

    public static byte[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof C2340a) {
            return ((C2340a) collection).m4008a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = ((Number) v7d.checkNotNull(array[i])).byteValue();
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(byte[] array, byte target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(byte[] array, byte target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void rotate(byte[] array, int distance, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        if (array.length <= 1) {
            return;
        }
        int i = toIndex - fromIndex;
        int i2 = (-distance) % i;
        if (i2 < 0) {
            i2 += i;
        }
        int i3 = i2 + fromIndex;
        if (i3 == fromIndex) {
            return;
        }
        reverse(array, fromIndex, i3);
        reverse(array, i3, toIndex);
        reverse(array, fromIndex, toIndex);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(byte[] r5, byte[] r6) {
        /*
            java.lang.String r0 = "array"
            p000.v7d.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            p000.v7d.checkNotNull(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2a
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L29
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            if (r3 == r4) goto L26
            int r0 = r0 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r0
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ck1.indexOf(byte[], byte[]):int");
    }

    public static void reverse(byte[] array, int fromIndex, int toIndex) {
        v7d.checkNotNull(array);
        v7d.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = toIndex - 1; fromIndex < i; i--) {
            byte b = array[fromIndex];
            array[fromIndex] = array[i];
            array[i] = b;
            fromIndex++;
        }
    }
}

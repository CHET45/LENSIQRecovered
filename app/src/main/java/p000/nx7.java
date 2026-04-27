package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tw7
@ox4
public final class nx7 implements Serializable {

    /* JADX INFO: renamed from: d */
    public static final nx7 f65949d = new nx7(new long[0]);

    /* JADX INFO: renamed from: a */
    public final long[] f65950a;

    /* JADX INFO: renamed from: b */
    public final transient int f65951b;

    /* JADX INFO: renamed from: c */
    public final int f65952c;

    /* JADX INFO: renamed from: nx7$b */
    public static class C10102b extends AbstractList<Long> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a */
        public final nx7 f65953a;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@wx1 Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@wx1 Object object) {
            if (object instanceof C10102b) {
                return this.f65953a.equals(((C10102b) object).f65953a);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i = this.f65953a.f65951b;
            for (Object obj : list) {
                if (obj instanceof Long) {
                    int i2 = i + 1;
                    if (this.f65953a.f65950a[i] == ((Long) obj).longValue()) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f65953a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@wx1 Object target) {
            if (target instanceof Long) {
                return this.f65953a.indexOf(((Long) target).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@wx1 Object target) {
            if (target instanceof Long) {
                return this.f65953a.lastIndexOf(((Long) target).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f65953a.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int fromIndex, int toIndex) {
            return this.f65953a.subArray(fromIndex, toIndex).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f65953a.toString();
        }

        private C10102b(nx7 parent) {
            this.f65953a = parent;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int index) {
            return Long.valueOf(this.f65953a.get(index));
        }
    }

    public static C10103c builder(int initialCapacity) {
        v7d.checkArgument(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new C10103c(initialCapacity);
    }

    public static nx7 copyOf(long[] values) {
        return values.length == 0 ? f65949d : new nx7(Arrays.copyOf(values, values.length));
    }

    private boolean isPartialView() {
        return this.f65951b > 0 || this.f65952c < this.f65950a.length;
    }

    /* JADX INFO: renamed from: of */
    public static nx7 m18182of() {
        return f65949d;
    }

    public List<Long> asList() {
        return new C10102b();
    }

    public boolean contains(long target) {
        return indexOf(target) >= 0;
    }

    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof nx7)) {
            return false;
        }
        nx7 nx7Var = (nx7) object;
        if (length() != nx7Var.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != nx7Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public long get(int index) {
        v7d.checkElementIndex(index, length());
        return this.f65950a[this.f65951b + index];
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i = this.f65951b; i < this.f65952c; i++) {
            iHashCode = (iHashCode * 31) + im9.hashCode(this.f65950a[i]);
        }
        return iHashCode;
    }

    public int indexOf(long target) {
        for (int i = this.f65951b; i < this.f65952c; i++) {
            if (this.f65950a[i] == target) {
                return i - this.f65951b;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f65952c == this.f65951b;
    }

    public int lastIndexOf(long target) {
        int i;
        int i2 = this.f65952c;
        do {
            i2--;
            i = this.f65951b;
            if (i2 < i) {
                return -1;
            }
        } while (this.f65950a[i2] != target);
        return i2 - i;
    }

    public int length() {
        return this.f65952c - this.f65951b;
    }

    public Object readResolve() {
        return isEmpty() ? f65949d : this;
    }

    public nx7 subArray(int startIndex, int endIndex) {
        v7d.checkPositionIndexes(startIndex, endIndex, length());
        if (startIndex == endIndex) {
            return f65949d;
        }
        long[] jArr = this.f65950a;
        int i = this.f65951b;
        return new nx7(jArr, startIndex + i, i + endIndex);
    }

    public long[] toArray() {
        return Arrays.copyOfRange(this.f65950a, this.f65951b, this.f65952c);
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append(C4584d2.f28242k);
        sb.append(this.f65950a[this.f65951b]);
        int i = this.f65951b;
        while (true) {
            i++;
            if (i >= this.f65952c) {
                sb.append(C4584d2.f28243l);
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f65950a[i]);
        }
    }

    public nx7 trimmed() {
        return isPartialView() ? new nx7(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private nx7(long[] array) {
        this(array, 0, array.length);
    }

    /* JADX INFO: renamed from: of */
    public static nx7 m18183of(long e0) {
        return new nx7(new long[]{e0});
    }

    /* JADX INFO: renamed from: nx7$c */
    public static final class C10103c {

        /* JADX INFO: renamed from: a */
        public long[] f65954a;

        /* JADX INFO: renamed from: b */
        public int f65955b = 0;

        public C10103c(int initialCapacity) {
            this.f65954a = new long[initialCapacity];
        }

        private void ensureRoomFor(int numberToAdd) {
            int i = this.f65955b + numberToAdd;
            long[] jArr = this.f65954a;
            if (i > jArr.length) {
                this.f65954a = Arrays.copyOf(jArr, expandedCapacity(jArr.length, i));
            }
        }

        private static int expandedCapacity(int oldCapacity, int minCapacity) {
            if (minCapacity < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = oldCapacity + (oldCapacity >> 1) + 1;
            if (iHighestOneBit < minCapacity) {
                iHighestOneBit = Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @op1
        public C10103c add(long value) {
            ensureRoomFor(1);
            long[] jArr = this.f65954a;
            int i = this.f65955b;
            jArr[i] = value;
            this.f65955b = i + 1;
            return this;
        }

        @op1
        public C10103c addAll(long[] values) {
            ensureRoomFor(values.length);
            System.arraycopy(values, 0, this.f65954a, this.f65955b, values.length);
            this.f65955b += values.length;
            return this;
        }

        public nx7 build() {
            if (this.f65955b == 0) {
                return nx7.f65949d;
            }
            return new nx7(this.f65954a, 0, this.f65955b);
        }

        @op1
        public C10103c addAll(Iterable<Long> values) {
            if (values instanceof Collection) {
                return addAll((Collection<Long>) values);
            }
            Iterator<Long> it = values.iterator();
            while (it.hasNext()) {
                add(it.next().longValue());
            }
            return this;
        }

        @op1
        public C10103c addAll(Collection<Long> values) {
            ensureRoomFor(values.size());
            for (Long l : values) {
                long[] jArr = this.f65954a;
                int i = this.f65955b;
                this.f65955b = i + 1;
                jArr[i] = l.longValue();
            }
            return this;
        }

        @op1
        public C10103c addAll(nx7 values) {
            ensureRoomFor(values.length());
            System.arraycopy(values.f65950a, values.f65951b, this.f65954a, this.f65955b, values.length());
            this.f65955b += values.length();
            return this;
        }
    }

    private nx7(long[] array, int start, int end) {
        this.f65950a = array;
        this.f65951b = start;
        this.f65952c = end;
    }

    public static C10103c builder() {
        return new C10103c(10);
    }

    /* JADX INFO: renamed from: of */
    public static nx7 m18184of(long e0, long e1) {
        return new nx7(new long[]{e0, e1});
    }

    public static nx7 copyOf(Collection<Long> values) {
        return values.isEmpty() ? f65949d : new nx7(im9.toArray(values));
    }

    /* JADX INFO: renamed from: of */
    public static nx7 m18185of(long e0, long e1, long e2) {
        return new nx7(new long[]{e0, e1, e2});
    }

    public static nx7 copyOf(Iterable<Long> values) {
        if (values instanceof Collection) {
            return copyOf((Collection<Long>) values);
        }
        return builder().addAll(values).build();
    }

    /* JADX INFO: renamed from: of */
    public static nx7 m18186of(long e0, long e1, long e2, long e3) {
        return new nx7(new long[]{e0, e1, e2, e3});
    }

    /* JADX INFO: renamed from: of */
    public static nx7 m18187of(long e0, long e1, long e2, long e3, long e4) {
        return new nx7(new long[]{e0, e1, e2, e3, e4});
    }

    /* JADX INFO: renamed from: of */
    public static nx7 m18188of(long e0, long e1, long e2, long e3, long e4, long e5) {
        return new nx7(new long[]{e0, e1, e2, e3, e4, e5});
    }

    /* JADX INFO: renamed from: of */
    public static nx7 m18189of(long first, long... rest) {
        v7d.checkArgument(rest.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr = new long[rest.length + 1];
        jArr[0] = first;
        System.arraycopy(rest, 0, jArr, 1, rest.length);
        return new nx7(jArr);
    }
}

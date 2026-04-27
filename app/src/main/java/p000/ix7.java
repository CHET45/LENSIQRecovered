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
public final class ix7 implements Serializable {

    /* JADX INFO: renamed from: d */
    public static final ix7 f48772d = new ix7(new int[0]);

    /* JADX INFO: renamed from: a */
    public final int[] f48773a;

    /* JADX INFO: renamed from: b */
    public final transient int f48774b;

    /* JADX INFO: renamed from: c */
    public final int f48775c;

    /* JADX INFO: renamed from: ix7$b */
    public static class C7651b extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a */
        public final ix7 f48776a;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@wx1 Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@wx1 Object object) {
            if (object instanceof C7651b) {
                return this.f48776a.equals(((C7651b) object).f48776a);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i = this.f48776a.f48774b;
            for (Object obj : list) {
                if (obj instanceof Integer) {
                    int i2 = i + 1;
                    if (this.f48776a.f48773a[i] == ((Integer) obj).intValue()) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f48776a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@wx1 Object target) {
            if (target instanceof Integer) {
                return this.f48776a.indexOf(((Integer) target).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@wx1 Object target) {
            if (target instanceof Integer) {
                return this.f48776a.lastIndexOf(((Integer) target).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f48776a.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int fromIndex, int toIndex) {
            return this.f48776a.subArray(fromIndex, toIndex).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f48776a.toString();
        }

        private C7651b(ix7 parent) {
            this.f48776a = parent;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int index) {
            return Integer.valueOf(this.f48776a.get(index));
        }
    }

    public static C7652c builder(int initialCapacity) {
        v7d.checkArgument(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new C7652c(initialCapacity);
    }

    public static ix7 copyOf(int[] values) {
        return values.length == 0 ? f48772d : new ix7(Arrays.copyOf(values, values.length));
    }

    private boolean isPartialView() {
        return this.f48774b > 0 || this.f48775c < this.f48773a.length;
    }

    /* JADX INFO: renamed from: of */
    public static ix7 m13516of() {
        return f48772d;
    }

    public List<Integer> asList() {
        return new C7651b();
    }

    public boolean contains(int target) {
        return indexOf(target) >= 0;
    }

    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ix7)) {
            return false;
        }
        ix7 ix7Var = (ix7) object;
        if (length() != ix7Var.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != ix7Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int get(int index) {
        v7d.checkElementIndex(index, length());
        return this.f48773a[this.f48774b + index];
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i = this.f48774b; i < this.f48775c; i++) {
            iHashCode = (iHashCode * 31) + rd8.hashCode(this.f48773a[i]);
        }
        return iHashCode;
    }

    public int indexOf(int target) {
        for (int i = this.f48774b; i < this.f48775c; i++) {
            if (this.f48773a[i] == target) {
                return i - this.f48774b;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f48775c == this.f48774b;
    }

    public int lastIndexOf(int target) {
        int i;
        int i2 = this.f48775c;
        do {
            i2--;
            i = this.f48774b;
            if (i2 < i) {
                return -1;
            }
        } while (this.f48773a[i2] != target);
        return i2 - i;
    }

    public int length() {
        return this.f48775c - this.f48774b;
    }

    public Object readResolve() {
        return isEmpty() ? f48772d : this;
    }

    public ix7 subArray(int startIndex, int endIndex) {
        v7d.checkPositionIndexes(startIndex, endIndex, length());
        if (startIndex == endIndex) {
            return f48772d;
        }
        int[] iArr = this.f48773a;
        int i = this.f48774b;
        return new ix7(iArr, startIndex + i, i + endIndex);
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.f48773a, this.f48774b, this.f48775c);
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append(C4584d2.f28242k);
        sb.append(this.f48773a[this.f48774b]);
        int i = this.f48774b;
        while (true) {
            i++;
            if (i >= this.f48775c) {
                sb.append(C4584d2.f28243l);
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f48773a[i]);
        }
    }

    public ix7 trimmed() {
        return isPartialView() ? new ix7(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private ix7(int[] array) {
        this(array, 0, array.length);
    }

    public static ix7 copyOf(Collection<Integer> values) {
        return values.isEmpty() ? f48772d : new ix7(rd8.toArray(values));
    }

    /* JADX INFO: renamed from: of */
    public static ix7 m13517of(int e0) {
        return new ix7(new int[]{e0});
    }

    /* JADX INFO: renamed from: ix7$c */
    public static final class C7652c {

        /* JADX INFO: renamed from: a */
        public int[] f48777a;

        /* JADX INFO: renamed from: b */
        public int f48778b = 0;

        public C7652c(int initialCapacity) {
            this.f48777a = new int[initialCapacity];
        }

        private void ensureRoomFor(int numberToAdd) {
            int i = this.f48778b + numberToAdd;
            int[] iArr = this.f48777a;
            if (i > iArr.length) {
                this.f48777a = Arrays.copyOf(iArr, expandedCapacity(iArr.length, i));
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
        public C7652c add(int value) {
            ensureRoomFor(1);
            int[] iArr = this.f48777a;
            int i = this.f48778b;
            iArr[i] = value;
            this.f48778b = i + 1;
            return this;
        }

        @op1
        public C7652c addAll(int[] values) {
            ensureRoomFor(values.length);
            System.arraycopy(values, 0, this.f48777a, this.f48778b, values.length);
            this.f48778b += values.length;
            return this;
        }

        public ix7 build() {
            if (this.f48778b == 0) {
                return ix7.f48772d;
            }
            return new ix7(this.f48777a, 0, this.f48778b);
        }

        @op1
        public C7652c addAll(Iterable<Integer> values) {
            if (values instanceof Collection) {
                return addAll((Collection<Integer>) values);
            }
            Iterator<Integer> it = values.iterator();
            while (it.hasNext()) {
                add(it.next().intValue());
            }
            return this;
        }

        @op1
        public C7652c addAll(Collection<Integer> values) {
            ensureRoomFor(values.size());
            for (Integer num : values) {
                int[] iArr = this.f48777a;
                int i = this.f48778b;
                this.f48778b = i + 1;
                iArr[i] = num.intValue();
            }
            return this;
        }

        @op1
        public C7652c addAll(ix7 values) {
            ensureRoomFor(values.length());
            System.arraycopy(values.f48773a, values.f48774b, this.f48777a, this.f48778b, values.length());
            this.f48778b += values.length();
            return this;
        }
    }

    private ix7(int[] array, int start, int end) {
        this.f48773a = array;
        this.f48774b = start;
        this.f48775c = end;
    }

    public static C7652c builder() {
        return new C7652c(10);
    }

    public static ix7 copyOf(Iterable<Integer> values) {
        if (values instanceof Collection) {
            return copyOf((Collection<Integer>) values);
        }
        return builder().addAll(values).build();
    }

    /* JADX INFO: renamed from: of */
    public static ix7 m13518of(int e0, int e1) {
        return new ix7(new int[]{e0, e1});
    }

    /* JADX INFO: renamed from: of */
    public static ix7 m13519of(int e0, int e1, int e2) {
        return new ix7(new int[]{e0, e1, e2});
    }

    /* JADX INFO: renamed from: of */
    public static ix7 m13520of(int e0, int e1, int e2, int e3) {
        return new ix7(new int[]{e0, e1, e2, e3});
    }

    /* JADX INFO: renamed from: of */
    public static ix7 m13521of(int e0, int e1, int e2, int e3, int e4) {
        return new ix7(new int[]{e0, e1, e2, e3, e4});
    }

    /* JADX INFO: renamed from: of */
    public static ix7 m13522of(int e0, int e1, int e2, int e3, int e4, int e5) {
        return new ix7(new int[]{e0, e1, e2, e3, e4, e5});
    }

    /* JADX INFO: renamed from: of */
    public static ix7 m13523of(int first, int... rest) {
        v7d.checkArgument(rest.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr = new int[rest.length + 1];
        iArr[0] = first;
        System.arraycopy(rest, 0, iArr, 1, rest.length);
        return new ix7(iArr);
    }
}

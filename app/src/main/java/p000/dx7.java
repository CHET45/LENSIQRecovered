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
public final class dx7 implements Serializable {

    /* JADX INFO: renamed from: d */
    public static final dx7 f31238d = new dx7(new double[0]);

    /* JADX INFO: renamed from: a */
    public final double[] f31239a;

    /* JADX INFO: renamed from: b */
    public final transient int f31240b;

    /* JADX INFO: renamed from: c */
    public final int f31241c;

    /* JADX INFO: renamed from: dx7$b */
    public static class C4994b extends AbstractList<Double> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a */
        public final dx7 f31242a;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@wx1 Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@wx1 Object object) {
            if (object instanceof C4994b) {
                return this.f31242a.equals(((C4994b) object).f31242a);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i = this.f31242a.f31240b;
            for (Object obj : list) {
                if (obj instanceof Double) {
                    int i2 = i + 1;
                    if (dx7.areEqual(this.f31242a.f31239a[i], ((Double) obj).doubleValue())) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f31242a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@wx1 Object target) {
            if (target instanceof Double) {
                return this.f31242a.indexOf(((Double) target).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@wx1 Object target) {
            if (target instanceof Double) {
                return this.f31242a.lastIndexOf(((Double) target).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f31242a.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int fromIndex, int toIndex) {
            return this.f31242a.subArray(fromIndex, toIndex).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f31242a.toString();
        }

        private C4994b(dx7 parent) {
            this.f31242a = parent;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int index) {
            return Double.valueOf(this.f31242a.get(index));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areEqual(double a, double b) {
        return Double.doubleToLongBits(a) == Double.doubleToLongBits(b);
    }

    public static C4995c builder(int initialCapacity) {
        v7d.checkArgument(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new C4995c(initialCapacity);
    }

    public static dx7 copyOf(double[] values) {
        return values.length == 0 ? f31238d : new dx7(Arrays.copyOf(values, values.length));
    }

    private boolean isPartialView() {
        return this.f31240b > 0 || this.f31241c < this.f31239a.length;
    }

    /* JADX INFO: renamed from: of */
    public static dx7 m9511of() {
        return f31238d;
    }

    public List<Double> asList() {
        return new C4994b();
    }

    public boolean contains(double target) {
        return indexOf(target) >= 0;
    }

    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dx7)) {
            return false;
        }
        dx7 dx7Var = (dx7) object;
        if (length() != dx7Var.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (!areEqual(get(i), dx7Var.get(i))) {
                return false;
            }
        }
        return true;
    }

    public double get(int index) {
        v7d.checkElementIndex(index, length());
        return this.f31239a[this.f31240b + index];
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i = this.f31240b; i < this.f31241c; i++) {
            iHashCode = (iHashCode * 31) + qk4.hashCode(this.f31239a[i]);
        }
        return iHashCode;
    }

    public int indexOf(double target) {
        for (int i = this.f31240b; i < this.f31241c; i++) {
            if (areEqual(this.f31239a[i], target)) {
                return i - this.f31240b;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f31241c == this.f31240b;
    }

    public int lastIndexOf(double target) {
        int i = this.f31241c;
        do {
            i--;
            if (i < this.f31240b) {
                return -1;
            }
        } while (!areEqual(this.f31239a[i], target));
        return i - this.f31240b;
    }

    public int length() {
        return this.f31241c - this.f31240b;
    }

    public Object readResolve() {
        return isEmpty() ? f31238d : this;
    }

    public dx7 subArray(int startIndex, int endIndex) {
        v7d.checkPositionIndexes(startIndex, endIndex, length());
        if (startIndex == endIndex) {
            return f31238d;
        }
        double[] dArr = this.f31239a;
        int i = this.f31240b;
        return new dx7(dArr, startIndex + i, i + endIndex);
    }

    public double[] toArray() {
        return Arrays.copyOfRange(this.f31239a, this.f31240b, this.f31241c);
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append(C4584d2.f28242k);
        sb.append(this.f31239a[this.f31240b]);
        int i = this.f31240b;
        while (true) {
            i++;
            if (i >= this.f31241c) {
                sb.append(C4584d2.f28243l);
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f31239a[i]);
        }
    }

    public dx7 trimmed() {
        return isPartialView() ? new dx7(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private dx7(double[] array) {
        this(array, 0, array.length);
    }

    /* JADX INFO: renamed from: of */
    public static dx7 m9512of(double e0) {
        return new dx7(new double[]{e0});
    }

    /* JADX INFO: renamed from: dx7$c */
    public static final class C4995c {

        /* JADX INFO: renamed from: a */
        public double[] f31243a;

        /* JADX INFO: renamed from: b */
        public int f31244b = 0;

        public C4995c(int initialCapacity) {
            this.f31243a = new double[initialCapacity];
        }

        private void ensureRoomFor(int numberToAdd) {
            int i = this.f31244b + numberToAdd;
            double[] dArr = this.f31243a;
            if (i > dArr.length) {
                this.f31243a = Arrays.copyOf(dArr, expandedCapacity(dArr.length, i));
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
        public C4995c add(double value) {
            ensureRoomFor(1);
            double[] dArr = this.f31243a;
            int i = this.f31244b;
            dArr[i] = value;
            this.f31244b = i + 1;
            return this;
        }

        @op1
        public C4995c addAll(double[] values) {
            ensureRoomFor(values.length);
            System.arraycopy(values, 0, this.f31243a, this.f31244b, values.length);
            this.f31244b += values.length;
            return this;
        }

        public dx7 build() {
            if (this.f31244b == 0) {
                return dx7.f31238d;
            }
            return new dx7(this.f31243a, 0, this.f31244b);
        }

        @op1
        public C4995c addAll(Iterable<Double> values) {
            if (values instanceof Collection) {
                return addAll((Collection<Double>) values);
            }
            Iterator<Double> it = values.iterator();
            while (it.hasNext()) {
                add(it.next().doubleValue());
            }
            return this;
        }

        @op1
        public C4995c addAll(Collection<Double> values) {
            ensureRoomFor(values.size());
            for (Double d : values) {
                double[] dArr = this.f31243a;
                int i = this.f31244b;
                this.f31244b = i + 1;
                dArr[i] = d.doubleValue();
            }
            return this;
        }

        @op1
        public C4995c addAll(dx7 values) {
            ensureRoomFor(values.length());
            System.arraycopy(values.f31239a, values.f31240b, this.f31243a, this.f31244b, values.length());
            this.f31244b += values.length();
            return this;
        }
    }

    private dx7(double[] array, int start, int end) {
        this.f31239a = array;
        this.f31240b = start;
        this.f31241c = end;
    }

    public static C4995c builder() {
        return new C4995c(10);
    }

    /* JADX INFO: renamed from: of */
    public static dx7 m9513of(double e0, double e1) {
        return new dx7(new double[]{e0, e1});
    }

    public static dx7 copyOf(Collection<Double> values) {
        return values.isEmpty() ? f31238d : new dx7(qk4.toArray(values));
    }

    /* JADX INFO: renamed from: of */
    public static dx7 m9514of(double e0, double e1, double e2) {
        return new dx7(new double[]{e0, e1, e2});
    }

    public static dx7 copyOf(Iterable<Double> values) {
        if (values instanceof Collection) {
            return copyOf((Collection<Double>) values);
        }
        return builder().addAll(values).build();
    }

    /* JADX INFO: renamed from: of */
    public static dx7 m9515of(double e0, double e1, double e2, double e3) {
        return new dx7(new double[]{e0, e1, e2, e3});
    }

    /* JADX INFO: renamed from: of */
    public static dx7 m9516of(double e0, double e1, double e2, double e3, double e4) {
        return new dx7(new double[]{e0, e1, e2, e3, e4});
    }

    /* JADX INFO: renamed from: of */
    public static dx7 m9517of(double e0, double e1, double e2, double e3, double e4, double e5) {
        return new dx7(new double[]{e0, e1, e2, e3, e4, e5});
    }

    /* JADX INFO: renamed from: of */
    public static dx7 m9518of(double first, double... rest) {
        v7d.checkArgument(rest.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr = new double[rest.length + 1];
        dArr[0] = first;
        System.arraycopy(rest, 0, dArr, 1, rest.length);
        return new dx7(dArr);
    }
}

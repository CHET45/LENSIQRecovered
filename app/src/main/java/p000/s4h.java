package p000;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class s4h<T> {

    /* JADX INFO: renamed from: a */
    public final int f80655a;

    /* JADX INFO: renamed from: b */
    public final Comparator<? super T> f80656b;

    /* JADX INFO: renamed from: c */
    public final T[] f80657c;

    /* JADX INFO: renamed from: d */
    public int f80658d;

    /* JADX INFO: renamed from: e */
    @wx1
    public T f80659e;

    private s4h(Comparator<? super T> comparator, int i) {
        this.f80656b = (Comparator) v7d.checkNotNull(comparator, "comparator");
        this.f80655a = i;
        v7d.checkArgument(i >= 0, "k (%s) must be >= 0", i);
        v7d.checkArgument(i <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.f80657c = (T[]) new Object[w68.checkedMultiply(i, 2)];
        this.f80658d = 0;
        this.f80659e = null;
    }

    public static <T extends Comparable<? super T>> s4h<T> greatest(int k) {
        return greatest(k, s7c.natural());
    }

    public static <T extends Comparable<? super T>> s4h<T> least(int k) {
        return least(k, s7c.natural());
    }

    private int partition(int i, int i2, int i3) {
        Object objM22018a = sib.m22018a(this.f80657c[i3]);
        T[] tArr = this.f80657c;
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.f80656b.compare((Object) sib.m22018a(this.f80657c[i]), objM22018a) < 0) {
                swap(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.f80657c;
        tArr2[i2] = tArr2[i4];
        tArr2[i4] = objM22018a;
        return i4;
    }

    private void swap(int i, int j) {
        T[] tArr = this.f80657c;
        T t = tArr[i];
        tArr[i] = tArr[j];
        tArr[j] = t;
    }

    private void trim() {
        int i = (this.f80655a * 2) - 1;
        int iLog2 = w68.log2(i, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (iMax >= i) {
                break;
            }
            int iPartition = partition(iMax, i, ((iMax + i) + 1) >>> 1);
            int i4 = this.f80655a;
            if (iPartition <= i4) {
                if (iPartition >= i4) {
                    break;
                }
                iMax = Math.max(iPartition, iMax + 1);
                i3 = iPartition;
            } else {
                i = iPartition - 1;
            }
            i2++;
            if (i2 >= iLog2) {
                Arrays.sort(this.f80657c, iMax, i + 1, this.f80656b);
                break;
            }
        }
        this.f80658d = this.f80655a;
        this.f80659e = (T) sib.m22018a(this.f80657c[i3]);
        while (true) {
            i3++;
            if (i3 >= this.f80655a) {
                return;
            }
            if (this.f80656b.compare((Object) sib.m22018a(this.f80657c[i3]), (Object) sib.m22018a(this.f80659e)) > 0) {
                this.f80659e = this.f80657c[i3];
            }
        }
    }

    public void offer(@dgc T t) {
        int i = this.f80655a;
        if (i == 0) {
            return;
        }
        int i2 = this.f80658d;
        if (i2 == 0) {
            this.f80657c[0] = t;
            this.f80659e = t;
            this.f80658d = 1;
            return;
        }
        if (i2 < i) {
            T[] tArr = this.f80657c;
            this.f80658d = i2 + 1;
            tArr[i2] = t;
            if (this.f80656b.compare(t, (Object) sib.m22018a(this.f80659e)) > 0) {
                this.f80659e = t;
                return;
            }
            return;
        }
        if (this.f80656b.compare(t, (Object) sib.m22018a(this.f80659e)) < 0) {
            T[] tArr2 = this.f80657c;
            int i3 = this.f80658d;
            int i4 = i3 + 1;
            this.f80658d = i4;
            tArr2[i3] = t;
            if (i4 == this.f80655a * 2) {
                trim();
            }
        }
    }

    public void offerAll(Iterable<? extends T> elements) {
        offerAll(elements.iterator());
    }

    public List<T> topK() {
        T[] tArr = this.f80657c;
        Arrays.sort(tArr, 0, this.f80658d, this.f80656b);
        int i = this.f80658d;
        int i2 = this.f80655a;
        if (i > i2) {
            T[] tArr2 = this.f80657c;
            Arrays.fill(tArr2, i2, tArr2.length, (Object) null);
            int i3 = this.f80655a;
            this.f80658d = i3;
            this.f80659e = this.f80657c[i3 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(tArr, this.f80658d)));
    }

    public static <T> s4h<T> greatest(int k, Comparator<? super T> comparator) {
        return new s4h<>(s7c.from(comparator).reverse(), k);
    }

    public static <T> s4h<T> least(int k, Comparator<? super T> comparator) {
        return new s4h<>(comparator, k);
    }

    public void offerAll(Iterator<? extends T> elements) {
        while (elements.hasNext()) {
            offer(elements.next());
        }
    }
}

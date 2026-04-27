package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n204#1:208\n204#1:209\n204#1:210\n1#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:208\n175#1:209\n188#1:210\n*E\n"})
public final class gae<T> extends AbstractC7110i2<T> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Object[] f39143a;

    /* JADX INFO: renamed from: b */
    public final int f39144b;

    /* JADX INFO: renamed from: c */
    public int f39145c;

    /* JADX INFO: renamed from: d */
    public int f39146d;

    /* JADX INFO: renamed from: gae$a */
    @dwf({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,206:1\n204#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:207\n*E\n"})
    public static final class C6186a extends AbstractC1703b2<T> {

        /* JADX INFO: renamed from: c */
        public int f39147c;

        /* JADX INFO: renamed from: d */
        public int f39148d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gae<T> f39149e;

        public C6186a(gae<T> gaeVar) {
            this.f39149e = gaeVar;
            this.f39147c = gaeVar.size();
            this.f39148d = gaeVar.f39145c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC1703b2
        /* JADX INFO: renamed from: a */
        public void mo2803a() {
            if (this.f39147c == 0) {
                m2804b();
                return;
            }
            m2805c(this.f39149e.f39143a[this.f39148d]);
            this.f39148d = (this.f39148d + 1) % this.f39149e.f39144b;
            this.f39147c--;
        }
    }

    public gae(@yfb Object[] objArr, int i) {
        md8.checkNotNullParameter(objArr, "buffer");
        this.f39143a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
        }
        if (i <= objArr.length) {
            this.f39144b = objArr.length;
            this.f39146d = i;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
    }

    private final int forward(int i, int i2) {
        return (i + i2) % this.f39144b;
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T t) {
        if (isFull()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f39143a[(this.f39145c + size()) % this.f39144b] = t;
        this.f39146d = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final gae<T> expanded(int i) {
        Object[] array;
        int i2 = this.f39144b;
        int iCoerceAtMost = kpd.coerceAtMost(i2 + (i2 >> 1) + 1, i);
        if (this.f39145c == 0) {
            array = Arrays.copyOf(this.f39143a, iCoerceAtMost);
            md8.checkNotNullExpressionValue(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iCoerceAtMost]);
        }
        return new gae<>(array, size());
    }

    @Override // p000.AbstractC7110i2, java.util.List
    public T get(int i) {
        AbstractC7110i2.Companion.checkElementIndex$kotlin_stdlib(i, size());
        return (T) this.f39143a[(this.f39145c + i) % this.f39144b];
    }

    @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
    public int getSize() {
        return this.f39146d;
    }

    public final boolean isFull() {
        return size() == this.f39144b;
    }

    @Override // p000.AbstractC7110i2, p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<T> iterator() {
        return new C6186a(this);
    }

    public final void removeFirst(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
        if (i > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        }
        if (i > 0) {
            int i2 = this.f39145c;
            int i3 = (i2 + i) % this.f39144b;
            if (i2 > i3) {
                u70.fill(this.f39143a, (Object) null, i2, this.f39144b);
                u70.fill(this.f39143a, (Object) null, 0, i3);
            } else {
                u70.fill(this.f39143a, (Object) null, i2, i3);
            }
            this.f39145c = i3;
            this.f39146d = size() - i;
        }
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
    @yfb
    public <T> T[] toArray(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        int length = tArr.length;
        Object[] objArr = tArr;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(tArr, size());
            md8.checkNotNullExpressionValue(objArr2, "copyOf(...)");
            objArr = objArr2;
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.f39145c; i2 < size && i3 < this.f39144b; i3++) {
            objArr[i2] = this.f39143a[i3];
            i2++;
        }
        while (i2 < size) {
            objArr[i2] = this.f39143a[i];
            i2++;
            i++;
        }
        return (T[]) k82.terminateCollectionToArray(size, objArr);
    }

    public gae(int i) {
        this(new Object[i], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
    @yfb
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}

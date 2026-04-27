package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,270:1\n1#2:271\n26#3:272\n26#3:273\n26#3:274\n26#3:275\n26#3:276\n26#3:277\n26#3:278\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n104#1:272\n122#1:273\n152#1:274\n187#1:275\n221#1:276\n235#1:277\n249#1:278\n*E\n"})
public final class h02<E> {

    /* JADX INFO: renamed from: a */
    @yfb
    public E[] f41918a;

    /* JADX INFO: renamed from: b */
    public int f41919b;

    /* JADX INFO: renamed from: c */
    public int f41920c;

    /* JADX INFO: renamed from: d */
    public int f41921d;

    @yn8
    public h02() {
        this(0, 1, null);
    }

    private final void doubleCapacity() {
        E[] eArr = this.f41918a;
        int length = eArr.length;
        int i = this.f41919b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i3];
        u70.copyInto(eArr, eArr2, 0, i, length);
        u70.copyInto(this.f41918a, eArr2, i2, 0, this.f41919b);
        this.f41918a = eArr2;
        this.f41919b = 0;
        this.f41920c = length;
        this.f41921d = i3 - 1;
    }

    public final void addFirst(E e) {
        int i = (this.f41919b - 1) & this.f41921d;
        this.f41919b = i;
        this.f41918a[i] = e;
        if (i == this.f41920c) {
            doubleCapacity();
        }
    }

    public final void addLast(E e) {
        E[] eArr = this.f41918a;
        int i = this.f41920c;
        eArr[i] = e;
        int i2 = this.f41921d & (i + 1);
        this.f41920c = i2;
        if (i2 == this.f41919b) {
            doubleCapacity();
        }
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final E get(int i) {
        if (i < 0 || i >= size()) {
            a82 a82Var = a82.f606a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e = this.f41918a[this.f41921d & (this.f41919b + i)];
        md8.checkNotNull(e);
        return e;
    }

    public final E getFirst() {
        int i = this.f41919b;
        if (i == this.f41920c) {
            a82 a82Var = a82.f606a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e = this.f41918a[i];
        md8.checkNotNull(e);
        return e;
    }

    public final E getLast() {
        int i = this.f41919b;
        int i2 = this.f41920c;
        if (i == i2) {
            a82 a82Var = a82.f606a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e = this.f41918a[(i2 - 1) & this.f41921d];
        md8.checkNotNull(e);
        return e;
    }

    public final boolean isEmpty() {
        return this.f41919b == this.f41920c;
    }

    public final E popFirst() {
        int i = this.f41919b;
        if (i == this.f41920c) {
            a82 a82Var = a82.f606a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.f41918a;
        E e = eArr[i];
        eArr[i] = null;
        this.f41919b = (i + 1) & this.f41921d;
        return e;
    }

    public final E popLast() {
        int i = this.f41919b;
        int i2 = this.f41920c;
        if (i == i2) {
            a82 a82Var = a82.f606a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f41921d & (i2 - 1);
        E[] eArr = this.f41918a;
        E e = eArr[i3];
        eArr[i3] = null;
        this.f41920c = i3;
        return e;
    }

    public final void removeFromEnd(int i) {
        if (i <= 0) {
            return;
        }
        if (i > size()) {
            a82 a82Var = a82.f606a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.f41920c;
        int i3 = i < i2 ? i2 - i : 0;
        for (int i4 = i3; i4 < i2; i4++) {
            this.f41918a[i4] = null;
        }
        int i5 = this.f41920c;
        int i6 = i5 - i3;
        int i7 = i - i6;
        this.f41920c = i5 - i6;
        if (i7 > 0) {
            int length = this.f41918a.length;
            this.f41920c = length;
            int i8 = length - i7;
            for (int i9 = i8; i9 < length; i9++) {
                this.f41918a[i9] = null;
            }
            this.f41920c = i8;
        }
    }

    public final void removeFromStart(int i) {
        if (i <= 0) {
            return;
        }
        if (i > size()) {
            a82 a82Var = a82.f606a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f41918a.length;
        int i2 = this.f41919b;
        if (i < length - i2) {
            length = i2 + i;
        }
        while (i2 < length) {
            this.f41918a[i2] = null;
            i2++;
        }
        int i3 = this.f41919b;
        int i4 = length - i3;
        int i5 = i - i4;
        this.f41919b = this.f41921d & (i3 + i4);
        if (i5 > 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                this.f41918a[i6] = null;
            }
            this.f41919b = i5;
        }
    }

    public final int size() {
        return (this.f41920c - this.f41919b) & this.f41921d;
    }

    @yn8
    public h02(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.f41921d = i - 1;
        this.f41918a = (E[]) new Object[i];
    }

    public /* synthetic */ h02(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}

package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,213:1\n1#2:214\n26#3:215\n26#3:216\n26#3:217\n26#3:218\n26#3:219\n26#3:220\n26#3:221\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n100#1:215\n113#1:216\n139#1:217\n156#1:218\n169#1:219\n181#1:220\n193#1:221\n*E\n"})
public final class k02 {

    /* JADX INFO: renamed from: a */
    @yfb
    public int[] f52314a;

    /* JADX INFO: renamed from: b */
    public int f52315b;

    /* JADX INFO: renamed from: c */
    public int f52316c;

    /* JADX INFO: renamed from: d */
    public int f52317d;

    @yn8
    public k02() {
        this(0, 1, null);
    }

    private final void doubleCapacity() {
        int[] iArr = this.f52314a;
        int length = iArr.length;
        int i = this.f52315b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i3];
        u70.copyInto(iArr, iArr2, 0, i, length);
        u70.copyInto(this.f52314a, iArr2, i2, 0, this.f52315b);
        this.f52314a = iArr2;
        this.f52315b = 0;
        this.f52316c = length;
        this.f52317d = i3 - 1;
    }

    public final void addFirst(int i) {
        int i2 = (this.f52315b - 1) & this.f52317d;
        this.f52315b = i2;
        this.f52314a[i2] = i;
        if (i2 == this.f52316c) {
            doubleCapacity();
        }
    }

    public final void addLast(int i) {
        int[] iArr = this.f52314a;
        int i2 = this.f52316c;
        iArr[i2] = i;
        int i3 = this.f52317d & (i2 + 1);
        this.f52316c = i3;
        if (i3 == this.f52315b) {
            doubleCapacity();
        }
    }

    public final void clear() {
        this.f52316c = this.f52315b;
    }

    public final int get(int i) {
        if (i < 0 || i >= size()) {
            a82 a82Var = a82.f606a;
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f52314a[this.f52317d & (this.f52315b + i)];
    }

    public final int getFirst() {
        int i = this.f52315b;
        if (i != this.f52316c) {
            return this.f52314a[i];
        }
        a82 a82Var = a82.f606a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int getLast() {
        int i = this.f52315b;
        int i2 = this.f52316c;
        if (i != i2) {
            return this.f52314a[(i2 - 1) & this.f52317d];
        }
        a82 a82Var = a82.f606a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean isEmpty() {
        return this.f52315b == this.f52316c;
    }

    public final int popFirst() {
        int i = this.f52315b;
        if (i == this.f52316c) {
            a82 a82Var = a82.f606a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.f52314a[i];
        this.f52315b = (i + 1) & this.f52317d;
        return i2;
    }

    public final int popLast() {
        int i = this.f52315b;
        int i2 = this.f52316c;
        if (i == i2) {
            a82 a82Var = a82.f606a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f52317d & (i2 - 1);
        int i4 = this.f52314a[i3];
        this.f52316c = i3;
        return i4;
    }

    public final void removeFromEnd(int i) {
        if (i <= 0) {
            return;
        }
        if (i > size()) {
            a82 a82Var = a82.f606a;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f52316c = this.f52317d & (this.f52316c - i);
    }

    public final void removeFromStart(int i) {
        if (i <= 0) {
            return;
        }
        if (i > size()) {
            a82 a82Var = a82.f606a;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f52315b = this.f52317d & (this.f52315b + i);
    }

    public final int size() {
        return (this.f52316c - this.f52315b) & this.f52317d;
    }

    @yn8
    public k02(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.f52317d = i - 1;
        this.f52314a = new int[i];
    }

    public /* synthetic */ k02(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}

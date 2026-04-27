package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n+ 2 LongList.kt\nandroidx/collection/LongList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13607#3,2:972\n1675#3,6:983\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
public final class s5b extends il9 {
    public s5b() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(s5b s5bVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = s5bVar.f47349b;
        }
        s5bVar.trim(i);
    }

    public final boolean add(long j) {
        ensureCapacity(this.f47349b + 1);
        long[] jArr = this.f47348a;
        int i = this.f47349b;
        jArr[i] = j;
        this.f47349b = i + 1;
        return true;
    }

    public final boolean addAll(@h78(from = 0) int i, @yfb long[] jArr) {
        int i2;
        md8.checkNotNullParameter(jArr, "elements");
        if (i < 0 || i > (i2 = this.f47349b)) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.f47349b);
        }
        if (jArr.length == 0) {
            return false;
        }
        ensureCapacity(i2 + jArr.length);
        long[] jArr2 = this.f47348a;
        int i3 = this.f47349b;
        if (i != i3) {
            u70.copyInto(jArr2, jArr2, jArr.length + i, i, i3);
        }
        u70.copyInto$default(jArr, jArr2, i, 0, 0, 12, (Object) null);
        this.f47349b += jArr.length;
        return true;
    }

    public final void clear() {
        this.f47349b = 0;
    }

    public final void ensureCapacity(int i) {
        long[] jArr = this.f47348a;
        if (jArr.length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f47348a = jArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.f47348a.length;
    }

    public final void minusAssign(long j) {
        remove(j);
    }

    public final void plusAssign(@yfb il9 il9Var) {
        md8.checkNotNullParameter(il9Var, "elements");
        addAll(this.f47349b, il9Var);
    }

    public final boolean remove(long j) {
        int iIndexOf = indexOf(j);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "elements");
        int i = this.f47349b;
        for (long j : jArr) {
            remove(j);
        }
        return i != this.f47349b;
    }

    public final long removeAt(@h78(from = 0) int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f47349b)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index ");
            sb.append(i);
            sb.append(" must be in 0..");
            sb.append(this.f47349b - 1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        long[] jArr = this.f47348a;
        long j = jArr[i];
        if (i != i2 - 1) {
            u70.copyInto(jArr, jArr, i, i + 1, i2);
        }
        this.f47349b--;
        return j;
    }

    public final void removeRange(@h78(from = 0) int i, @h78(from = 0) int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.f47349b) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.f47349b);
        }
        if (i2 >= i) {
            if (i2 != i) {
                if (i2 < i3) {
                    long[] jArr = this.f47348a;
                    u70.copyInto(jArr, jArr, i, i2, i3);
                }
                this.f47349b -= i2 - i;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
    }

    public final boolean retainAll(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "elements");
        int i = this.f47349b;
        long[] jArr2 = this.f47348a;
        int i2 = i - 1;
        while (true) {
            int i3 = 0;
            int i4 = -1;
            if (-1 >= i2) {
                break;
            }
            long j = jArr2[i2];
            int length = jArr.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (jArr[i3] == j) {
                    i4 = i3;
                    break;
                }
                i3++;
            }
            if (i4 < 0) {
                removeAt(i2);
            }
            i2--;
        }
        return i != this.f47349b;
    }

    public final long set(@h78(from = 0) int i, long j) {
        if (i >= 0 && i < this.f47349b) {
            long[] jArr = this.f47348a;
            long j2 = jArr[i];
            jArr[i] = j;
            return j2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i);
        sb.append(" must be between 0 .. ");
        sb.append(this.f47349b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void sort() {
        u70.sort(this.f47348a, 0, this.f47349b);
    }

    public final void sortDescending() {
        e80.sortDescending(this.f47348a, 0, this.f47349b);
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this.f47349b);
        long[] jArr = this.f47348a;
        if (jArr.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f47348a = jArrCopyOf;
        }
    }

    public /* synthetic */ s5b(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "elements");
        for (long j : jArr) {
            remove(j);
        }
    }

    public final void plusAssign(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "elements");
        addAll(this.f47349b, jArr);
    }

    public s5b(int i) {
        super(i, null);
    }

    public final void plusAssign(long j) {
        add(j);
    }

    public final void add(@h78(from = 0) int i, long j) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f47349b)) {
            ensureCapacity(i2 + 1);
            long[] jArr = this.f47348a;
            int i3 = this.f47349b;
            if (i != i3) {
                u70.copyInto(jArr, jArr, i + 1, i, i3);
            }
            jArr[i] = j;
            this.f47349b++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.f47349b);
    }

    public final void minusAssign(@yfb il9 il9Var) {
        md8.checkNotNullParameter(il9Var, "elements");
        long[] jArr = il9Var.f47348a;
        int i = il9Var.f47349b;
        for (int i2 = 0; i2 < i; i2++) {
            remove(jArr[i2]);
        }
    }

    public final boolean removeAll(@yfb il9 il9Var) {
        md8.checkNotNullParameter(il9Var, "elements");
        int i = this.f47349b;
        int i2 = il9Var.f47349b - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(il9Var.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this.f47349b;
    }

    public final boolean retainAll(@yfb il9 il9Var) {
        md8.checkNotNullParameter(il9Var, "elements");
        int i = this.f47349b;
        long[] jArr = this.f47348a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!il9Var.contains(jArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this.f47349b;
    }

    public final boolean addAll(@h78(from = 0) int i, @yfb il9 il9Var) {
        md8.checkNotNullParameter(il9Var, "elements");
        if (i >= 0 && i <= this.f47349b) {
            if (il9Var.isEmpty()) {
                return false;
            }
            ensureCapacity(this.f47349b + il9Var.f47349b);
            long[] jArr = this.f47348a;
            int i2 = this.f47349b;
            if (i != i2) {
                u70.copyInto(jArr, jArr, il9Var.f47349b + i, i, i2);
            }
            u70.copyInto(il9Var.f47348a, jArr, i, 0, il9Var.f47349b);
            this.f47349b += il9Var.f47349b;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.f47349b);
    }

    public final boolean addAll(@yfb il9 il9Var) {
        md8.checkNotNullParameter(il9Var, "elements");
        return addAll(this.f47349b, il9Var);
    }

    public final boolean addAll(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "elements");
        return addAll(this.f47349b, jArr);
    }
}

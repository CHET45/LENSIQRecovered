package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13600#3,2:972\n1663#3,6:983\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
public final class g5b extends q68 {
    public g5b() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(g5b g5bVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = g5bVar.f73325b;
        }
        g5bVar.trim(i);
    }

    public final boolean add(int i) {
        ensureCapacity(this.f73325b + 1);
        int[] iArr = this.f73324a;
        int i2 = this.f73325b;
        iArr[i2] = i;
        this.f73325b = i2 + 1;
        return true;
    }

    public final boolean addAll(@h78(from = 0) int i, @yfb int[] iArr) {
        int i2;
        md8.checkNotNullParameter(iArr, "elements");
        if (i < 0 || i > (i2 = this.f73325b)) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.f73325b);
        }
        if (iArr.length == 0) {
            return false;
        }
        ensureCapacity(i2 + iArr.length);
        int[] iArr2 = this.f73324a;
        int i3 = this.f73325b;
        if (i != i3) {
            u70.copyInto(iArr2, iArr2, iArr.length + i, i, i3);
        }
        u70.copyInto$default(iArr, iArr2, i, 0, 0, 12, (Object) null);
        this.f73325b += iArr.length;
        return true;
    }

    public final void clear() {
        this.f73325b = 0;
    }

    public final void ensureCapacity(int i) {
        int[] iArr = this.f73324a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f73324a = iArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.f73324a.length;
    }

    public final void minusAssign(int i) {
        remove(i);
    }

    public final void plusAssign(@yfb q68 q68Var) {
        md8.checkNotNullParameter(q68Var, "elements");
        addAll(this.f73325b, q68Var);
    }

    public final boolean remove(int i) {
        int iIndexOf = indexOf(i);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        int i = this.f73325b;
        for (int i2 : iArr) {
            remove(i2);
        }
        return i != this.f73325b;
    }

    public final int removeAt(@h78(from = 0) int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f73325b)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index ");
            sb.append(i);
            sb.append(" must be in 0..");
            sb.append(this.f73325b - 1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int[] iArr = this.f73324a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            u70.copyInto(iArr, iArr, i, i + 1, i2);
        }
        this.f73325b--;
        return i3;
    }

    public final void removeRange(@h78(from = 0) int i, @h78(from = 0) int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.f73325b) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.f73325b);
        }
        if (i2 >= i) {
            if (i2 != i) {
                if (i2 < i3) {
                    int[] iArr = this.f73324a;
                    u70.copyInto(iArr, iArr, i, i2, i3);
                }
                this.f73325b -= i2 - i;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
    }

    public final boolean retainAll(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        int i = this.f73325b;
        int[] iArr2 = this.f73324a;
        int i2 = i - 1;
        while (true) {
            int i3 = 0;
            int i4 = -1;
            if (-1 >= i2) {
                break;
            }
            int i5 = iArr2[i2];
            int length = iArr.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (iArr[i3] == i5) {
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
        return i != this.f73325b;
    }

    public final int set(@h78(from = 0) int i, int i2) {
        if (i >= 0 && i < this.f73325b) {
            int[] iArr = this.f73324a;
            int i3 = iArr[i];
            iArr[i] = i2;
            return i3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i);
        sb.append(" must be between 0 .. ");
        sb.append(this.f73325b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void sort() {
        u70.sort(this.f73324a, 0, this.f73325b);
    }

    public final void sortDescending() {
        e80.sortDescending(this.f73324a, 0, this.f73325b);
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this.f73325b);
        int[] iArr = this.f73324a;
        if (iArr.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f73324a = iArrCopyOf;
        }
    }

    public /* synthetic */ g5b(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        for (int i : iArr) {
            remove(i);
        }
    }

    public final void plusAssign(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        addAll(this.f73325b, iArr);
    }

    public g5b(int i) {
        super(i, null);
    }

    public final void plusAssign(int i) {
        add(i);
    }

    public final void add(@h78(from = 0) int i, int i2) {
        int i3;
        if (i >= 0 && i <= (i3 = this.f73325b)) {
            ensureCapacity(i3 + 1);
            int[] iArr = this.f73324a;
            int i4 = this.f73325b;
            if (i != i4) {
                u70.copyInto(iArr, iArr, i + 1, i, i4);
            }
            iArr[i] = i2;
            this.f73325b++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.f73325b);
    }

    public final void minusAssign(@yfb q68 q68Var) {
        md8.checkNotNullParameter(q68Var, "elements");
        int[] iArr = q68Var.f73324a;
        int i = q68Var.f73325b;
        for (int i2 = 0; i2 < i; i2++) {
            remove(iArr[i2]);
        }
    }

    public final boolean removeAll(@yfb q68 q68Var) {
        md8.checkNotNullParameter(q68Var, "elements");
        int i = this.f73325b;
        int i2 = q68Var.f73325b - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(q68Var.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this.f73325b;
    }

    public final boolean retainAll(@yfb q68 q68Var) {
        md8.checkNotNullParameter(q68Var, "elements");
        int i = this.f73325b;
        int[] iArr = this.f73324a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!q68Var.contains(iArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this.f73325b;
    }

    public final boolean addAll(@h78(from = 0) int i, @yfb q68 q68Var) {
        md8.checkNotNullParameter(q68Var, "elements");
        if (i >= 0 && i <= this.f73325b) {
            if (q68Var.isEmpty()) {
                return false;
            }
            ensureCapacity(this.f73325b + q68Var.f73325b);
            int[] iArr = this.f73324a;
            int i2 = this.f73325b;
            if (i != i2) {
                u70.copyInto(iArr, iArr, q68Var.f73325b + i, i, i2);
            }
            u70.copyInto(q68Var.f73324a, iArr, i, 0, q68Var.f73325b);
            this.f73325b += q68Var.f73325b;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.f73325b);
    }

    public final boolean addAll(@yfb q68 q68Var) {
        md8.checkNotNullParameter(q68Var, "elements");
        return addAll(this.f73325b, q68Var);
    }

    public final boolean addAll(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        return addAll(this.f73325b, iArr);
    }
}

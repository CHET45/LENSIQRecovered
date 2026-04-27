package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n+ 2 FloatList.kt\nandroidx/collection/FloatList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13614#3,2:972\n1687#3,6:983\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
public final class x4b extends p46 {
    public x4b() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(x4b x4bVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = x4bVar.f69631b;
        }
        x4bVar.trim(i);
    }

    public final boolean add(float f) {
        ensureCapacity(this.f69631b + 1);
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        fArr[i] = f;
        this.f69631b = i + 1;
        return true;
    }

    public final boolean addAll(@h78(from = 0) int i, @yfb float[] fArr) {
        int i2;
        md8.checkNotNullParameter(fArr, "elements");
        if (i < 0 || i > (i2 = this.f69631b)) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.f69631b);
        }
        if (fArr.length == 0) {
            return false;
        }
        ensureCapacity(i2 + fArr.length);
        float[] fArr2 = this.f69630a;
        int i3 = this.f69631b;
        if (i != i3) {
            u70.copyInto(fArr2, fArr2, fArr.length + i, i, i3);
        }
        u70.copyInto$default(fArr, fArr2, i, 0, 0, 12, (Object) null);
        this.f69631b += fArr.length;
        return true;
    }

    public final void clear() {
        this.f69631b = 0;
    }

    public final void ensureCapacity(int i) {
        float[] fArr = this.f69630a;
        if (fArr.length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
            md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, newSize)");
            this.f69630a = fArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.f69630a.length;
    }

    public final void minusAssign(float f) {
        remove(f);
    }

    public final void plusAssign(@yfb p46 p46Var) {
        md8.checkNotNullParameter(p46Var, "elements");
        addAll(this.f69631b, p46Var);
    }

    public final boolean remove(float f) {
        int iIndexOf = indexOf(f);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "elements");
        int i = this.f69631b;
        for (float f : fArr) {
            remove(f);
        }
        return i != this.f69631b;
    }

    public final float removeAt(@h78(from = 0) int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f69631b)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index ");
            sb.append(i);
            sb.append(" must be in 0..");
            sb.append(this.f69631b - 1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        float[] fArr = this.f69630a;
        float f = fArr[i];
        if (i != i2 - 1) {
            u70.copyInto(fArr, fArr, i, i + 1, i2);
        }
        this.f69631b--;
        return f;
    }

    public final void removeRange(@h78(from = 0) int i, @h78(from = 0) int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.f69631b) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.f69631b);
        }
        if (i2 >= i) {
            if (i2 != i) {
                if (i2 < i3) {
                    float[] fArr = this.f69630a;
                    u70.copyInto(fArr, fArr, i, i2, i3);
                }
                this.f69631b -= i2 - i;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
    }

    public final boolean retainAll(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "elements");
        int i = this.f69631b;
        float[] fArr2 = this.f69630a;
        int i2 = i - 1;
        while (true) {
            int i3 = 0;
            int i4 = -1;
            if (-1 >= i2) {
                break;
            }
            float f = fArr2[i2];
            int length = fArr.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (fArr[i3] == f) {
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
        return i != this.f69631b;
    }

    public final float set(@h78(from = 0) int i, float f) {
        if (i >= 0 && i < this.f69631b) {
            float[] fArr = this.f69630a;
            float f2 = fArr[i];
            fArr[i] = f;
            return f2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i);
        sb.append(" must be between 0 .. ");
        sb.append(this.f69631b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void sort() {
        u70.sort(this.f69630a, 0, this.f69631b);
    }

    public final void sortDescending() {
        e80.sortDescending(this.f69630a, 0, this.f69631b);
    }

    public final void trim(int i) {
        int iMax = Math.max(i, this.f69631b);
        float[] fArr = this.f69630a;
        if (fArr.length > iMax) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, iMax);
            md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, newSize)");
            this.f69630a = fArrCopyOf;
        }
    }

    public /* synthetic */ x4b(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final void minusAssign(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "elements");
        for (float f : fArr) {
            remove(f);
        }
    }

    public final void plusAssign(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "elements");
        addAll(this.f69631b, fArr);
    }

    public x4b(int i) {
        super(i, null);
    }

    public final void plusAssign(float f) {
        add(f);
    }

    public final void add(@h78(from = 0) int i, float f) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f69631b)) {
            ensureCapacity(i2 + 1);
            float[] fArr = this.f69630a;
            int i3 = this.f69631b;
            if (i != i3) {
                u70.copyInto(fArr, fArr, i + 1, i, i3);
            }
            fArr[i] = f;
            this.f69631b++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.f69631b);
    }

    public final void minusAssign(@yfb p46 p46Var) {
        md8.checkNotNullParameter(p46Var, "elements");
        float[] fArr = p46Var.f69630a;
        int i = p46Var.f69631b;
        for (int i2 = 0; i2 < i; i2++) {
            remove(fArr[i2]);
        }
    }

    public final boolean removeAll(@yfb p46 p46Var) {
        md8.checkNotNullParameter(p46Var, "elements");
        int i = this.f69631b;
        int i2 = p46Var.f69631b - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(p46Var.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this.f69631b;
    }

    public final boolean retainAll(@yfb p46 p46Var) {
        md8.checkNotNullParameter(p46Var, "elements");
        int i = this.f69631b;
        float[] fArr = this.f69630a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!p46Var.contains(fArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this.f69631b;
    }

    public final boolean addAll(@h78(from = 0) int i, @yfb p46 p46Var) {
        md8.checkNotNullParameter(p46Var, "elements");
        if (i >= 0 && i <= this.f69631b) {
            if (p46Var.isEmpty()) {
                return false;
            }
            ensureCapacity(this.f69631b + p46Var.f69631b);
            float[] fArr = this.f69630a;
            int i2 = this.f69631b;
            if (i != i2) {
                u70.copyInto(fArr, fArr, p46Var.f69631b + i, i, i2);
            }
            u70.copyInto(p46Var.f69630a, fArr, i, 0, p46Var.f69631b);
            this.f69631b += p46Var.f69631b;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.f69631b);
    }

    public final boolean addAll(@yfb p46 p46Var) {
        md8.checkNotNullParameter(p46Var, "elements");
        return addAll(this.f69631b, p46Var);
    }

    public final boolean addAll(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "elements");
        return addAll(this.f69631b, fArr);
    }
}

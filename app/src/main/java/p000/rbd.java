package p000;

import androidx.lifecycle.C1171x;

/* JADX INFO: loaded from: classes7.dex */
public abstract class rbd<T> {

    /* JADX INFO: renamed from: a */
    public final int f77686a;

    /* JADX INFO: renamed from: b */
    public int f77687b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final T[] f77688c;

    public rbd(int i) {
        this.f77686a = i;
        this.f77688c = (T[]) new Object[i];
    }

    private static /* synthetic */ void getSpreads$annotations() {
    }

    /* JADX INFO: renamed from: a */
    public final int m21109a() {
        return this.f77687b;
    }

    public final void addSpread(@yfb T t) {
        md8.checkNotNullParameter(t, "spreadArgument");
        T[] tArr = this.f77688c;
        int i = this.f77687b;
        this.f77687b = i + 1;
        tArr[i] = t;
    }

    /* JADX INFO: renamed from: b */
    public final void m21110b(int i) {
        this.f77687b = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m21111c() {
        int i = this.f77686a - 1;
        int size = 0;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                T t = this.f77688c[i2];
                size += t != null ? getSize(t) : 1;
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return size;
    }

    @yfb
    /* JADX INFO: renamed from: d */
    public final T m21112d(@yfb T t, @yfb T t2) {
        int i;
        md8.checkNotNullParameter(t, C1171x.f7958g);
        md8.checkNotNullParameter(t2, "result");
        int i2 = this.f77686a - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            int i5 = 0;
            i = 0;
            while (true) {
                T t3 = this.f77688c[i4];
                if (t3 != null) {
                    if (i5 < i4) {
                        int i6 = i4 - i5;
                        System.arraycopy(t, i5, t2, i, i6);
                        i += i6;
                    }
                    int size = getSize(t3);
                    System.arraycopy(t3, 0, t2, i, size);
                    i += size;
                    i5 = i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4++;
            }
            i3 = i5;
        } else {
            i = 0;
        }
        int i7 = this.f77686a;
        if (i3 < i7) {
            System.arraycopy(t, i3, t2, i, i7 - i3);
        }
        return t2;
    }

    public abstract int getSize(@yfb T t);
}

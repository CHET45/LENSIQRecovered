package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class g2d {

    /* JADX INFO: renamed from: c */
    public static final int f38300c = 8;

    /* JADX INFO: renamed from: a */
    public int f38301a;

    /* JADX INFO: renamed from: b */
    @yfb
    public long[] f38302b = new long[2];

    public final boolean add(long j) {
        if (contains(j)) {
            return false;
        }
        set(this.f38301a, j);
        return true;
    }

    /* JADX INFO: renamed from: add-0FcD4WY, reason: not valid java name */
    public final boolean m29684add0FcD4WY(long j) {
        return add(j);
    }

    public final void clear() {
        this.f38301a = 0;
    }

    public final boolean contains(long j) {
        int i = this.f38301a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f38302b[i2] == j) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m29685contains0FcD4WY(long j) {
        return contains(j);
    }

    /* JADX INFO: renamed from: get-_I2yYro, reason: not valid java name */
    public final long m29686get_I2yYro(int i) {
        return f2d.m28881constructorimpl(this.f38302b[i]);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.f38301a;
    }

    public final boolean isEmpty() {
        return this.f38301a == 0;
    }

    public final boolean remove(long j) {
        int i = this.f38301a;
        for (int i2 = 0; i2 < i; i2++) {
            if (j == m29686get_I2yYro(i2)) {
                removeAt(i2);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m29687remove0FcD4WY(long j) {
        return remove(j);
    }

    public final boolean removeAt(int i) {
        int i2 = this.f38301a;
        if (i >= i2) {
            return false;
        }
        int i3 = i2 - 1;
        while (i < i3) {
            long[] jArr = this.f38302b;
            int i4 = i + 1;
            jArr[i] = jArr[i4];
            i = i4;
        }
        this.f38301a--;
        return true;
    }

    public final void set(int i, long j) {
        long[] jArr = this.f38302b;
        if (i >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f38302b = jArrCopyOf;
        }
        this.f38302b[i] = j;
        if (i >= this.f38301a) {
            this.f38301a = i + 1;
        }
    }

    /* JADX INFO: renamed from: set-DmW0f2w, reason: not valid java name */
    public final void m29688setDmW0f2w(int i, long j) {
        set(i, j);
    }
}

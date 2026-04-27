package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class u5c<T> {

    /* JADX INFO: renamed from: f */
    public static final int f86847f = -1640531527;

    /* JADX INFO: renamed from: a */
    public final float f86848a;

    /* JADX INFO: renamed from: b */
    public int f86849b;

    /* JADX INFO: renamed from: c */
    public int f86850c;

    /* JADX INFO: renamed from: d */
    public int f86851d;

    /* JADX INFO: renamed from: e */
    public T[] f86852e;

    public u5c() {
        this(16, 0.75f);
    }

    /* JADX INFO: renamed from: a */
    public static int m23101a(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public boolean add(T t) {
        T t2;
        T[] tArr = this.f86852e;
        int i = this.f86849b;
        int iM23101a = m23101a(t.hashCode()) & i;
        T t3 = tArr[iM23101a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                iM23101a = (iM23101a + 1) & i;
                t2 = tArr[iM23101a];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[iM23101a] = t;
        int i2 = this.f86850c + 1;
        this.f86850c = i2;
        if (i2 >= this.f86851d) {
            m23102b();
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m23102b() {
        T t;
        T[] tArr = this.f86852e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.f86850c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                this.f86849b = i2;
                this.f86851d = (int) (i * this.f86848a);
                this.f86852e = tArr2;
                return;
            }
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int iM23101a = m23101a(t.hashCode()) & i2;
            if (tArr2[iM23101a] != null) {
                do {
                    iM23101a = (iM23101a + 1) & i2;
                } while (tArr2[iM23101a] != null);
            }
            tArr2[iM23101a] = tArr[length];
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m23103c(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f86850c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int iM23101a = m23101a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= iM23101a || iM23101a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < iM23101a || iM23101a <= i3) {
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public Object[] keys() {
        return this.f86852e;
    }

    public boolean remove(T t) {
        T t2;
        T[] tArr = this.f86852e;
        int i = this.f86849b;
        int iM23101a = m23101a(t.hashCode()) & i;
        T t3 = tArr[iM23101a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return m23103c(iM23101a, tArr, i);
        }
        do {
            iM23101a = (iM23101a + 1) & i;
            t2 = tArr[iM23101a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return m23103c(iM23101a, tArr, i);
    }

    public int size() {
        return this.f86850c;
    }

    public u5c(int i) {
        this(i, 0.75f);
    }

    public u5c(int i, float f) {
        this.f86848a = f;
        int iRoundToPowerOfTwo = x5d.roundToPowerOfTwo(i);
        this.f86849b = iRoundToPowerOfTwo - 1;
        this.f86851d = (int) (f * iRoundToPowerOfTwo);
        this.f86852e = (T[]) new Object[iRoundToPowerOfTwo];
    }
}

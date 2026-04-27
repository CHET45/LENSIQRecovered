package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class t5c<T> {

    /* JADX INFO: renamed from: f */
    public static final int f83753f = -1640531527;

    /* JADX INFO: renamed from: a */
    public final float f83754a;

    /* JADX INFO: renamed from: b */
    public int f83755b;

    /* JADX INFO: renamed from: c */
    public int f83756c;

    /* JADX INFO: renamed from: d */
    public int f83757d;

    /* JADX INFO: renamed from: e */
    public T[] f83758e;

    public t5c() {
        this(16, 0.75f);
    }

    /* JADX INFO: renamed from: a */
    public static int m22375a(int x) {
        int i = x * (-1640531527);
        return i ^ (i >>> 16);
    }

    public boolean add(T value) {
        T t;
        T[] tArr = this.f83758e;
        int i = this.f83755b;
        int iM22375a = m22375a(value.hashCode()) & i;
        T t2 = tArr[iM22375a];
        if (t2 != null) {
            if (t2.equals(value)) {
                return false;
            }
            do {
                iM22375a = (iM22375a + 1) & i;
                t = tArr[iM22375a];
                if (t == null) {
                }
            } while (!t.equals(value));
            return false;
        }
        tArr[iM22375a] = value;
        int i2 = this.f83756c + 1;
        this.f83756c = i2;
        if (i2 >= this.f83757d) {
            m22376b();
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m22376b() {
        T t;
        T[] tArr = this.f83758e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.f83756c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                this.f83755b = i2;
                this.f83757d = (int) (i * this.f83754a);
                this.f83758e = tArr2;
                return;
            }
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int iM22375a = m22375a(t.hashCode()) & i2;
            if (tArr2[iM22375a] != null) {
                do {
                    iM22375a = (iM22375a + 1) & i2;
                } while (tArr2[iM22375a] != null);
            }
            tArr2[iM22375a] = tArr[length];
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m22377c(int pos, T[] a, int m) {
        int i;
        T t;
        this.f83756c--;
        while (true) {
            int i2 = pos + 1;
            while (true) {
                i = i2 & m;
                t = a[i];
                if (t == null) {
                    a[pos] = null;
                    return true;
                }
                int iM22375a = m22375a(t.hashCode()) & m;
                if (pos <= i) {
                    if (pos >= iM22375a || iM22375a > i) {
                        break;
                    }
                    i2 = i + 1;
                } else if (pos < iM22375a || iM22375a <= i) {
                    i2 = i + 1;
                }
            }
            a[pos] = t;
            pos = i;
        }
    }

    public Object[] keys() {
        return this.f83758e;
    }

    public boolean remove(T value) {
        T t;
        T[] tArr = this.f83758e;
        int i = this.f83755b;
        int iM22375a = m22375a(value.hashCode()) & i;
        T t2 = tArr[iM22375a];
        if (t2 == null) {
            return false;
        }
        if (t2.equals(value)) {
            return m22377c(iM22375a, tArr, i);
        }
        do {
            iM22375a = (iM22375a + 1) & i;
            t = tArr[iM22375a];
            if (t == null) {
                return false;
            }
        } while (!t.equals(value));
        return m22377c(iM22375a, tArr, i);
    }

    public int size() {
        return this.f83756c;
    }

    public t5c(int capacity) {
        this(capacity, 0.75f);
    }

    public t5c(int i, float f) {
        this.f83754a = f;
        int iRoundToPowerOfTwo = w5d.roundToPowerOfTwo(i);
        this.f83755b = iRoundToPowerOfTwo - 1;
        this.f83757d = (int) (f * iRoundToPowerOfTwo);
        this.f83758e = (T[]) new Object[iRoundToPowerOfTwo];
    }
}

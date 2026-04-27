package p000;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class rc0 implements Iterable<ic0>, Cloneable {

    /* JADX INFO: renamed from: C */
    public static final String f77696C = "";

    /* JADX INFO: renamed from: d */
    public static final int f77697d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f77698e = 2;

    /* JADX INFO: renamed from: f */
    public static final String[] f77699f = new String[0];

    /* JADX INFO: renamed from: m */
    public static final int f77700m = -1;

    /* JADX INFO: renamed from: a */
    public int f77701a = 0;

    /* JADX INFO: renamed from: b */
    public String[] f77702b;

    /* JADX INFO: renamed from: c */
    public String[] f77703c;

    /* JADX INFO: renamed from: rc0$a */
    public class C11998a implements Iterator<ic0> {

        /* JADX INFO: renamed from: a */
        public int f77704a = 0;

        public C11998a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f77704a < rc0.this.f77701a;
        }

        @Override // java.util.Iterator
        public void remove() {
            rc0 rc0Var = rc0.this;
            int i = this.f77704a - 1;
            this.f77704a = i;
            rc0Var.remove(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public ic0 next() {
            rc0 rc0Var = rc0.this;
            String[] strArr = rc0Var.f77703c;
            int i = this.f77704a;
            String str = strArr[i];
            String str2 = rc0Var.f77702b[i];
            if (str == null) {
                str = "";
            }
            ic0 ic0Var = new ic0(str2, str, rc0Var);
            this.f77704a++;
            return ic0Var;
        }
    }

    public rc0() {
        String[] strArr = f77699f;
        this.f77702b = strArr;
        this.f77703c = strArr;
    }

    private void add(String str, String str2) {
        checkCapacity(this.f77701a + 1);
        String[] strArr = this.f77702b;
        int i = this.f77701a;
        strArr[i] = str;
        this.f77703c[i] = str2;
        this.f77701a = i + 1;
    }

    /* JADX INFO: renamed from: c */
    public static String m21116c(String str) {
        return str == null ? "" : str;
    }

    private void checkCapacity(int i) {
        v1i.isTrue(i >= this.f77701a);
        String[] strArr = this.f77702b;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 4 ? this.f77701a * 2 : 4;
        if (i <= i2) {
            i = i2;
        }
        this.f77702b = copyOf(strArr, i);
        this.f77703c = copyOf(this.f77703c, i);
    }

    private static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
        return strArr2;
    }

    private int indexOfKeyIgnoreCase(String str) {
        v1i.notNull(str);
        for (int i = 0; i < this.f77701a; i++) {
            if (str.equalsIgnoreCase(this.f77702b[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void remove(int i) {
        v1i.isFalse(i >= this.f77701a);
        int i2 = (this.f77701a - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.f77702b;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.f77703c;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.f77701a - 1;
        this.f77701a = i4;
        this.f77702b[i4] = null;
        this.f77703c[i4] = null;
    }

    public void addAll(rc0 rc0Var) {
        if (rc0Var.size() == 0) {
            return;
        }
        checkCapacity(this.f77701a + rc0Var.f77701a);
        Iterator<ic0> it = rc0Var.iterator();
        while (it.hasNext()) {
            put(it.next());
        }
    }

    /* JADX INFO: renamed from: d */
    public int m21117d(String str) {
        v1i.notNull(str);
        for (int i = 0; i < this.f77701a; i++) {
            if (str.equals(this.f77702b[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public void m21118e(String str, String str2) {
        int iIndexOfKeyIgnoreCase = indexOfKeyIgnoreCase(str);
        if (iIndexOfKeyIgnoreCase == -1) {
            add(str, str2);
            return;
        }
        this.f77703c[iIndexOfKeyIgnoreCase] = str2;
        if (this.f77702b[iIndexOfKeyIgnoreCase].equals(str)) {
            return;
        }
        this.f77702b[iIndexOfKeyIgnoreCase] = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rc0 rc0Var = (rc0) obj;
        if (this.f77701a == rc0Var.f77701a && Arrays.equals(this.f77702b, rc0Var.f77702b)) {
            return Arrays.equals(this.f77703c, rc0Var.f77703c);
        }
        return false;
    }

    public String get(String str) {
        int iM21117d = m21117d(str);
        return iM21117d == -1 ? "" : m21116c(this.f77703c[iM21117d]);
    }

    public String getIgnoreCase(String str) {
        int iIndexOfKeyIgnoreCase = indexOfKeyIgnoreCase(str);
        return iIndexOfKeyIgnoreCase == -1 ? "" : m21116c(this.f77703c[iIndexOfKeyIgnoreCase]);
    }

    public boolean hasKey(String str) {
        return m21117d(str) != -1;
    }

    public boolean hasKeyIgnoreCase(String str) {
        return indexOfKeyIgnoreCase(str) != -1;
    }

    public int hashCode() {
        return (((this.f77701a * 31) + Arrays.hashCode(this.f77702b)) * 31) + Arrays.hashCode(this.f77703c);
    }

    @Override // java.lang.Iterable
    public Iterator<ic0> iterator() {
        return new C11998a();
    }

    public void normalize() {
        for (int i = 0; i < this.f77701a; i++) {
            String[] strArr = this.f77702b;
            strArr[i] = rfb.lowerCase(strArr[i]);
        }
    }

    public rc0 put(String str, String str2) {
        int iM21117d = m21117d(str);
        if (iM21117d != -1) {
            this.f77703c[iM21117d] = str2;
        } else {
            add(str, str2);
        }
        return this;
    }

    public void removeIgnoreCase(String str) {
        int iIndexOfKeyIgnoreCase = indexOfKeyIgnoreCase(str);
        if (iIndexOfKeyIgnoreCase != -1) {
            remove(iIndexOfKeyIgnoreCase);
        }
    }

    public int size() {
        return this.f77701a;
    }

    public rc0 clone() {
        try {
            rc0 rc0Var = (rc0) super.clone();
            rc0Var.f77701a = this.f77701a;
            this.f77702b = copyOf(this.f77702b, this.f77701a);
            this.f77703c = copyOf(this.f77703c, this.f77701a);
            return rc0Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public rc0 put(String str, boolean z) {
        if (z) {
            m21118e(str, null);
        } else {
            remove(str);
        }
        return this;
    }

    public rc0 put(ic0 ic0Var) {
        v1i.notNull(ic0Var);
        put(ic0Var.getKey(), ic0Var.getValue());
        ic0Var.f46478c = this;
        return this;
    }

    public void remove(String str) {
        int iM21117d = m21117d(str);
        if (iM21117d != -1) {
            remove(iM21117d);
        }
    }
}

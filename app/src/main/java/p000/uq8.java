package p000;

import java.io.PrintStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class uq8 {

    /* JADX INFO: renamed from: uq8$a */
    public static class C13649a {

        /* JADX INFO: renamed from: d */
        public static final int f88770d = 999;

        /* JADX INFO: renamed from: a */
        public int[] f88771a = new int[101];

        /* JADX INFO: renamed from: b */
        public fb3[] f88772b = new fb3[101];

        /* JADX INFO: renamed from: c */
        public int f88773c;

        public C13649a() {
            clear();
        }

        public void append(int i, fb3 fb3Var) {
            if (this.f88772b[i] != null) {
                remove(i);
            }
            this.f88772b[i] = fb3Var;
            int[] iArr = this.f88771a;
            int i2 = this.f88773c;
            this.f88773c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.f88771a, 999);
            Arrays.fill(this.f88772b, (Object) null);
            this.f88773c = 0;
        }

        public void dump() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f88771a, this.f88773c)));
            printStream.print("K: [");
            int i = 0;
            while (i < this.f88773c) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(valueAt(i));
                printStream2.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.f88771a[i];
        }

        public void remove(int i) {
            this.f88772b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f88773c;
                if (i2 >= i4) {
                    this.f88773c = i4 - 1;
                    return;
                }
                int[] iArr = this.f88771a;
                if (i == iArr[i2]) {
                    iArr[i2] = 999;
                    i3++;
                }
                if (i2 != i3) {
                    iArr[i2] = iArr[i3];
                }
                i3++;
                i2++;
            }
        }

        public int size() {
            return this.f88773c;
        }

        public fb3 valueAt(int i) {
            return this.f88772b[this.f88771a[i]];
        }
    }

    /* JADX INFO: renamed from: uq8$b */
    public static class C13650b {

        /* JADX INFO: renamed from: d */
        public static final int f88774d = 999;

        /* JADX INFO: renamed from: a */
        public int[] f88775a = new int[101];

        /* JADX INFO: renamed from: b */
        public ge3[] f88776b = new ge3[101];

        /* JADX INFO: renamed from: c */
        public int f88777c;

        public C13650b() {
            clear();
        }

        public void append(int i, ge3 ge3Var) {
            if (this.f88776b[i] != null) {
                remove(i);
            }
            this.f88776b[i] = ge3Var;
            int[] iArr = this.f88775a;
            int i2 = this.f88777c;
            this.f88777c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.f88775a, 999);
            Arrays.fill(this.f88776b, (Object) null);
            this.f88777c = 0;
        }

        public void dump() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f88775a, this.f88777c)));
            printStream.print("K: [");
            int i = 0;
            while (i < this.f88777c) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(valueAt(i));
                printStream2.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.f88775a[i];
        }

        public void remove(int i) {
            this.f88776b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f88777c;
                if (i2 >= i4) {
                    this.f88777c = i4 - 1;
                    return;
                }
                int[] iArr = this.f88775a;
                if (i == iArr[i2]) {
                    iArr[i2] = 999;
                    i3++;
                }
                if (i2 != i3) {
                    iArr[i2] = iArr[i3];
                }
                i3++;
                i2++;
            }
        }

        public int size() {
            return this.f88777c;
        }

        public ge3 valueAt(int i) {
            return this.f88776b[this.f88775a[i]];
        }
    }

    /* JADX INFO: renamed from: uq8$c */
    public static class C13651c {

        /* JADX INFO: renamed from: d */
        public static final int f88778d = 999;

        /* JADX INFO: renamed from: a */
        public int[] f88779a = new int[101];

        /* JADX INFO: renamed from: b */
        public float[][] f88780b = new float[101][];

        /* JADX INFO: renamed from: c */
        public int f88781c;

        public C13651c() {
            clear();
        }

        public void append(int i, float[] fArr) {
            if (this.f88780b[i] != null) {
                remove(i);
            }
            this.f88780b[i] = fArr;
            int[] iArr = this.f88779a;
            int i2 = this.f88781c;
            this.f88781c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.f88779a, 999);
            Arrays.fill(this.f88780b, (Object) null);
            this.f88781c = 0;
        }

        public void dump() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f88779a, this.f88781c)));
            printStream.print("K: [");
            int i = 0;
            while (i < this.f88781c) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(Arrays.toString(valueAt(i)));
                printStream2.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.f88779a[i];
        }

        public void remove(int i) {
            this.f88780b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f88781c;
                if (i2 >= i4) {
                    this.f88781c = i4 - 1;
                    return;
                }
                int[] iArr = this.f88779a;
                if (i == iArr[i2]) {
                    iArr[i2] = 999;
                    i3++;
                }
                if (i2 != i3) {
                    iArr[i2] = iArr[i3];
                }
                i3++;
                i2++;
            }
        }

        public int size() {
            return this.f88781c;
        }

        public float[] valueAt(int i) {
            return this.f88780b[this.f88779a[i]];
        }
    }
}

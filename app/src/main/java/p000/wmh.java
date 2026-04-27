package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class wmh {

    /* JADX INFO: renamed from: m */
    public static final int f94778m = 4;

    /* JADX INFO: renamed from: n */
    public static final int f94779n = 10;

    /* JADX INFO: renamed from: o */
    public static final int f94780o = 10;

    /* JADX INFO: renamed from: p */
    public static final int f94781p = 5;

    /* JADX INFO: renamed from: a */
    public int[] f94782a = new int[10];

    /* JADX INFO: renamed from: b */
    public int[] f94783b = new int[10];

    /* JADX INFO: renamed from: c */
    public int f94784c = 0;

    /* JADX INFO: renamed from: d */
    public int[] f94785d = new int[10];

    /* JADX INFO: renamed from: e */
    public float[] f94786e = new float[10];

    /* JADX INFO: renamed from: f */
    public int f94787f = 0;

    /* JADX INFO: renamed from: g */
    public int[] f94788g = new int[5];

    /* JADX INFO: renamed from: h */
    public String[] f94789h = new String[5];

    /* JADX INFO: renamed from: i */
    public int f94790i = 0;

    /* JADX INFO: renamed from: j */
    public int[] f94791j = new int[4];

    /* JADX INFO: renamed from: k */
    public boolean[] f94792k = new boolean[4];

    /* JADX INFO: renamed from: l */
    public int f94793l = 0;

    public void add(int i, int i2) {
        int i3 = this.f94784c;
        int[] iArr = this.f94782a;
        if (i3 >= iArr.length) {
            this.f94782a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f94783b;
            this.f94783b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f94782a;
        int i4 = this.f94784c;
        iArr3[i4] = i;
        int[] iArr4 = this.f94783b;
        this.f94784c = i4 + 1;
        iArr4[i4] = i2;
    }

    public void addIfNotNull(int i, String str) {
        if (str != null) {
            add(i, str);
        }
    }

    public void applyDelta(ymh ymhVar) {
        for (int i = 0; i < this.f94784c; i++) {
            ymhVar.setValue(this.f94782a[i], this.f94783b[i]);
        }
        for (int i2 = 0; i2 < this.f94787f; i2++) {
            ymhVar.setValue(this.f94785d[i2], this.f94786e[i2]);
        }
        for (int i3 = 0; i3 < this.f94790i; i3++) {
            ymhVar.setValue(this.f94788g[i3], this.f94789h[i3]);
        }
        for (int i4 = 0; i4 < this.f94793l; i4++) {
            ymhVar.setValue(this.f94791j[i4], this.f94792k[i4]);
        }
    }

    public void clear() {
        this.f94793l = 0;
        this.f94790i = 0;
        this.f94787f = 0;
        this.f94784c = 0;
    }

    public int getInteger(int i) {
        for (int i2 = 0; i2 < this.f94784c; i2++) {
            if (this.f94782a[i2] == i) {
                return this.f94783b[i2];
            }
        }
        return -1;
    }

    public void add(int i, float f) {
        int i2 = this.f94787f;
        int[] iArr = this.f94785d;
        if (i2 >= iArr.length) {
            this.f94785d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f94786e;
            this.f94786e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f94785d;
        int i3 = this.f94787f;
        iArr2[i3] = i;
        float[] fArr2 = this.f94786e;
        this.f94787f = i3 + 1;
        fArr2[i3] = f;
    }

    public void applyDelta(wmh wmhVar) {
        for (int i = 0; i < this.f94784c; i++) {
            wmhVar.add(this.f94782a[i], this.f94783b[i]);
        }
        for (int i2 = 0; i2 < this.f94787f; i2++) {
            wmhVar.add(this.f94785d[i2], this.f94786e[i2]);
        }
        for (int i3 = 0; i3 < this.f94790i; i3++) {
            wmhVar.add(this.f94788g[i3], this.f94789h[i3]);
        }
        for (int i4 = 0; i4 < this.f94793l; i4++) {
            wmhVar.add(this.f94791j[i4], this.f94792k[i4]);
        }
    }

    public void add(int i, String str) {
        int i2 = this.f94790i;
        int[] iArr = this.f94788g;
        if (i2 >= iArr.length) {
            this.f94788g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f94789h;
            this.f94789h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f94788g;
        int i3 = this.f94790i;
        iArr2[i3] = i;
        String[] strArr2 = this.f94789h;
        this.f94790i = i3 + 1;
        strArr2[i3] = str;
    }

    public void add(int i, boolean z) {
        int i2 = this.f94793l;
        int[] iArr = this.f94791j;
        if (i2 >= iArr.length) {
            this.f94791j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f94792k;
            this.f94792k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f94791j;
        int i3 = this.f94793l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f94792k;
        this.f94793l = i3 + 1;
        zArr2[i3] = z;
    }
}

package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p000.arf;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class arf {

    /* JADX INFO: renamed from: h */
    public static final Comparator<C1581b> f11688h = new Comparator() { // from class: xqf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return arf.lambda$static$0((arf.C1581b) obj, (arf.C1581b) obj2);
        }
    };

    /* JADX INFO: renamed from: i */
    public static final Comparator<C1581b> f11689i = new Comparator() { // from class: zqf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return arf.lambda$static$1((arf.C1581b) obj, (arf.C1581b) obj2);
        }
    };

    /* JADX INFO: renamed from: j */
    public static final int f11690j = -1;

    /* JADX INFO: renamed from: k */
    public static final int f11691k = 0;

    /* JADX INFO: renamed from: l */
    public static final int f11692l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f11693m = 5;

    /* JADX INFO: renamed from: a */
    public final int f11694a;

    /* JADX INFO: renamed from: e */
    public int f11698e;

    /* JADX INFO: renamed from: f */
    public int f11699f;

    /* JADX INFO: renamed from: g */
    public int f11700g;

    /* JADX INFO: renamed from: c */
    public final C1581b[] f11696c = new C1581b[5];

    /* JADX INFO: renamed from: b */
    public final ArrayList<C1581b> f11695b = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public int f11697d = -1;

    /* JADX INFO: renamed from: arf$b */
    public static class C1581b {

        /* JADX INFO: renamed from: a */
        public int f11701a;

        /* JADX INFO: renamed from: b */
        public int f11702b;

        /* JADX INFO: renamed from: c */
        public float f11703c;

        private C1581b() {
        }
    }

    public arf(int i) {
        this.f11694a = i;
    }

    private void ensureSortedByIndex() {
        if (this.f11697d != 1) {
            Collections.sort(this.f11695b, f11688h);
            this.f11697d = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.f11697d != 0) {
            Collections.sort(this.f11695b, f11689i);
            this.f11697d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(C1581b c1581b, C1581b c1581b2) {
        return c1581b.f11701a - c1581b2.f11701a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(C1581b c1581b, C1581b c1581b2) {
        return Float.compare(c1581b.f11703c, c1581b2.f11703c);
    }

    public void addSample(int i, float f) {
        C1581b c1581b;
        ensureSortedByIndex();
        int i2 = this.f11700g;
        if (i2 > 0) {
            C1581b[] c1581bArr = this.f11696c;
            int i3 = i2 - 1;
            this.f11700g = i3;
            c1581b = c1581bArr[i3];
        } else {
            c1581b = new C1581b();
        }
        int i4 = this.f11698e;
        this.f11698e = i4 + 1;
        c1581b.f11701a = i4;
        c1581b.f11702b = i;
        c1581b.f11703c = f;
        this.f11695b.add(c1581b);
        this.f11699f += i;
        while (true) {
            int i5 = this.f11699f;
            int i6 = this.f11694a;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            C1581b c1581b2 = this.f11695b.get(0);
            int i8 = c1581b2.f11702b;
            if (i8 <= i7) {
                this.f11699f -= i8;
                this.f11695b.remove(0);
                int i9 = this.f11700g;
                if (i9 < 5) {
                    C1581b[] c1581bArr2 = this.f11696c;
                    this.f11700g = i9 + 1;
                    c1581bArr2[i9] = c1581b2;
                }
            } else {
                c1581b2.f11702b = i8 - i7;
                this.f11699f -= i7;
            }
        }
    }

    public float getPercentile(float f) {
        ensureSortedByValue();
        float f2 = f * this.f11699f;
        int i = 0;
        for (int i2 = 0; i2 < this.f11695b.size(); i2++) {
            C1581b c1581b = this.f11695b.get(i2);
            i += c1581b.f11702b;
            if (i >= f2) {
                return c1581b.f11703c;
            }
        }
        if (this.f11695b.isEmpty()) {
            return Float.NaN;
        }
        return this.f11695b.get(r5.size() - 1).f11703c;
    }

    public void reset() {
        this.f11695b.clear();
        this.f11697d = -1;
        this.f11698e = 0;
        this.f11699f = 0;
    }
}

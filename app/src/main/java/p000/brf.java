package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p000.brf;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class brf {

    /* JADX INFO: renamed from: h */
    public static final Comparator<C2023b> f14605h = new Comparator() { // from class: wqf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return brf.lambda$static$0((brf.C2023b) obj, (brf.C2023b) obj2);
        }
    };

    /* JADX INFO: renamed from: i */
    public static final Comparator<C2023b> f14606i = new Comparator() { // from class: yqf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return brf.lambda$static$1((brf.C2023b) obj, (brf.C2023b) obj2);
        }
    };

    /* JADX INFO: renamed from: j */
    public static final int f14607j = -1;

    /* JADX INFO: renamed from: k */
    public static final int f14608k = 0;

    /* JADX INFO: renamed from: l */
    public static final int f14609l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f14610m = 5;

    /* JADX INFO: renamed from: a */
    public final int f14611a;

    /* JADX INFO: renamed from: e */
    public int f14615e;

    /* JADX INFO: renamed from: f */
    public int f14616f;

    /* JADX INFO: renamed from: g */
    public int f14617g;

    /* JADX INFO: renamed from: c */
    public final C2023b[] f14613c = new C2023b[5];

    /* JADX INFO: renamed from: b */
    public final ArrayList<C2023b> f14612b = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public int f14614d = -1;

    /* JADX INFO: renamed from: brf$b */
    public static class C2023b {

        /* JADX INFO: renamed from: a */
        public int f14618a;

        /* JADX INFO: renamed from: b */
        public int f14619b;

        /* JADX INFO: renamed from: c */
        public float f14620c;

        private C2023b() {
        }
    }

    public brf(int i) {
        this.f14611a = i;
    }

    private void ensureSortedByIndex() {
        if (this.f14614d != 1) {
            Collections.sort(this.f14612b, f14605h);
            this.f14614d = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.f14614d != 0) {
            Collections.sort(this.f14612b, f14606i);
            this.f14614d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(C2023b c2023b, C2023b c2023b2) {
        return c2023b.f14618a - c2023b2.f14618a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(C2023b c2023b, C2023b c2023b2) {
        return Float.compare(c2023b.f14620c, c2023b2.f14620c);
    }

    public void addSample(int i, float f) {
        C2023b c2023b;
        ensureSortedByIndex();
        int i2 = this.f14617g;
        if (i2 > 0) {
            C2023b[] c2023bArr = this.f14613c;
            int i3 = i2 - 1;
            this.f14617g = i3;
            c2023b = c2023bArr[i3];
        } else {
            c2023b = new C2023b();
        }
        int i4 = this.f14615e;
        this.f14615e = i4 + 1;
        c2023b.f14618a = i4;
        c2023b.f14619b = i;
        c2023b.f14620c = f;
        this.f14612b.add(c2023b);
        this.f14616f += i;
        while (true) {
            int i5 = this.f14616f;
            int i6 = this.f14611a;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            C2023b c2023b2 = this.f14612b.get(0);
            int i8 = c2023b2.f14619b;
            if (i8 <= i7) {
                this.f14616f -= i8;
                this.f14612b.remove(0);
                int i9 = this.f14617g;
                if (i9 < 5) {
                    C2023b[] c2023bArr2 = this.f14613c;
                    this.f14617g = i9 + 1;
                    c2023bArr2[i9] = c2023b2;
                }
            } else {
                c2023b2.f14619b = i8 - i7;
                this.f14616f -= i7;
            }
        }
    }

    public float getPercentile(float f) {
        ensureSortedByValue();
        float f2 = f * this.f14616f;
        int i = 0;
        for (int i2 = 0; i2 < this.f14612b.size(); i2++) {
            C2023b c2023b = this.f14612b.get(i2);
            i += c2023b.f14619b;
            if (i >= f2) {
                return c2023b.f14620c;
            }
        }
        if (this.f14612b.isEmpty()) {
            return Float.NaN;
        }
        return this.f14612b.get(r5.size() - 1).f14620c;
    }

    public void reset() {
        this.f14612b.clear();
        this.f14614d = -1;
        this.f14615e = 0;
        this.f14616f = 0;
    }
}

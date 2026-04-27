package p000;

import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p000.adc;

/* JADX INFO: loaded from: classes3.dex */
public final class y82 {

    /* JADX INFO: renamed from: g */
    public static final String f100717g = "ColorCutQuantizer";

    /* JADX INFO: renamed from: h */
    public static final boolean f100718h = false;

    /* JADX INFO: renamed from: i */
    public static final int f100719i = -3;

    /* JADX INFO: renamed from: j */
    public static final int f100720j = -2;

    /* JADX INFO: renamed from: k */
    public static final int f100721k = -1;

    /* JADX INFO: renamed from: l */
    public static final int f100722l = 5;

    /* JADX INFO: renamed from: m */
    public static final int f100723m = 31;

    /* JADX INFO: renamed from: n */
    public static final Comparator<C15545b> f100724n = new C15544a();

    /* JADX INFO: renamed from: a */
    public final int[] f100725a;

    /* JADX INFO: renamed from: b */
    public final int[] f100726b;

    /* JADX INFO: renamed from: c */
    public final List<adc.C0185e> f100727c;

    /* JADX INFO: renamed from: e */
    public final adc.InterfaceC0183c[] f100729e;

    /* JADX INFO: renamed from: f */
    public final float[] f100730f = new float[3];

    /* JADX INFO: renamed from: d */
    @hib
    public final TimingLogger f100728d = null;

    /* JADX INFO: renamed from: y82$a */
    public static class C15544a implements Comparator<C15545b> {
        @Override // java.util.Comparator
        public int compare(C15545b c15545b, C15545b c15545b2) {
            return c15545b2.m25693g() - c15545b.m25693g();
        }
    }

    /* JADX INFO: renamed from: y82$b */
    public class C15545b {

        /* JADX INFO: renamed from: a */
        public int f100731a;

        /* JADX INFO: renamed from: b */
        public int f100732b;

        /* JADX INFO: renamed from: c */
        public int f100733c;

        /* JADX INFO: renamed from: d */
        public int f100734d;

        /* JADX INFO: renamed from: e */
        public int f100735e;

        /* JADX INFO: renamed from: f */
        public int f100736f;

        /* JADX INFO: renamed from: g */
        public int f100737g;

        /* JADX INFO: renamed from: h */
        public int f100738h;

        /* JADX INFO: renamed from: i */
        public int f100739i;

        public C15545b(int i, int i2) {
            this.f100731a = i;
            this.f100732b = i2;
            m25689c();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m25687a() {
            return m25691e() > 1;
        }

        /* JADX INFO: renamed from: b */
        public final int m25688b() {
            int iM25692f = m25692f();
            y82 y82Var = y82.this;
            int[] iArr = y82Var.f100725a;
            int[] iArr2 = y82Var.f100726b;
            y82.m25682c(iArr, iM25692f, this.f100731a, this.f100732b);
            Arrays.sort(iArr, this.f100731a, this.f100732b + 1);
            y82.m25682c(iArr, iM25692f, this.f100731a, this.f100732b);
            int i = this.f100733c / 2;
            int i2 = this.f100731a;
            int i3 = 0;
            while (true) {
                int i4 = this.f100732b;
                if (i2 > i4) {
                    return this.f100731a;
                }
                i3 += iArr2[iArr[i2]];
                if (i3 >= i) {
                    return Math.min(i4 - 1, i2);
                }
                i2++;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m25689c() {
            y82 y82Var = y82.this;
            int[] iArr = y82Var.f100725a;
            int[] iArr2 = y82Var.f100726b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.f100731a; i8 <= this.f100732b; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int iM25685f = y82.m25685f(i9);
                int iM25684e = y82.m25684e(i9);
                int iM25683d = y82.m25683d(i9);
                if (iM25685f > i2) {
                    i2 = iM25685f;
                }
                if (iM25685f < i) {
                    i = iM25685f;
                }
                if (iM25684e > i3) {
                    i3 = iM25684e;
                }
                if (iM25684e < i6) {
                    i6 = iM25684e;
                }
                if (iM25683d > i4) {
                    i4 = iM25683d;
                }
                if (iM25683d < i7) {
                    i7 = iM25683d;
                }
            }
            this.f100734d = i;
            this.f100735e = i2;
            this.f100736f = i6;
            this.f100737g = i3;
            this.f100738h = i7;
            this.f100739i = i4;
            this.f100733c = i5;
        }

        /* JADX INFO: renamed from: d */
        public final adc.C0185e m25690d() {
            y82 y82Var = y82.this;
            int[] iArr = y82Var.f100725a;
            int[] iArr2 = y82Var.f100726b;
            int iM25685f = 0;
            int i = 0;
            int iM25684e = 0;
            int iM25683d = 0;
            for (int i2 = this.f100731a; i2 <= this.f100732b; i2++) {
                int i3 = iArr[i2];
                int i4 = iArr2[i3];
                i += i4;
                iM25685f += y82.m25685f(i3) * i4;
                iM25684e += y82.m25684e(i3) * i4;
                iM25683d += i4 * y82.m25683d(i3);
            }
            float f = i;
            return new adc.C0185e(y82.m25681a(Math.round(iM25685f / f), Math.round(iM25684e / f), Math.round(iM25683d / f)), i);
        }

        /* JADX INFO: renamed from: e */
        public final int m25691e() {
            return (this.f100732b + 1) - this.f100731a;
        }

        /* JADX INFO: renamed from: f */
        public final int m25692f() {
            int i = this.f100735e - this.f100734d;
            int i2 = this.f100737g - this.f100736f;
            int i3 = this.f100739i - this.f100738h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        /* JADX INFO: renamed from: g */
        public final int m25693g() {
            return ((this.f100735e - this.f100734d) + 1) * ((this.f100737g - this.f100736f) + 1) * ((this.f100739i - this.f100738h) + 1);
        }

        /* JADX INFO: renamed from: h */
        public final C15545b m25694h() {
            if (!m25687a()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iM25688b = m25688b();
            C15545b c15545b = y82.this.new C15545b(iM25688b + 1, this.f100732b);
            this.f100732b = iM25688b;
            m25689c();
            return c15545b;
        }
    }

    public y82(int[] iArr, int i, adc.InterfaceC0183c[] interfaceC0183cArr) {
        this.f100729e = interfaceC0183cArr;
        int[] iArr2 = new int[32768];
        this.f100726b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int iQuantizeFromRgb888 = quantizeFromRgb888(iArr[i2]);
            iArr[i2] = iQuantizeFromRgb888;
            iArr2[iQuantizeFromRgb888] = iArr2[iQuantizeFromRgb888] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && shouldIgnoreColor(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f100725a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 > i) {
            this.f100727c = quantizePixels(i);
            return;
        }
        this.f100727c = new ArrayList();
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = iArr3[i7];
            this.f100727c.add(new adc.C0185e(approximateToRgb888(i8), iArr2[i8]));
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m25681a(int i, int i2, int i3) {
        return Color.rgb(modifyWordWidth(i, 5, 8), modifyWordWidth(i2, 5, 8), modifyWordWidth(i3, 5, 8));
    }

    private static int approximateToRgb888(int i) {
        return m25681a(m25685f(i), m25684e(i), m25683d(i));
    }

    /* JADX INFO: renamed from: c */
    public static void m25682c(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = m25683d(i4) | (m25684e(i4) << 10) | (m25685f(i4) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = m25685f(i5) | (m25683d(i5) << 10) | (m25684e(i5) << 5);
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m25683d(int i) {
        return i & 31;
    }

    /* JADX INFO: renamed from: e */
    public static int m25684e(int i) {
        return (i >> 5) & 31;
    }

    /* JADX INFO: renamed from: f */
    public static int m25685f(int i) {
        return (i >> 10) & 31;
    }

    private List<adc.C0185e> generateAverageColors(Collection<C15545b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<C15545b> it = collection.iterator();
        while (it.hasNext()) {
            adc.C0185e c0185eM25690d = it.next().m25690d();
            if (!shouldIgnoreColor(c0185eM25690d)) {
                arrayList.add(c0185eM25690d);
            }
        }
        return arrayList;
    }

    private static int modifyWordWidth(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    private static int quantizeFromRgb888(int i) {
        return modifyWordWidth(Color.blue(i), 8, 5) | (modifyWordWidth(Color.red(i), 8, 5) << 10) | (modifyWordWidth(Color.green(i), 8, 5) << 5);
    }

    private List<adc.C0185e> quantizePixels(int i) {
        PriorityQueue<C15545b> priorityQueue = new PriorityQueue<>(i, f100724n);
        priorityQueue.offer(new C15545b(0, this.f100725a.length - 1));
        splitBoxes(priorityQueue, i);
        return generateAverageColors(priorityQueue);
    }

    private boolean shouldIgnoreColor(int i) {
        int iApproximateToRgb888 = approximateToRgb888(i);
        ua2.colorToHSL(iApproximateToRgb888, this.f100730f);
        return shouldIgnoreColor(iApproximateToRgb888, this.f100730f);
    }

    private void splitBoxes(PriorityQueue<C15545b> priorityQueue, int i) {
        C15545b c15545bPoll;
        while (priorityQueue.size() < i && (c15545bPoll = priorityQueue.poll()) != null && c15545bPoll.m25687a()) {
            priorityQueue.offer(c15545bPoll.m25694h());
            priorityQueue.offer(c15545bPoll);
        }
    }

    /* JADX INFO: renamed from: b */
    public List<adc.C0185e> m25686b() {
        return this.f100727c;
    }

    private boolean shouldIgnoreColor(adc.C0185e c0185e) {
        return shouldIgnoreColor(c0185e.getRgb(), c0185e.getHsl());
    }

    private boolean shouldIgnoreColor(int i, float[] fArr) {
        adc.InterfaceC0183c[] interfaceC0183cArr = this.f100729e;
        if (interfaceC0183cArr != null && interfaceC0183cArr.length > 0) {
            int length = interfaceC0183cArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f100729e[i2].isAllowed(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}

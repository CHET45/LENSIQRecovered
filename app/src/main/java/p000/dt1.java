package p000;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000.dt1;
import p000.o93;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class dt1 extends ht1 {

    /* JADX INFO: renamed from: A */
    public static final int f30641A = 159;

    /* JADX INFO: renamed from: A0 */
    public static final int f30642A0 = 49;

    /* JADX INFO: renamed from: B */
    public static final int f30643B = 255;

    /* JADX INFO: renamed from: B0 */
    public static final int f30644B0 = 50;

    /* JADX INFO: renamed from: C */
    public static final int f30645C = 31;

    /* JADX INFO: renamed from: C0 */
    public static final int f30646C0 = 51;

    /* JADX INFO: renamed from: D */
    public static final int f30647D = 127;

    /* JADX INFO: renamed from: D0 */
    public static final int f30648D0 = 52;

    /* JADX INFO: renamed from: E */
    public static final int f30649E = 159;

    /* JADX INFO: renamed from: E0 */
    public static final int f30650E0 = 53;

    /* JADX INFO: renamed from: F */
    public static final int f30651F = 255;

    /* JADX INFO: renamed from: F0 */
    public static final int f30652F0 = 57;

    /* JADX INFO: renamed from: G */
    public static final int f30653G = 0;

    /* JADX INFO: renamed from: G0 */
    public static final int f30654G0 = 58;

    /* JADX INFO: renamed from: H */
    public static final int f30655H = 3;

    /* JADX INFO: renamed from: H0 */
    public static final int f30656H0 = 60;

    /* JADX INFO: renamed from: I */
    public static final int f30657I = 8;

    /* JADX INFO: renamed from: I0 */
    public static final int f30658I0 = 61;

    /* JADX INFO: renamed from: J */
    public static final int f30659J = 12;

    /* JADX INFO: renamed from: J0 */
    public static final int f30660J0 = 63;

    /* JADX INFO: renamed from: K */
    public static final int f30661K = 13;

    /* JADX INFO: renamed from: K0 */
    public static final int f30662K0 = 118;

    /* JADX INFO: renamed from: L */
    public static final int f30663L = 14;

    /* JADX INFO: renamed from: L0 */
    public static final int f30664L0 = 119;

    /* JADX INFO: renamed from: M */
    public static final int f30665M = 16;

    /* JADX INFO: renamed from: M0 */
    public static final int f30666M0 = 120;

    /* JADX INFO: renamed from: N */
    public static final int f30667N = 17;

    /* JADX INFO: renamed from: N0 */
    public static final int f30668N0 = 121;

    /* JADX INFO: renamed from: O */
    public static final int f30669O = 23;

    /* JADX INFO: renamed from: O0 */
    public static final int f30670O0 = 122;

    /* JADX INFO: renamed from: P */
    public static final int f30671P = 24;

    /* JADX INFO: renamed from: P0 */
    public static final int f30672P0 = 123;

    /* JADX INFO: renamed from: Q */
    public static final int f30673Q = 31;

    /* JADX INFO: renamed from: Q0 */
    public static final int f30674Q0 = 124;

    /* JADX INFO: renamed from: R */
    public static final int f30675R = 128;

    /* JADX INFO: renamed from: R0 */
    public static final int f30676R0 = 125;

    /* JADX INFO: renamed from: S */
    public static final int f30677S = 129;

    /* JADX INFO: renamed from: S0 */
    public static final int f30678S0 = 126;

    /* JADX INFO: renamed from: T */
    public static final int f30679T = 130;

    /* JADX INFO: renamed from: T0 */
    public static final int f30680T0 = 127;

    /* JADX INFO: renamed from: U */
    public static final int f30681U = 131;

    /* JADX INFO: renamed from: V */
    public static final int f30682V = 132;

    /* JADX INFO: renamed from: W */
    public static final int f30683W = 133;

    /* JADX INFO: renamed from: X */
    public static final int f30684X = 134;

    /* JADX INFO: renamed from: Y */
    public static final int f30685Y = 135;

    /* JADX INFO: renamed from: Z */
    public static final int f30686Z = 136;

    /* JADX INFO: renamed from: a0 */
    public static final int f30687a0 = 137;

    /* JADX INFO: renamed from: b0 */
    public static final int f30688b0 = 138;

    /* JADX INFO: renamed from: c0 */
    public static final int f30689c0 = 139;

    /* JADX INFO: renamed from: d0 */
    public static final int f30690d0 = 140;

    /* JADX INFO: renamed from: e0 */
    public static final int f30691e0 = 141;

    /* JADX INFO: renamed from: f0 */
    public static final int f30692f0 = 142;

    /* JADX INFO: renamed from: g0 */
    public static final int f30693g0 = 143;

    /* JADX INFO: renamed from: h0 */
    public static final int f30694h0 = 144;

    /* JADX INFO: renamed from: i0 */
    public static final int f30695i0 = 145;

    /* JADX INFO: renamed from: j0 */
    public static final int f30696j0 = 146;

    /* JADX INFO: renamed from: k0 */
    public static final int f30697k0 = 151;

    /* JADX INFO: renamed from: l0 */
    public static final int f30698l0 = 152;

    /* JADX INFO: renamed from: m0 */
    public static final int f30699m0 = 153;

    /* JADX INFO: renamed from: n0 */
    public static final int f30700n0 = 154;

    /* JADX INFO: renamed from: o0 */
    public static final int f30701o0 = 155;

    /* JADX INFO: renamed from: p0 */
    public static final int f30702p0 = 156;

    /* JADX INFO: renamed from: q0 */
    public static final int f30703q0 = 157;

    /* JADX INFO: renamed from: r0 */
    public static final int f30704r0 = 158;

    /* JADX INFO: renamed from: s0 */
    public static final int f30705s0 = 159;

    /* JADX INFO: renamed from: t */
    public static final String f30706t = "Cea708Decoder";

    /* JADX INFO: renamed from: t0 */
    public static final int f30707t0 = 127;

    /* JADX INFO: renamed from: u */
    public static final int f30708u = 8;

    /* JADX INFO: renamed from: u0 */
    public static final int f30709u0 = 32;

    /* JADX INFO: renamed from: v */
    public static final int f30710v = 2;

    /* JADX INFO: renamed from: v0 */
    public static final int f30711v0 = 33;

    /* JADX INFO: renamed from: w */
    public static final int f30712w = 3;

    /* JADX INFO: renamed from: w0 */
    public static final int f30713w0 = 37;

    /* JADX INFO: renamed from: x */
    public static final int f30714x = 4;

    /* JADX INFO: renamed from: x0 */
    public static final int f30715x0 = 42;

    /* JADX INFO: renamed from: y */
    public static final int f30716y = 31;

    /* JADX INFO: renamed from: y0 */
    public static final int f30717y0 = 44;

    /* JADX INFO: renamed from: z */
    public static final int f30718z = 127;

    /* JADX INFO: renamed from: z0 */
    public static final int f30719z0 = 48;

    /* JADX INFO: renamed from: i */
    public final ihc f30720i = new ihc();

    /* JADX INFO: renamed from: j */
    public final ghc f30721j = new ghc();

    /* JADX INFO: renamed from: k */
    public int f30722k = -1;

    /* JADX INFO: renamed from: l */
    public final boolean f30723l;

    /* JADX INFO: renamed from: m */
    public final int f30724m;

    /* JADX INFO: renamed from: n */
    public final C4938b[] f30725n;

    /* JADX INFO: renamed from: o */
    public C4938b f30726o;

    /* JADX INFO: renamed from: p */
    @hib
    public List<o93> f30727p;

    /* JADX INFO: renamed from: q */
    @hib
    public List<o93> f30728q;

    /* JADX INFO: renamed from: r */
    @hib
    public C4939c f30729r;

    /* JADX INFO: renamed from: s */
    public int f30730s;

    /* JADX INFO: renamed from: dt1$a */
    public static final class C4937a {

        /* JADX INFO: renamed from: c */
        public static final Comparator<C4937a> f30731c = new Comparator() { // from class: at1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return dt1.C4937a.lambda$static$0((dt1.C4937a) obj, (dt1.C4937a) obj2);
            }
        };

        /* JADX INFO: renamed from: a */
        public final o93 f30732a;

        /* JADX INFO: renamed from: b */
        public final int f30733b;

        public C4937a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            o93.C10261c size = new o93.C10261c().setText(charSequence).setTextAlignment(alignment).setLine(f, i).setLineAnchor(i2).setPosition(f2).setPositionAnchor(i3).setSize(f3);
            if (z) {
                size.setWindowColor(i4);
            }
            this.f30732a = size.build();
            this.f30733b = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(C4937a c4937a, C4937a c4937a2) {
            return Integer.compare(c4937a2.f30733b, c4937a.f30733b);
        }
    }

    /* JADX INFO: renamed from: dt1$b */
    public static final class C4938b {

        /* JADX INFO: renamed from: A */
        public static final int f30734A = 15;

        /* JADX INFO: renamed from: B */
        public static final int f30735B = 0;

        /* JADX INFO: renamed from: C */
        public static final int f30736C = 1;

        /* JADX INFO: renamed from: D */
        public static final int f30737D = 2;

        /* JADX INFO: renamed from: E */
        public static final int f30738E = 3;

        /* JADX INFO: renamed from: F */
        public static final int f30739F = 0;

        /* JADX INFO: renamed from: G */
        public static final int f30740G = 1;

        /* JADX INFO: renamed from: H */
        public static final int f30741H = 2;

        /* JADX INFO: renamed from: I */
        public static final int f30742I = 3;

        /* JADX INFO: renamed from: J */
        public static final int f30743J = 0;

        /* JADX INFO: renamed from: K */
        public static final int f30744K = 3;

        /* JADX INFO: renamed from: L */
        public static final int f30745L = getArgbColorFromCeaColor(2, 2, 2, 0);

        /* JADX INFO: renamed from: M */
        public static final int f30746M;

        /* JADX INFO: renamed from: N */
        public static final int f30747N;

        /* JADX INFO: renamed from: O */
        public static final int f30748O = 1;

        /* JADX INFO: renamed from: P */
        public static final int f30749P = 0;

        /* JADX INFO: renamed from: Q */
        public static final int f30750Q = 1;

        /* JADX INFO: renamed from: R */
        public static final int f30751R = 2;

        /* JADX INFO: renamed from: S */
        public static final int f30752S = 3;

        /* JADX INFO: renamed from: T */
        public static final int f30753T = 4;

        /* JADX INFO: renamed from: U */
        public static final int f30754U = 1;

        /* JADX INFO: renamed from: V */
        public static final int[] f30755V;

        /* JADX INFO: renamed from: W */
        public static final int[] f30756W;

        /* JADX INFO: renamed from: X */
        public static final int[] f30757X;

        /* JADX INFO: renamed from: Y */
        public static final boolean[] f30758Y;

        /* JADX INFO: renamed from: Z */
        public static final int[] f30759Z;

        /* JADX INFO: renamed from: a0 */
        public static final int[] f30760a0;

        /* JADX INFO: renamed from: b0 */
        public static final int[] f30761b0;

        /* JADX INFO: renamed from: c0 */
        public static final int[] f30762c0;

        /* JADX INFO: renamed from: w */
        public static final int f30763w = 99;

        /* JADX INFO: renamed from: x */
        public static final int f30764x = 74;

        /* JADX INFO: renamed from: y */
        public static final int f30765y = 209;

        /* JADX INFO: renamed from: z */
        public static final int f30766z = 4;

        /* JADX INFO: renamed from: a */
        public final List<SpannableString> f30767a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final SpannableStringBuilder f30768b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c */
        public boolean f30769c;

        /* JADX INFO: renamed from: d */
        public boolean f30770d;

        /* JADX INFO: renamed from: e */
        public int f30771e;

        /* JADX INFO: renamed from: f */
        public boolean f30772f;

        /* JADX INFO: renamed from: g */
        public int f30773g;

        /* JADX INFO: renamed from: h */
        public int f30774h;

        /* JADX INFO: renamed from: i */
        public int f30775i;

        /* JADX INFO: renamed from: j */
        public int f30776j;

        /* JADX INFO: renamed from: k */
        public boolean f30777k;

        /* JADX INFO: renamed from: l */
        public int f30778l;

        /* JADX INFO: renamed from: m */
        public int f30779m;

        /* JADX INFO: renamed from: n */
        public int f30780n;

        /* JADX INFO: renamed from: o */
        public int f30781o;

        /* JADX INFO: renamed from: p */
        public int f30782p;

        /* JADX INFO: renamed from: q */
        public int f30783q;

        /* JADX INFO: renamed from: r */
        public int f30784r;

        /* JADX INFO: renamed from: s */
        public int f30785s;

        /* JADX INFO: renamed from: t */
        public int f30786t;

        /* JADX INFO: renamed from: u */
        public int f30787u;

        /* JADX INFO: renamed from: v */
        public int f30788v;

        static {
            int argbColorFromCeaColor = getArgbColorFromCeaColor(0, 0, 0, 0);
            f30746M = argbColorFromCeaColor;
            int argbColorFromCeaColor2 = getArgbColorFromCeaColor(0, 0, 0, 3);
            f30747N = argbColorFromCeaColor2;
            f30755V = new int[]{0, 0, 0, 0, 0, 2, 0};
            f30756W = new int[]{0, 0, 0, 0, 0, 0, 2};
            f30757X = new int[]{3, 3, 3, 3, 3, 3, 1};
            f30758Y = new boolean[]{false, false, false, true, true, true, false};
            f30759Z = new int[]{argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor};
            f30760a0 = new int[]{0, 1, 2, 3, 4, 3, 4};
            f30761b0 = new int[]{0, 0, 0, 0, 0, 3, 3};
            f30762c0 = new int[]{argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor2};
        }

        public C4938b() {
            reset();
        }

        public static int getArgbColorFromCeaColor(int i, int i2, int i3) {
            return getArgbColorFromCeaColor(i, i2, i3, 0);
        }

        public void append(char c) {
            if (c != '\n') {
                this.f30768b.append(c);
                return;
            }
            this.f30767a.add(buildSpannableString());
            this.f30768b.clear();
            if (this.f30782p != -1) {
                this.f30782p = 0;
            }
            if (this.f30783q != -1) {
                this.f30783q = 0;
            }
            if (this.f30784r != -1) {
                this.f30784r = 0;
            }
            if (this.f30786t != -1) {
                this.f30786t = 0;
            }
            while (true) {
                if ((!this.f30777k || this.f30767a.size() < this.f30776j) && this.f30767a.size() < 15) {
                    return;
                } else {
                    this.f30767a.remove(0);
                }
            }
        }

        public void backspace() {
            int length = this.f30768b.length();
            if (length > 0) {
                this.f30768b.delete(length - 1, length);
            }
        }

        @hib
        public C4937a build() {
            Layout.Alignment alignment;
            float f;
            float f2;
            if (isEmpty()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.f30767a.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.f30767a.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildSpannableString());
            int i2 = this.f30778l;
            if (i2 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i2 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f30778l);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f30772f) {
                f = this.f30774h / 99.0f;
                f2 = this.f30773g / 99.0f;
            } else {
                f = this.f30774h / 209.0f;
                f2 = this.f30773g / 74.0f;
            }
            float f3 = (f * 0.9f) + 0.05f;
            float f4 = (f2 * 0.9f) + 0.05f;
            int i3 = this.f30775i;
            return new C4937a(spannableStringBuilder, alignment2, f4, 0, i3 / 3 == 0 ? 0 : i3 / 3 == 1 ? 1 : 2, f3, i3 % 3 == 0 ? 0 : i3 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f30781o != f30746M, this.f30781o, this.f30771e);
        }

        public SpannableString buildSpannableString() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f30768b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f30782p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f30782p, length, 33);
                }
                if (this.f30783q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f30783q, length, 33);
                }
                if (this.f30784r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f30785s), this.f30784r, length, 33);
                }
                if (this.f30786t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f30787u), this.f30786t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void clear() {
            this.f30767a.clear();
            this.f30768b.clear();
            this.f30782p = -1;
            this.f30783q = -1;
            this.f30784r = -1;
            this.f30786t = -1;
            this.f30788v = 0;
        }

        public void defineWindow(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f30769c = true;
            this.f30770d = z;
            this.f30777k = z2;
            this.f30771e = i;
            this.f30772f = z4;
            this.f30773g = i2;
            this.f30774h = i3;
            this.f30775i = i6;
            int i9 = i4 + 1;
            if (this.f30776j != i9) {
                this.f30776j = i9;
                while (true) {
                    if ((!z2 || this.f30767a.size() < this.f30776j) && this.f30767a.size() < 15) {
                        break;
                    } else {
                        this.f30767a.remove(0);
                    }
                }
            }
            if (i7 != 0 && this.f30779m != i7) {
                this.f30779m = i7;
                int i10 = i7 - 1;
                setWindowAttributes(f30759Z[i10], f30747N, f30758Y[i10], 0, f30756W[i10], f30757X[i10], f30755V[i10]);
            }
            if (i8 == 0 || this.f30780n == i8) {
                return;
            }
            this.f30780n = i8;
            int i11 = i8 - 1;
            setPenAttributes(0, 1, 1, false, false, f30761b0[i11], f30760a0[i11]);
            setPenColor(f30745L, f30762c0[i11], f30746M);
        }

        public boolean isDefined() {
            return this.f30769c;
        }

        public boolean isEmpty() {
            return !isDefined() || (this.f30767a.isEmpty() && this.f30768b.length() == 0);
        }

        public boolean isVisible() {
            return this.f30770d;
        }

        public void reset() {
            clear();
            this.f30769c = false;
            this.f30770d = false;
            this.f30771e = 4;
            this.f30772f = false;
            this.f30773g = 0;
            this.f30774h = 0;
            this.f30775i = 0;
            this.f30776j = 15;
            this.f30777k = true;
            this.f30778l = 0;
            this.f30779m = 0;
            this.f30780n = 0;
            int i = f30746M;
            this.f30781o = i;
            this.f30785s = f30745L;
            this.f30787u = i;
        }

        public void setPenAttributes(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f30782p != -1) {
                if (!z) {
                    this.f30768b.setSpan(new StyleSpan(2), this.f30782p, this.f30768b.length(), 33);
                    this.f30782p = -1;
                }
            } else if (z) {
                this.f30782p = this.f30768b.length();
            }
            if (this.f30783q == -1) {
                if (z2) {
                    this.f30783q = this.f30768b.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.f30768b.setSpan(new UnderlineSpan(), this.f30783q, this.f30768b.length(), 33);
                this.f30783q = -1;
            }
        }

        public void setPenColor(int i, int i2, int i3) {
            if (this.f30784r != -1 && this.f30785s != i) {
                this.f30768b.setSpan(new ForegroundColorSpan(this.f30785s), this.f30784r, this.f30768b.length(), 33);
            }
            if (i != f30745L) {
                this.f30784r = this.f30768b.length();
                this.f30785s = i;
            }
            if (this.f30786t != -1 && this.f30787u != i2) {
                this.f30768b.setSpan(new BackgroundColorSpan(this.f30787u), this.f30786t, this.f30768b.length(), 33);
            }
            if (i2 != f30746M) {
                this.f30786t = this.f30768b.length();
                this.f30787u = i2;
            }
        }

        public void setPenLocation(int i, int i2) {
            if (this.f30788v != i) {
                append('\n');
            }
            this.f30788v = i;
        }

        public void setVisibility(boolean z) {
            this.f30770d = z;
        }

        public void setWindowAttributes(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f30781o = i;
            this.f30778l = i6;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getArgbColorFromCeaColor(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p000.u80.checkIndex(r4, r0, r1)
                p000.u80.checkIndex(r5, r0, r1)
                p000.u80.checkIndex(r6, r0, r1)
                p000.u80.checkIndex(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r2
                goto L21
            L1d:
                r7 = r0
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r1) goto L25
                r4 = r2
                goto L26
            L25:
                r4 = r0
            L26:
                if (r5 <= r1) goto L2a
                r5 = r2
                goto L2b
            L2a:
                r5 = r0
            L2b:
                if (r6 <= r1) goto L2e
                r0 = r2
            L2e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.dt1.C4938b.getArgbColorFromCeaColor(int, int, int, int):int");
        }
    }

    /* JADX INFO: renamed from: dt1$c */
    public static final class C4939c {

        /* JADX INFO: renamed from: a */
        public final int f30789a;

        /* JADX INFO: renamed from: b */
        public final int f30790b;

        /* JADX INFO: renamed from: c */
        public final byte[] f30791c;

        /* JADX INFO: renamed from: d */
        public int f30792d = 0;

        public C4939c(int i, int i2) {
            this.f30789a = i;
            this.f30790b = i2;
            this.f30791c = new byte[(i2 * 2) - 1];
        }
    }

    public dt1(int i, @hib List<byte[]> list) {
        this.f30724m = i == -1 ? 1 : i;
        this.f30723l = list != null && c72.parseCea708InitializationData(list);
        this.f30725n = new C4938b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f30725n[i2] = new C4938b();
        }
        this.f30726o = this.f30725n[0];
    }

    private void finalizeCurrentPacket() {
        if (this.f30729r == null) {
            return;
        }
        processCurrentPacket();
        this.f30729r = null;
    }

    private List<o93> getDisplayCues() {
        C4937a c4937aBuild;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f30725n[i].isEmpty() && this.f30725n[i].isVisible() && (c4937aBuild = this.f30725n[i].build()) != null) {
                arrayList.add(c4937aBuild);
            }
        }
        Collections.sort(arrayList, C4937a.f30731c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C4937a) arrayList.get(i2)).f30732a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void handleC0Command(int i) {
        if (i != 0) {
            if (i == 3) {
                this.f30727p = getDisplayCues();
            }
            if (i == 8) {
                this.f30726o.backspace();
                return;
            }
            switch (i) {
                case 12:
                    resetCueBuilders();
                    break;
                case 13:
                    this.f30726o.append('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i >= 17 && i <= 23) {
                        yh9.m25919w("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        this.f30721j.skipBits(8);
                    } else if (i >= 24 && i <= 31) {
                        yh9.m25919w("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        this.f30721j.skipBits(16);
                    } else {
                        yh9.m25919w("Cea708Decoder", "Invalid C0 command: " + i);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void handleC1Command(int i) {
        int i2 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i3 = i - 128;
                if (this.f30730s != i3) {
                    this.f30730s = i3;
                    this.f30726o = this.f30725n[i3];
                }
                break;
            case 136:
                while (i2 <= 8) {
                    if (this.f30721j.readBit()) {
                        this.f30725n[8 - i2].clear();
                    }
                    i2++;
                }
                break;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.f30721j.readBit()) {
                        this.f30725n[8 - i4].setVisibility(true);
                    }
                }
                break;
            case 138:
                while (i2 <= 8) {
                    if (this.f30721j.readBit()) {
                        this.f30725n[8 - i2].setVisibility(false);
                    }
                    i2++;
                }
                break;
            case 139:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f30721j.readBit()) {
                        this.f30725n[8 - i5].setVisibility(!r0.isVisible());
                    }
                }
                break;
            case 140:
                while (i2 <= 8) {
                    if (this.f30721j.readBit()) {
                        this.f30725n[8 - i2].reset();
                    }
                    i2++;
                }
                break;
            case 141:
                this.f30721j.skipBits(8);
                break;
            case 142:
                break;
            case 143:
                resetCueBuilders();
                break;
            case 144:
                if (this.f30726o.isDefined()) {
                    handleSetPenAttributes();
                } else {
                    this.f30721j.skipBits(16);
                }
                break;
            case 145:
                if (this.f30726o.isDefined()) {
                    handleSetPenColor();
                } else {
                    this.f30721j.skipBits(24);
                }
                break;
            case 146:
                if (this.f30726o.isDefined()) {
                    handleSetPenLocation();
                } else {
                    this.f30721j.skipBits(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                yh9.m25919w("Cea708Decoder", "Invalid C1 command: " + i);
                break;
            case 151:
                if (this.f30726o.isDefined()) {
                    handleSetWindowAttributes();
                } else {
                    this.f30721j.skipBits(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i6 = i - 152;
                handleDefineWindow(i6);
                if (this.f30730s != i6) {
                    this.f30730s = i6;
                    this.f30726o = this.f30725n[i6];
                }
                break;
        }
    }

    private void handleC2Command(int i) {
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            this.f30721j.skipBits(8);
        } else if (i <= 23) {
            this.f30721j.skipBits(16);
        } else if (i <= 31) {
            this.f30721j.skipBits(24);
        }
    }

    private void handleC3Command(int i) {
        if (i <= 135) {
            this.f30721j.skipBits(32);
            return;
        }
        if (i <= 143) {
            this.f30721j.skipBits(40);
        } else if (i <= 159) {
            this.f30721j.skipBits(2);
            this.f30721j.skipBits(this.f30721j.readBits(6) * 8);
        }
    }

    private void handleDefineWindow(int i) {
        C4938b c4938b = this.f30725n[i];
        this.f30721j.skipBits(2);
        boolean bit = this.f30721j.readBit();
        boolean bit2 = this.f30721j.readBit();
        boolean bit3 = this.f30721j.readBit();
        int bits = this.f30721j.readBits(3);
        boolean bit4 = this.f30721j.readBit();
        int bits2 = this.f30721j.readBits(7);
        int bits3 = this.f30721j.readBits(8);
        int bits4 = this.f30721j.readBits(4);
        int bits5 = this.f30721j.readBits(4);
        this.f30721j.skipBits(2);
        int bits6 = this.f30721j.readBits(6);
        this.f30721j.skipBits(2);
        c4938b.defineWindow(bit, bit2, bit3, bits, bit4, bits2, bits3, bits5, bits6, bits4, this.f30721j.readBits(3), this.f30721j.readBits(3));
    }

    private void handleG0Character(int i) {
        if (i == 127) {
            this.f30726o.append((char) 9835);
        } else {
            this.f30726o.append((char) (i & 255));
        }
    }

    private void handleG1Character(int i) {
        this.f30726o.append((char) (i & 255));
    }

    private void handleG2Character(int i) {
        if (i == 32) {
            this.f30726o.append(' ');
        }
        if (i == 33) {
            this.f30726o.append(xnh.f98716g);
            return;
        }
        if (i == 37) {
            this.f30726o.append(xnh.f98699F);
            return;
        }
        if (i == 42) {
            this.f30726o.append((char) 352);
            return;
        }
        if (i == 44) {
            this.f30726o.append((char) 338);
            return;
        }
        if (i == 63) {
            this.f30726o.append((char) 376);
            return;
        }
        if (i == 57) {
            this.f30726o.append(xnh.f98703J);
            return;
        }
        if (i == 58) {
            this.f30726o.append((char) 353);
            return;
        }
        if (i == 60) {
            this.f30726o.append((char) 339);
            return;
        }
        if (i == 61) {
            this.f30726o.append((char) 8480);
            return;
        }
        switch (i) {
            case 48:
                this.f30726o.append((char) 9608);
                break;
            case 49:
                this.f30726o.append(xnh.f98732w);
                break;
            case 50:
                this.f30726o.append(xnh.f98733x);
                break;
            case 51:
                this.f30726o.append(xnh.f98735z);
                break;
            case 52:
                this.f30726o.append(xnh.f98694A);
                break;
            case 53:
                this.f30726o.append((char) 8226);
                break;
            default:
                switch (i) {
                    case 118:
                        this.f30726o.append((char) 8539);
                        break;
                    case 119:
                        this.f30726o.append((char) 8540);
                        break;
                    case 120:
                        this.f30726o.append((char) 8541);
                        break;
                    case 121:
                        this.f30726o.append((char) 8542);
                        break;
                    case 122:
                        this.f30726o.append((char) 9474);
                        break;
                    case 123:
                        this.f30726o.append((char) 9488);
                        break;
                    case 124:
                        this.f30726o.append((char) 9492);
                        break;
                    case 125:
                        this.f30726o.append((char) 9472);
                        break;
                    case 126:
                        this.f30726o.append((char) 9496);
                        break;
                    case 127:
                        this.f30726o.append((char) 9484);
                        break;
                    default:
                        yh9.m25919w("Cea708Decoder", "Invalid G2 character: " + i);
                        break;
                }
                break;
        }
    }

    private void handleG3Character(int i) {
        if (i == 160) {
            this.f30726o.append((char) 13252);
            return;
        }
        yh9.m25919w("Cea708Decoder", "Invalid G3 character: " + i);
        this.f30726o.append('_');
    }

    private void handleSetPenAttributes() {
        this.f30726o.setPenAttributes(this.f30721j.readBits(4), this.f30721j.readBits(2), this.f30721j.readBits(2), this.f30721j.readBit(), this.f30721j.readBit(), this.f30721j.readBits(3), this.f30721j.readBits(3));
    }

    private void handleSetPenColor() {
        int argbColorFromCeaColor = C4938b.getArgbColorFromCeaColor(this.f30721j.readBits(2), this.f30721j.readBits(2), this.f30721j.readBits(2), this.f30721j.readBits(2));
        int argbColorFromCeaColor2 = C4938b.getArgbColorFromCeaColor(this.f30721j.readBits(2), this.f30721j.readBits(2), this.f30721j.readBits(2), this.f30721j.readBits(2));
        this.f30721j.skipBits(2);
        this.f30726o.setPenColor(argbColorFromCeaColor, argbColorFromCeaColor2, C4938b.getArgbColorFromCeaColor(this.f30721j.readBits(2), this.f30721j.readBits(2), this.f30721j.readBits(2)));
    }

    private void handleSetPenLocation() {
        this.f30721j.skipBits(4);
        int bits = this.f30721j.readBits(4);
        this.f30721j.skipBits(2);
        this.f30726o.setPenLocation(bits, this.f30721j.readBits(6));
    }

    private void handleSetWindowAttributes() {
        int argbColorFromCeaColor = C4938b.getArgbColorFromCeaColor(this.f30721j.readBits(2), this.f30721j.readBits(2), this.f30721j.readBits(2), this.f30721j.readBits(2));
        int bits = this.f30721j.readBits(2);
        int argbColorFromCeaColor2 = C4938b.getArgbColorFromCeaColor(this.f30721j.readBits(2), this.f30721j.readBits(2), this.f30721j.readBits(2));
        if (this.f30721j.readBit()) {
            bits |= 4;
        }
        boolean bit = this.f30721j.readBit();
        int bits2 = this.f30721j.readBits(2);
        int bits3 = this.f30721j.readBits(2);
        int bits4 = this.f30721j.readBits(2);
        this.f30721j.skipBits(8);
        this.f30726o.setWindowAttributes(argbColorFromCeaColor, argbColorFromCeaColor2, bit, bits, bits2, bits3, bits4);
    }

    @g5e({"currentDtvCcPacket"})
    private void processCurrentPacket() {
        C4939c c4939c = this.f30729r;
        if (c4939c.f30792d != (c4939c.f30790b * 2) - 1) {
            yh9.m25913d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f30729r.f30790b * 2) - 1) + ", but current index is " + this.f30729r.f30792d + " (sequence number " + this.f30729r.f30789a + ");");
        }
        ghc ghcVar = this.f30721j;
        C4939c c4939c2 = this.f30729r;
        ghcVar.reset(c4939c2.f30791c, c4939c2.f30792d);
        boolean z = false;
        while (true) {
            if (this.f30721j.bitsLeft() <= 0) {
                break;
            }
            int bits = this.f30721j.readBits(3);
            int bits2 = this.f30721j.readBits(5);
            if (bits == 7) {
                this.f30721j.skipBits(2);
                bits = this.f30721j.readBits(6);
                if (bits < 7) {
                    yh9.m25919w("Cea708Decoder", "Invalid extended service number: " + bits);
                }
            }
            if (bits2 == 0) {
                if (bits != 0) {
                    yh9.m25919w("Cea708Decoder", "serviceNumber is non-zero (" + bits + ") when blockSize is 0");
                }
            } else if (bits != this.f30724m) {
                this.f30721j.skipBytes(bits2);
            } else {
                int position = this.f30721j.getPosition() + (bits2 * 8);
                while (this.f30721j.getPosition() < position) {
                    int bits3 = this.f30721j.readBits(8);
                    if (bits3 == 16) {
                        int bits4 = this.f30721j.readBits(8);
                        if (bits4 <= 31) {
                            handleC2Command(bits4);
                        } else {
                            if (bits4 <= 127) {
                                handleG2Character(bits4);
                            } else if (bits4 <= 159) {
                                handleC3Command(bits4);
                            } else if (bits4 <= 255) {
                                handleG3Character(bits4);
                            } else {
                                yh9.m25919w("Cea708Decoder", "Invalid extended command: " + bits4);
                            }
                            z = true;
                        }
                    } else if (bits3 <= 31) {
                        handleC0Command(bits3);
                    } else {
                        if (bits3 <= 127) {
                            handleG0Character(bits3);
                        } else if (bits3 <= 159) {
                            handleC1Command(bits3);
                        } else if (bits3 <= 255) {
                            handleG1Character(bits3);
                        } else {
                            yh9.m25919w("Cea708Decoder", "Invalid base command: " + bits3);
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            this.f30727p = getDisplayCues();
        }
    }

    private void resetCueBuilders() {
        for (int i = 0; i < 8; i++) {
            this.f30725n[i].reset();
        }
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: a */
    public xdg mo9344a() {
        List<o93> list = this.f30727p;
        this.f30728q = list;
        return new it1((List) u80.checkNotNull(list));
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: b */
    public void mo9345b(ieg iegVar) {
        ByteBuffer byteBuffer = (ByteBuffer) u80.checkNotNull(iegVar.f82162d);
        this.f30720i.reset(byteBuffer.array(), byteBuffer.limit());
        while (this.f30720i.bytesLeft() >= 3) {
            int unsignedByte = this.f30720i.readUnsignedByte();
            int i = unsignedByte & 3;
            boolean z = (unsignedByte & 4) == 4;
            byte unsignedByte2 = (byte) this.f30720i.readUnsignedByte();
            byte unsignedByte3 = (byte) this.f30720i.readUnsignedByte();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        finalizeCurrentPacket();
                        int i2 = (unsignedByte2 & k95.f53214o7) >> 6;
                        int i3 = this.f30722k;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            resetCueBuilders();
                            yh9.m25919w("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f30722k + " current=" + i2);
                        }
                        this.f30722k = i2;
                        int i4 = unsignedByte2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C4939c c4939c = new C4939c(i2, i4);
                        this.f30729r = c4939c;
                        byte[] bArr = c4939c.f30791c;
                        int i5 = c4939c.f30792d;
                        c4939c.f30792d = i5 + 1;
                        bArr[i5] = unsignedByte3;
                    } else {
                        u80.checkArgument(i == 2);
                        C4939c c4939c2 = this.f30729r;
                        if (c4939c2 == null) {
                            yh9.m25915e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c4939c2.f30791c;
                            int i6 = c4939c2.f30792d;
                            int i7 = i6 + 1;
                            c4939c2.f30792d = i7;
                            bArr2[i6] = unsignedByte2;
                            c4939c2.f30792d = i6 + 2;
                            bArr2[i7] = unsignedByte3;
                        }
                    }
                    C4939c c4939c3 = this.f30729r;
                    if (c4939c3.f30792d == (c4939c3.f30790b * 2) - 1) {
                        finalizeCurrentPacket();
                    }
                }
            }
        }
    }

    @Override // p000.ht1, p000.il3
    @hib
    public /* bridge */ /* synthetic */ ieg dequeueInputBuffer() throws beg {
        return super.dequeueInputBuffer();
    }

    @Override // p000.ht1, p000.il3
    @hib
    public /* bridge */ /* synthetic */ keg dequeueOutputBuffer() throws beg {
        return super.dequeueOutputBuffer();
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: e */
    public boolean mo9346e() {
        return this.f30727p != this.f30728q;
    }

    @Override // p000.ht1, p000.il3
    public void flush() {
        super.flush();
        this.f30727p = null;
        this.f30728q = null;
        this.f30730s = 0;
        this.f30726o = this.f30725n[0];
        resetCueBuilders();
        this.f30729r = null;
    }

    @Override // p000.ht1, p000.il3
    public String getName() {
        return "Cea708Decoder";
    }

    @Override // p000.ht1
    public /* bridge */ /* synthetic */ void queueInputBuffer(ieg iegVar) throws beg {
        super.queueInputBuffer(iegVar);
    }

    @Override // p000.ht1, p000.il3
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // p000.ht1, p000.zdg
    public /* bridge */ /* synthetic */ void setPositionUs(long j) {
        super.setPositionUs(j);
    }
}

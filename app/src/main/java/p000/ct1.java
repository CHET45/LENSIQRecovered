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
import p000.ct1;
import p000.n93;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ct1 extends gt1 {

    /* JADX INFO: renamed from: A */
    public static final int f27324A = 127;

    /* JADX INFO: renamed from: A0 */
    public static final int f27325A0 = 48;

    /* JADX INFO: renamed from: B */
    public static final int f27326B = 159;

    /* JADX INFO: renamed from: B0 */
    public static final int f27327B0 = 49;

    /* JADX INFO: renamed from: C */
    public static final int f27328C = 255;

    /* JADX INFO: renamed from: C0 */
    public static final int f27329C0 = 50;

    /* JADX INFO: renamed from: D */
    public static final int f27330D = 31;

    /* JADX INFO: renamed from: D0 */
    public static final int f27331D0 = 51;

    /* JADX INFO: renamed from: E */
    public static final int f27332E = 127;

    /* JADX INFO: renamed from: E0 */
    public static final int f27333E0 = 52;

    /* JADX INFO: renamed from: F */
    public static final int f27334F = 159;

    /* JADX INFO: renamed from: F0 */
    public static final int f27335F0 = 53;

    /* JADX INFO: renamed from: G */
    public static final int f27336G = 255;

    /* JADX INFO: renamed from: G0 */
    public static final int f27337G0 = 57;

    /* JADX INFO: renamed from: H */
    public static final int f27338H = 0;

    /* JADX INFO: renamed from: H0 */
    public static final int f27339H0 = 58;

    /* JADX INFO: renamed from: I */
    public static final int f27340I = 3;

    /* JADX INFO: renamed from: I0 */
    public static final int f27341I0 = 60;

    /* JADX INFO: renamed from: J */
    public static final int f27342J = 8;

    /* JADX INFO: renamed from: J0 */
    public static final int f27343J0 = 61;

    /* JADX INFO: renamed from: K */
    public static final int f27344K = 12;

    /* JADX INFO: renamed from: K0 */
    public static final int f27345K0 = 63;

    /* JADX INFO: renamed from: L */
    public static final int f27346L = 13;

    /* JADX INFO: renamed from: L0 */
    public static final int f27347L0 = 118;

    /* JADX INFO: renamed from: M */
    public static final int f27348M = 14;

    /* JADX INFO: renamed from: M0 */
    public static final int f27349M0 = 119;

    /* JADX INFO: renamed from: N */
    public static final int f27350N = 16;

    /* JADX INFO: renamed from: N0 */
    public static final int f27351N0 = 120;

    /* JADX INFO: renamed from: O */
    public static final int f27352O = 17;

    /* JADX INFO: renamed from: O0 */
    public static final int f27353O0 = 121;

    /* JADX INFO: renamed from: P */
    public static final int f27354P = 23;

    /* JADX INFO: renamed from: P0 */
    public static final int f27355P0 = 122;

    /* JADX INFO: renamed from: Q */
    public static final int f27356Q = 24;

    /* JADX INFO: renamed from: Q0 */
    public static final int f27357Q0 = 123;

    /* JADX INFO: renamed from: R */
    public static final int f27358R = 31;

    /* JADX INFO: renamed from: R0 */
    public static final int f27359R0 = 124;

    /* JADX INFO: renamed from: S */
    public static final int f27360S = 128;

    /* JADX INFO: renamed from: S0 */
    public static final int f27361S0 = 125;

    /* JADX INFO: renamed from: T */
    public static final int f27362T = 129;

    /* JADX INFO: renamed from: T0 */
    public static final int f27363T0 = 126;

    /* JADX INFO: renamed from: U */
    public static final int f27364U = 130;

    /* JADX INFO: renamed from: U0 */
    public static final int f27365U0 = 127;

    /* JADX INFO: renamed from: V */
    public static final int f27366V = 131;

    /* JADX INFO: renamed from: W */
    public static final int f27367W = 132;

    /* JADX INFO: renamed from: X */
    public static final int f27368X = 133;

    /* JADX INFO: renamed from: Y */
    public static final int f27369Y = 134;

    /* JADX INFO: renamed from: Z */
    public static final int f27370Z = 135;

    /* JADX INFO: renamed from: a0 */
    public static final int f27371a0 = 136;

    /* JADX INFO: renamed from: b0 */
    public static final int f27372b0 = 137;

    /* JADX INFO: renamed from: c0 */
    public static final int f27373c0 = 138;

    /* JADX INFO: renamed from: d0 */
    public static final int f27374d0 = 139;

    /* JADX INFO: renamed from: e0 */
    public static final int f27375e0 = 140;

    /* JADX INFO: renamed from: f0 */
    public static final int f27376f0 = 141;

    /* JADX INFO: renamed from: g0 */
    public static final int f27377g0 = 142;

    /* JADX INFO: renamed from: h0 */
    public static final int f27378h0 = 143;

    /* JADX INFO: renamed from: i0 */
    public static final int f27379i0 = 144;

    /* JADX INFO: renamed from: j0 */
    public static final int f27380j0 = 145;

    /* JADX INFO: renamed from: k0 */
    public static final int f27381k0 = 146;

    /* JADX INFO: renamed from: l0 */
    public static final int f27382l0 = 151;

    /* JADX INFO: renamed from: m0 */
    public static final int f27383m0 = 152;

    /* JADX INFO: renamed from: n0 */
    public static final int f27384n0 = 153;

    /* JADX INFO: renamed from: o0 */
    public static final int f27385o0 = 154;

    /* JADX INFO: renamed from: p0 */
    public static final int f27386p0 = 155;

    /* JADX INFO: renamed from: q0 */
    public static final int f27387q0 = 156;

    /* JADX INFO: renamed from: r0 */
    public static final int f27388r0 = 157;

    /* JADX INFO: renamed from: s0 */
    public static final int f27389s0 = 158;

    /* JADX INFO: renamed from: t0 */
    public static final int f27390t0 = 159;

    /* JADX INFO: renamed from: u */
    public static final String f27391u = "Cea708Decoder";

    /* JADX INFO: renamed from: u0 */
    public static final int f27392u0 = 127;

    /* JADX INFO: renamed from: v */
    public static final int f27393v = 8;

    /* JADX INFO: renamed from: v0 */
    public static final int f27394v0 = 32;

    /* JADX INFO: renamed from: w */
    public static final int f27395w = 2;

    /* JADX INFO: renamed from: w0 */
    public static final int f27396w0 = 33;

    /* JADX INFO: renamed from: x */
    public static final int f27397x = 3;

    /* JADX INFO: renamed from: x0 */
    public static final int f27398x0 = 37;

    /* JADX INFO: renamed from: y */
    public static final int f27399y = 4;

    /* JADX INFO: renamed from: y0 */
    public static final int f27400y0 = 42;

    /* JADX INFO: renamed from: z */
    public static final int f27401z = 31;

    /* JADX INFO: renamed from: z0 */
    public static final int f27402z0 = 44;

    /* JADX INFO: renamed from: j */
    public final jhc f27403j = new jhc();

    /* JADX INFO: renamed from: k */
    public final hhc f27404k = new hhc();

    /* JADX INFO: renamed from: l */
    public int f27405l = -1;

    /* JADX INFO: renamed from: m */
    public final boolean f27406m;

    /* JADX INFO: renamed from: n */
    public final int f27407n;

    /* JADX INFO: renamed from: o */
    public final C4490b[] f27408o;

    /* JADX INFO: renamed from: p */
    public C4490b f27409p;

    /* JADX INFO: renamed from: q */
    @hib
    public List<n93> f27410q;

    /* JADX INFO: renamed from: r */
    @hib
    public List<n93> f27411r;

    /* JADX INFO: renamed from: s */
    @hib
    public C4491c f27412s;

    /* JADX INFO: renamed from: t */
    public int f27413t;

    /* JADX INFO: renamed from: ct1$a */
    public static final class C4489a {

        /* JADX INFO: renamed from: c */
        public static final Comparator<C4489a> f27414c = new Comparator() { // from class: bt1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ct1.C4489a.lambda$static$0((ct1.C4489a) obj, (ct1.C4489a) obj2);
            }
        };

        /* JADX INFO: renamed from: a */
        public final n93 f27415a;

        /* JADX INFO: renamed from: b */
        public final int f27416b;

        public C4489a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            n93.C9750c size = new n93.C9750c().setText(charSequence).setTextAlignment(alignment).setLine(f, i).setLineAnchor(i2).setPosition(f2).setPositionAnchor(i3).setSize(f3);
            if (z) {
                size.setWindowColor(i4);
            }
            this.f27415a = size.build();
            this.f27416b = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(C4489a c4489a, C4489a c4489a2) {
            return Integer.compare(c4489a2.f27416b, c4489a.f27416b);
        }
    }

    /* JADX INFO: renamed from: ct1$b */
    public static final class C4490b {

        /* JADX INFO: renamed from: A */
        public static final int f27417A = 0;

        /* JADX INFO: renamed from: B */
        public static final int f27418B = 1;

        /* JADX INFO: renamed from: C */
        public static final int f27419C = 2;

        /* JADX INFO: renamed from: D */
        public static final int f27420D = 3;

        /* JADX INFO: renamed from: E */
        public static final int f27421E = 0;

        /* JADX INFO: renamed from: F */
        public static final int f27422F = 1;

        /* JADX INFO: renamed from: G */
        public static final int f27423G = 2;

        /* JADX INFO: renamed from: H */
        public static final int f27424H = 3;

        /* JADX INFO: renamed from: I */
        public static final int f27425I = 0;

        /* JADX INFO: renamed from: J */
        public static final int f27426J = 3;

        /* JADX INFO: renamed from: K */
        public static final int f27427K = getArgbColorFromCeaColor(2, 2, 2, 0);

        /* JADX INFO: renamed from: L */
        public static final int f27428L;

        /* JADX INFO: renamed from: M */
        public static final int f27429M;

        /* JADX INFO: renamed from: N */
        public static final int f27430N = 1;

        /* JADX INFO: renamed from: O */
        public static final int f27431O = 0;

        /* JADX INFO: renamed from: P */
        public static final int f27432P = 1;

        /* JADX INFO: renamed from: Q */
        public static final int f27433Q = 2;

        /* JADX INFO: renamed from: R */
        public static final int f27434R = 3;

        /* JADX INFO: renamed from: S */
        public static final int f27435S = 4;

        /* JADX INFO: renamed from: T */
        public static final int f27436T = 1;

        /* JADX INFO: renamed from: U */
        public static final int[] f27437U;

        /* JADX INFO: renamed from: V */
        public static final int[] f27438V;

        /* JADX INFO: renamed from: W */
        public static final int[] f27439W;

        /* JADX INFO: renamed from: X */
        public static final boolean[] f27440X;

        /* JADX INFO: renamed from: Y */
        public static final int[] f27441Y;

        /* JADX INFO: renamed from: Z */
        public static final int[] f27442Z;

        /* JADX INFO: renamed from: a0 */
        public static final int[] f27443a0;

        /* JADX INFO: renamed from: b0 */
        public static final int[] f27444b0;

        /* JADX INFO: renamed from: v */
        public static final int f27445v = 99;

        /* JADX INFO: renamed from: w */
        public static final int f27446w = 74;

        /* JADX INFO: renamed from: x */
        public static final int f27447x = 209;

        /* JADX INFO: renamed from: y */
        public static final int f27448y = 4;

        /* JADX INFO: renamed from: z */
        public static final int f27449z = 15;

        /* JADX INFO: renamed from: a */
        public final List<SpannableString> f27450a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final SpannableStringBuilder f27451b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c */
        public boolean f27452c;

        /* JADX INFO: renamed from: d */
        public boolean f27453d;

        /* JADX INFO: renamed from: e */
        public int f27454e;

        /* JADX INFO: renamed from: f */
        public boolean f27455f;

        /* JADX INFO: renamed from: g */
        public int f27456g;

        /* JADX INFO: renamed from: h */
        public int f27457h;

        /* JADX INFO: renamed from: i */
        public int f27458i;

        /* JADX INFO: renamed from: j */
        public int f27459j;

        /* JADX INFO: renamed from: k */
        public int f27460k;

        /* JADX INFO: renamed from: l */
        public int f27461l;

        /* JADX INFO: renamed from: m */
        public int f27462m;

        /* JADX INFO: renamed from: n */
        public int f27463n;

        /* JADX INFO: renamed from: o */
        public int f27464o;

        /* JADX INFO: renamed from: p */
        public int f27465p;

        /* JADX INFO: renamed from: q */
        public int f27466q;

        /* JADX INFO: renamed from: r */
        public int f27467r;

        /* JADX INFO: renamed from: s */
        public int f27468s;

        /* JADX INFO: renamed from: t */
        public int f27469t;

        /* JADX INFO: renamed from: u */
        public int f27470u;

        static {
            int argbColorFromCeaColor = getArgbColorFromCeaColor(0, 0, 0, 0);
            f27428L = argbColorFromCeaColor;
            int argbColorFromCeaColor2 = getArgbColorFromCeaColor(0, 0, 0, 3);
            f27429M = argbColorFromCeaColor2;
            f27437U = new int[]{0, 0, 0, 0, 0, 2, 0};
            f27438V = new int[]{0, 0, 0, 0, 0, 0, 2};
            f27439W = new int[]{3, 3, 3, 3, 3, 3, 1};
            f27440X = new boolean[]{false, false, false, true, true, true, false};
            f27441Y = new int[]{argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor};
            f27442Z = new int[]{0, 1, 2, 3, 4, 3, 4};
            f27443a0 = new int[]{0, 0, 0, 0, 0, 3, 3};
            f27444b0 = new int[]{argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor2};
        }

        public C4490b() {
            reset();
        }

        public static int getArgbColorFromCeaColor(int i, int i2, int i3) {
            return getArgbColorFromCeaColor(i, i2, i3, 0);
        }

        public void append(char c) {
            if (c != '\n') {
                this.f27451b.append(c);
                return;
            }
            this.f27450a.add(buildSpannableString());
            this.f27451b.clear();
            if (this.f27464o != -1) {
                this.f27464o = 0;
            }
            if (this.f27465p != -1) {
                this.f27465p = 0;
            }
            if (this.f27466q != -1) {
                this.f27466q = 0;
            }
            if (this.f27468s != -1) {
                this.f27468s = 0;
            }
            while (true) {
                if (this.f27450a.size() < this.f27459j && this.f27450a.size() < 15) {
                    this.f27470u = this.f27450a.size();
                    return;
                }
                this.f27450a.remove(0);
            }
        }

        public void backspace() {
            int length = this.f27451b.length();
            if (length > 0) {
                this.f27451b.delete(length - 1, length);
            }
        }

        @hib
        public C4489a build() {
            Layout.Alignment alignment;
            float f;
            float f2;
            if (isEmpty()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.f27450a.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.f27450a.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildSpannableString());
            int i2 = this.f27460k;
            if (i2 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i2 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f27460k);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f27455f) {
                f = this.f27457h / 99.0f;
                f2 = this.f27456g / 99.0f;
            } else {
                f = this.f27457h / 209.0f;
                f2 = this.f27456g / 74.0f;
            }
            float f3 = (f * 0.9f) + 0.05f;
            float f4 = (f2 * 0.9f) + 0.05f;
            int i3 = this.f27458i;
            return new C4489a(spannableStringBuilder, alignment2, f4, 0, i3 / 3 == 0 ? 0 : i3 / 3 == 1 ? 1 : 2, f3, i3 % 3 == 0 ? 0 : i3 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f27463n != f27428L, this.f27463n, this.f27454e);
        }

        public SpannableString buildSpannableString() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f27451b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f27464o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f27464o, length, 33);
                }
                if (this.f27465p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f27465p, length, 33);
                }
                if (this.f27466q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f27467r), this.f27466q, length, 33);
                }
                if (this.f27468s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f27469t), this.f27468s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void clear() {
            this.f27450a.clear();
            this.f27451b.clear();
            this.f27464o = -1;
            this.f27465p = -1;
            this.f27466q = -1;
            this.f27468s = -1;
            this.f27470u = 0;
        }

        public void defineWindow(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f27452c = true;
            this.f27453d = z;
            this.f27454e = i;
            this.f27455f = z2;
            this.f27456g = i2;
            this.f27457h = i3;
            this.f27458i = i5;
            int i8 = i4 + 1;
            if (this.f27459j != i8) {
                this.f27459j = i8;
                while (true) {
                    if (this.f27450a.size() < this.f27459j && this.f27450a.size() < 15) {
                        break;
                    } else {
                        this.f27450a.remove(0);
                    }
                }
            }
            if (i6 != 0 && this.f27461l != i6) {
                this.f27461l = i6;
                int i9 = i6 - 1;
                setWindowAttributes(f27441Y[i9], f27429M, f27440X[i9], 0, f27438V[i9], f27439W[i9], f27437U[i9]);
            }
            if (i7 == 0 || this.f27462m == i7) {
                return;
            }
            this.f27462m = i7;
            int i10 = i7 - 1;
            setPenAttributes(0, 1, 1, false, false, f27443a0[i10], f27442Z[i10]);
            setPenColor(f27427K, f27444b0[i10], f27428L);
        }

        public boolean isDefined() {
            return this.f27452c;
        }

        public boolean isEmpty() {
            return !isDefined() || (this.f27450a.isEmpty() && this.f27451b.length() == 0);
        }

        public boolean isVisible() {
            return this.f27453d;
        }

        public void reset() {
            clear();
            this.f27452c = false;
            this.f27453d = false;
            this.f27454e = 4;
            this.f27455f = false;
            this.f27456g = 0;
            this.f27457h = 0;
            this.f27458i = 0;
            this.f27459j = 15;
            this.f27460k = 0;
            this.f27461l = 0;
            this.f27462m = 0;
            int i = f27428L;
            this.f27463n = i;
            this.f27467r = f27427K;
            this.f27469t = i;
        }

        public void setPenAttributes(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f27464o != -1) {
                if (!z) {
                    this.f27451b.setSpan(new StyleSpan(2), this.f27464o, this.f27451b.length(), 33);
                    this.f27464o = -1;
                }
            } else if (z) {
                this.f27464o = this.f27451b.length();
            }
            if (this.f27465p == -1) {
                if (z2) {
                    this.f27465p = this.f27451b.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.f27451b.setSpan(new UnderlineSpan(), this.f27465p, this.f27451b.length(), 33);
                this.f27465p = -1;
            }
        }

        public void setPenColor(int i, int i2, int i3) {
            if (this.f27466q != -1 && this.f27467r != i) {
                this.f27451b.setSpan(new ForegroundColorSpan(this.f27467r), this.f27466q, this.f27451b.length(), 33);
            }
            if (i != f27427K) {
                this.f27466q = this.f27451b.length();
                this.f27467r = i;
            }
            if (this.f27468s != -1 && this.f27469t != i2) {
                this.f27451b.setSpan(new BackgroundColorSpan(this.f27469t), this.f27468s, this.f27451b.length(), 33);
            }
            if (i2 != f27428L) {
                this.f27468s = this.f27451b.length();
                this.f27469t = i2;
            }
        }

        public void setPenLocation(int i, int i2) {
            if (this.f27470u != i) {
                append('\n');
            }
            this.f27470u = i;
        }

        public void setVisibility(boolean z) {
            this.f27453d = z;
        }

        public void setWindowAttributes(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f27463n = i;
            this.f27460k = i6;
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
                p000.v80.checkIndex(r4, r0, r1)
                p000.v80.checkIndex(r5, r0, r1)
                p000.v80.checkIndex(r6, r0, r1)
                p000.v80.checkIndex(r7, r0, r1)
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
            throw new UnsupportedOperationException("Method not decompiled: p000.ct1.C4490b.getArgbColorFromCeaColor(int, int, int, int):int");
        }
    }

    /* JADX INFO: renamed from: ct1$c */
    public static final class C4491c {

        /* JADX INFO: renamed from: a */
        public final int f27471a;

        /* JADX INFO: renamed from: b */
        public final int f27472b;

        /* JADX INFO: renamed from: c */
        public final byte[] f27473c;

        /* JADX INFO: renamed from: d */
        public int f27474d = 0;

        public C4491c(int i, int i2) {
            this.f27471a = i;
            this.f27472b = i2;
            this.f27473c = new byte[(i2 * 2) - 1];
        }
    }

    public ct1(int i, @hib List<byte[]> list) {
        this.f27407n = i == -1 ? 1 : i;
        this.f27406m = list != null && d72.parseCea708InitializationData(list);
        this.f27408o = new C4490b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f27408o[i2] = new C4490b();
        }
        this.f27409p = this.f27408o[0];
    }

    private void finalizeCurrentPacket() {
        if (this.f27412s == null) {
            return;
        }
        processCurrentPacket();
        this.f27412s = null;
    }

    private List<n93> getDisplayCues() {
        C4489a c4489aBuild;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f27408o[i].isEmpty() && this.f27408o[i].isVisible() && (c4489aBuild = this.f27408o[i].build()) != null) {
                arrayList.add(c4489aBuild);
            }
        }
        Collections.sort(arrayList, C4489a.f27414c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C4489a) arrayList.get(i2)).f27415a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void handleC0Command(int i) {
        if (i != 0) {
            if (i == 3) {
                this.f27410q = getDisplayCues();
            }
            if (i == 8) {
                this.f27409p.backspace();
                return;
            }
            switch (i) {
                case 12:
                    resetCueBuilders();
                    break;
                case 13:
                    this.f27409p.append('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i >= 17 && i <= 23) {
                        xh9.m25148w("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        this.f27404k.skipBits(8);
                    } else if (i >= 24 && i <= 31) {
                        xh9.m25148w("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        this.f27404k.skipBits(16);
                    } else {
                        xh9.m25148w("Cea708Decoder", "Invalid C0 command: " + i);
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
                if (this.f27413t != i3) {
                    this.f27413t = i3;
                    this.f27409p = this.f27408o[i3];
                }
                break;
            case 136:
                while (i2 <= 8) {
                    if (this.f27404k.readBit()) {
                        this.f27408o[8 - i2].clear();
                    }
                    i2++;
                }
                break;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.f27404k.readBit()) {
                        this.f27408o[8 - i4].setVisibility(true);
                    }
                }
                break;
            case 138:
                while (i2 <= 8) {
                    if (this.f27404k.readBit()) {
                        this.f27408o[8 - i2].setVisibility(false);
                    }
                    i2++;
                }
                break;
            case 139:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f27404k.readBit()) {
                        this.f27408o[8 - i5].setVisibility(!r0.isVisible());
                    }
                }
                break;
            case 140:
                while (i2 <= 8) {
                    if (this.f27404k.readBit()) {
                        this.f27408o[8 - i2].reset();
                    }
                    i2++;
                }
                break;
            case 141:
                this.f27404k.skipBits(8);
                break;
            case 142:
                break;
            case 143:
                resetCueBuilders();
                break;
            case 144:
                if (this.f27409p.isDefined()) {
                    handleSetPenAttributes();
                } else {
                    this.f27404k.skipBits(16);
                }
                break;
            case 145:
                if (this.f27409p.isDefined()) {
                    handleSetPenColor();
                } else {
                    this.f27404k.skipBits(24);
                }
                break;
            case 146:
                if (this.f27409p.isDefined()) {
                    handleSetPenLocation();
                } else {
                    this.f27404k.skipBits(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                xh9.m25148w("Cea708Decoder", "Invalid C1 command: " + i);
                break;
            case 151:
                if (this.f27409p.isDefined()) {
                    handleSetWindowAttributes();
                } else {
                    this.f27404k.skipBits(32);
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
                if (this.f27413t != i6) {
                    this.f27413t = i6;
                    this.f27409p = this.f27408o[i6];
                }
                break;
        }
    }

    private void handleC2Command(int i) {
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            this.f27404k.skipBits(8);
        } else if (i <= 23) {
            this.f27404k.skipBits(16);
        } else if (i <= 31) {
            this.f27404k.skipBits(24);
        }
    }

    private void handleC3Command(int i) {
        if (i <= 135) {
            this.f27404k.skipBits(32);
            return;
        }
        if (i <= 143) {
            this.f27404k.skipBits(40);
        } else if (i <= 159) {
            this.f27404k.skipBits(2);
            this.f27404k.skipBits(this.f27404k.readBits(6) * 8);
        }
    }

    private void handleDefineWindow(int i) {
        C4490b c4490b = this.f27408o[i];
        this.f27404k.skipBits(2);
        boolean bit = this.f27404k.readBit();
        this.f27404k.skipBits(2);
        int bits = this.f27404k.readBits(3);
        boolean bit2 = this.f27404k.readBit();
        int bits2 = this.f27404k.readBits(7);
        int bits3 = this.f27404k.readBits(8);
        int bits4 = this.f27404k.readBits(4);
        int bits5 = this.f27404k.readBits(4);
        this.f27404k.skipBits(2);
        this.f27404k.skipBits(6);
        this.f27404k.skipBits(2);
        c4490b.defineWindow(bit, bits, bit2, bits2, bits3, bits5, bits4, this.f27404k.readBits(3), this.f27404k.readBits(3));
    }

    private void handleG0Character(int i) {
        if (i == 127) {
            this.f27409p.append((char) 9835);
        } else {
            this.f27409p.append((char) (i & 255));
        }
    }

    private void handleG1Character(int i) {
        this.f27409p.append((char) (i & 255));
    }

    private void handleG2Character(int i) {
        if (i == 32) {
            this.f27409p.append(' ');
        }
        if (i == 33) {
            this.f27409p.append(xnh.f98716g);
            return;
        }
        if (i == 37) {
            this.f27409p.append(xnh.f98699F);
            return;
        }
        if (i == 42) {
            this.f27409p.append((char) 352);
            return;
        }
        if (i == 44) {
            this.f27409p.append((char) 338);
            return;
        }
        if (i == 63) {
            this.f27409p.append((char) 376);
            return;
        }
        if (i == 57) {
            this.f27409p.append(xnh.f98703J);
            return;
        }
        if (i == 58) {
            this.f27409p.append((char) 353);
            return;
        }
        if (i == 60) {
            this.f27409p.append((char) 339);
            return;
        }
        if (i == 61) {
            this.f27409p.append((char) 8480);
            return;
        }
        switch (i) {
            case 48:
                this.f27409p.append((char) 9608);
                break;
            case 49:
                this.f27409p.append(xnh.f98732w);
                break;
            case 50:
                this.f27409p.append(xnh.f98733x);
                break;
            case 51:
                this.f27409p.append(xnh.f98735z);
                break;
            case 52:
                this.f27409p.append(xnh.f98694A);
                break;
            case 53:
                this.f27409p.append((char) 8226);
                break;
            default:
                switch (i) {
                    case 118:
                        this.f27409p.append((char) 8539);
                        break;
                    case 119:
                        this.f27409p.append((char) 8540);
                        break;
                    case 120:
                        this.f27409p.append((char) 8541);
                        break;
                    case 121:
                        this.f27409p.append((char) 8542);
                        break;
                    case 122:
                        this.f27409p.append((char) 9474);
                        break;
                    case 123:
                        this.f27409p.append((char) 9488);
                        break;
                    case 124:
                        this.f27409p.append((char) 9492);
                        break;
                    case 125:
                        this.f27409p.append((char) 9472);
                        break;
                    case 126:
                        this.f27409p.append((char) 9496);
                        break;
                    case 127:
                        this.f27409p.append((char) 9484);
                        break;
                    default:
                        xh9.m25148w("Cea708Decoder", "Invalid G2 character: " + i);
                        break;
                }
                break;
        }
    }

    private void handleG3Character(int i) {
        if (i == 160) {
            this.f27409p.append((char) 13252);
            return;
        }
        xh9.m25148w("Cea708Decoder", "Invalid G3 character: " + i);
        this.f27409p.append('_');
    }

    private void handleSetPenAttributes() {
        this.f27409p.setPenAttributes(this.f27404k.readBits(4), this.f27404k.readBits(2), this.f27404k.readBits(2), this.f27404k.readBit(), this.f27404k.readBit(), this.f27404k.readBits(3), this.f27404k.readBits(3));
    }

    private void handleSetPenColor() {
        int argbColorFromCeaColor = C4490b.getArgbColorFromCeaColor(this.f27404k.readBits(2), this.f27404k.readBits(2), this.f27404k.readBits(2), this.f27404k.readBits(2));
        int argbColorFromCeaColor2 = C4490b.getArgbColorFromCeaColor(this.f27404k.readBits(2), this.f27404k.readBits(2), this.f27404k.readBits(2), this.f27404k.readBits(2));
        this.f27404k.skipBits(2);
        this.f27409p.setPenColor(argbColorFromCeaColor, argbColorFromCeaColor2, C4490b.getArgbColorFromCeaColor(this.f27404k.readBits(2), this.f27404k.readBits(2), this.f27404k.readBits(2)));
    }

    private void handleSetPenLocation() {
        this.f27404k.skipBits(4);
        int bits = this.f27404k.readBits(4);
        this.f27404k.skipBits(2);
        this.f27409p.setPenLocation(bits, this.f27404k.readBits(6));
    }

    private void handleSetWindowAttributes() {
        int argbColorFromCeaColor = C4490b.getArgbColorFromCeaColor(this.f27404k.readBits(2), this.f27404k.readBits(2), this.f27404k.readBits(2), this.f27404k.readBits(2));
        int bits = this.f27404k.readBits(2);
        int argbColorFromCeaColor2 = C4490b.getArgbColorFromCeaColor(this.f27404k.readBits(2), this.f27404k.readBits(2), this.f27404k.readBits(2));
        if (this.f27404k.readBit()) {
            bits |= 4;
        }
        boolean bit = this.f27404k.readBit();
        int bits2 = this.f27404k.readBits(2);
        int bits3 = this.f27404k.readBits(2);
        int bits4 = this.f27404k.readBits(2);
        this.f27404k.skipBits(8);
        this.f27409p.setWindowAttributes(argbColorFromCeaColor, argbColorFromCeaColor2, bit, bits, bits2, bits3, bits4);
    }

    @g5e({"currentDtvCcPacket"})
    private void processCurrentPacket() {
        C4491c c4491c = this.f27412s;
        if (c4491c.f27474d != (c4491c.f27472b * 2) - 1) {
            xh9.m25142d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f27412s.f27472b * 2) - 1) + ", but current index is " + this.f27412s.f27474d + " (sequence number " + this.f27412s.f27471a + ");");
        }
        hhc hhcVar = this.f27404k;
        C4491c c4491c2 = this.f27412s;
        hhcVar.reset(c4491c2.f27473c, c4491c2.f27474d);
        boolean z = false;
        while (true) {
            if (this.f27404k.bitsLeft() <= 0) {
                break;
            }
            int bits = this.f27404k.readBits(3);
            int bits2 = this.f27404k.readBits(5);
            if (bits == 7) {
                this.f27404k.skipBits(2);
                bits = this.f27404k.readBits(6);
                if (bits < 7) {
                    xh9.m25148w("Cea708Decoder", "Invalid extended service number: " + bits);
                }
            }
            if (bits2 == 0) {
                if (bits != 0) {
                    xh9.m25148w("Cea708Decoder", "serviceNumber is non-zero (" + bits + ") when blockSize is 0");
                }
            } else if (bits != this.f27407n) {
                this.f27404k.skipBytes(bits2);
            } else {
                int position = this.f27404k.getPosition() + (bits2 * 8);
                while (this.f27404k.getPosition() < position) {
                    int bits3 = this.f27404k.readBits(8);
                    if (bits3 == 16) {
                        int bits4 = this.f27404k.readBits(8);
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
                                xh9.m25148w("Cea708Decoder", "Invalid extended command: " + bits4);
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
                            xh9.m25148w("Cea708Decoder", "Invalid base command: " + bits3);
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            this.f27410q = getDisplayCues();
        }
    }

    private void resetCueBuilders() {
        for (int i = 0; i < 8; i++) {
            this.f27408o[i].reset();
        }
    }

    @Override // p000.gt1
    /* JADX INFO: renamed from: a */
    public ydg mo8674a() {
        List<n93> list = this.f27410q;
        this.f27411r = list;
        return new jt1((List) v80.checkNotNull(list));
    }

    @Override // p000.gt1
    /* JADX INFO: renamed from: b */
    public void mo8675b(jeg jegVar) {
        ByteBuffer byteBuffer = (ByteBuffer) v80.checkNotNull(jegVar.f78608d);
        this.f27403j.reset(byteBuffer.array(), byteBuffer.limit());
        while (this.f27403j.bytesLeft() >= 3) {
            int unsignedByte = this.f27403j.readUnsignedByte();
            int i = unsignedByte & 3;
            boolean z = (unsignedByte & 4) == 4;
            byte unsignedByte2 = (byte) this.f27403j.readUnsignedByte();
            byte unsignedByte3 = (byte) this.f27403j.readUnsignedByte();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        finalizeCurrentPacket();
                        int i2 = (unsignedByte2 & k95.f53214o7) >> 6;
                        int i3 = this.f27405l;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            resetCueBuilders();
                            xh9.m25148w("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f27405l + " current=" + i2);
                        }
                        this.f27405l = i2;
                        int i4 = unsignedByte2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C4491c c4491c = new C4491c(i2, i4);
                        this.f27412s = c4491c;
                        byte[] bArr = c4491c.f27473c;
                        int i5 = c4491c.f27474d;
                        c4491c.f27474d = i5 + 1;
                        bArr[i5] = unsignedByte3;
                    } else {
                        v80.checkArgument(i == 2);
                        C4491c c4491c2 = this.f27412s;
                        if (c4491c2 == null) {
                            xh9.m25144e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c4491c2.f27473c;
                            int i6 = c4491c2.f27474d;
                            int i7 = i6 + 1;
                            c4491c2.f27474d = i7;
                            bArr2[i6] = unsignedByte2;
                            c4491c2.f27474d = i6 + 2;
                            bArr2[i7] = unsignedByte3;
                        }
                    }
                    C4491c c4491c3 = this.f27412s;
                    if (c4491c3.f27474d == (c4491c3.f27472b * 2) - 1) {
                        finalizeCurrentPacket();
                    }
                }
            }
        }
    }

    @Override // p000.gt1, p000.kl3
    @hib
    public /* bridge */ /* synthetic */ jeg dequeueInputBuffer() throws ceg {
        return super.dequeueInputBuffer();
    }

    @Override // p000.gt1, p000.kl3
    @hib
    public /* bridge */ /* synthetic */ leg dequeueOutputBuffer() throws ceg {
        return super.dequeueOutputBuffer();
    }

    @Override // p000.gt1
    /* JADX INFO: renamed from: e */
    public boolean mo8676e() {
        return this.f27410q != this.f27411r;
    }

    @Override // p000.gt1, p000.kl3
    public void flush() {
        super.flush();
        this.f27410q = null;
        this.f27411r = null;
        this.f27413t = 0;
        this.f27409p = this.f27408o[0];
        resetCueBuilders();
        this.f27412s = null;
    }

    @Override // p000.gt1, p000.kl3
    public String getName() {
        return "Cea708Decoder";
    }

    @Override // p000.gt1
    public /* bridge */ /* synthetic */ void queueInputBuffer(jeg jegVar) throws ceg {
        super.queueInputBuffer(jegVar);
    }

    @Override // p000.gt1, p000.kl3
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // p000.gt1, p000.aeg
    public /* bridge */ /* synthetic */ void setPositionUs(long j) {
        super.setPositionUs(j);
    }
}

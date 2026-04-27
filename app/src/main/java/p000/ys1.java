package p000;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.n93;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ys1 extends gt1 {

    /* JADX INFO: renamed from: B */
    public static final long f102814B = 16000;

    /* JADX INFO: renamed from: C */
    public static final String f102815C = "Cea608Decoder";

    /* JADX INFO: renamed from: D */
    public static final int f102816D = 4;

    /* JADX INFO: renamed from: E */
    public static final int f102817E = 2;

    /* JADX INFO: renamed from: F */
    public static final int f102818F = 1;

    /* JADX INFO: renamed from: G */
    public static final int f102819G = 0;

    /* JADX INFO: renamed from: H */
    public static final int f102820H = 1;

    /* JADX INFO: renamed from: I */
    public static final int f102821I = 0;

    /* JADX INFO: renamed from: J */
    public static final int f102822J = 1;

    /* JADX INFO: renamed from: K */
    public static final int f102823K = 0;

    /* JADX INFO: renamed from: L */
    public static final int f102824L = 1;

    /* JADX INFO: renamed from: M */
    public static final int f102825M = 2;

    /* JADX INFO: renamed from: N */
    public static final int f102826N = 3;

    /* JADX INFO: renamed from: R */
    public static final int f102830R = 7;

    /* JADX INFO: renamed from: S */
    public static final int f102831S = 8;

    /* JADX INFO: renamed from: T */
    public static final int f102832T = 4;

    /* JADX INFO: renamed from: U */
    public static final byte f102833U = -4;

    /* JADX INFO: renamed from: V */
    public static final byte f102834V = 32;

    /* JADX INFO: renamed from: W */
    public static final byte f102835W = 33;

    /* JADX INFO: renamed from: X */
    public static final byte f102836X = 36;

    /* JADX INFO: renamed from: Y */
    public static final byte f102837Y = 37;

    /* JADX INFO: renamed from: Z */
    public static final byte f102838Z = 38;

    /* JADX INFO: renamed from: a0 */
    public static final byte f102839a0 = 39;

    /* JADX INFO: renamed from: b0 */
    public static final byte f102840b0 = 41;

    /* JADX INFO: renamed from: c0 */
    public static final byte f102841c0 = 42;

    /* JADX INFO: renamed from: d0 */
    public static final byte f102842d0 = 43;

    /* JADX INFO: renamed from: e0 */
    public static final byte f102843e0 = 44;

    /* JADX INFO: renamed from: f0 */
    public static final byte f102844f0 = 45;

    /* JADX INFO: renamed from: g0 */
    public static final byte f102845g0 = 46;

    /* JADX INFO: renamed from: h0 */
    public static final byte f102846h0 = 47;

    /* JADX INFO: renamed from: A */
    public long f102852A;

    /* JADX INFO: renamed from: k */
    public final int f102854k;

    /* JADX INFO: renamed from: l */
    public final int f102855l;

    /* JADX INFO: renamed from: m */
    public final int f102856m;

    /* JADX INFO: renamed from: n */
    public final long f102857n;

    /* JADX INFO: renamed from: q */
    @hib
    public List<n93> f102860q;

    /* JADX INFO: renamed from: r */
    @hib
    public List<n93> f102861r;

    /* JADX INFO: renamed from: s */
    public int f102862s;

    /* JADX INFO: renamed from: t */
    public int f102863t;

    /* JADX INFO: renamed from: u */
    public boolean f102864u;

    /* JADX INFO: renamed from: v */
    public boolean f102865v;

    /* JADX INFO: renamed from: w */
    public byte f102866w;

    /* JADX INFO: renamed from: x */
    public byte f102867x;

    /* JADX INFO: renamed from: z */
    public boolean f102869z;

    /* JADX INFO: renamed from: O */
    public static final int[] f102827O = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: P */
    public static final int[] f102828P = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: Q */
    public static final int[] f102829Q = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: i0 */
    public static final int[] f102847i0 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: j0 */
    public static final int[] f102848j0 = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, nb2.f63866n, nb2.f63860h, 234, 238, 244, 251};

    /* JADX INFO: renamed from: k0 */
    public static final int[] f102849k0 = {l87.f56762u, 201, 211, bw3.f14995j, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, nb2.f63870r, tpc.f85549b, 200, 202, 203, 235, gm2.f40178o, gm2.f40180q, 239, nb2.f63868p, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: l0 */
    public static final int[] f102850l0 = {nb2.f63871s, nb2.f63861i, 205, gm2.f40176m, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, nb2.f63872t, nb2.f63862j, 214, 246, 223, 165, 164, 9474, 197, nb2.f63863k, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: m0 */
    public static final boolean[] f102851m0 = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: j */
    public final jhc f102853j = new jhc();

    /* JADX INFO: renamed from: o */
    public final ArrayList<C15793a> f102858o = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    public C15793a f102859p = new C15793a(0, 4);

    /* JADX INFO: renamed from: y */
    public int f102868y = 0;

    /* JADX INFO: renamed from: ys1$a */
    public static final class C15793a {

        /* JADX INFO: renamed from: i */
        public static final int f102870i = 32;

        /* JADX INFO: renamed from: j */
        public static final int f102871j = 15;

        /* JADX INFO: renamed from: a */
        public final List<a> f102872a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<SpannableString> f102873b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final StringBuilder f102874c = new StringBuilder();

        /* JADX INFO: renamed from: d */
        public int f102875d;

        /* JADX INFO: renamed from: e */
        public int f102876e;

        /* JADX INFO: renamed from: f */
        public int f102877f;

        /* JADX INFO: renamed from: g */
        public int f102878g;

        /* JADX INFO: renamed from: h */
        public int f102879h;

        /* JADX INFO: renamed from: ys1$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final int f102880a;

            /* JADX INFO: renamed from: b */
            public final boolean f102881b;

            /* JADX INFO: renamed from: c */
            public int f102882c;

            public a(int i, boolean z, int i2) {
                this.f102880a = i;
                this.f102881b = z;
                this.f102882c = i2;
            }
        }

        public C15793a(int i, int i2) {
            reset(i);
            this.f102879h = i2;
        }

        private SpannableString buildCurrentLine() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f102874c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 < this.f102872a.size()) {
                a aVar = this.f102872a.get(i5);
                boolean z2 = aVar.f102881b;
                int i7 = aVar.f102880a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = ys1.f102829Q[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f102882c;
                i5++;
                if (i8 != (i5 < this.f102872a.size() ? this.f102872a.get(i5).f102882c : length)) {
                    if (i != -1 && !z2) {
                        setUnderlineSpan(spannableStringBuilder, i, i8);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        setItalicSpan(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        setColorSpan(spannableStringBuilder, i6, i8, i3);
                        i3 = i4;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                setUnderlineSpan(spannableStringBuilder, i, length);
            }
            if (i2 != -1 && i2 != length) {
                setItalicSpan(spannableStringBuilder, i2, length);
            }
            if (i6 != length) {
                setColorSpan(spannableStringBuilder, i6, length, i3);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void setColorSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        private static void setItalicSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        private static void setUnderlineSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        public void append(char c) {
            if (this.f102874c.length() < 32) {
                this.f102874c.append(c);
            }
        }

        public void backspace() {
            int length = this.f102874c.length();
            if (length > 0) {
                this.f102874c.delete(length - 1, length);
                for (int size = this.f102872a.size() - 1; size >= 0; size--) {
                    a aVar = this.f102872a.get(size);
                    int i = aVar.f102882c;
                    if (i != length) {
                        return;
                    }
                    aVar.f102882c = i - 1;
                }
            }
        }

        @hib
        public n93 build(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < this.f102873b.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.f102873b.get(i2));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildCurrentLine());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.f102876e + this.f102877f;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.f102878g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.f102878g != 2 || i4 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i5 = this.f102875d;
            if (i5 > 7) {
                i5 -= 17;
            } else if (this.f102878g == 1) {
                i5 -= this.f102879h - 1;
            }
            return new n93.C9750c().setText(spannableStringBuilder).setTextAlignment(Layout.Alignment.ALIGN_NORMAL).setLine(i5, 1).setPosition(f).setPositionAnchor(i).build();
        }

        public boolean isEmpty() {
            return this.f102872a.isEmpty() && this.f102873b.isEmpty() && this.f102874c.length() == 0;
        }

        public void reset(int i) {
            this.f102878g = i;
            this.f102872a.clear();
            this.f102873b.clear();
            this.f102874c.setLength(0);
            this.f102875d = 15;
            this.f102876e = 0;
            this.f102877f = 0;
        }

        public void rollUp() {
            this.f102873b.add(buildCurrentLine());
            this.f102874c.setLength(0);
            this.f102872a.clear();
            int iMin = Math.min(this.f102879h, this.f102875d);
            while (this.f102873b.size() >= iMin) {
                this.f102873b.remove(0);
            }
        }

        public void setCaptionMode(int i) {
            this.f102878g = i;
        }

        public void setCaptionRowCount(int i) {
            this.f102879h = i;
        }

        public void setStyle(int i, boolean z) {
            this.f102872a.add(new a(i, z, this.f102874c.length()));
        }
    }

    public ys1(String str, int i, long j) {
        if (j != -9223372036854775807L) {
            v80.checkArgument(j >= 16000);
            this.f102857n = j * 1000;
        } else {
            this.f102857n = -9223372036854775807L;
        }
        this.f102854k = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f102856m = 0;
            this.f102855l = 0;
        } else if (i == 2) {
            this.f102856m = 1;
            this.f102855l = 0;
        } else if (i == 3) {
            this.f102856m = 0;
            this.f102855l = 1;
        } else if (i != 4) {
            xh9.m25148w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f102856m = 0;
            this.f102855l = 0;
        } else {
            this.f102856m = 1;
            this.f102855l = 1;
        }
        setCaptionMode(0);
        resetCueBuilders();
        this.f102869z = true;
        this.f102852A = -9223372036854775807L;
    }

    private static char getBasicChar(byte b) {
        return (char) f102847i0[(b & 127) - 32];
    }

    private static int getChannel(byte b) {
        return (b >> 3) & 1;
    }

    private List<n93> getDisplayCues() {
        int size = this.f102858o.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            n93 n93VarBuild = this.f102858o.get(i).build(Integer.MIN_VALUE);
            arrayList.add(n93VarBuild);
            if (n93VarBuild != null) {
                iMin = Math.min(iMin, n93VarBuild.f63711i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            n93 n93Var = (n93) arrayList.get(i2);
            if (n93Var != null) {
                if (n93Var.f63711i != iMin) {
                    n93Var = (n93) v80.checkNotNull(this.f102858o.get(i2).build(iMin));
                }
                arrayList2.add(n93Var);
            }
        }
        return arrayList2;
    }

    private static char getExtendedEsFrChar(byte b) {
        return (char) f102849k0[b & 31];
    }

    private static char getExtendedPtDeChar(byte b) {
        return (char) f102850l0[b & 31];
    }

    private static char getExtendedWestEuropeanChar(byte b, byte b2) {
        return (b & 1) == 0 ? getExtendedEsFrChar(b2) : getExtendedPtDeChar(b2);
    }

    private static char getSpecialNorthAmericanChar(byte b) {
        return (char) f102848j0[b & 15];
    }

    private void handleMidrowCtrl(byte b) {
        this.f102859p.append(' ');
        this.f102859p.setStyle((b >> 1) & 7, (b & 1) == 1);
    }

    private void handleMiscCode(byte b) {
        if (b == 32) {
            setCaptionMode(2);
            return;
        }
        if (b == 41) {
            setCaptionMode(3);
            return;
        }
        switch (b) {
            case 37:
                setCaptionMode(1);
                setCaptionRowCount(2);
                break;
            case 38:
                setCaptionMode(1);
                setCaptionRowCount(3);
                break;
            case 39:
                setCaptionMode(1);
                setCaptionRowCount(4);
                break;
            default:
                int i = this.f102862s;
                if (i != 0) {
                    if (b != 33) {
                        switch (b) {
                            case 44:
                                this.f102860q = Collections.emptyList();
                                int i2 = this.f102862s;
                                if (i2 == 1 || i2 == 3) {
                                    resetCueBuilders();
                                }
                                break;
                            case 45:
                                if (i == 1 && !this.f102859p.isEmpty()) {
                                    this.f102859p.rollUp();
                                    break;
                                }
                                break;
                            case 46:
                                resetCueBuilders();
                                break;
                            case 47:
                                this.f102860q = getDisplayCues();
                                resetCueBuilders();
                                break;
                        }
                    } else {
                        this.f102859p.backspace();
                        break;
                    }
                }
                break;
        }
    }

    private void handlePreambleAddressCode(byte b, byte b2) {
        int i = f102827O[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.f102859p.f102875d) {
            if (this.f102862s != 1 && !this.f102859p.isEmpty()) {
                C15793a c15793a = new C15793a(this.f102862s, this.f102863t);
                this.f102859p = c15793a;
                this.f102858o.add(c15793a);
            }
            this.f102859p.f102875d = i;
        }
        boolean z = (b2 & 16) == 16;
        boolean z2 = (b2 & 1) == 1;
        int i2 = (b2 >> 1) & 7;
        this.f102859p.setStyle(z ? 8 : i2, z2);
        if (z) {
            this.f102859p.f102876e = f102828P[i2];
        }
    }

    private static boolean isCtrlCode(byte b) {
        return (b & 224) == 0;
    }

    private static boolean isExtendedWestEuropeanChar(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    private static boolean isMidrowCtrlCode(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    private static boolean isMiscCode(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    private static boolean isPreambleAddressCode(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & k95.f53214o7) == 64;
    }

    private static boolean isRepeatable(byte b) {
        return (b & 240) == 16;
    }

    private boolean isRepeatedCommand(boolean z, byte b, byte b2) {
        if (!z || !isRepeatable(b)) {
            this.f102865v = false;
        } else {
            if (this.f102865v && this.f102866w == b && this.f102867x == b2) {
                this.f102865v = false;
                return true;
            }
            this.f102865v = true;
            this.f102866w = b;
            this.f102867x = b2;
        }
        return false;
    }

    private static boolean isServiceSwitchCommand(byte b) {
        return (b & 246) == 20;
    }

    private static boolean isSpecialNorthAmericanChar(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    private static boolean isTabCtrlCode(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    private static boolean isXdsControlCode(byte b) {
        return 1 <= b && b <= 15;
    }

    private void maybeUpdateIsInCaptionService(byte b, byte b2) {
        if (isXdsControlCode(b)) {
            this.f102869z = false;
            return;
        }
        if (isServiceSwitchCommand(b)) {
            if (b2 != 32 && b2 != 47) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 42:
                            case 43:
                                this.f102869z = false;
                                break;
                        }
                }
            }
            this.f102869z = true;
        }
    }

    private void resetCueBuilders() {
        this.f102859p.reset(this.f102862s);
        this.f102858o.clear();
        this.f102858o.add(this.f102859p);
    }

    private void setCaptionMode(int i) {
        int i2 = this.f102862s;
        if (i2 == i) {
            return;
        }
        this.f102862s = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.f102858o.size(); i3++) {
                this.f102858o.get(i3).setCaptionMode(i);
            }
            return;
        }
        resetCueBuilders();
        if (i2 == 3 || i == 1 || i == 0) {
            this.f102860q = Collections.emptyList();
        }
    }

    private void setCaptionRowCount(int i) {
        this.f102863t = i;
        this.f102859p.setCaptionRowCount(i);
    }

    private boolean shouldClearStuckCaptions() {
        return (this.f102857n == -9223372036854775807L || this.f102852A == -9223372036854775807L || m11857d() - this.f102852A < this.f102857n) ? false : true;
    }

    private boolean updateAndVerifyCurrentChannel(byte b) {
        if (isCtrlCode(b)) {
            this.f102868y = getChannel(b);
        }
        return this.f102868y == this.f102856m;
    }

    @Override // p000.gt1
    /* JADX INFO: renamed from: a */
    public ydg mo8674a() {
        List<n93> list = this.f102860q;
        this.f102861r = list;
        return new jt1((List) v80.checkNotNull(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // p000.gt1
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo8675b(p000.jeg r10) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ys1.mo8675b(jeg):void");
    }

    @Override // p000.gt1, p000.kl3
    @hib
    public /* bridge */ /* synthetic */ jeg dequeueInputBuffer() throws ceg {
        return super.dequeueInputBuffer();
    }

    @Override // p000.gt1
    /* JADX INFO: renamed from: e */
    public boolean mo8676e() {
        return this.f102860q != this.f102861r;
    }

    @Override // p000.gt1, p000.kl3
    public void flush() {
        super.flush();
        this.f102860q = null;
        this.f102861r = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.f102864u = false;
        this.f102865v = false;
        this.f102866w = (byte) 0;
        this.f102867x = (byte) 0;
        this.f102868y = 0;
        this.f102869z = true;
        this.f102852A = -9223372036854775807L;
    }

    @Override // p000.gt1, p000.kl3
    public String getName() {
        return "Cea608Decoder";
    }

    @Override // p000.gt1
    public /* bridge */ /* synthetic */ void queueInputBuffer(jeg jegVar) throws ceg {
        super.queueInputBuffer(jegVar);
    }

    @Override // p000.gt1, p000.kl3
    public void release() {
    }

    @Override // p000.gt1, p000.aeg
    public /* bridge */ /* synthetic */ void setPositionUs(long j) {
        super.setPositionUs(j);
    }

    @Override // p000.gt1, p000.kl3
    @hib
    public leg dequeueOutputBuffer() throws ceg {
        leg legVarM11856c;
        leg legVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (legVarDequeueOutputBuffer != null) {
            return legVarDequeueOutputBuffer;
        }
        if (!shouldClearStuckCaptions() || (legVarM11856c = m11856c()) == null) {
            return null;
        }
        this.f102860q = Collections.emptyList();
        this.f102852A = -9223372036854775807L;
        legVarM11856c.setContent(m11857d(), mo8674a(), Long.MAX_VALUE);
        return legVarM11856c;
    }
}

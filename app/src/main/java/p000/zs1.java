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
import p000.o93;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zs1 extends ht1 {

    /* JADX INFO: renamed from: A */
    public static final long f105874A = 16000;

    /* JADX INFO: renamed from: B */
    public static final String f105875B = "Cea608Decoder";

    /* JADX INFO: renamed from: C */
    public static final int f105876C = 4;

    /* JADX INFO: renamed from: D */
    public static final int f105877D = 2;

    /* JADX INFO: renamed from: E */
    public static final int f105878E = 1;

    /* JADX INFO: renamed from: F */
    public static final int f105879F = 0;

    /* JADX INFO: renamed from: G */
    public static final int f105880G = 1;

    /* JADX INFO: renamed from: H */
    public static final int f105881H = 0;

    /* JADX INFO: renamed from: I */
    public static final int f105882I = 1;

    /* JADX INFO: renamed from: J */
    public static final int f105883J = 0;

    /* JADX INFO: renamed from: K */
    public static final int f105884K = 1;

    /* JADX INFO: renamed from: L */
    public static final int f105885L = 2;

    /* JADX INFO: renamed from: M */
    public static final int f105886M = 3;

    /* JADX INFO: renamed from: Q */
    public static final int f105890Q = 7;

    /* JADX INFO: renamed from: R */
    public static final int f105891R = 8;

    /* JADX INFO: renamed from: S */
    public static final int f105892S = 4;

    /* JADX INFO: renamed from: T */
    public static final byte f105893T = -4;

    /* JADX INFO: renamed from: U */
    public static final byte f105894U = 32;

    /* JADX INFO: renamed from: V */
    public static final byte f105895V = 33;

    /* JADX INFO: renamed from: W */
    public static final byte f105896W = 36;

    /* JADX INFO: renamed from: X */
    public static final byte f105897X = 37;

    /* JADX INFO: renamed from: Y */
    public static final byte f105898Y = 38;

    /* JADX INFO: renamed from: Z */
    public static final byte f105899Z = 39;

    /* JADX INFO: renamed from: a0 */
    public static final byte f105900a0 = 41;

    /* JADX INFO: renamed from: b0 */
    public static final byte f105901b0 = 42;

    /* JADX INFO: renamed from: c0 */
    public static final byte f105902c0 = 43;

    /* JADX INFO: renamed from: d0 */
    public static final byte f105903d0 = 44;

    /* JADX INFO: renamed from: e0 */
    public static final byte f105904e0 = 45;

    /* JADX INFO: renamed from: f0 */
    public static final byte f105905f0 = 46;

    /* JADX INFO: renamed from: g0 */
    public static final byte f105906g0 = 47;

    /* JADX INFO: renamed from: j */
    public final int f105913j;

    /* JADX INFO: renamed from: k */
    public final int f105914k;

    /* JADX INFO: renamed from: l */
    public final int f105915l;

    /* JADX INFO: renamed from: m */
    public final long f105916m;

    /* JADX INFO: renamed from: p */
    @hib
    public List<o93> f105919p;

    /* JADX INFO: renamed from: q */
    @hib
    public List<o93> f105920q;

    /* JADX INFO: renamed from: r */
    public int f105921r;

    /* JADX INFO: renamed from: s */
    public int f105922s;

    /* JADX INFO: renamed from: t */
    public boolean f105923t;

    /* JADX INFO: renamed from: u */
    public boolean f105924u;

    /* JADX INFO: renamed from: v */
    public byte f105925v;

    /* JADX INFO: renamed from: w */
    public byte f105926w;

    /* JADX INFO: renamed from: y */
    public boolean f105928y;

    /* JADX INFO: renamed from: z */
    public long f105929z;

    /* JADX INFO: renamed from: N */
    public static final int[] f105887N = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: O */
    public static final int[] f105888O = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: P */
    public static final int[] f105889P = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: h0 */
    public static final int[] f105907h0 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: i0 */
    public static final int[] f105908i0 = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, nb2.f63866n, nb2.f63860h, 234, 238, 244, 251};

    /* JADX INFO: renamed from: j0 */
    public static final int[] f105909j0 = {l87.f56762u, 201, 211, bw3.f14995j, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, nb2.f63870r, tpc.f85549b, 200, 202, 203, 235, gm2.f40178o, gm2.f40180q, 239, nb2.f63868p, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: k0 */
    public static final int[] f105910k0 = {nb2.f63871s, nb2.f63861i, 205, gm2.f40176m, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, nb2.f63872t, nb2.f63862j, 214, 246, 223, 165, 164, 9474, 197, nb2.f63863k, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: l0 */
    public static final boolean[] f105911l0 = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: i */
    public final ihc f105912i = new ihc();

    /* JADX INFO: renamed from: n */
    public final ArrayList<C16237a> f105917n = new ArrayList<>();

    /* JADX INFO: renamed from: o */
    public C16237a f105918o = new C16237a(0, 4);

    /* JADX INFO: renamed from: x */
    public int f105927x = 0;

    /* JADX INFO: renamed from: zs1$a */
    public static final class C16237a {

        /* JADX INFO: renamed from: i */
        public static final int f105930i = 32;

        /* JADX INFO: renamed from: j */
        public static final int f105931j = 15;

        /* JADX INFO: renamed from: a */
        public final List<a> f105932a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<SpannableString> f105933b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final StringBuilder f105934c = new StringBuilder();

        /* JADX INFO: renamed from: d */
        public int f105935d;

        /* JADX INFO: renamed from: e */
        public int f105936e;

        /* JADX INFO: renamed from: f */
        public int f105937f;

        /* JADX INFO: renamed from: g */
        public int f105938g;

        /* JADX INFO: renamed from: h */
        public int f105939h;

        /* JADX INFO: renamed from: zs1$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final int f105940a;

            /* JADX INFO: renamed from: b */
            public final boolean f105941b;

            /* JADX INFO: renamed from: c */
            public int f105942c;

            public a(int i, boolean z, int i2) {
                this.f105940a = i;
                this.f105941b = z;
                this.f105942c = i2;
            }
        }

        public C16237a(int i, int i2) {
            reset(i);
            this.f105939h = i2;
        }

        private SpannableString buildCurrentLine() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f105934c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 < this.f105932a.size()) {
                a aVar = this.f105932a.get(i5);
                boolean z2 = aVar.f105941b;
                int i7 = aVar.f105940a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = zs1.f105889P[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f105942c;
                i5++;
                if (i8 != (i5 < this.f105932a.size() ? this.f105932a.get(i5).f105942c : length)) {
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
            if (this.f105934c.length() < 32) {
                this.f105934c.append(c);
            }
        }

        public void backspace() {
            int length = this.f105934c.length();
            if (length > 0) {
                this.f105934c.delete(length - 1, length);
                for (int size = this.f105932a.size() - 1; size >= 0; size--) {
                    a aVar = this.f105932a.get(size);
                    int i = aVar.f105942c;
                    if (i != length) {
                        return;
                    }
                    aVar.f105942c = i - 1;
                }
            }
        }

        @hib
        public o93 build(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < this.f105933b.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.f105933b.get(i2));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildCurrentLine());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.f105936e + this.f105937f;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.f105938g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.f105938g != 2 || i4 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i5 = this.f105935d;
            if (i5 > 7) {
                i5 -= 17;
            } else if (this.f105938g == 1) {
                i5 -= this.f105939h - 1;
            }
            return new o93.C10261c().setText(spannableStringBuilder).setTextAlignment(Layout.Alignment.ALIGN_NORMAL).setLine(i5, 1).setPosition(f).setPositionAnchor(i).build();
        }

        public boolean isEmpty() {
            return this.f105932a.isEmpty() && this.f105933b.isEmpty() && this.f105934c.length() == 0;
        }

        public void reset(int i) {
            this.f105938g = i;
            this.f105932a.clear();
            this.f105933b.clear();
            this.f105934c.setLength(0);
            this.f105935d = 15;
            this.f105936e = 0;
            this.f105937f = 0;
        }

        public void rollUp() {
            this.f105933b.add(buildCurrentLine());
            this.f105934c.setLength(0);
            this.f105932a.clear();
            int iMin = Math.min(this.f105939h, this.f105935d);
            while (this.f105933b.size() >= iMin) {
                this.f105933b.remove(0);
            }
        }

        public void setCaptionMode(int i) {
            this.f105938g = i;
        }

        public void setCaptionRowCount(int i) {
            this.f105939h = i;
        }

        public void setStyle(int i, boolean z) {
            this.f105932a.add(new a(i, z, this.f105934c.length()));
        }
    }

    public zs1(String str, int i, long j) {
        this.f105916m = j > 0 ? j * 1000 : -9223372036854775807L;
        this.f105913j = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f105915l = 0;
            this.f105914k = 0;
        } else if (i == 2) {
            this.f105915l = 1;
            this.f105914k = 0;
        } else if (i == 3) {
            this.f105915l = 0;
            this.f105914k = 1;
        } else if (i != 4) {
            yh9.m25919w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f105915l = 0;
            this.f105914k = 0;
        } else {
            this.f105915l = 1;
            this.f105914k = 1;
        }
        setCaptionMode(0);
        resetCueBuilders();
        this.f105928y = true;
        this.f105929z = -9223372036854775807L;
    }

    private static char getBasicChar(byte b) {
        return (char) f105907h0[(b & 127) - 32];
    }

    private static int getChannel(byte b) {
        return (b >> 3) & 1;
    }

    private List<o93> getDisplayCues() {
        int size = this.f105917n.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            o93 o93VarBuild = this.f105917n.get(i).build(Integer.MIN_VALUE);
            arrayList.add(o93VarBuild);
            if (o93VarBuild != null) {
                iMin = Math.min(iMin, o93VarBuild.f66865F);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            o93 o93Var = (o93) arrayList.get(i2);
            if (o93Var != null) {
                if (o93Var.f66865F != iMin) {
                    o93Var = (o93) u80.checkNotNull(this.f105917n.get(i2).build(iMin));
                }
                arrayList2.add(o93Var);
            }
        }
        return arrayList2;
    }

    private static char getExtendedEsFrChar(byte b) {
        return (char) f105909j0[b & 31];
    }

    private static char getExtendedPtDeChar(byte b) {
        return (char) f105910k0[b & 31];
    }

    private static char getExtendedWestEuropeanChar(byte b, byte b2) {
        return (b & 1) == 0 ? getExtendedEsFrChar(b2) : getExtendedPtDeChar(b2);
    }

    private static char getSpecialNorthAmericanChar(byte b) {
        return (char) f105908i0[b & 15];
    }

    private void handleMidrowCtrl(byte b) {
        this.f105918o.append(' ');
        this.f105918o.setStyle((b >> 1) & 7, (b & 1) == 1);
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
                int i = this.f105921r;
                if (i != 0) {
                    if (b != 33) {
                        switch (b) {
                            case 44:
                                this.f105919p = Collections.emptyList();
                                int i2 = this.f105921r;
                                if (i2 == 1 || i2 == 3) {
                                    resetCueBuilders();
                                }
                                break;
                            case 45:
                                if (i == 1 && !this.f105918o.isEmpty()) {
                                    this.f105918o.rollUp();
                                    break;
                                }
                                break;
                            case 46:
                                resetCueBuilders();
                                break;
                            case 47:
                                this.f105919p = getDisplayCues();
                                resetCueBuilders();
                                break;
                        }
                    } else {
                        this.f105918o.backspace();
                        break;
                    }
                }
                break;
        }
    }

    private void handlePreambleAddressCode(byte b, byte b2) {
        int i = f105887N[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.f105918o.f105935d) {
            if (this.f105921r != 1 && !this.f105918o.isEmpty()) {
                C16237a c16237a = new C16237a(this.f105921r, this.f105922s);
                this.f105918o = c16237a;
                this.f105917n.add(c16237a);
            }
            this.f105918o.f105935d = i;
        }
        boolean z = (b2 & 16) == 16;
        boolean z2 = (b2 & 1) == 1;
        int i2 = (b2 >> 1) & 7;
        this.f105918o.setStyle(z ? 8 : i2, z2);
        if (z) {
            this.f105918o.f105936e = f105888O[i2];
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
            this.f105924u = false;
        } else {
            if (this.f105924u && this.f105925v == b && this.f105926w == b2) {
                this.f105924u = false;
                return true;
            }
            this.f105924u = true;
            this.f105925v = b;
            this.f105926w = b2;
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
            this.f105928y = false;
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
                                this.f105928y = false;
                                break;
                        }
                }
            }
            this.f105928y = true;
        }
    }

    private void resetCueBuilders() {
        this.f105918o.reset(this.f105921r);
        this.f105917n.clear();
        this.f105917n.add(this.f105918o);
    }

    private void setCaptionMode(int i) {
        int i2 = this.f105921r;
        if (i2 == i) {
            return;
        }
        this.f105921r = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.f105917n.size(); i3++) {
                this.f105917n.get(i3).setCaptionMode(i);
            }
            return;
        }
        resetCueBuilders();
        if (i2 == 3 || i == 1 || i == 0) {
            this.f105919p = Collections.emptyList();
        }
    }

    private void setCaptionRowCount(int i) {
        this.f105922s = i;
        this.f105918o.setCaptionRowCount(i);
    }

    private boolean shouldClearStuckCaptions() {
        return (this.f105916m == -9223372036854775807L || this.f105929z == -9223372036854775807L || m12599d() - this.f105929z < this.f105916m) ? false : true;
    }

    private boolean updateAndVerifyCurrentChannel(byte b) {
        if (isCtrlCode(b)) {
            this.f105927x = getChannel(b);
        }
        return this.f105927x == this.f105915l;
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: a */
    public xdg mo9344a() {
        List<o93> list = this.f105919p;
        this.f105920q = list;
        return new it1((List) u80.checkNotNull(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // p000.ht1
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo9345b(p000.ieg r10) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zs1.mo9345b(ieg):void");
    }

    @Override // p000.ht1, p000.il3
    @hib
    public /* bridge */ /* synthetic */ ieg dequeueInputBuffer() throws beg {
        return super.dequeueInputBuffer();
    }

    @Override // p000.ht1
    /* JADX INFO: renamed from: e */
    public boolean mo9346e() {
        return this.f105919p != this.f105920q;
    }

    @Override // p000.ht1, p000.il3
    public void flush() {
        super.flush();
        this.f105919p = null;
        this.f105920q = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.f105923t = false;
        this.f105924u = false;
        this.f105925v = (byte) 0;
        this.f105926w = (byte) 0;
        this.f105927x = 0;
        this.f105928y = true;
        this.f105929z = -9223372036854775807L;
    }

    @Override // p000.ht1, p000.il3
    public String getName() {
        return "Cea608Decoder";
    }

    @Override // p000.ht1
    public /* bridge */ /* synthetic */ void queueInputBuffer(ieg iegVar) throws beg {
        super.queueInputBuffer(iegVar);
    }

    @Override // p000.ht1, p000.il3
    public void release() {
    }

    @Override // p000.ht1, p000.zdg
    public /* bridge */ /* synthetic */ void setPositionUs(long j) {
        super.setPositionUs(j);
    }

    @Override // p000.ht1, p000.il3
    @hib
    public keg dequeueOutputBuffer() throws beg {
        keg kegVarM12598c;
        keg kegVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (kegVarDequeueOutputBuffer != null) {
            return kegVarDequeueOutputBuffer;
        }
        if (!shouldClearStuckCaptions() || (kegVarM12598c = m12598c()) == null) {
            return null;
        }
        this.f105919p = Collections.emptyList();
        this.f105929z = -9223372036854775807L;
        kegVarM12598c.setContent(m12599d(), mo9344a(), Long.MAX_VALUE);
        return kegVarM12598c;
    }
}

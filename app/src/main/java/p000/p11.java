package p000;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class p11 {

    /* JADX INFO: renamed from: d */
    public static final xqg f69356d;

    /* JADX INFO: renamed from: e */
    public static final char f69357e = 8234;

    /* JADX INFO: renamed from: f */
    public static final char f69358f = 8235;

    /* JADX INFO: renamed from: g */
    public static final char f69359g = 8236;

    /* JADX INFO: renamed from: h */
    public static final char f69360h = 8206;

    /* JADX INFO: renamed from: i */
    public static final char f69361i = 8207;

    /* JADX INFO: renamed from: j */
    public static final String f69362j;

    /* JADX INFO: renamed from: k */
    public static final String f69363k;

    /* JADX INFO: renamed from: l */
    public static final String f69364l = "";

    /* JADX INFO: renamed from: m */
    public static final int f69365m = 2;

    /* JADX INFO: renamed from: n */
    public static final int f69366n = 2;

    /* JADX INFO: renamed from: o */
    public static final p11 f69367o;

    /* JADX INFO: renamed from: p */
    public static final p11 f69368p;

    /* JADX INFO: renamed from: q */
    public static final int f69369q = -1;

    /* JADX INFO: renamed from: r */
    public static final int f69370r = 0;

    /* JADX INFO: renamed from: s */
    public static final int f69371s = 1;

    /* JADX INFO: renamed from: a */
    public final boolean f69372a;

    /* JADX INFO: renamed from: b */
    public final int f69373b;

    /* JADX INFO: renamed from: c */
    public final xqg f69374c;

    /* JADX INFO: renamed from: p11$b */
    public static class C10745b {

        /* JADX INFO: renamed from: f */
        public static final int f69378f = 1792;

        /* JADX INFO: renamed from: g */
        public static final byte[] f69379g = new byte[f69378f];

        /* JADX INFO: renamed from: a */
        public final CharSequence f69380a;

        /* JADX INFO: renamed from: b */
        public final boolean f69381b;

        /* JADX INFO: renamed from: c */
        public final int f69382c;

        /* JADX INFO: renamed from: d */
        public int f69383d;

        /* JADX INFO: renamed from: e */
        public char f69384e;

        static {
            for (int i = 0; i < 1792; i++) {
                f69379g[i] = Character.getDirectionality(i);
            }
        }

        public C10745b(CharSequence charSequence, boolean z) {
            this.f69380a = charSequence;
            this.f69381b = z;
            this.f69382c = charSequence.length();
        }

        private static byte getCachedDirectionality(char c) {
            return c < 1792 ? f69379g[c] : Character.getDirectionality(c);
        }

        private byte skipEntityBackward() {
            char cCharAt;
            int i = this.f69383d;
            do {
                int i2 = this.f69383d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f69380a;
                int i3 = i2 - 1;
                this.f69383d = i3;
                cCharAt = charSequence.charAt(i3);
                this.f69384e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f69383d = i;
            this.f69384e = ';';
            return (byte) 13;
        }

        private byte skipEntityForward() {
            char cCharAt;
            do {
                int i = this.f69383d;
                if (i >= this.f69382c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f69380a;
                this.f69383d = i + 1;
                cCharAt = charSequence.charAt(i);
                this.f69384e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte skipTagBackward() {
            char cCharAt;
            int i = this.f69383d;
            while (true) {
                int i2 = this.f69383d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f69380a;
                int i3 = i2 - 1;
                this.f69383d = i3;
                char cCharAt2 = charSequence.charAt(i3);
                this.f69384e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.f69383d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f69380a;
                            int i5 = i4 - 1;
                            this.f69383d = i5;
                            cCharAt = charSequence2.charAt(i5);
                            this.f69384e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f69383d = i;
            this.f69384e = '>';
            return (byte) 13;
        }

        private byte skipTagForward() {
            char cCharAt;
            int i = this.f69383d;
            while (true) {
                int i2 = this.f69383d;
                if (i2 >= this.f69382c) {
                    this.f69383d = i;
                    this.f69384e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f69380a;
                this.f69383d = i2 + 1;
                char cCharAt2 = charSequence.charAt(i2);
                this.f69384e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i3 = this.f69383d;
                        if (i3 < this.f69382c) {
                            CharSequence charSequence2 = this.f69380a;
                            this.f69383d = i3 + 1;
                            cCharAt = charSequence2.charAt(i3);
                            this.f69384e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public byte m19138a() {
            char cCharAt = this.f69380a.charAt(this.f69383d - 1);
            this.f69384e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f69380a, this.f69383d);
                this.f69383d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f69383d--;
            byte cachedDirectionality = getCachedDirectionality(this.f69384e);
            if (!this.f69381b) {
                return cachedDirectionality;
            }
            char c = this.f69384e;
            return c == '>' ? skipTagBackward() : c == ';' ? skipEntityBackward() : cachedDirectionality;
        }

        /* JADX INFO: renamed from: b */
        public byte m19139b() {
            char cCharAt = this.f69380a.charAt(this.f69383d);
            this.f69384e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f69380a, this.f69383d);
                this.f69383d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f69383d++;
            byte cachedDirectionality = getCachedDirectionality(this.f69384e);
            if (!this.f69381b) {
                return cachedDirectionality;
            }
            char c = this.f69384e;
            return c == '<' ? skipTagForward() : c == '&' ? skipEntityForward() : cachedDirectionality;
        }

        /* JADX INFO: renamed from: c */
        public int m19140c() {
            this.f69383d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f69383d < this.f69382c && i == 0) {
                byte bM19139b = m19139b();
                if (bM19139b != 0) {
                    if (bM19139b == 1 || bM19139b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (bM19139b != 9) {
                        switch (bM19139b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f69383d > 0) {
                switch (m19138a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* JADX INFO: renamed from: d */
        public int m19141d() {
            this.f69383d = this.f69382c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f69383d > 0) {
                    byte bM19138a = m19138a();
                    if (bM19138a == 0) {
                        if (i == 0) {
                            return -1;
                        }
                        if (i2 == 0) {
                            break;
                        }
                    } else if (bM19138a == 1 || bM19138a == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            break;
                        }
                    } else if (bM19138a != 9) {
                        switch (bM19138a) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        xqg xqgVar = yqg.f102669c;
        f69356d = xqgVar;
        f69362j = Character.toString(f69360h);
        f69363k = Character.toString(f69361i);
        f69367o = new p11(false, 2, xqgVar);
        f69368p = new p11(true, 2, xqgVar);
    }

    public p11(boolean z, int i, xqg xqgVar) {
        this.f69372a = z;
        this.f69373b = i;
        this.f69374c = xqgVar;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m19137a(Locale locale) {
        return nwg.getLayoutDirectionFromLocale(locale) == 1;
    }

    private static int getEntryDir(CharSequence charSequence) {
        return new C10745b(charSequence, false).m19140c();
    }

    private static int getExitDir(CharSequence charSequence) {
        return new C10745b(charSequence, false).m19141d();
    }

    public static p11 getInstance() {
        return new C10744a().build();
    }

    private String markAfter(CharSequence charSequence, xqg xqgVar) {
        boolean zIsRtl = xqgVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f69372a || !(zIsRtl || getExitDir(charSequence) == 1)) ? this.f69372a ? (!zIsRtl || getExitDir(charSequence) == -1) ? f69363k : "" : "" : f69362j;
    }

    private String markBefore(CharSequence charSequence, xqg xqgVar) {
        boolean zIsRtl = xqgVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f69372a || !(zIsRtl || getEntryDir(charSequence) == 1)) ? this.f69372a ? (!zIsRtl || getEntryDir(charSequence) == -1) ? f69363k : "" : "" : f69362j;
    }

    public boolean getStereoReset() {
        return (this.f69373b & 2) != 0;
    }

    public boolean isRtl(String str) {
        return isRtl((CharSequence) str);
    }

    public boolean isRtlContext() {
        return this.f69372a;
    }

    public String unicodeWrap(String str, xqg xqgVar, boolean z) {
        if (str == null) {
            return null;
        }
        return unicodeWrap((CharSequence) str, xqgVar, z).toString();
    }

    /* JADX INFO: renamed from: p11$a */
    public static final class C10744a {

        /* JADX INFO: renamed from: a */
        public boolean f69375a;

        /* JADX INFO: renamed from: b */
        public int f69376b;

        /* JADX INFO: renamed from: c */
        public xqg f69377c;

        public C10744a() {
            initialize(p11.m19137a(Locale.getDefault()));
        }

        private static p11 getDefaultInstanceFromContext(boolean z) {
            return z ? p11.f69368p : p11.f69367o;
        }

        private void initialize(boolean z) {
            this.f69375a = z;
            this.f69377c = p11.f69356d;
            this.f69376b = 2;
        }

        public p11 build() {
            return (this.f69376b == 2 && this.f69377c == p11.f69356d) ? getDefaultInstanceFromContext(this.f69375a) : new p11(this.f69375a, this.f69376b, this.f69377c);
        }

        public C10744a setTextDirectionHeuristic(xqg xqgVar) {
            this.f69377c = xqgVar;
            return this;
        }

        public C10744a stereoReset(boolean z) {
            if (z) {
                this.f69376b |= 2;
            } else {
                this.f69376b &= -3;
            }
            return this;
        }

        public C10744a(boolean z) {
            initialize(z);
        }

        public C10744a(Locale locale) {
            initialize(p11.m19137a(locale));
        }
    }

    public static p11 getInstance(boolean z) {
        return new C10744a(z).build();
    }

    public boolean isRtl(CharSequence charSequence) {
        return this.f69374c.isRtl(charSequence, 0, charSequence.length());
    }

    public CharSequence unicodeWrap(CharSequence charSequence, xqg xqgVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = xqgVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (getStereoReset() && z) {
            spannableStringBuilder.append((CharSequence) markBefore(charSequence, zIsRtl ? yqg.f102668b : yqg.f102667a));
        }
        if (zIsRtl != this.f69372a) {
            spannableStringBuilder.append(zIsRtl ? f69358f : f69357e);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f69359g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) markAfter(charSequence, zIsRtl ? yqg.f102668b : yqg.f102667a));
        }
        return spannableStringBuilder;
    }

    public static p11 getInstance(Locale locale) {
        return new C10744a(locale).build();
    }

    public String unicodeWrap(String str, xqg xqgVar) {
        return unicodeWrap(str, xqgVar, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, xqg xqgVar) {
        return unicodeWrap(charSequence, xqgVar, true);
    }

    public String unicodeWrap(String str, boolean z) {
        return unicodeWrap(str, this.f69374c, z);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, boolean z) {
        return unicodeWrap(charSequence, this.f69374c, z);
    }

    public String unicodeWrap(String str) {
        return unicodeWrap(str, this.f69374c, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence) {
        return unicodeWrap(charSequence, this.f69374c, true);
    }
}

package p000;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzf {

    /* JADX INFO: renamed from: k */
    public static final String f106582k = "SsaStyle";

    /* JADX INFO: renamed from: l */
    public static final int f106583l = -1;

    /* JADX INFO: renamed from: m */
    public static final int f106584m = 1;

    /* JADX INFO: renamed from: n */
    public static final int f106585n = 2;

    /* JADX INFO: renamed from: o */
    public static final int f106586o = 3;

    /* JADX INFO: renamed from: p */
    public static final int f106587p = 4;

    /* JADX INFO: renamed from: q */
    public static final int f106588q = 5;

    /* JADX INFO: renamed from: r */
    public static final int f106589r = 6;

    /* JADX INFO: renamed from: s */
    public static final int f106590s = 7;

    /* JADX INFO: renamed from: t */
    public static final int f106591t = 8;

    /* JADX INFO: renamed from: u */
    public static final int f106592u = 9;

    /* JADX INFO: renamed from: v */
    public static final int f106593v = -1;

    /* JADX INFO: renamed from: w */
    public static final int f106594w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f106595x = 3;

    /* JADX INFO: renamed from: a */
    public final String f106596a;

    /* JADX INFO: renamed from: b */
    public final int f106597b;

    /* JADX INFO: renamed from: c */
    @g92
    @hib
    public final Integer f106598c;

    /* JADX INFO: renamed from: d */
    @g92
    @hib
    public final Integer f106599d;

    /* JADX INFO: renamed from: e */
    public final float f106600e;

    /* JADX INFO: renamed from: f */
    public final boolean f106601f;

    /* JADX INFO: renamed from: g */
    public final boolean f106602g;

    /* JADX INFO: renamed from: h */
    public final boolean f106603h;

    /* JADX INFO: renamed from: i */
    public final boolean f106604i;

    /* JADX INFO: renamed from: j */
    public final int f106605j;

    /* JADX INFO: renamed from: zzf$a */
    public static final class C16328a {

        /* JADX INFO: renamed from: a */
        public final int f106606a;

        /* JADX INFO: renamed from: b */
        public final int f106607b;

        /* JADX INFO: renamed from: c */
        public final int f106608c;

        /* JADX INFO: renamed from: d */
        public final int f106609d;

        /* JADX INFO: renamed from: e */
        public final int f106610e;

        /* JADX INFO: renamed from: f */
        public final int f106611f;

        /* JADX INFO: renamed from: g */
        public final int f106612g;

        /* JADX INFO: renamed from: h */
        public final int f106613h;

        /* JADX INFO: renamed from: i */
        public final int f106614i;

        /* JADX INFO: renamed from: j */
        public final int f106615j;

        /* JADX INFO: renamed from: k */
        public final int f106616k;

        private C16328a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f106606a = i;
            this.f106607b = i2;
            this.f106608c = i3;
            this.f106609d = i4;
            this.f106610e = i5;
            this.f106611f = i6;
            this.f106612g = i7;
            this.f106613h = i8;
            this.f106614i = i9;
            this.f106615j = i10;
            this.f106616k = i11;
        }

        @hib
        public static C16328a fromFormatLine(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                String lowerCase = i80.toLowerCase(strArrSplit[i11].trim());
                lowerCase.hashCode();
                switch (lowerCase) {
                    case "italic":
                        i7 = i11;
                        break;
                    case "underline":
                        i8 = i11;
                        break;
                    case "strikeout":
                        i9 = i11;
                        break;
                    case "primarycolour":
                        i3 = i11;
                        break;
                    case "bold":
                        i6 = i11;
                        break;
                    case "name":
                        i = i11;
                        break;
                    case "fontsize":
                        i5 = i11;
                        break;
                    case "borderstyle":
                        i10 = i11;
                        break;
                    case "alignment":
                        i2 = i11;
                        break;
                    case "outlinecolour":
                        i4 = i11;
                        break;
                }
            }
            if (i != -1) {
                return new C16328a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, strArrSplit.length);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: zzf$b */
    public static final class C16329b {

        /* JADX INFO: renamed from: c */
        public static final String f106617c = "SsaStyle.Overrides";

        /* JADX INFO: renamed from: e */
        public static final String f106619e = "\\s*\\d+(?:\\.\\d+)?\\s*";

        /* JADX INFO: renamed from: a */
        public final int f106623a;

        /* JADX INFO: renamed from: b */
        @hib
        public final PointF f106624b;

        /* JADX INFO: renamed from: d */
        public static final Pattern f106618d = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: f */
        public static final Pattern f106620f = Pattern.compile(t0i.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: g */
        public static final Pattern f106621g = Pattern.compile(t0i.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: h */
        public static final Pattern f106622h = Pattern.compile("\\\\an(\\d+)");

        private C16329b(int i, @hib PointF pointF) {
            this.f106623a = i;
            this.f106624b = pointF;
        }

        private static int parseAlignmentOverride(String str) {
            Matcher matcher = f106622h.matcher(str);
            if (matcher.find()) {
                return zzf.parseAlignment((String) v80.checkNotNull(matcher.group(1)));
            }
            return -1;
        }

        public static C16329b parseFromDialogue(String str) {
            Matcher matcher = f106618d.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) v80.checkNotNull(matcher.group(1));
                try {
                    PointF position = parsePosition(str2);
                    if (position != null) {
                        pointF = position;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int alignmentOverride = parseAlignmentOverride(str2);
                    if (alignmentOverride != -1) {
                        i = alignmentOverride;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new C16329b(i, pointF);
        }

        @hib
        private static PointF parsePosition(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f106620f.matcher(str);
            Matcher matcher2 = f106621g.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    xh9.m25146i("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) v80.checkNotNull(strGroup)).trim()), Float.parseFloat(((String) v80.checkNotNull(strGroup2)).trim()));
        }

        public static String stripStyleOverrides(String str) {
            return f106618d.matcher(str).replaceAll("");
        }
    }

    /* JADX INFO: renamed from: zzf$c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC16330c {
    }

    /* JADX INFO: renamed from: zzf$d */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC16331d {
    }

    private zzf(String str, int i, @g92 @hib Integer num, @g92 @hib Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f106596a = str;
        this.f106597b = i;
        this.f106598c = num;
        this.f106599d = num2;
        this.f106600e = f;
        this.f106601f = z;
        this.f106602g = z2;
        this.f106603h = z3;
        this.f106604i = z4;
        this.f106605j = i2;
    }

    @hib
    public static zzf fromStyleLine(String str, C16328a c16328a) {
        v80.checkArgument(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i = c16328a.f106616k;
        if (length != i) {
            xh9.m25148w("SsaStyle", t0i.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[c16328a.f106606a].trim();
            int i2 = c16328a.f106607b;
            int alignment = i2 != -1 ? parseAlignment(strArrSplit[i2].trim()) : -1;
            int i3 = c16328a.f106608c;
            Integer color = i3 != -1 ? parseColor(strArrSplit[i3].trim()) : null;
            int i4 = c16328a.f106609d;
            Integer color2 = i4 != -1 ? parseColor(strArrSplit[i4].trim()) : null;
            int i5 = c16328a.f106610e;
            float fontSize = i5 != -1 ? parseFontSize(strArrSplit[i5].trim()) : -3.4028235E38f;
            int i6 = c16328a.f106611f;
            boolean z = i6 != -1 && parseBooleanValue(strArrSplit[i6].trim());
            int i7 = c16328a.f106612g;
            boolean z2 = i7 != -1 && parseBooleanValue(strArrSplit[i7].trim());
            int i8 = c16328a.f106613h;
            boolean z3 = i8 != -1 && parseBooleanValue(strArrSplit[i8].trim());
            int i9 = c16328a.f106614i;
            boolean z4 = i9 != -1 && parseBooleanValue(strArrSplit[i9].trim());
            int i10 = c16328a.f106615j;
            return new zzf(strTrim, alignment, color, color2, fontSize, z, z2, z3, z4, i10 != -1 ? parseBorderStyle(strArrSplit[i10].trim()) : -1);
        } catch (RuntimeException e) {
            xh9.m25149w("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    private static boolean isValidAlignment(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean isValidBorderStyle(int i) {
        return i == 1 || i == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int parseAlignment(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (isValidAlignment(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        xh9.m25148w("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean parseBooleanValue(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            xh9.m25149w("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    private static int parseBorderStyle(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (isValidBorderStyle(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        xh9.m25148w("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    @g92
    @hib
    public static Integer parseColor(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            v80.checkArgument(j <= 4294967295L);
            return Integer.valueOf(Color.argb(rd8.checkedCast(((j >> 24) & 255) ^ 255), rd8.checkedCast(j & 255), rd8.checkedCast((j >> 8) & 255), rd8.checkedCast((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            xh9.m25149w("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    private static float parseFontSize(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            xh9.m25149w("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }
}

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

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a0g {

    /* JADX INFO: renamed from: k */
    public static final String f43k = "SsaStyle";

    /* JADX INFO: renamed from: l */
    public static final int f44l = -1;

    /* JADX INFO: renamed from: m */
    public static final int f45m = 1;

    /* JADX INFO: renamed from: n */
    public static final int f46n = 2;

    /* JADX INFO: renamed from: o */
    public static final int f47o = 3;

    /* JADX INFO: renamed from: p */
    public static final int f48p = 4;

    /* JADX INFO: renamed from: q */
    public static final int f49q = 5;

    /* JADX INFO: renamed from: r */
    public static final int f50r = 6;

    /* JADX INFO: renamed from: s */
    public static final int f51s = 7;

    /* JADX INFO: renamed from: t */
    public static final int f52t = 8;

    /* JADX INFO: renamed from: u */
    public static final int f53u = 9;

    /* JADX INFO: renamed from: v */
    public static final int f54v = -1;

    /* JADX INFO: renamed from: w */
    public static final int f55w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f56x = 3;

    /* JADX INFO: renamed from: a */
    public final String f57a;

    /* JADX INFO: renamed from: b */
    public final int f58b;

    /* JADX INFO: renamed from: c */
    @g92
    @hib
    public final Integer f59c;

    /* JADX INFO: renamed from: d */
    @g92
    @hib
    public final Integer f60d;

    /* JADX INFO: renamed from: e */
    public final float f61e;

    /* JADX INFO: renamed from: f */
    public final boolean f62f;

    /* JADX INFO: renamed from: g */
    public final boolean f63g;

    /* JADX INFO: renamed from: h */
    public final boolean f64h;

    /* JADX INFO: renamed from: i */
    public final boolean f65i;

    /* JADX INFO: renamed from: j */
    public final int f66j;

    /* JADX INFO: renamed from: a0g$a */
    public static final class C0003a {

        /* JADX INFO: renamed from: a */
        public final int f67a;

        /* JADX INFO: renamed from: b */
        public final int f68b;

        /* JADX INFO: renamed from: c */
        public final int f69c;

        /* JADX INFO: renamed from: d */
        public final int f70d;

        /* JADX INFO: renamed from: e */
        public final int f71e;

        /* JADX INFO: renamed from: f */
        public final int f72f;

        /* JADX INFO: renamed from: g */
        public final int f73g;

        /* JADX INFO: renamed from: h */
        public final int f74h;

        /* JADX INFO: renamed from: i */
        public final int f75i;

        /* JADX INFO: renamed from: j */
        public final int f76j;

        /* JADX INFO: renamed from: k */
        public final int f77k;

        private C0003a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f67a = i;
            this.f68b = i2;
            this.f69c = i3;
            this.f70d = i4;
            this.f71e = i5;
            this.f72f = i6;
            this.f73g = i7;
            this.f74h = i8;
            this.f75i = i9;
            this.f76j = i10;
            this.f77k = i11;
        }

        @hib
        public static C0003a fromFormatLine(String str) {
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
                return new C0003a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, strArrSplit.length);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a0g$b */
    public static final class C0004b {

        /* JADX INFO: renamed from: c */
        public static final String f78c = "SsaStyle.Overrides";

        /* JADX INFO: renamed from: e */
        public static final String f80e = "\\s*\\d+(?:\\.\\d+)?\\s*";

        /* JADX INFO: renamed from: a */
        public final int f84a;

        /* JADX INFO: renamed from: b */
        @hib
        public final PointF f85b;

        /* JADX INFO: renamed from: d */
        public static final Pattern f79d = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: f */
        public static final Pattern f81f = Pattern.compile(x0i.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: g */
        public static final Pattern f82g = Pattern.compile(x0i.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: h */
        public static final Pattern f83h = Pattern.compile("\\\\an(\\d+)");

        private C0004b(int i, @hib PointF pointF) {
            this.f84a = i;
            this.f85b = pointF;
        }

        private static int parseAlignmentOverride(String str) {
            Matcher matcher = f83h.matcher(str);
            if (matcher.find()) {
                return a0g.parseAlignment((String) u80.checkNotNull(matcher.group(1)));
            }
            return -1;
        }

        public static C0004b parseFromDialogue(String str) {
            Matcher matcher = f79d.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) u80.checkNotNull(matcher.group(1));
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
            return new C0004b(i, pointF);
        }

        @hib
        private static PointF parsePosition(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f81f.matcher(str);
            Matcher matcher2 = f82g.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    yh9.m25917i("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
            return new PointF(Float.parseFloat(((String) u80.checkNotNull(strGroup)).trim()), Float.parseFloat(((String) u80.checkNotNull(strGroup2)).trim()));
        }

        public static String stripStyleOverrides(String str) {
            return f79d.matcher(str).replaceAll("");
        }
    }

    /* JADX INFO: renamed from: a0g$c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0005c {
    }

    /* JADX INFO: renamed from: a0g$d */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0006d {
    }

    private a0g(String str, int i, @g92 @hib Integer num, @g92 @hib Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f57a = str;
        this.f58b = i;
        this.f59c = num;
        this.f60d = num2;
        this.f61e = f;
        this.f62f = z;
        this.f63g = z2;
        this.f64h = z3;
        this.f65i = z4;
        this.f66j = i2;
    }

    @hib
    public static a0g fromStyleLine(String str, C0003a c0003a) {
        u80.checkArgument(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i = c0003a.f77k;
        if (length != i) {
            yh9.m25919w("SsaStyle", x0i.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[c0003a.f67a].trim();
            int i2 = c0003a.f68b;
            int alignment = i2 != -1 ? parseAlignment(strArrSplit[i2].trim()) : -1;
            int i3 = c0003a.f69c;
            Integer color = i3 != -1 ? parseColor(strArrSplit[i3].trim()) : null;
            int i4 = c0003a.f70d;
            Integer color2 = i4 != -1 ? parseColor(strArrSplit[i4].trim()) : null;
            int i5 = c0003a.f71e;
            float fontSize = i5 != -1 ? parseFontSize(strArrSplit[i5].trim()) : -3.4028235E38f;
            int i6 = c0003a.f72f;
            boolean z = i6 != -1 && parseBooleanValue(strArrSplit[i6].trim());
            int i7 = c0003a.f73g;
            boolean z2 = i7 != -1 && parseBooleanValue(strArrSplit[i7].trim());
            int i8 = c0003a.f74h;
            boolean z3 = i8 != -1 && parseBooleanValue(strArrSplit[i8].trim());
            int i9 = c0003a.f75i;
            boolean z4 = i9 != -1 && parseBooleanValue(strArrSplit[i9].trim());
            int i10 = c0003a.f76j;
            return new a0g(strTrim, alignment, color, color2, fontSize, z, z2, z3, z4, i10 != -1 ? parseBorderStyle(strArrSplit[i10].trim()) : -1);
        } catch (RuntimeException e) {
            yh9.m25920w("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
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
        yh9.m25919w("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean parseBooleanValue(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            yh9.m25920w("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
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
        yh9.m25919w("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    @g92
    @hib
    public static Integer parseColor(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            u80.checkArgument(j <= 4294967295L);
            return Integer.valueOf(Color.argb(rd8.checkedCast(((j >> 24) & 255) ^ 255), rd8.checkedCast(j & 255), rd8.checkedCast((j >> 8) & 255), rd8.checkedCast((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            yh9.m25920w("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    private static float parseFontSize(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            yh9.m25920w("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }
}

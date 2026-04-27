package p000;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import p000.ju9;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 1)
public final class sae {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final sae f81060a = new sae();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f81061b = "RomUtils--->";

    /* JADX INFO: renamed from: c */
    public static final int f81062c = 0;

    private sae() {
    }

    @do8
    public static final double getEmuiVersion() throws Throwable {
        try {
            String systemProperty = getSystemProperty("ro.build.version.emui");
            md8.checkNotNull(systemProperty);
            String strSubstring = systemProperty.substring(m9g.indexOf$default((CharSequence) systemProperty, p43.f69617m, 0, false, 6, (Object) null) + 1);
            md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return Double.parseDouble(strSubstring);
        } catch (Exception e) {
            e.printStackTrace();
            return 4.0d;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0044: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:11:0x0044 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @p000.do8
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String getSystemProperty(@p000.yfb java.lang.String r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "RomUtils--->"
            java.lang.String r2 = "propName"
            p000.md8.checkNotNullParameter(r7, r2)
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r4.<init>()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.lang.String r5 = "getprop "
            r4.append(r5)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r4.append(r7)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.lang.Process r3 = r3.exec(r4)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r3 = 1024(0x400, float:1.435E-42)
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            r4.close()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            r4.close()     // Catch: java.io.IOException -> L3e
            goto L42
        L3e:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
        L42:
            return r3
        L43:
            r7 = move-exception
            r2 = r4
            goto L6b
        L46:
            r3 = move-exception
            goto L4c
        L48:
            r7 = move-exception
            goto L6b
        L4a:
            r3 = move-exception
            r4 = r2
        L4c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r5.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = "Unable to read sysprop "
            r5.append(r6)     // Catch: java.lang.Throwable -> L43
            r5.append(r7)     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L43
            android.util.Log.e(r1, r7, r3)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L6a
            r4.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
        L6a:
            return r2
        L6b:
            if (r2 == 0) goto L75
            r2.close()     // Catch: java.io.IOException -> L71
            goto L75
        L71:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L75:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sae.getSystemProperty(java.lang.String):java.lang.String");
    }

    public final boolean checkIs360Rom() {
        String str = Build.MANUFACTURER;
        md8.checkNotNullExpressionValue(str, "MANUFACTURER");
        if (!m9g.contains$default((CharSequence) str, (CharSequence) "QiKU", false, 2, (Object) null)) {
            md8.checkNotNullExpressionValue(str, "MANUFACTURER");
            if (!m9g.contains$default((CharSequence) str, (CharSequence) "360", false, 2, (Object) null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean checkIsHuaweiRom() {
        String str = Build.MANUFACTURER;
        md8.checkNotNullExpressionValue(str, "MANUFACTURER");
        return m9g.contains$default((CharSequence) str, (CharSequence) ju9.C8096a.f51939a, false, 2, (Object) null);
    }

    public final boolean checkIsMeizuRom() throws Throwable {
        String systemProperty = getSystemProperty("ro.build.display.id");
        if (TextUtils.isEmpty(systemProperty)) {
            return false;
        }
        md8.checkNotNull(systemProperty);
        if (!m9g.contains$default((CharSequence) systemProperty, (CharSequence) "flyme", false, 2, (Object) null)) {
            String lowerCase = systemProperty.toLowerCase(Locale.ROOT);
            md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!m9g.contains$default((CharSequence) lowerCase, (CharSequence) "flyme", false, 2, (Object) null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean checkIsMiuiRom() {
        return !TextUtils.isEmpty(getSystemProperty(zsc.f105987l));
    }

    public final boolean checkIsOppoRom() {
        String str = Build.MANUFACTURER;
        md8.checkNotNullExpressionValue(str, "MANUFACTURER");
        if (!m9g.contains$default((CharSequence) str, (CharSequence) ju9.C8096a.f51941c, false, 2, (Object) null)) {
            md8.checkNotNullExpressionValue(str, "MANUFACTURER");
            if (!m9g.contains$default((CharSequence) str, (CharSequence) "oppo", false, 2, (Object) null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean checkIsVivoRom() {
        String str = Build.MANUFACTURER;
        md8.checkNotNullExpressionValue(str, "MANUFACTURER");
        if (!m9g.contains$default((CharSequence) str, (CharSequence) ju9.C8096a.f51942d, false, 2, (Object) null)) {
            md8.checkNotNullExpressionValue(str, "MANUFACTURER");
            if (!m9g.contains$default((CharSequence) str, (CharSequence) "vivo", false, 2, (Object) null)) {
                return false;
            }
        }
        return true;
    }
}

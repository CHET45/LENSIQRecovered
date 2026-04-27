package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
@igg({"InlinedApi"})
public final class coc {

    /* JADX INFO: renamed from: a */
    public static final String f17250a = "CALENDAR";

    /* JADX INFO: renamed from: b */
    public static final String f17251b = "CAMERA";

    /* JADX INFO: renamed from: c */
    public static final String f17252c = "CONTACTS";

    /* JADX INFO: renamed from: d */
    public static final String f17253d = "LOCATION";

    /* JADX INFO: renamed from: e */
    public static final String f17254e = "MICROPHONE";

    /* JADX INFO: renamed from: f */
    public static final String f17255f = "PHONE";

    /* JADX INFO: renamed from: g */
    public static final String f17256g = "SENSORS";

    /* JADX INFO: renamed from: h */
    public static final String f17257h = "SMS";

    /* JADX INFO: renamed from: i */
    public static final String f17258i = "STORAGE";

    /* JADX INFO: renamed from: j */
    public static final String f17259j = "ACTIVITY_RECOGNITION";

    /* JADX INFO: renamed from: k */
    public static final String[] f17260k = {xnc.f98588M, xnc.f98589N};

    /* JADX INFO: renamed from: l */
    public static final String[] f17261l = {xnc.f98581F};

    /* JADX INFO: renamed from: m */
    public static final String[] f17262m = {xnc.f98585J, xnc.f98586K, xnc.f98587L};

    /* JADX INFO: renamed from: n */
    public static final String[] f17263n = {xnc.f98583H, xnc.f98584I, "android.permission.ACCESS_BACKGROUND_LOCATION"};

    /* JADX INFO: renamed from: o */
    public static final String[] f17264o = {xnc.f98582G};

    /* JADX INFO: renamed from: p */
    public static final String[] f17265p = {xnc.f98590O, xnc.f98577B, xnc.f98591P, xnc.f98592Q, xnc.f98593R, xnc.f98594S, xnc.f98595T, xnc.f98596U, xnc.f98578C};

    /* JADX INFO: renamed from: q */
    public static final String[] f17266q = {xnc.f98590O, xnc.f98577B, xnc.f98591P, xnc.f98592Q, xnc.f98593R, xnc.f98594S, xnc.f98595T, xnc.f98596U};

    /* JADX INFO: renamed from: r */
    public static final String[] f17267r = {xnc.f98597V};

    /* JADX INFO: renamed from: s */
    public static final String[] f17268s = {xnc.f98598W, xnc.f98599X, xnc.f98600Y, xnc.f98601Z, xnc.f98603a0};

    /* JADX INFO: renamed from: t */
    public static final String[] f17269t = {xnc.f98579D, xnc.f98580E};

    /* JADX INFO: renamed from: u */
    public static final String[] f17270u = {xnc.f98628y};

    /* JADX INFO: renamed from: coc$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC2414a {
    }

    public static String[] getPermissions(String str) {
        if (str == null) {
            return new String[0];
        }
        switch (str) {
            case "LOCATION":
                return f17263n;
            case "SENSORS":
                return f17267r;
            case "STORAGE":
                return f17269t;
            case "SMS":
                return f17268s;
            case "PHONE":
                return f17265p;
            case "ACTIVITY_RECOGNITION":
                return f17270u;
            case "CONTACTS":
                return f17262m;
            case "CALENDAR":
                return f17260k;
            case "MICROPHONE":
                return f17264o;
            case "CAMERA":
                return f17261l;
            default:
                return new String[]{str};
        }
    }
}

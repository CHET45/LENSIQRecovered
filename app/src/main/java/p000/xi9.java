package p000;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class xi9 {

    /* JADX INFO: renamed from: a */
    public static boolean f98076a = true;

    /* JADX INFO: renamed from: b */
    public static final String f98077b = "A.I.Kit";

    /* JADX INFO: renamed from: c */
    public static final String f98078c = System.getProperty("line.separator");

    /* JADX INFO: renamed from: d */
    public static final int f98079d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f98080e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f98081f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f98082g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f98083h = 4;

    /* JADX INFO: renamed from: i */
    public static final int f98084i = 5;

    /* JADX INFO: renamed from: j */
    public static final int f98085j = 6;

    /* JADX INFO: renamed from: k */
    public static final int f98086k = 7;

    /* JADX INFO: renamed from: a */
    public static void m25205a() {
        printLog(6, null, f98077b);
    }

    /* JADX INFO: renamed from: d */
    public static void m25208d() {
        printLog(2, null, f98077b);
    }

    /* JADX INFO: renamed from: e */
    public static void m25211e() {
        printLog(5, null, f98077b);
    }

    /* JADX INFO: renamed from: i */
    public static void m25214i() {
        printLog(3, null, f98077b);
    }

    public static void init(boolean z) {
        f98076a = z;
    }

    public static void json(String str) {
        printLog(7, null, str);
    }

    private static void printLine(String str, boolean z) {
        sui.m22261e(str, z ? "╔═══════════════════════════════════════════════════════════════════════════════════════" : "╚═══════════════════════════════════════════════════════════════════════════════════════");
    }

    private static void printLog(int i, String str, Object obj) {
        if (f98076a) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String fileName = stackTrace[4].getFileName();
            String methodName = stackTrace[4].getMethodName();
            int lineNumber = stackTrace[4].getLineNumber();
            if (str == null) {
                str = fileName;
            }
            String str2 = methodName.substring(0, 1).toUpperCase() + methodName.substring(1);
            StringBuilder sb = new StringBuilder();
            sb.append("[ (");
            sb.append(fileName);
            sb.append(g1i.f38277c);
            sb.append(lineNumber);
            sb.append(")#");
            sb.append(str2);
            sb.append(" ] ");
            String string = obj == null ? "Log with null Object" : obj.toString();
            if (string != null && i != 7) {
                sb.append(string);
            }
            String string2 = sb.toString();
            switch (i) {
                case 1:
                    sui.m22260d(str, string2);
                    break;
                case 2:
                    sui.m22256a(str, string2);
                    break;
                case 3:
                    sui.m22259c(str, string2);
                    break;
                case 4:
                    sui.m22261e(str, string2);
                    break;
                case 5:
                    sui.m22258b(str, string2);
                    break;
                case 6:
                    sui.m22262f(str, string2);
                    break;
                case 7:
                    if (TextUtils.isEmpty(string)) {
                        sui.m22256a(str, "Empty or Null json content");
                    } else {
                        try {
                            String string3 = string.startsWith("{") ? new JSONObject(string).toString(4) : string.startsWith("[") ? new JSONArray(string).toString(4) : null;
                            printLine(str, true);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(string2);
                            String str3 = f98078c;
                            sb2.append(str3);
                            sb2.append(string3);
                            String[] strArrSplit = sb2.toString().split(str3);
                            StringBuilder sb3 = new StringBuilder();
                            for (String str4 : strArrSplit) {
                                sb3.append("║ ");
                                sb3.append(str4);
                                sb3.append(f98078c);
                            }
                            if (sb3.toString().length() > 3200) {
                                sui.m22261e(str, "jsonContent.length = " + sb3.toString().length());
                                int length = sb3.toString().length() / 3200;
                                int i2 = 0;
                                while (i2 <= length) {
                                    int i3 = i2 + 1;
                                    int i4 = i3 * 3200;
                                    sui.m22261e(str, i4 >= sb3.toString().length() ? sb3.toString().substring(i2 * 3200) : sb3.toString().substring(i2 * 3200, i4));
                                    i2 = i3;
                                }
                            } else {
                                sui.m22261e(str, sb3.toString());
                            }
                            printLine(str, false);
                        } catch (JSONException e) {
                            m25213e(str, e.getCause().getMessage() + "\n" + string);
                            return;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m25217v() {
        printLog(1, null, f98077b);
    }

    /* JADX INFO: renamed from: w */
    public static void m25220w() {
        printLog(4, null, f98077b);
    }

    /* JADX INFO: renamed from: a */
    public static void m25206a(Object obj) {
        printLog(6, null, obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m25209d(Object obj) {
        printLog(2, null, obj);
    }

    /* JADX INFO: renamed from: e */
    public static void m25212e(Object obj) {
        printLog(5, null, obj);
    }

    /* JADX INFO: renamed from: i */
    public static void m25215i(Object obj) {
        printLog(3, null, obj);
    }

    public static void json(String str, String str2) {
        printLog(7, str, str2);
    }

    /* JADX INFO: renamed from: v */
    public static void m25218v(Object obj) {
        printLog(1, null, obj);
    }

    /* JADX INFO: renamed from: w */
    public static void m25221w(Object obj) {
        printLog(4, null, obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m25207a(String str, Object obj) {
        printLog(6, str, obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m25210d(String str, Object obj) {
        printLog(2, str, obj);
    }

    /* JADX INFO: renamed from: e */
    public static void m25213e(String str, Object obj) {
        printLog(5, str, obj);
    }

    /* JADX INFO: renamed from: i */
    public static void m25216i(String str, Object obj) {
        printLog(3, str, obj);
    }

    /* JADX INFO: renamed from: v */
    public static void m25219v(String str, String str2) {
        printLog(1, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m25222w(String str, Object obj) {
        printLog(4, str, obj);
    }
}

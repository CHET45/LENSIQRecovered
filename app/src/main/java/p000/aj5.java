package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class aj5 {

    /* JADX INFO: renamed from: c */
    public static String f1737c = "";

    /* JADX INFO: renamed from: a */
    public Map<String, String> f1738a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public String f1739b;

    private aj5() {
    }

    public static aj5 parseExtensionRequest(String str) {
        aj5 aj5Var = new aj5();
        String[] strArrSplit = str.split(";");
        aj5Var.f1739b = strArrSplit[0].trim();
        for (int i = 1; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].split("=");
            String strTrim = f1737c;
            if (strArrSplit2.length > 1) {
                strTrim = strArrSplit2[1].trim();
                if ((strTrim.startsWith("\"") && strTrim.endsWith("\"")) || (strTrim.startsWith("'") && strTrim.endsWith("'") && strTrim.length() > 2)) {
                    strTrim = strTrim.substring(1, strTrim.length() - 1);
                }
            }
            aj5Var.f1738a.put(strArrSplit2[0].trim(), strTrim);
        }
        return aj5Var;
    }

    public String getExtensionName() {
        return this.f1739b;
    }

    public Map<String, String> getExtensionParameters() {
        return this.f1738a;
    }
}

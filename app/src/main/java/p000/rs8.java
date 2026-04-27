package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class rs8 {

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f79194a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final int f79195b;

    /* JADX INFO: renamed from: c */
    public final int f79196c;

    public rs8(int i, int i2) {
        this.f79195b = i;
        this.f79196c = i2;
    }

    private String sanitizeKey(String str) {
        if (str != null) {
            return sanitizeString(str, this.f79196c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String sanitizeString(String str, int i) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i ? strTrim.substring(0, i) : strTrim;
    }

    @efb
    public synchronized Map<String, String> getKeys() {
        return Collections.unmodifiableMap(new HashMap(this.f79194a));
    }

    public synchronized boolean setKey(String str, String str2) {
        String strSanitizeKey = sanitizeKey(str);
        if (this.f79194a.size() >= this.f79195b && !this.f79194a.containsKey(strSanitizeKey)) {
            ej9.getLogger().m10069w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f79195b);
            return false;
        }
        String strSanitizeString = sanitizeString(str2, this.f79196c);
        if (lc2.nullSafeEquals(this.f79194a.get(strSanitizeKey), strSanitizeString)) {
            return false;
        }
        Map<String, String> map = this.f79194a;
        if (str2 == null) {
            strSanitizeString = "";
        }
        map.put(strSanitizeKey, strSanitizeString);
        return true;
    }

    public synchronized void setKeys(Map<String, String> map) {
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String strSanitizeKey = sanitizeKey(entry.getKey());
                if (this.f79194a.size() < this.f79195b || this.f79194a.containsKey(strSanitizeKey)) {
                    String value = entry.getValue();
                    this.f79194a.put(strSanitizeKey, value == null ? "" : sanitizeString(value, this.f79196c));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                ej9.getLogger().m10069w("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f79195b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

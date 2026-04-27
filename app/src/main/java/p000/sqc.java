package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes7.dex */
public class sqc implements zz2 {

    /* JADX INFO: renamed from: c */
    public static final String f82626c = "PersistentCookieStore";

    /* JADX INFO: renamed from: d */
    public static final String f82627d = "CookiePrefsFile";

    /* JADX INFO: renamed from: e */
    public static final String f82628e = "cookie_";

    /* JADX INFO: renamed from: a */
    public final HashMap<String, ConcurrentHashMap<String, Cookie>> f82629a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f82630b;

    public sqc(Context context) {
        Cookie cookieM22192c;
        SharedPreferences sharedPreferences = context.getSharedPreferences(f82627d, 0);
        this.f82630b = sharedPreferences;
        this.f82629a = new HashMap<>();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if (((String) entry.getValue()) != null && !((String) entry.getValue()).startsWith(f82628e)) {
                for (String str : TextUtils.split((String) entry.getValue(), ",")) {
                    String string = this.f82630b.getString(f82628e + str, null);
                    if (string != null && (cookieM22192c = m22192c(string)) != null) {
                        if (!this.f82629a.containsKey(entry.getKey())) {
                            this.f82629a.put(entry.getKey(), new ConcurrentHashMap<>());
                        }
                        this.f82629a.get(entry.getKey()).put(str, cookieM22192c);
                    }
                }
            }
        }
    }

    private static boolean isCookieExpired(Cookie cookie) {
        return cookie.expiresAt() < System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public void m22190a(HttpUrl httpUrl, Cookie cookie) {
        String strM22194e = m22194e(cookie);
        if (!cookie.persistent()) {
            if (!this.f82629a.containsKey(httpUrl.host())) {
                this.f82629a.put(httpUrl.host(), new ConcurrentHashMap<>());
            }
            this.f82629a.get(httpUrl.host()).put(strM22194e, cookie);
        } else if (!this.f82629a.containsKey(httpUrl.host())) {
            return;
        } else {
            this.f82629a.get(httpUrl.host()).remove(strM22194e);
        }
        SharedPreferences.Editor editorEdit = this.f82630b.edit();
        editorEdit.putString(httpUrl.host(), TextUtils.join(",", this.f82629a.get(httpUrl.host()).keySet()));
        editorEdit.putString(f82628e + strM22194e, m22193d(new y0f(cookie)));
        editorEdit.apply();
    }

    @Override // p000.zz2
    public void add(HttpUrl httpUrl, List<Cookie> list) {
        Iterator<Cookie> it = list.iterator();
        while (it.hasNext()) {
            m22190a(httpUrl, it.next());
        }
    }

    /* JADX INFO: renamed from: b */
    public String m22191b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    /* JADX INFO: renamed from: c */
    public Cookie m22192c(String str) {
        try {
            return ((y0f) new ObjectInputStream(new ByteArrayInputStream(m22195f(str))).readObject()).getCookie();
        } catch (IOException | ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public String m22193d(y0f y0fVar) {
        if (y0fVar == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(y0fVar);
            return m22191b(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public String m22194e(Cookie cookie) {
        return cookie.name() + cookie.domain();
    }

    /* JADX INFO: renamed from: f */
    public byte[] m22195f(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    @Override // p000.zz2
    public List<Cookie> get(HttpUrl httpUrl) {
        ArrayList arrayList = new ArrayList();
        if (this.f82629a.containsKey(httpUrl.host())) {
            for (Cookie cookie : this.f82629a.get(httpUrl.host()).values()) {
                if (isCookieExpired(cookie)) {
                    remove(httpUrl, cookie);
                } else {
                    arrayList.add(cookie);
                }
            }
        }
        return arrayList;
    }

    @Override // p000.zz2
    public List<Cookie> getCookies() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f82629a.keySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(this.f82629a.get(it.next()).values());
        }
        return arrayList;
    }

    @Override // p000.zz2
    public boolean remove(HttpUrl httpUrl, Cookie cookie) {
        String strM22194e = m22194e(cookie);
        if (!this.f82629a.containsKey(httpUrl.host()) || !this.f82629a.get(httpUrl.host()).containsKey(strM22194e)) {
            return false;
        }
        this.f82629a.get(httpUrl.host()).remove(strM22194e);
        SharedPreferences.Editor editorEdit = this.f82630b.edit();
        if (this.f82630b.contains(f82628e + strM22194e)) {
            editorEdit.remove(f82628e + strM22194e);
        }
        editorEdit.putString(httpUrl.host(), TextUtils.join(",", this.f82629a.get(httpUrl.host()).keySet()));
        editorEdit.apply();
        return true;
    }

    @Override // p000.zz2
    public boolean removeAll() {
        SharedPreferences.Editor editorEdit = this.f82630b.edit();
        editorEdit.clear();
        editorEdit.apply();
        this.f82629a.clear();
        return true;
    }
}

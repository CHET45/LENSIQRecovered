package p000;

import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes7.dex */
public class yz2 implements CookieJar {

    /* JADX INFO: renamed from: a */
    public zz2 f103499a;

    public yz2(zz2 zz2Var) {
        if (zz2Var == null) {
            p75.illegalArgument("cookieStore can not be null.", new Object[0]);
        }
        this.f103499a = zz2Var;
    }

    public zz2 getCookieStore() {
        return this.f103499a;
    }

    @Override // okhttp3.CookieJar
    public synchronized List<Cookie> loadForRequest(HttpUrl httpUrl) {
        return this.f103499a.get(httpUrl);
    }

    @Override // okhttp3.CookieJar
    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        this.f103499a.add(httpUrl, list);
    }
}

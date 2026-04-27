package p000;

import java.util.List;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes7.dex */
public interface zz2 {
    void add(HttpUrl httpUrl, List<Cookie> list);

    List<Cookie> get(HttpUrl httpUrl);

    List<Cookie> getCookies();

    boolean remove(HttpUrl httpUrl, Cookie cookie);

    boolean removeAll();
}

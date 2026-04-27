package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes7.dex */
public class lqa implements zz2 {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, List<Cookie>> f58463a = new HashMap<>();

    @Override // p000.zz2
    public void add(HttpUrl httpUrl, List<Cookie> list) {
        List<Cookie> list2 = this.f58463a.get(httpUrl.host());
        if (list2 == null) {
            this.f58463a.put(httpUrl.host(), list);
            return;
        }
        Iterator<Cookie> it = list.iterator();
        Iterator<Cookie> it2 = list2.iterator();
        while (it.hasNext()) {
            String strName = it.next().name();
            while (strName != null && it2.hasNext()) {
                String strName2 = it2.next().name();
                if (strName2 != null && strName.equals(strName2)) {
                    it2.remove();
                }
            }
        }
        list2.addAll(list);
    }

    @Override // p000.zz2
    public List<Cookie> get(HttpUrl httpUrl) {
        List<Cookie> list = this.f58463a.get(httpUrl.host());
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f58463a.put(httpUrl.host(), arrayList);
        return arrayList;
    }

    @Override // p000.zz2
    public List<Cookie> getCookies() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f58463a.keySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(this.f58463a.get(it.next()));
        }
        return arrayList;
    }

    @Override // p000.zz2
    public boolean remove(HttpUrl httpUrl, Cookie cookie) {
        List<Cookie> list = this.f58463a.get(httpUrl.host());
        if (cookie != null) {
            return list.remove(cookie);
        }
        return false;
    }

    @Override // p000.zz2
    public boolean removeAll() {
        this.f58463a.clear();
        return true;
    }
}

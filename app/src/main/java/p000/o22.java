package p000;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes6.dex */
public class o22 implements Dns {

    /* JADX INFO: renamed from: a */
    public final Dns f66265a = Dns.SYSTEM;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap<String, List<InetAddress>> f66266b = new ConcurrentHashMap<>();

    public void clearAllCache() {
        this.f66266b.clear();
    }

    public void clearCache(String str) {
        this.f66266b.remove(str);
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        List<InetAddress> list = this.f66266b.get(str);
        if (list != null) {
            return list;
        }
        List<InetAddress> listLookup = this.f66265a.lookup(str);
        this.f66266b.put(str, listLookup);
        return listLookup;
    }
}

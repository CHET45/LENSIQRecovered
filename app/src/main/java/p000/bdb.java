package p000;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes6.dex */
public class bdb implements Dns {

    /* JADX INFO: renamed from: a */
    public final Dns f13442a = Dns.SYSTEM;

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        return this.f13442a.lookup(str);
    }
}

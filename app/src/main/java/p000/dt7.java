package p000;

import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public class dt7 extends bt7 {

    /* JADX INFO: renamed from: a */
    public final URL f30840a;

    public dt7(@efb String str) {
        this.f30840a = obtain(str);
    }

    @efb
    public static dt7 create(@efb String str) {
        return new dt7(str);
    }

    @hib
    private static URL obtain(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // p000.bt7
    @efb
    public String process(@efb String str) {
        if (this.f30840a == null) {
            return str;
        }
        try {
            return new URL(this.f30840a, str).toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static dt7 create(@efb URL url) {
        return new dt7(url);
    }

    public dt7(@efb URL url) {
        this.f30840a = url;
    }
}

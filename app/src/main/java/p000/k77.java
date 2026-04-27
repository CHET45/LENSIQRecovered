package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class k77 implements eq8 {

    /* JADX INFO: renamed from: j */
    public static final String f52723j = "@#&=*+-_.,:!?()/~'%;$";

    /* JADX INFO: renamed from: c */
    public final ii7 f52724c;

    /* JADX INFO: renamed from: d */
    @hib
    public final URL f52725d;

    /* JADX INFO: renamed from: e */
    @hib
    public final String f52726e;

    /* JADX INFO: renamed from: f */
    @hib
    public String f52727f;

    /* JADX INFO: renamed from: g */
    @hib
    public URL f52728g;

    /* JADX INFO: renamed from: h */
    @hib
    public volatile byte[] f52729h;

    /* JADX INFO: renamed from: i */
    public int f52730i;

    public k77(URL url) {
        this(url, ii7.f47094b);
    }

    private byte[] getCacheKeyBytes() {
        if (this.f52729h == null) {
            this.f52729h = getCacheKey().getBytes(eq8.f33838b);
        }
        return this.f52729h;
    }

    private String getSafeStringUrl() {
        if (TextUtils.isEmpty(this.f52727f)) {
            String string = this.f52726e;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) t7d.checkNotNull(this.f52725d)).toString();
            }
            this.f52727f = Uri.encode(string, f52723j);
        }
        return this.f52727f;
    }

    private URL getSafeUrl() throws MalformedURLException {
        if (this.f52728g == null) {
            this.f52728g = new URL(getSafeStringUrl());
        }
        return this.f52728g;
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        if (!(obj instanceof k77)) {
            return false;
        }
        k77 k77Var = (k77) obj;
        return getCacheKey().equals(k77Var.getCacheKey()) && this.f52724c.equals(k77Var.f52724c);
    }

    public String getCacheKey() {
        String str = this.f52726e;
        return str != null ? str : ((URL) t7d.checkNotNull(this.f52725d)).toString();
    }

    public Map<String, String> getHeaders() {
        return this.f52724c.getHeaders();
    }

    @Override // p000.eq8
    public int hashCode() {
        if (this.f52730i == 0) {
            int iHashCode = getCacheKey().hashCode();
            this.f52730i = iHashCode;
            this.f52730i = (iHashCode * 31) + this.f52724c.hashCode();
        }
        return this.f52730i;
    }

    public String toString() {
        return getCacheKey();
    }

    public String toStringUrl() {
        return getSafeStringUrl();
    }

    public URL toURL() throws MalformedURLException {
        return getSafeUrl();
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(getCacheKeyBytes());
    }

    public k77(String str) {
        this(str, ii7.f47094b);
    }

    public k77(URL url, ii7 ii7Var) {
        this.f52725d = (URL) t7d.checkNotNull(url);
        this.f52726e = null;
        this.f52724c = (ii7) t7d.checkNotNull(ii7Var);
    }

    public k77(String str, ii7 ii7Var) {
        this.f52725d = null;
        this.f52726e = t7d.checkNotEmpty(str);
        this.f52724c = (ii7) t7d.checkNotNull(ii7Var);
    }
}

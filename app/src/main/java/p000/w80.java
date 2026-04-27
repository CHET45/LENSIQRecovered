package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class w80 extends wq0 {

    /* JADX INFO: renamed from: f */
    public final AssetManager f93545f;

    /* JADX INFO: renamed from: g */
    @hib
    public Uri f93546g;

    /* JADX INFO: renamed from: h */
    @hib
    public InputStream f93547h;

    /* JADX INFO: renamed from: i */
    public long f93548i;

    /* JADX INFO: renamed from: j */
    public boolean f93549j;

    /* JADX INFO: renamed from: w80$a */
    public static final class C14468a extends sh3 {
        @Deprecated
        public C14468a(IOException iOException) {
            super(iOException, 2000);
        }

        public C14468a(@hib Throwable th, int i) {
            super(th, i);
        }
    }

    public w80(Context context) {
        super(false);
        this.f93545f = context.getAssets();
    }

    @Override // p000.gh3
    public void close() throws C14468a {
        this.f93546g = null;
        try {
            try {
                InputStream inputStream = this.f93547h;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C14468a(e, 2000);
            }
        } finally {
            this.f93547h = null;
            if (this.f93549j) {
                this.f93549j = false;
                m24715c();
            }
        }
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return this.f93546g;
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws C14468a {
        try {
            Uri uri = xh3Var.f97800a;
            this.f93546g = uri;
            String strSubstring = (String) v80.checkNotNull(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith(pj4.f71071b)) {
                strSubstring = strSubstring.substring(1);
            }
            m24716d(xh3Var);
            InputStream inputStreamOpen = this.f93545f.open(strSubstring, 1);
            this.f93547h = inputStreamOpen;
            if (inputStreamOpen.skip(xh3Var.f97806g) < xh3Var.f97806g) {
                throw new C14468a(null, 2008);
            }
            long j = xh3Var.f97807h;
            if (j != -1) {
                this.f93548i = j;
            } else {
                long jAvailable = this.f93547h.available();
                this.f93548i = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f93548i = -1L;
                }
            }
            this.f93549j = true;
            m24717e(xh3Var);
            return this.f93548i;
        } catch (C14468a e) {
            throw e;
        } catch (IOException e2) {
            throw new C14468a(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) throws C14468a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f93548i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C14468a(e, 2000);
            }
        }
        int i3 = ((InputStream) t0i.castNonNull(this.f93547h)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.f93548i;
        if (j2 != -1) {
            this.f93548i = j2 - ((long) i3);
        }
        m24714b(i3);
        return i3;
    }
}

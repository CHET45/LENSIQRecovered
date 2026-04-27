package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class x80 extends vq0 {

    /* JADX INFO: renamed from: f */
    public final AssetManager f97129f;

    /* JADX INFO: renamed from: g */
    @hib
    public Uri f97130g;

    /* JADX INFO: renamed from: h */
    @hib
    public InputStream f97131h;

    /* JADX INFO: renamed from: i */
    public long f97132i;

    /* JADX INFO: renamed from: j */
    public boolean f97133j;

    /* JADX INFO: renamed from: x80$a */
    public static final class C14978a extends rh3 {
        @Deprecated
        public C14978a(IOException iOException) {
            super(iOException, 2000);
        }

        public C14978a(@hib Throwable th, int i) {
            super(th, i);
        }
    }

    public x80(Context context) {
        super(false);
        this.f97129f = context.getAssets();
    }

    @Override // p000.ih3, p000.en7
    public void close() throws C14978a {
        this.f97130g = null;
        try {
            try {
                InputStream inputStream = this.f97131h;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C14978a(e, 2000);
            }
        } finally {
            this.f97131h = null;
            if (this.f97133j) {
                this.f97133j = false;
                m24113c();
            }
        }
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        return this.f97130g;
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws C14978a {
        try {
            Uri uri = yh3Var.f101485a;
            this.f97130g = uri;
            String strSubstring = (String) u80.checkNotNull(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith(pj4.f71071b)) {
                strSubstring = strSubstring.substring(1);
            }
            m24114d(yh3Var);
            InputStream inputStreamOpen = this.f97129f.open(strSubstring, 1);
            this.f97131h = inputStreamOpen;
            if (inputStreamOpen.skip(yh3Var.f101491g) < yh3Var.f101491g) {
                throw new C14978a(null, 2008);
            }
            long j = yh3Var.f101492h;
            if (j != -1) {
                this.f97132i = j;
            } else {
                long jAvailable = this.f97131h.available();
                this.f97132i = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f97132i = -1L;
                }
            }
            this.f97133j = true;
            m24115e(yh3Var);
            return this.f97132i;
        } catch (C14978a e) {
            throw e;
        } catch (IOException e2) {
            throw new C14978a(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws C14978a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f97132i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C14978a(e, 2000);
            }
        }
        int i3 = ((InputStream) x0i.castNonNull(this.f97131h)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.f97132i;
        if (j2 != -1) {
            this.f97132i = j2 - ((long) i3);
        }
        m24112b(i3);
        return i3;
    }
}

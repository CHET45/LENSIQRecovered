package p000;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p000.ih3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class os5 extends vq0 {

    /* JADX INFO: renamed from: f */
    @hib
    public RandomAccessFile f68550f;

    /* JADX INFO: renamed from: g */
    @hib
    public Uri f68551g;

    /* JADX INFO: renamed from: h */
    public long f68552h;

    /* JADX INFO: renamed from: i */
    public boolean f68553i;

    /* JADX INFO: renamed from: os5$a */
    @c5e(21)
    public static final class C10628a {
        private C10628a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ih4
        public static boolean isPermissionError(@hib Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* JADX INFO: renamed from: os5$b */
    public static final class C10629b implements ih3.InterfaceC7283a {

        /* JADX INFO: renamed from: a */
        @hib
        public pdh f68554a;

        @op1
        public C10629b setListener(@hib pdh pdhVar) {
            this.f68554a = pdhVar;
            return this;
        }

        @Override // p000.ih3.InterfaceC7283a
        public os5 createDataSource() {
            os5 os5Var = new os5();
            pdh pdhVar = this.f68554a;
            if (pdhVar != null) {
                os5Var.addTransferListener(pdhVar);
            }
            return os5Var;
        }
    }

    /* JADX INFO: renamed from: os5$c */
    public static class C10630c extends rh3 {
        @Deprecated
        public C10630c(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public C10630c(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public C10630c(Throwable th, int i) {
            super(th, i);
        }

        public C10630c(@hib String str, @hib Throwable th, int i) {
            super(str, th, i);
        }
    }

    public os5() {
        super(false);
    }

    private static RandomAccessFile openLocalFile(Uri uri) throws C10630c {
        try {
            return new RandomAccessFile((String) u80.checkNotNull(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C10630c(e, (x0i.f95978a < 21 || !C10628a.isPermissionError(e.getCause())) ? 2005 : 2006);
            }
            throw new C10630c(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (SecurityException e2) {
            throw new C10630c(e2, 2006);
        } catch (RuntimeException e3) {
            throw new C10630c(e3, 2000);
        }
    }

    @Override // p000.ih3, p000.en7
    public void close() throws C10630c {
        this.f68551g = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f68550f;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C10630c(e, 2000);
            }
        } finally {
            this.f68550f = null;
            if (this.f68553i) {
                this.f68553i = false;
                m24113c();
            }
        }
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        return this.f68551g;
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws C10630c {
        Uri uri = yh3Var.f101485a;
        this.f68551g = uri;
        m24114d(yh3Var);
        RandomAccessFile randomAccessFileOpenLocalFile = openLocalFile(uri);
        this.f68550f = randomAccessFileOpenLocalFile;
        try {
            randomAccessFileOpenLocalFile.seek(yh3Var.f101491g);
            long length = yh3Var.f101492h;
            if (length == -1) {
                length = this.f68550f.length() - yh3Var.f101491g;
            }
            this.f68552h = length;
            if (length < 0) {
                throw new C10630c(null, null, 2008);
            }
            this.f68553i = true;
            m24115e(yh3Var);
            return this.f68552h;
        } catch (IOException e) {
            throw new C10630c(e, 2000);
        }
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws C10630c {
        if (i2 == 0) {
            return 0;
        }
        if (this.f68552h == 0) {
            return -1;
        }
        try {
            int i3 = ((RandomAccessFile) x0i.castNonNull(this.f68550f)).read(bArr, i, (int) Math.min(this.f68552h, i2));
            if (i3 > 0) {
                this.f68552h -= (long) i3;
                m24112b(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new C10630c(e, 2000);
        }
    }
}

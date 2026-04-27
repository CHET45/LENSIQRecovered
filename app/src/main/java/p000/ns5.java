package p000;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p000.gh3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ns5 extends wq0 {

    /* JADX INFO: renamed from: f */
    @hib
    public RandomAccessFile f65479f;

    /* JADX INFO: renamed from: g */
    @hib
    public Uri f65480g;

    /* JADX INFO: renamed from: h */
    public long f65481h;

    /* JADX INFO: renamed from: i */
    public boolean f65482i;

    /* JADX INFO: renamed from: ns5$a */
    public static final class C10038a implements gh3.InterfaceC6313a {

        /* JADX INFO: renamed from: a */
        @hib
        public qdh f65483a;

        @op1
        public C10038a setListener(@hib qdh qdhVar) {
            this.f65483a = qdhVar;
            return this;
        }

        @Override // p000.gh3.InterfaceC6313a
        public ns5 createDataSource() {
            ns5 ns5Var = new ns5();
            qdh qdhVar = this.f65483a;
            if (qdhVar != null) {
                ns5Var.addTransferListener(qdhVar);
            }
            return ns5Var;
        }
    }

    /* JADX INFO: renamed from: ns5$b */
    public static class C10039b extends sh3 {
        @Deprecated
        public C10039b(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public C10039b(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public C10039b(Throwable th, int i) {
            super(th, i);
        }

        public C10039b(@hib String str, @hib Throwable th, int i) {
            super(str, th, i);
        }
    }

    public ns5() {
        super(false);
    }

    private static RandomAccessFile openLocalFile(Uri uri) throws C10039b {
        try {
            return new RandomAccessFile((String) v80.checkNotNull(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C10039b(e, ((e.getCause() instanceof ErrnoException) && ((ErrnoException) e.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new C10039b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (SecurityException e2) {
            throw new C10039b(e2, 2006);
        } catch (RuntimeException e3) {
            throw new C10039b(e3, 2000);
        }
    }

    @Override // p000.gh3
    public void close() throws C10039b {
        this.f65480g = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f65479f;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C10039b(e, 2000);
            }
        } finally {
            this.f65479f = null;
            if (this.f65482i) {
                this.f65482i = false;
                m24715c();
            }
        }
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return this.f65480g;
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws C10039b {
        Uri uri = xh3Var.f97800a;
        this.f65480g = uri;
        m24716d(xh3Var);
        RandomAccessFile randomAccessFileOpenLocalFile = openLocalFile(uri);
        this.f65479f = randomAccessFileOpenLocalFile;
        try {
            randomAccessFileOpenLocalFile.seek(xh3Var.f97806g);
            long length = xh3Var.f97807h;
            if (length == -1) {
                length = this.f65479f.length() - xh3Var.f97806g;
            }
            this.f65481h = length;
            if (length < 0) {
                throw new C10039b(null, null, 2008);
            }
            this.f65482i = true;
            m24717e(xh3Var);
            return this.f65481h;
        } catch (IOException e) {
            throw new C10039b(e, 2000);
        }
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) throws C10039b {
        if (i2 == 0) {
            return 0;
        }
        if (this.f65481h == 0) {
            return -1;
        }
        try {
            int i3 = ((RandomAccessFile) t0i.castNonNull(this.f65479f)).read(bArr, i, (int) Math.min(this.f65481h, i2));
            if (i3 > 0) {
                this.f65481h -= (long) i3;
                m24714b(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new C10039b(e, 2000);
        }
    }
}

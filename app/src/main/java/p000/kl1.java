package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p000.dl1;
import p000.fh3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class kl1 implements fh3 {

    /* JADX INFO: renamed from: k */
    public static final long f54587k = 5242880;

    /* JADX INFO: renamed from: l */
    public static final int f54588l = 20480;

    /* JADX INFO: renamed from: m */
    public static final long f54589m = 2097152;

    /* JADX INFO: renamed from: n */
    public static final String f54590n = "CacheDataSink";

    /* JADX INFO: renamed from: a */
    public final dl1 f54591a;

    /* JADX INFO: renamed from: b */
    public final long f54592b;

    /* JADX INFO: renamed from: c */
    public final int f54593c;

    /* JADX INFO: renamed from: d */
    @hib
    public yh3 f54594d;

    /* JADX INFO: renamed from: e */
    public long f54595e;

    /* JADX INFO: renamed from: f */
    @hib
    public File f54596f;

    /* JADX INFO: renamed from: g */
    @hib
    public OutputStream f54597g;

    /* JADX INFO: renamed from: h */
    public long f54598h;

    /* JADX INFO: renamed from: i */
    public long f54599i;

    /* JADX INFO: renamed from: j */
    public f9e f54600j;

    /* JADX INFO: renamed from: kl1$a */
    public static final class C8441a extends dl1.C4842a {
        public C8441a(IOException iOException) {
            super(iOException);
        }
    }

    /* JADX INFO: renamed from: kl1$b */
    public static final class C8442b implements fh3.InterfaceC5803a {

        /* JADX INFO: renamed from: a */
        public dl1 f54601a;

        /* JADX INFO: renamed from: b */
        public long f54602b = 5242880;

        /* JADX INFO: renamed from: c */
        public int f54603c = 20480;

        @Override // p000.fh3.InterfaceC5803a
        public fh3 createDataSink() {
            return new kl1((dl1) u80.checkNotNull(this.f54601a), this.f54602b, this.f54603c);
        }

        @op1
        public C8442b setBufferSize(int i) {
            this.f54603c = i;
            return this;
        }

        @op1
        public C8442b setCache(dl1 dl1Var) {
            this.f54601a = dl1Var;
            return this;
        }

        @op1
        public C8442b setFragmentSize(long j) {
            this.f54602b = j;
            return this;
        }
    }

    public kl1(dl1 dl1Var, long j) {
        this(dl1Var, j, 20480);
    }

    private void closeCurrentOutputStream() throws IOException {
        OutputStream outputStream = this.f54597g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            x0i.closeQuietly(this.f54597g);
            this.f54597g = null;
            File file = (File) x0i.castNonNull(this.f54596f);
            this.f54596f = null;
            this.f54591a.commitFile(file, this.f54598h);
        } catch (Throwable th) {
            x0i.closeQuietly(this.f54597g);
            this.f54597g = null;
            File file2 = (File) x0i.castNonNull(this.f54596f);
            this.f54596f = null;
            file2.delete();
            throw th;
        }
    }

    private void openNextOutputStream(yh3 yh3Var) throws IOException {
        long j = yh3Var.f101492h;
        this.f54596f = this.f54591a.startFile((String) x0i.castNonNull(yh3Var.f101493i), yh3Var.f101491g + this.f54599i, j != -1 ? Math.min(j - this.f54599i, this.f54595e) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f54596f);
        if (this.f54593c > 0) {
            f9e f9eVar = this.f54600j;
            if (f9eVar == null) {
                this.f54600j = new f9e(fileOutputStream, this.f54593c);
            } else {
                f9eVar.reset(fileOutputStream);
            }
            this.f54597g = this.f54600j;
        } else {
            this.f54597g = fileOutputStream;
        }
        this.f54598h = 0L;
    }

    @Override // p000.fh3
    public void close() throws C8441a {
        if (this.f54594d == null) {
            return;
        }
        try {
            closeCurrentOutputStream();
        } catch (IOException e) {
            throw new C8441a(e);
        }
    }

    @Override // p000.fh3
    public void open(yh3 yh3Var) throws C8441a {
        u80.checkNotNull(yh3Var.f101493i);
        if (yh3Var.f101492h == -1 && yh3Var.isFlagSet(2)) {
            this.f54594d = null;
            return;
        }
        this.f54594d = yh3Var;
        this.f54595e = yh3Var.isFlagSet(4) ? this.f54592b : Long.MAX_VALUE;
        this.f54599i = 0L;
        try {
            openNextOutputStream(yh3Var);
        } catch (IOException e) {
            throw new C8441a(e);
        }
    }

    @Override // p000.fh3
    public void write(byte[] bArr, int i, int i2) throws C8441a {
        yh3 yh3Var = this.f54594d;
        if (yh3Var == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f54598h == this.f54595e) {
                    closeCurrentOutputStream();
                    openNextOutputStream(yh3Var);
                }
                int iMin = (int) Math.min(i2 - i3, this.f54595e - this.f54598h);
                ((OutputStream) x0i.castNonNull(this.f54597g)).write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.f54598h += j;
                this.f54599i += j;
            } catch (IOException e) {
                throw new C8441a(e);
            }
        }
    }

    public kl1(dl1 dl1Var, long j, int i) {
        u80.checkState(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j != -1 && j < 2097152) {
            yh9.m25919w("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f54591a = (dl1) u80.checkNotNull(dl1Var);
        this.f54592b = j == -1 ? Long.MAX_VALUE : j;
        this.f54593c = i;
    }
}

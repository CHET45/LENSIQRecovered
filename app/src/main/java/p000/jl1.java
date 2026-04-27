package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p000.cl1;
import p000.eh3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class jl1 implements eh3 {

    /* JADX INFO: renamed from: k */
    public static final long f51085k = 5242880;

    /* JADX INFO: renamed from: l */
    public static final int f51086l = 20480;

    /* JADX INFO: renamed from: m */
    public static final long f51087m = 2097152;

    /* JADX INFO: renamed from: n */
    public static final String f51088n = "CacheDataSink";

    /* JADX INFO: renamed from: a */
    public final cl1 f51089a;

    /* JADX INFO: renamed from: b */
    public final long f51090b;

    /* JADX INFO: renamed from: c */
    public final int f51091c;

    /* JADX INFO: renamed from: d */
    @hib
    public xh3 f51092d;

    /* JADX INFO: renamed from: e */
    public long f51093e;

    /* JADX INFO: renamed from: f */
    @hib
    public File f51094f;

    /* JADX INFO: renamed from: g */
    @hib
    public OutputStream f51095g;

    /* JADX INFO: renamed from: h */
    public long f51096h;

    /* JADX INFO: renamed from: i */
    public long f51097i;

    /* JADX INFO: renamed from: j */
    public g9e f51098j;

    /* JADX INFO: renamed from: jl1$a */
    public static final class C7968a extends cl1.C2374a {
        public C7968a(IOException iOException) {
            super(iOException);
        }
    }

    /* JADX INFO: renamed from: jl1$b */
    public static final class C7969b implements eh3.InterfaceC5299a {

        /* JADX INFO: renamed from: a */
        public cl1 f51099a;

        /* JADX INFO: renamed from: b */
        public long f51100b = 5242880;

        /* JADX INFO: renamed from: c */
        public int f51101c = 20480;

        @Override // p000.eh3.InterfaceC5299a
        public eh3 createDataSink() {
            return new jl1((cl1) v80.checkNotNull(this.f51099a), this.f51100b, this.f51101c);
        }

        @op1
        public C7969b setBufferSize(int i) {
            this.f51101c = i;
            return this;
        }

        @op1
        public C7969b setCache(cl1 cl1Var) {
            this.f51099a = cl1Var;
            return this;
        }

        @op1
        public C7969b setFragmentSize(long j) {
            this.f51100b = j;
            return this;
        }
    }

    public jl1(cl1 cl1Var, long j) {
        this(cl1Var, j, 20480);
    }

    private void closeCurrentOutputStream() throws IOException {
        OutputStream outputStream = this.f51095g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            t0i.closeQuietly(this.f51095g);
            this.f51095g = null;
            File file = (File) t0i.castNonNull(this.f51094f);
            this.f51094f = null;
            this.f51089a.commitFile(file, this.f51096h);
        } catch (Throwable th) {
            t0i.closeQuietly(this.f51095g);
            this.f51095g = null;
            File file2 = (File) t0i.castNonNull(this.f51094f);
            this.f51094f = null;
            file2.delete();
            throw th;
        }
    }

    private void openNextOutputStream(xh3 xh3Var) throws IOException {
        long j = xh3Var.f97807h;
        this.f51094f = this.f51089a.startFile((String) t0i.castNonNull(xh3Var.f97808i), xh3Var.f97806g + this.f51097i, j != -1 ? Math.min(j - this.f51097i, this.f51093e) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f51094f);
        if (this.f51091c > 0) {
            g9e g9eVar = this.f51098j;
            if (g9eVar == null) {
                this.f51098j = new g9e(fileOutputStream, this.f51091c);
            } else {
                g9eVar.reset(fileOutputStream);
            }
            this.f51095g = this.f51098j;
        } else {
            this.f51095g = fileOutputStream;
        }
        this.f51096h = 0L;
    }

    @Override // p000.eh3
    public void close() throws C7968a {
        if (this.f51092d == null) {
            return;
        }
        try {
            closeCurrentOutputStream();
        } catch (IOException e) {
            throw new C7968a(e);
        }
    }

    @Override // p000.eh3
    public void open(xh3 xh3Var) throws C7968a {
        v80.checkNotNull(xh3Var.f97808i);
        if (xh3Var.f97807h == -1 && xh3Var.isFlagSet(2)) {
            this.f51092d = null;
            return;
        }
        this.f51092d = xh3Var;
        this.f51093e = xh3Var.isFlagSet(4) ? this.f51090b : Long.MAX_VALUE;
        this.f51097i = 0L;
        try {
            openNextOutputStream(xh3Var);
        } catch (IOException e) {
            throw new C7968a(e);
        }
    }

    @Override // p000.eh3
    public void write(byte[] bArr, int i, int i2) throws C7968a {
        xh3 xh3Var = this.f51092d;
        if (xh3Var == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f51096h == this.f51093e) {
                    closeCurrentOutputStream();
                    openNextOutputStream(xh3Var);
                }
                int iMin = (int) Math.min(i2 - i3, this.f51093e - this.f51096h);
                ((OutputStream) t0i.castNonNull(this.f51095g)).write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.f51096h += j;
                this.f51097i += j;
            } catch (IOException e) {
                throw new C7968a(e);
            }
        }
    }

    public jl1(cl1 cl1Var, long j, int i) {
        v80.checkState(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j != -1 && j < 2097152) {
            xh9.m25148w("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f51089a = (cl1) v80.checkNotNull(cl1Var);
        this.f51090b = j == -1 ? Long.MAX_VALUE : j;
        this.f51091c = i;
    }
}

package p000;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class gi1 extends wq0 {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6318a f39850f;

    /* JADX INFO: renamed from: g */
    @hib
    public Uri f39851g;

    /* JADX INFO: renamed from: h */
    @hib
    public byte[] f39852h;

    /* JADX INFO: renamed from: i */
    public int f39853i;

    /* JADX INFO: renamed from: j */
    public int f39854j;

    /* JADX INFO: renamed from: k */
    public boolean f39855k;

    /* JADX INFO: renamed from: gi1$a */
    public interface InterfaceC6318a {
        byte[] resolve(Uri uri) throws IOException;
    }

    public gi1(final byte[] bArr) {
        this(new InterfaceC6318a() { // from class: fi1
            @Override // p000.gi1.InterfaceC6318a
            public final byte[] resolve(Uri uri) {
                return gi1.lambda$new$0(bArr, uri);
            }
        });
        v80.checkArgument(bArr.length > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$new$0(byte[] bArr, Uri uri) throws IOException {
        return bArr;
    }

    @Override // p000.gh3
    public void close() {
        if (this.f39855k) {
            this.f39855k = false;
            m24715c();
        }
        this.f39851g = null;
        this.f39852h = null;
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return this.f39851g;
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws IOException {
        m24716d(xh3Var);
        Uri uri = xh3Var.f97800a;
        this.f39851g = uri;
        byte[] bArrResolve = this.f39850f.resolve(uri);
        this.f39852h = bArrResolve;
        long j = xh3Var.f97806g;
        if (j > bArrResolve.length) {
            throw new sh3(2008);
        }
        this.f39853i = (int) j;
        int length = bArrResolve.length - ((int) j);
        this.f39854j = length;
        long j2 = xh3Var.f97807h;
        if (j2 != -1) {
            this.f39854j = (int) Math.min(length, j2);
        }
        this.f39855k = true;
        m24717e(xh3Var);
        long j3 = xh3Var.f97807h;
        return j3 != -1 ? j3 : this.f39854j;
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f39854j;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(v80.checkStateNotNull(this.f39852h), this.f39853i, bArr, i, iMin);
        this.f39853i += iMin;
        this.f39854j -= iMin;
        m24714b(iMin);
        return iMin;
    }

    public gi1(InterfaceC6318a interfaceC6318a) {
        super(false);
        this.f39850f = (InterfaceC6318a) v80.checkNotNull(interfaceC6318a);
    }
}

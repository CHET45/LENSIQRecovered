package p000;

import android.net.Uri;
import java.io.IOException;
import p000.gh3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class iwc implements gh3 {

    /* JADX INFO: renamed from: b */
    public static final iwc f48697b = new iwc();

    /* JADX INFO: renamed from: c */
    public static final gh3.InterfaceC6313a f48698c = new gh3.InterfaceC6313a() { // from class: gwc
        @Override // p000.gh3.InterfaceC6313a
        public final gh3 createDataSource() {
            return iwc.m13491b();
        }
    };

    private iwc() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ iwc m13491b() {
        return new iwc();
    }

    @Override // p000.gh3
    public void addTransferListener(qdh qdhVar) {
    }

    @Override // p000.gh3
    public void close() {
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return null;
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}

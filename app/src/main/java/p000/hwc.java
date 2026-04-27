package p000;

import android.net.Uri;
import java.io.IOException;
import p000.ih3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class hwc implements ih3 {

    /* JADX INFO: renamed from: b */
    public static final hwc f45165b = new hwc();

    /* JADX INFO: renamed from: c */
    public static final ih3.InterfaceC7283a f45166c = new ih3.InterfaceC7283a() { // from class: fwc
        @Override // p000.ih3.InterfaceC7283a
        public final ih3 createDataSource() {
            return hwc.m12655b();
        }
    };

    private hwc() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ hwc m12655b() {
        return new hwc();
    }

    @Override // p000.ih3
    public void addTransferListener(pdh pdhVar) {
    }

    @Override // p000.ih3, p000.en7
    public void close() {
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        return null;
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}

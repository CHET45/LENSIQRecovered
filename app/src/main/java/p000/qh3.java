package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import p000.gh3;
import p000.nt3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class qh3 implements a41 {

    /* JADX INFO: renamed from: e */
    public static final lfg<bb9> f74445e = pfg.memoize(new lfg() { // from class: kh3
        @Override // p000.lfg
        public final Object get() {
            return qh3.lambda$static$0();
        }
    });

    /* JADX INFO: renamed from: a */
    public final bb9 f74446a;

    /* JADX INFO: renamed from: b */
    public final gh3.InterfaceC6313a f74447b;

    /* JADX INFO: renamed from: c */
    @hib
    public final BitmapFactory.Options f74448c;

    /* JADX INFO: renamed from: d */
    public final int f74449d;

    public qh3(Context context) {
        this((bb9) v80.checkStateNotNull(f74445e.get()), new nt3.C10051a(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$decodeBitmap$1(byte[] bArr) throws Exception {
        return o41.decode(bArr, bArr.length, this.f74448c, this.f74449d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$loadBitmap$2(Uri uri) throws Exception {
        return load(this.f74447b.createDataSource(), uri, this.f74448c, this.f74449d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ bb9 lambda$static$0() {
        return xya.listeningDecorator(Executors.newSingleThreadExecutor());
    }

    private static Bitmap load(gh3 gh3Var, Uri uri, @hib BitmapFactory.Options options, int i) throws IOException {
        try {
            gh3Var.open(new xh3(uri));
            byte[] toEnd = wh3.readToEnd(gh3Var);
            return o41.decode(toEnd, toEnd.length, options, i);
        } finally {
            gh3Var.close();
        }
    }

    @Override // p000.a41
    public ja9<Bitmap> decodeBitmap(final byte[] bArr) {
        return this.f74446a.submit(new Callable() { // from class: mh3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f61004a.lambda$decodeBitmap$1(bArr);
            }
        });
    }

    @Override // p000.a41
    public ja9<Bitmap> loadBitmap(final Uri uri) {
        return this.f74446a.submit(new Callable() { // from class: oh3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67633a.lambda$loadBitmap$2(uri);
            }
        });
    }

    @Override // p000.a41
    public boolean supportsMimeType(String str) {
        return t0i.isBitmapFactorySupportedMimeType(str);
    }

    public qh3(bb9 bb9Var, gh3.InterfaceC6313a interfaceC6313a) {
        this(bb9Var, interfaceC6313a, null);
    }

    public qh3(bb9 bb9Var, gh3.InterfaceC6313a interfaceC6313a, @hib BitmapFactory.Options options) {
        this(bb9Var, interfaceC6313a, options, -1);
    }

    public qh3(bb9 bb9Var, gh3.InterfaceC6313a interfaceC6313a, @hib BitmapFactory.Options options, int i) {
        this.f74446a = bb9Var;
        this.f74447b = interfaceC6313a;
        this.f74448c = options;
        this.f74449d = i;
    }
}

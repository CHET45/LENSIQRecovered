package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import p000.ih3;
import p000.ot3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ph3 implements z31 {

    /* JADX INFO: renamed from: c */
    public static final lfg<bb9> f70779c = pfg.memoize(new lfg() { // from class: jh3
        @Override // p000.lfg
        public final Object get() {
            return ph3.lambda$static$0();
        }
    });

    /* JADX INFO: renamed from: a */
    public final bb9 f70780a;

    /* JADX INFO: renamed from: b */
    public final ih3.InterfaceC7283a f70781b;

    public ph3(Context context) {
        this((bb9) u80.checkStateNotNull(f70779c.get()), new ot3.C10647a(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap decode(byte[] bArr) {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        u80.checkArgument(bitmapDecodeByteArray != null, "Could not decode image data");
        return bitmapDecodeByteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$loadBitmap$2(Uri uri) throws Exception {
        return load(this.f70781b.createDataSource(), uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ bb9 lambda$static$0() {
        return xya.listeningDecorator(Executors.newSingleThreadExecutor());
    }

    private static Bitmap load(ih3 ih3Var, Uri uri) throws IOException {
        ih3Var.open(new yh3(uri));
        return decode(vh3.readToEnd(ih3Var));
    }

    @Override // p000.z31
    public ja9<Bitmap> decodeBitmap(final byte[] bArr) {
        return this.f70780a.submit(new Callable() { // from class: nh3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ph3.decode(bArr);
            }
        });
    }

    @Override // p000.z31
    public ja9<Bitmap> loadBitmap(final Uri uri) {
        return this.f70780a.submit(new Callable() { // from class: lh3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f57570a.lambda$loadBitmap$2(uri);
            }
        });
    }

    public ph3(bb9 bb9Var, ih3.InterfaceC7283a interfaceC7283a) {
        this.f70780a = bb9Var;
        this.f70781b = interfaceC7283a;
    }
}

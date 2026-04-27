package p000;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.File;
import p000.ip6;

/* JADX INFO: renamed from: qs */
/* JADX INFO: loaded from: classes.dex */
@xn8(name = "AndroidFontKt")
public final class C11663qs {
    @f0g
    @yfb
    /* JADX INFO: renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final xn6 m31992FontEj4NQ78(@yfb File file, @yfb jp6 jp6Var, int i, @yfb ip6.C7556e c7556e) {
        return new C9493ms(file, jp6Var, i, c7556e, null);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ xn6 m31994FontEj4NQ78$default(File file, jp6 jp6Var, int i, ip6.C7556e c7556e, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jp6Var = jp6.f51403b.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = fp6.f37355b.m29582getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            c7556e = ip6.f47830a.m30313Settings6EWAqTQ(jp6Var, i, new ip6.InterfaceC7552a[0]);
        }
        return m31992FontEj4NQ78(file, jp6Var, i, c7556e);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final xn6 m31995FontMuC2MFs(@yfb String str, @yfb AssetManager assetManager, @yfb jp6 jp6Var, int i, @yfb ip6.C7556e c7556e) {
        return new C12706so(assetManager, str, jp6Var, i, c7556e, null);
    }

    /* JADX INFO: renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ xn6 m31996FontMuC2MFs$default(String str, AssetManager assetManager, jp6 jp6Var, int i, ip6.C7556e c7556e, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            jp6Var = jp6.f51403b.getNormal();
        }
        if ((i2 & 8) != 0) {
            i = fp6.f37355b.m29582getNormal_LCdwA();
        }
        if ((i2 & 16) != 0) {
            c7556e = ip6.f47830a.m30313Settings6EWAqTQ(jp6Var, i, new ip6.InterfaceC7552a[0]);
        }
        return m31995FontMuC2MFs(str, assetManager, jp6Var, i, c7556e);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }

    @c5e(26)
    @f0g
    @yfb
    /* JADX INFO: renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final xn6 m31991FontEj4NQ78(@yfb ParcelFileDescriptor parcelFileDescriptor, @yfb jp6 jp6Var, int i, @yfb ip6.C7556e c7556e) {
        return new C8948ls(parcelFileDescriptor, jp6Var, i, c7556e, null);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ xn6 m31993FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, jp6 jp6Var, int i, ip6.C7556e c7556e, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jp6Var = jp6.f51403b.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = fp6.f37355b.m29582getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            c7556e = ip6.f47830a.m30313Settings6EWAqTQ(jp6Var, i, new ip6.InterfaceC7552a[0]);
        }
        return m31991FontEj4NQ78(parcelFileDescriptor, jp6Var, i, c7556e);
    }
}

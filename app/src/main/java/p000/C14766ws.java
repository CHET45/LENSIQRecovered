package p000;

import android.content.Context;
import android.graphics.Typeface;
import p000.xn6;

/* JADX INFO: renamed from: ws */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@q64(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @i2e(expression = "PlatformFontLoader", imports = {}))
public final class C14766ws implements xn6.InterfaceC15211b {

    /* JADX INFO: renamed from: b */
    public static final int f95251b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Context f95252a;

    public C14766ws(@yfb Context context) {
        this.f95252a = context;
    }

    @Override // p000.xn6.InterfaceC15211b
    @yfb
    @q64(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @i2e(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    public Typeface load(@yfb xn6 xn6Var) {
        if (xn6Var instanceof i6e) {
            return C15265xs.f99083a.create(this.f95252a, ((i6e) xn6Var).getResId());
        }
        throw new IllegalArgumentException("Unknown font type: " + xn6Var);
    }
}

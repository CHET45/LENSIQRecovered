package p000;

import android.content.Context;
import p000.do6;
import p000.xn6;

/* JADX INFO: loaded from: classes.dex */
public final class c44 {
    @yfb
    @q64(message = "This exists to bridge existing Font.ResourceLoader subclasses to be used as aFontFamily.ResourceLoader during upgrade.", replaceWith = @i2e(expression = "createFontFamilyResolver()", imports = {}))
    public static final do6.InterfaceC4891b createFontFamilyResolver(@yfb xn6.InterfaceC15211b interfaceC15211b, @yfb Context context) {
        return new fo6(new a44(interfaceC15211b, context.getApplicationContext()), null, null, null, null, 30, null);
    }

    @yfb
    @q64(message = "This exists to bridge existing Font.ResourceLoader APIs, and should be removed with them", replaceWith = @i2e(expression = "createFontFamilyResolver()", imports = {}))
    public static final do6.InterfaceC4891b createFontFamilyResolver(@yfb xn6.InterfaceC15211b interfaceC15211b) {
        return new fo6(new b44(interfaceC15211b), null, null, null, null, 30, null);
    }
}

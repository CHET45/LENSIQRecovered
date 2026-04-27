package p000;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zr1 {

    /* JADX INFO: renamed from: g */
    public static final int f105784g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f105785h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f105786i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f105787j = 3;

    /* JADX INFO: renamed from: k */
    public static final int f105788k = 4;

    /* JADX INFO: renamed from: l */
    public static final int f105789l = 1;

    /* JADX INFO: renamed from: m */
    public static final zr1 f105790m = new zr1(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a */
    public final int f105791a;

    /* JADX INFO: renamed from: b */
    public final int f105792b;

    /* JADX INFO: renamed from: c */
    public final int f105793c;

    /* JADX INFO: renamed from: d */
    public final int f105794d;

    /* JADX INFO: renamed from: e */
    public final int f105795e;

    /* JADX INFO: renamed from: f */
    @hib
    public final Typeface f105796f;

    /* JADX INFO: renamed from: zr1$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC16221a {
    }

    public zr1(int i, int i2, int i3, int i4, int i5, @hib Typeface typeface) {
        this.f105791a = i;
        this.f105792b = i2;
        this.f105793c = i3;
        this.f105794d = i4;
        this.f105795e = i5;
        this.f105796f = typeface;
    }

    @c5e(19)
    public static zr1 createFromCaptionStyle(CaptioningManager.CaptionStyle captionStyle) {
        return x0i.f95978a >= 21 ? createFromCaptionStyleV21(captionStyle) : createFromCaptionStyleV19(captionStyle);
    }

    @c5e(19)
    private static zr1 createFromCaptionStyleV19(CaptioningManager.CaptionStyle captionStyle) {
        return new zr1(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @c5e(21)
    private static zr1 createFromCaptionStyleV21(CaptioningManager.CaptionStyle captionStyle) {
        return new zr1(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f105790m.f105791a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f105790m.f105792b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f105790m.f105793c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f105790m.f105794d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f105790m.f105795e, captionStyle.getTypeface());
    }
}

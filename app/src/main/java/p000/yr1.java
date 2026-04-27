package p000;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class yr1 {

    /* JADX INFO: renamed from: g */
    public static final int f102723g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f102724h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f102725i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f102726j = 3;

    /* JADX INFO: renamed from: k */
    public static final int f102727k = 4;

    /* JADX INFO: renamed from: l */
    public static final int f102728l = 1;

    /* JADX INFO: renamed from: m */
    public static final yr1 f102729m = new yr1(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a */
    public final int f102730a;

    /* JADX INFO: renamed from: b */
    public final int f102731b;

    /* JADX INFO: renamed from: c */
    public final int f102732c;

    /* JADX INFO: renamed from: d */
    public final int f102733d;

    /* JADX INFO: renamed from: e */
    public final int f102734e;

    /* JADX INFO: renamed from: f */
    @hib
    public final Typeface f102735f;

    /* JADX INFO: renamed from: yr1$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15774a {
    }

    public yr1(int i, int i2, int i3, int i4, int i5, @hib Typeface typeface) {
        this.f102730a = i;
        this.f102731b = i2;
        this.f102732c = i3;
        this.f102733d = i4;
        this.f102734e = i5;
        this.f102735f = typeface;
    }

    public static yr1 createFromCaptionStyle(CaptioningManager.CaptionStyle captionStyle) {
        return new yr1(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f102729m.f102730a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f102729m.f102731b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f102729m.f102732c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f102729m.f102733d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f102729m.f102734e, captionStyle.getTypeface());
    }
}

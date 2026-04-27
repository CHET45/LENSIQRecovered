package p000;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import p000.ip6;

/* JADX INFO: loaded from: classes.dex */
@c5e(26)
public final class enh {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final enh f33627a = new enh();

    /* JADX INFO: renamed from: b */
    @yfb
    public static ThreadLocal<Paint> f33628b = new ThreadLocal<>();

    /* JADX INFO: renamed from: enh$a */
    public static final class C5414a extends tt8 implements qy6<ip6.InterfaceC7552a, CharSequence> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c64 f33629a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5414a(c64 c64Var) {
            super(1);
            this.f33629a = c64Var;
        }

        @Override // p000.qy6
        @yfb
        public final CharSequence invoke(@yfb ip6.InterfaceC7552a interfaceC7552a) {
            return '\'' + interfaceC7552a.getAxisName() + "' " + interfaceC7552a.toVariationValue(this.f33629a);
        }
    }

    private enh() {
    }

    @th5
    private final String toAndroidString(ip6.C7556e c7556e, Context context) {
        return u99.fastJoinToString$default(c7556e.getSettings(), null, null, null, 0, null, new C5414a(C2030bs.Density(context)), 31, null);
    }

    @gib
    @th5
    public final Typeface setFontVariationSettings(@gib Typeface typeface, @yfb ip6.C7556e c7556e, @yfb Context context) {
        if (typeface == null) {
            return null;
        }
        if (c7556e.getSettings().isEmpty()) {
            return typeface;
        }
        Paint paint = f33628b.get();
        if (paint == null) {
            paint = new Paint();
            f33628b.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(toAndroidString(c7556e, context));
        return paint.getTypeface();
    }
}

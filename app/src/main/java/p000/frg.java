package p000;

import android.os.Bundle;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class frg implements eu8 {

    /* JADX INFO: renamed from: d */
    public static final int f37571d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f37572e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f37573f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f37574g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f37575h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f37576i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f37577j = 2;

    /* JADX INFO: renamed from: k */
    public static final String f37578k = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: l */
    public static final String f37579l = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: m */
    public static final String f37580m = t0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: a */
    public int f37581a;

    /* JADX INFO: renamed from: b */
    public int f37582b;

    /* JADX INFO: renamed from: c */
    public final int f37583c;

    /* JADX INFO: renamed from: frg$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC5942a {
    }

    /* JADX INFO: renamed from: frg$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC5943b {
    }

    public frg(int i, int i2, int i3) {
        this.f37581a = i;
        this.f37582b = i2;
        this.f37583c = i3;
    }

    public static frg fromBundle(Bundle bundle) {
        return new frg(bundle.getInt(f37578k), bundle.getInt(f37579l), bundle.getInt(f37580m));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f37578k, this.f37581a);
        bundle.putInt(f37579l, this.f37582b);
        bundle.putInt(f37580m, this.f37583c);
        return bundle;
    }
}

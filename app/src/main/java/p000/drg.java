package p000;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class drg {

    /* JADX INFO: renamed from: d */
    public static final int f30505d = -1;

    /* JADX INFO: renamed from: e */
    public static final int f30506e = -2;

    /* JADX INFO: renamed from: f */
    public static final Pattern f30507f = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: g */
    public static final dy7<String> f30508g = dy7.m9577of("auto", "none");

    /* JADX INFO: renamed from: h */
    public static final dy7<String> f30509h = dy7.m9578of("dot", "sesame", "circle");

    /* JADX INFO: renamed from: i */
    public static final dy7<String> f30510i = dy7.m9577of("filled", "open");

    /* JADX INFO: renamed from: j */
    public static final dy7<String> f30511j = dy7.m9578of("after", "before", "outside");

    /* JADX INFO: renamed from: a */
    public final int f30512a;

    /* JADX INFO: renamed from: b */
    public final int f30513b;

    /* JADX INFO: renamed from: c */
    public final int f30514c;

    /* JADX INFO: renamed from: drg$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC4927a {
    }

    private drg(int i, int i2, int i3) {
        this.f30512a = i;
        this.f30513b = i2;
        this.f30514c = i3;
    }

    @hib
    public static drg parse(@hib String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = i80.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return parseWords(dy7.copyOf(TextUtils.split(lowerCase, f30507f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000.drg parseWords(p000.dy7<java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.drg.parseWords(dy7):drg");
    }
}

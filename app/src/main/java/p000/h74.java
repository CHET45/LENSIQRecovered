package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class h74<T> extends wr0<T> {

    /* JADX INFO: renamed from: d */
    public static final Pattern f42697d = Pattern.compile("%([0-9]+)");

    /* JADX INFO: renamed from: a */
    public final String f42698a;

    /* JADX INFO: renamed from: b */
    public final yv9<T> f42699b;

    /* JADX INFO: renamed from: c */
    public final Object[] f42700c;

    public h74(String str, yv9<T> yv9Var, Object[] objArr) {
        this.f42698a = str;
        this.f42699b = yv9Var;
        this.f42700c = (Object[]) objArr.clone();
    }

    @io5
    public static <T> yv9<T> describedAs(String str, yv9<T> yv9Var, Object... objArr) {
        return new h74(str, yv9Var, objArr);
    }

    @Override // p000.wr0, p000.yv9
    public void describeMismatch(Object obj, i74 i74Var) {
        this.f42699b.describeMismatch(obj, i74Var);
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        Matcher matcher = f42697d.matcher(this.f42698a);
        int iEnd = 0;
        while (matcher.find()) {
            i74Var.appendText(this.f42698a.substring(iEnd, matcher.start()));
            i74Var.appendValue(this.f42700c[Integer.parseInt(matcher.group(1))]);
            iEnd = matcher.end();
        }
        if (iEnd < this.f42698a.length()) {
            i74Var.appendText(this.f42698a.substring(iEnd));
        }
    }

    @Override // p000.yv9
    public boolean matches(Object obj) {
        return this.f42699b.matches(obj);
    }
}

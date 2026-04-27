package p000;

import com.blankj.utilcode.util.C2473f;

/* JADX INFO: loaded from: classes8.dex */
public abstract class sp5<T, U> extends jmh<T> {

    /* JADX INFO: renamed from: f */
    public static final awd f82509f = new awd("featureValueOf", 1, 0);

    /* JADX INFO: renamed from: c */
    public final yv9<? super U> f82510c;

    /* JADX INFO: renamed from: d */
    public final String f82511d;

    /* JADX INFO: renamed from: e */
    public final String f82512e;

    public sp5(yv9<? super U> yv9Var, String str, String str2) {
        super(f82509f);
        this.f82510c = yv9Var;
        this.f82511d = str;
        this.f82512e = str2;
    }

    /* JADX INFO: renamed from: a */
    public abstract U m22169a(T t);

    @Override // p000.ixe
    public final void describeTo(i74 i74Var) {
        i74Var.appendText(this.f82511d).appendText(C2473f.f17566z).appendDescriptionOf(this.f82510c);
    }

    @Override // p000.jmh
    public boolean matchesSafely(T t, i74 i74Var) {
        U uM22169a = m22169a(t);
        if (this.f82510c.matches(uM22169a)) {
            return true;
        }
        i74Var.appendText(this.f82512e).appendText(C2473f.f17566z);
        this.f82510c.describeMismatch(uM22169a, i74Var);
        return false;
    }
}

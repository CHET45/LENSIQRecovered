package p000;

import com.blankj.utilcode.util.C2473f;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wdg extends lmh<String> {

    /* JADX INFO: renamed from: c */
    public final String f93998c;

    public wdg(String str) {
        this.f93998c = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo13905a(String str);

    /* JADX INFO: renamed from: b */
    public abstract String mo13906b();

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendText("a string ").appendText(mo13906b()).appendText(C2473f.f17566z).appendValue(this.f93998c);
    }

    @Override // p000.lmh
    public void describeMismatchSafely(String str, i74 i74Var) {
        i74Var.appendText("was \"").appendText(str).appendText("\"");
    }

    @Override // p000.lmh
    public boolean matchesSafely(String str) {
        return mo13905a(str);
    }
}

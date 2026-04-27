package p000;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@c5e(24)
public final class ff9 implements ef9 {

    /* JADX INFO: renamed from: a */
    public final LocaleList f36365a;

    public ff9(Object obj) {
        this.f36365a = (LocaleList) obj;
    }

    public boolean equals(Object obj) {
        return this.f36365a.equals(((ef9) obj).getLocaleList());
    }

    @Override // p000.ef9
    public Locale get(int i) {
        return this.f36365a.get(i);
    }

    @Override // p000.ef9
    @hib
    public Locale getFirstMatch(@efb String[] strArr) {
        return this.f36365a.getFirstMatch(strArr);
    }

    @Override // p000.ef9
    public Object getLocaleList() {
        return this.f36365a;
    }

    public int hashCode() {
        return this.f36365a.hashCode();
    }

    @Override // p000.ef9
    public int indexOf(Locale locale) {
        return this.f36365a.indexOf(locale);
    }

    @Override // p000.ef9
    public boolean isEmpty() {
        return this.f36365a.isEmpty();
    }

    @Override // p000.ef9
    public int size() {
        return this.f36365a.size();
    }

    @Override // p000.ef9
    public String toLanguageTags() {
        return this.f36365a.toLanguageTags();
    }

    public String toString() {
        return this.f36365a.toString();
    }
}

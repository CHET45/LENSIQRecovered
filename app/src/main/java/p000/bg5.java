package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class bg5 {

    /* JADX INFO: renamed from: a */
    public final List<yv9<?>> f13675a = new ArrayList();

    private yv9<Throwable> allOfTheMatchers() {
        return this.f13675a.size() == 1 ? cast(this.f13675a.get(0)) : l03.allOf(castedMatchers());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private yv9<Throwable> cast(yv9<?> yv9Var) {
        return yv9Var;
    }

    private List<yv9<? super Throwable>> castedMatchers() {
        return new ArrayList(this.f13675a);
    }

    /* JADX INFO: renamed from: a */
    public void m3163a(yv9<?> yv9Var) {
        this.f13675a.add(yv9Var);
    }

    /* JADX INFO: renamed from: b */
    public yv9<Throwable> m3164b() {
        return gi8.isThrowable(allOfTheMatchers());
    }

    /* JADX INFO: renamed from: c */
    public boolean m3165c() {
        return !this.f13675a.isEmpty();
    }
}

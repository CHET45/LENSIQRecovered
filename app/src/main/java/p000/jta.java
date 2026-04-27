package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
@ukd
@xqe("javax.inject.Singleton")
@se3
public final class jta implements go5<ita> {

    /* JADX INFO: renamed from: a */
    public final gid<Context> f51771a;

    /* JADX INFO: renamed from: b */
    public final gid<i63> f51772b;

    public jta(gid<Context> gidVar, gid<i63> gidVar2) {
        this.f51771a = gidVar;
        this.f51772b = gidVar2;
    }

    public static jta create(gid<Context> gidVar, gid<i63> gidVar2) {
        return new jta(gidVar, gidVar2);
    }

    public static ita newInstance(Context context, Object obj) {
        return new ita(context, (i63) obj);
    }

    @Override // p000.gid
    public ita get() {
        return newInstance(this.f51771a.get(), this.f51772b.get());
    }
}

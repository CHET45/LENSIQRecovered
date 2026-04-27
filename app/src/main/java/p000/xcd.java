package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
@te3
@yqe("javax.inject.Singleton")
@vkd
public final class xcd implements ho5<wcd> {

    /* JADX INFO: renamed from: a */
    public final gid<Context> f97527a;

    /* JADX INFO: renamed from: b */
    public final gid<n1i> f97528b;

    public xcd(gid<Context> gidVar, gid<n1i> gidVar2) {
        this.f97527a = gidVar;
        this.f97528b = gidVar2;
    }

    public static xcd create(gid<Context> gidVar, gid<n1i> gidVar2) {
        return new xcd(gidVar, gidVar2);
    }

    public static wcd newInstance(Context context, n1i n1iVar) {
        return new wcd(context, n1iVar);
    }

    @Override // p000.gid
    public wcd get() {
        return newInstance(this.f97527a.get(), this.f97528b.get());
    }
}

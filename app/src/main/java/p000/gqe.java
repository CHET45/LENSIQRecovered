package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
@ukd({"javax.inject.Named"})
@xqe
@se3
public final class gqe implements go5<fqe> {

    /* JADX INFO: renamed from: a */
    public final gid<Context> f40798a;

    /* JADX INFO: renamed from: b */
    public final gid<String> f40799b;

    /* JADX INFO: renamed from: c */
    public final gid<Integer> f40800c;

    public gqe(gid<Context> gidVar, gid<String> gidVar2, gid<Integer> gidVar3) {
        this.f40798a = gidVar;
        this.f40799b = gidVar2;
        this.f40800c = gidVar3;
    }

    public static gqe create(gid<Context> gidVar, gid<String> gidVar2, gid<Integer> gidVar3) {
        return new gqe(gidVar, gidVar2, gidVar3);
    }

    public static fqe newInstance(Context context, String str, int i) {
        return new fqe(context, str, i);
    }

    @Override // p000.gid
    public fqe get() {
        return newInstance(this.f40798a.get(), this.f40799b.get(), this.f40800c.get().intValue());
    }
}

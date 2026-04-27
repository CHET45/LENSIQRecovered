package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
@te3
@yqe("javax.inject.Singleton")
@vkd
public final class sd9 implements ho5<qd9> {

    /* JADX INFO: renamed from: a */
    public final gid<Context> f81370a;

    public sd9(gid<Context> gidVar) {
        this.f81370a = gidVar;
    }

    public static sd9 create(gid<Context> gidVar) {
        return new sd9(gidVar);
    }

    public static qd9 newInstance(Context context) {
        return new qd9(context);
    }

    @Override // p000.gid
    public qd9 get() {
        return newInstance(this.f81370a.get());
    }
}

package p000;

/* JADX INFO: loaded from: classes5.dex */
@te3
@yqe("javax.inject.Singleton")
@vkd
public final class y55 implements ho5<w55> {

    /* JADX INFO: renamed from: a */
    public final gid<eid<dhh>> f100418a;

    public y55(gid<eid<dhh>> gidVar) {
        this.f100418a = gidVar;
    }

    public static y55 create(gid<eid<dhh>> gidVar) {
        return new y55(gidVar);
    }

    public static w55 newInstance(eid<dhh> eidVar) {
        return new w55(eidVar);
    }

    @Override // p000.gid
    public w55 get() {
        return newInstance(this.f100418a.get());
    }
}

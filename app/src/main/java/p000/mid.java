package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class mid {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: mid$a */
    public class C9359a<T> implements fid<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gid f61079a;

        public C9359a(gid gidVar) {
            this.f61079a = gidVar;
        }

        @Override // p000.gid
        public T get() {
            return (T) this.f61079a.get();
        }
    }

    private mid() {
    }

    public static <T> fid<T> asDaggerProvider(gid<T> gidVar) {
        y7d.checkNotNull(gidVar);
        return new C9359a(gidVar);
    }
}

package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d9d {

    /* JADX INFO: renamed from: d9d$a */
    public static final class C4675a<T> {

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f28837a;

        public C4675a(@yfb String str) {
            md8.checkNotNullParameter(str, "name");
            this.f28837a = str;
        }

        public boolean equals(@gib Object obj) {
            if (obj instanceof C4675a) {
                return md8.areEqual(this.f28837a, ((C4675a) obj).f28837a);
            }
            return false;
        }

        @yfb
        public final String getName() {
            return this.f28837a;
        }

        public int hashCode() {
            return this.f28837a.hashCode();
        }

        @yfb
        /* JADX INFO: renamed from: to */
        public final C4676b<T> m8992to(T t) {
            return new C4676b<>(this, t);
        }

        @yfb
        public String toString() {
            return this.f28837a;
        }
    }

    /* JADX INFO: renamed from: d9d$b */
    public static final class C4676b<T> {

        /* JADX INFO: renamed from: a */
        @yfb
        public final C4675a<T> f28838a;

        /* JADX INFO: renamed from: b */
        public final T f28839b;

        public C4676b(@yfb C4675a<T> c4675a, T t) {
            md8.checkNotNullParameter(c4675a, "key");
            this.f28838a = c4675a;
            this.f28839b = t;
        }

        @yfb
        public final C4675a<T> getKey$datastore_preferences_core_release() {
            return this.f28838a;
        }

        public final T getValue$datastore_preferences_core_release() {
            return this.f28839b;
        }
    }

    @yfb
    public abstract Map<C4675a<?>, Object> asMap();

    public abstract <T> boolean contains(@yfb C4675a<T> c4675a);

    @gib
    public abstract <T> T get(@yfb C4675a<T> c4675a);

    @yfb
    public final i6b toMutablePreferences() {
        return new i6b(xt9.toMutableMap(asMap()), false);
    }

    @yfb
    public final d9d toPreferences() {
        return new i6b(xt9.toMutableMap(asMap()), true);
    }
}

package p000;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c3b {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final c3b f15691a = new c3b();

    /* JADX INFO: renamed from: c3b$a */
    public static final class C2184a extends tt8 implements qy6<File, m98> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x13 f15692a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2184a(x13 x13Var) {
            super(1);
            this.f15692a = x13Var;
        }

        @Override // p000.qy6
        @yfb
        public final m98 invoke(@yfb File file) {
            md8.checkNotNullParameter(file, "it");
            return new a3b(this.f15692a.getCoroutineContext(), file);
        }
    }

    private c3b() {
    }

    public static /* synthetic */ ai3 create$default(c3b c3bVar, f5g f5gVar, h2e h2eVar, List list, x13 x13Var, int i, Object obj) {
        if ((i & 2) != 0) {
            h2eVar = null;
        }
        if ((i & 4) != 0) {
            list = l82.emptyList();
        }
        if ((i & 8) != 0) {
            x13Var = y13.CoroutineScope(df4.getIO().plus(kfg.SupervisorJob$default((jj8) null, 1, (Object) null)));
        }
        return c3bVar.create(f5gVar, h2eVar, list, x13Var);
    }

    @yfb
    @yn8
    public final <T> ai3<T> create(@yfb w1f<T> w1fVar, @yfb ny6<? extends File> ny6Var) {
        md8.checkNotNullParameter(w1fVar, "serializer");
        md8.checkNotNullParameter(ny6Var, "produceFile");
        return create$default(this, w1fVar, null, null, null, ny6Var, 14, null);
    }

    @yfb
    @yn8
    public final <T> ai3<T> create(@yfb w1f<T> w1fVar, @gib h2e<T> h2eVar, @yfb ny6<? extends File> ny6Var) {
        md8.checkNotNullParameter(w1fVar, "serializer");
        md8.checkNotNullParameter(ny6Var, "produceFile");
        return create$default(this, w1fVar, h2eVar, null, null, ny6Var, 12, null);
    }

    @yfb
    @yn8
    public final <T> ai3<T> create(@yfb w1f<T> w1fVar, @gib h2e<T> h2eVar, @yfb List<? extends ug3<T>> list, @yfb ny6<? extends File> ny6Var) {
        md8.checkNotNullParameter(w1fVar, "serializer");
        md8.checkNotNullParameter(list, "migrations");
        md8.checkNotNullParameter(ny6Var, "produceFile");
        return create$default(this, w1fVar, h2eVar, list, null, ny6Var, 8, null);
    }

    public static /* synthetic */ ai3 create$default(c3b c3bVar, w1f w1fVar, h2e h2eVar, List list, x13 x13Var, ny6 ny6Var, int i, Object obj) {
        h2e h2eVar2 = (i & 2) != 0 ? null : h2eVar;
        if ((i & 4) != 0) {
            list = l82.emptyList();
        }
        List list2 = list;
        if ((i & 8) != 0) {
            x13Var = y13.CoroutineScope(df4.getIO().plus(kfg.SupervisorJob$default((jj8) null, 1, (Object) null)));
        }
        return c3bVar.create(w1fVar, h2eVar2, list2, x13Var, ny6Var);
    }

    @yfb
    @yn8
    public final <T> ai3<T> create(@yfb f5g<T> f5gVar) {
        md8.checkNotNullParameter(f5gVar, "storage");
        return create$default(this, f5gVar, null, null, null, 14, null);
    }

    @yfb
    @yn8
    public final <T> ai3<T> create(@yfb f5g<T> f5gVar, @gib h2e<T> h2eVar) {
        md8.checkNotNullParameter(f5gVar, "storage");
        return create$default(this, f5gVar, h2eVar, null, null, 12, null);
    }

    @yfb
    @yn8
    public final <T> ai3<T> create(@yfb f5g<T> f5gVar, @gib h2e<T> h2eVar, @yfb List<? extends ug3<T>> list) {
        md8.checkNotNullParameter(f5gVar, "storage");
        md8.checkNotNullParameter(list, "migrations");
        return create$default(this, f5gVar, h2eVar, list, null, 8, null);
    }

    @yfb
    @yn8
    public final <T> ai3<T> create(@yfb f5g<T> f5gVar, @gib h2e<T> h2eVar, @yfb List<? extends ug3<T>> list, @yfb x13 x13Var) {
        md8.checkNotNullParameter(f5gVar, "storage");
        md8.checkNotNullParameter(list, "migrations");
        md8.checkNotNullParameter(x13Var, "scope");
        List listListOf = k82.listOf(vg3.f91032a.getInitializer(list));
        if (h2eVar == null) {
            h2eVar = (h2e<T>) new rdb();
        }
        return new fi3(f5gVar, listListOf, h2eVar, x13Var);
    }

    @yfb
    @yn8
    public final <T> ai3<T> create(@yfb w1f<T> w1fVar, @gib h2e<T> h2eVar, @yfb List<? extends ug3<T>> list, @yfb x13 x13Var, @yfb ny6<? extends File> ny6Var) {
        md8.checkNotNullParameter(w1fVar, "serializer");
        md8.checkNotNullParameter(list, "migrations");
        md8.checkNotNullParameter(x13Var, "scope");
        md8.checkNotNullParameter(ny6Var, "produceFile");
        ht5 ht5Var = new ht5(w1fVar, new C2184a(x13Var), ny6Var);
        List listListOf = k82.listOf(vg3.f91032a.getInitializer(list));
        if (h2eVar == null) {
            h2eVar = (h2e<T>) new rdb();
        }
        return new fi3(ht5Var, listListOf, h2eVar, x13Var);
    }
}

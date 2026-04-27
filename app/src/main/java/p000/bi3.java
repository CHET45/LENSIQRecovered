package p000;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "DataStoreDelegateKt")
public final class bi3 {

    /* JADX INFO: renamed from: bi3$a */
    public static final class C1908a extends tt8 implements qy6<Context, List<? extends ug3<Object>>> {

        /* JADX INFO: renamed from: a */
        public static final C1908a f13781a = new C1908a();

        public C1908a() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final List<ug3<Object>> invoke(@yfb Context context) {
            md8.checkNotNullParameter(context, "it");
            return l82.emptyList();
        }
    }

    @yfb
    public static final <T> yqd<Context, ai3<T>> dataStore(@yfb String str, @yfb w1f<T> w1fVar, @gib h2e<T> h2eVar, @yfb qy6<? super Context, ? extends List<? extends ug3<T>>> qy6Var, @yfb x13 x13Var) {
        md8.checkNotNullParameter(str, "fileName");
        md8.checkNotNullParameter(w1fVar, "serializer");
        md8.checkNotNullParameter(qy6Var, "produceMigrations");
        md8.checkNotNullParameter(x13Var, "scope");
        return new hi3(str, new m1c(w1fVar), h2eVar, qy6Var, x13Var);
    }

    public static /* synthetic */ yqd dataStore$default(String str, w1f w1fVar, h2e h2eVar, qy6 qy6Var, x13 x13Var, int i, Object obj) {
        if ((i & 4) != 0) {
            h2eVar = null;
        }
        if ((i & 8) != 0) {
            qy6Var = C1908a.f13781a;
        }
        if ((i & 16) != 0) {
            x13Var = y13.CoroutineScope(df4.getIO().plus(kfg.SupervisorJob$default((jj8) null, 1, (Object) null)));
        }
        return dataStore(str, w1fVar, h2eVar, qy6Var, x13Var);
    }
}

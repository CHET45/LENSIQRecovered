package p000;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "PreferenceDataStoreDelegateKt")
public final class y8d {

    /* JADX INFO: renamed from: y8d$a */
    public static final class C15551a extends tt8 implements qy6<Context, List<? extends ug3<d9d>>> {

        /* JADX INFO: renamed from: a */
        public static final C15551a f100761a = new C15551a();

        public C15551a() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final List<ug3<d9d>> invoke(@yfb Context context) {
            md8.checkNotNullParameter(context, "it");
            return l82.emptyList();
        }
    }

    @yfb
    public static final yqd<Context, ai3<d9d>> preferencesDataStore(@yfb String str, @gib h2e<d9d> h2eVar, @yfb qy6<? super Context, ? extends List<? extends ug3<d9d>>> qy6Var, @yfb x13 x13Var) {
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(qy6Var, "produceMigrations");
        md8.checkNotNullParameter(x13Var, "scope");
        return new b9d(str, h2eVar, qy6Var, x13Var);
    }

    public static /* synthetic */ yqd preferencesDataStore$default(String str, h2e h2eVar, qy6 qy6Var, x13 x13Var, int i, Object obj) {
        if ((i & 2) != 0) {
            h2eVar = null;
        }
        if ((i & 4) != 0) {
            qy6Var = C15551a.f100761a;
        }
        if ((i & 8) != 0) {
            x13Var = y13.CoroutineScope(df4.getIO().plus(kfg.SupervisorJob$default((jj8) null, 1, (Object) null)));
        }
        return preferencesDataStore(str, h2eVar, qy6Var, x13Var);
    }
}

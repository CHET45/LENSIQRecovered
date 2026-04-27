package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q99 {

    /* JADX INFO: Add missing generic type declarations: [Original] */
    /* JADX INFO: renamed from: q99$a */
    @dwf({"SMAP\nListSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListSaver.kt\nandroidx/compose/runtime/saveable/ListSaverKt$listSaver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
    public static final class C11392a<Original> extends tt8 implements gz6<fme, Original, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<fme, Original, List<Saveable>> f73694a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11392a(gz6<? super fme, ? super Original, ? extends List<? extends Saveable>> gz6Var) {
            super(2);
            this.f73694a = gz6Var;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb fme fmeVar, Original original) {
            List list = (List) this.f73694a.invoke(fmeVar, original);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj != null && !fmeVar.canBeSaved(obj)) {
                    throw new IllegalArgumentException("item can't be saved");
                }
            }
            List list2 = list;
            if (list2.isEmpty()) {
                return null;
            }
            return new ArrayList(list2);
        }
    }

    @yfb
    public static final <Original, Saveable> dme<Original, Object> listSaver(@yfb gz6<? super fme, ? super Original, ? extends List<? extends Saveable>> gz6Var, @yfb qy6<? super List<? extends Saveable>, ? extends Original> qy6Var) {
        C11392a c11392a = new C11392a(gz6Var);
        md8.checkNotNull(qy6Var, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return eme.Saver(c11392a, (qy6) qlh.beforeCheckcastToFunctionOfArity(qy6Var, 1));
    }
}

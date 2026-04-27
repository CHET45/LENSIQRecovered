package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class s49 {

    /* JADX INFO: renamed from: s49$a */
    public interface InterfaceC12434a<T> {
        String extract(T t);
    }

    private s49() {
    }

    public static ej2<?> create(String str, String str2) {
        return ej2.intoSet(q49.m20066a(str, str2), (Class<q49>) q49.class);
    }

    public static ej2<?> fromContext(final String str, final InterfaceC12434a<Context> interfaceC12434a) {
        return ej2.intoSetBuilder(q49.class).add(i64.required((Class<?>) Context.class)).factory(new tj2() { // from class: r49
            @Override // p000.tj2
            public final Object create(mj2 mj2Var) {
                return s49.lambda$fromContext$0(str, interfaceC12434a, mj2Var);
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ q49 lambda$fromContext$0(String str, InterfaceC12434a interfaceC12434a, mj2 mj2Var) {
        return q49.m20066a(str, interfaceC12434a.extract((Context) mj2Var.get(Context.class)));
    }
}

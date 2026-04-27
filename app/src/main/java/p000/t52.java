package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class t52 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f83725a = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    @yfb
    public static final s52 asCloseable(@yfb x13 x13Var) {
        md8.checkNotNullParameter(x13Var, "<this>");
        return new s52(x13Var);
    }

    @yfb
    public static final s52 createViewModelScope() {
        e13 immediate;
        try {
            immediate = df4.getMain().getImmediate();
        } catch (IllegalStateException unused) {
            immediate = a05.f2a;
        } catch (wfb unused2) {
            immediate = a05.f2a;
        }
        return new s52(immediate.plus(kfg.SupervisorJob$default((jj8) null, 1, (Object) null)));
    }
}

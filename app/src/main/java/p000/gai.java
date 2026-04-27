package p000;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/ViewModelKt\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n36#2,2:229\n23#3:231\n1#4:232\n*S KotlinDebug\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/ViewModelKt\n*L\n222#1:229,2\n222#1:231\n*E\n"})
public final class gai {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final big f39168a = new big();

    @yfb
    public static final x13 getViewModelScope(@yfb cai caiVar) {
        s52 s52VarCreateViewModelScope;
        md8.checkNotNullParameter(caiVar, "<this>");
        synchronized (f39168a) {
            s52VarCreateViewModelScope = (s52) caiVar.getCloseable(t52.f83725a);
            if (s52VarCreateViewModelScope == null) {
                s52VarCreateViewModelScope = t52.createViewModelScope();
                caiVar.addCloseable(t52.f83725a, s52VarCreateViewModelScope);
            }
        }
        return s52VarCreateViewModelScope;
    }
}

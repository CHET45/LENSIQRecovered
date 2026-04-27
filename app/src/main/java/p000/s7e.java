package p000;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
public abstract class s7e extends tq0 {
    public s7e(@gib zy2<Object> zy2Var) {
        super(zy2Var);
        if (zy2Var != null && zy2Var.getContext() != a05.f2a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p000.zy2
    @yfb
    public e13 getContext() {
        return a05.f2a;
    }
}

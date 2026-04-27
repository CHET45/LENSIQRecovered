package p000;

/* JADX INFO: renamed from: k1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC8162k1<T, R> extends m86<R> implements eh7<T> {

    /* JADX INFO: renamed from: b */
    public final m86<T> f52360b;

    public AbstractC8162k1(m86<T> m86Var) {
        this.f52360b = (m86) xjb.requireNonNull(m86Var, "source is null");
    }

    @Override // p000.eh7
    public final zjd<T> source() {
        return this.f52360b;
    }
}

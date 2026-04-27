package p000;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public class b82<T> implements bbd<T> {

    /* JADX INFO: renamed from: b */
    public static final int f12948b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Collection<T> f12949a;

    /* JADX WARN: Multi-variable type inference failed */
    public b82(@yfb Collection<? extends T> collection) {
        this.f12949a = collection;
    }

    @Override // p000.bbd
    @yfb
    public vye<T> getValues() {
        return v82.asSequence(this.f12949a);
    }
}

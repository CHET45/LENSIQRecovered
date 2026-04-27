package p000;

import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class av2<T> extends AbstractC0012a2<T> {

    /* JADX INFO: renamed from: c */
    public final Queue<T> f11915c;

    public av2(Queue<T> queue) {
        this.f11915c = (Queue) v7d.checkNotNull(queue);
    }

    @Override // p000.AbstractC0012a2
    @wx1
    public T computeNext() {
        return this.f11915c.isEmpty() ? m25a() : this.f11915c.remove();
    }
}

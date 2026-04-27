package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public abstract class i2b<E> extends AbstractSet<E> {

    /* JADX INFO: renamed from: a */
    public final Map<E, ?> f45553a;

    /* JADX INFO: renamed from: b */
    public final Object f45554b;

    /* JADX INFO: renamed from: i2b$a */
    public class C7122a extends AbstractC0012a2<E> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Iterator f45555c;

        public C7122a(final Iterator val$entries) {
            this.f45555c = val$entries;
        }

        @Override // p000.AbstractC0012a2
        @wx1
        public E computeNext() {
            while (this.f45555c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f45555c.next();
                if (i2b.this.f45554b.equals(entry.getValue())) {
                    return (E) entry.getKey();
                }
            }
            return m25a();
        }
    }

    public i2b(Map<E, ?> outEdgeToNode, Object targetNode) {
        this.f45553a = (Map) v7d.checkNotNull(outEdgeToNode);
        this.f45554b = v7d.checkNotNull(targetNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@wx1 Object edge) {
        return this.f45554b.equals(this.f45553a.get(edge));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public quh<E> iterator() {
        return new C7122a(this.f45553a.entrySet().iterator());
    }
}

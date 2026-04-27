package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public class ex7<K, V> extends AbstractC13818v2<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    @dgc
    public final K f34356a;

    /* JADX INFO: renamed from: b */
    @dgc
    public final V f34357b;

    public ex7(@dgc K key, @dgc V value) {
        this.f34356a = key;
        this.f34357b = value;
    }

    @Override // p000.AbstractC13818v2, java.util.Map.Entry
    @dgc
    public final K getKey() {
        return this.f34356a;
    }

    @Override // p000.AbstractC13818v2, java.util.Map.Entry
    @dgc
    public final V getValue() {
        return this.f34357b;
    }

    @Override // p000.AbstractC13818v2, java.util.Map.Entry
    @dgc
    public final V setValue(@dgc V value) {
        throw new UnsupportedOperationException();
    }
}

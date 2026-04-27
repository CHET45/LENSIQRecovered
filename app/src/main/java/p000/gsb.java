package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class gsb<V> implements erd<Object, V> {

    /* JADX INFO: renamed from: a */
    public V f40946a;

    public gsb(V v) {
        this.f40946a = v;
    }

    /* JADX INFO: renamed from: a */
    public void mo11837a(@yfb hp8<?> hp8Var, V v, V v2) {
        md8.checkNotNullParameter(hp8Var, "property");
    }

    /* JADX INFO: renamed from: b */
    public boolean mo11838b(@yfb hp8<?> hp8Var, V v, V v2) {
        md8.checkNotNullParameter(hp8Var, "property");
        return true;
    }

    @Override // p000.erd, p000.yqd
    public V getValue(@gib Object obj, @yfb hp8<?> hp8Var) {
        md8.checkNotNullParameter(hp8Var, "property");
        return this.f40946a;
    }

    @Override // p000.erd
    public void setValue(@gib Object obj, @yfb hp8<?> hp8Var, V v) {
        md8.checkNotNullParameter(hp8Var, "property");
        V v2 = this.f40946a;
        if (mo11838b(hp8Var, v2, v)) {
            this.f40946a = v;
            mo11837a(hp8Var, v2, v);
        }
    }

    @yfb
    public String toString() {
        return "ObservableProperty(value=" + this.f40946a + ')';
    }
}

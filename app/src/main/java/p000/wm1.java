package p000;

/* JADX INFO: loaded from: classes4.dex */
public final class wm1<K, V> extends x60<K, V> {

    /* JADX INFO: renamed from: m */
    public int f94719m;

    @Override // p000.scf, java.util.Map
    public void clear() {
        this.f94719m = 0;
        super.clear();
    }

    @Override // p000.scf, java.util.Map
    public int hashCode() {
        if (this.f94719m == 0) {
            this.f94719m = super.hashCode();
        }
        return this.f94719m;
    }

    @Override // p000.scf, java.util.Map
    public V put(K k, V v) {
        this.f94719m = 0;
        return (V) super.put(k, v);
    }

    @Override // p000.scf
    public void putAll(scf<? extends K, ? extends V> scfVar) {
        this.f94719m = 0;
        super.putAll(scfVar);
    }

    @Override // p000.scf
    public V removeAt(int i) {
        this.f94719m = 0;
        return (V) super.removeAt(i);
    }

    @Override // p000.scf
    public V setValueAt(int i, V v) {
        this.f94719m = 0;
        return (V) super.setValueAt(i, v);
    }
}

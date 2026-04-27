package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class wl1 implements Map.Entry<String, d84> {

    /* JADX INFO: renamed from: a */
    public final String f94584a;

    /* JADX INFO: renamed from: b */
    public final g84 f94585b;

    public wl1(String str, g84 g84Var) {
        this.f94584a = str;
        this.f94585b = g84Var;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl1)) {
            return false;
        }
        wl1 wl1Var = (wl1) obj;
        return this.f94584a.equals(wl1Var.getKey()) && this.f94585b.equals(wl1Var.f94585b);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (this.f94584a.hashCode() * 31) + this.f94585b.hashCode();
    }

    @Override // java.util.Map.Entry
    public String getKey() {
        return this.f94584a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map.Entry
    public d84 getValue() {
        return this.f94585b.get();
    }

    @Override // java.util.Map.Entry
    public d84 setValue(d84 d84Var) {
        throw new UnsupportedOperationException("Not implemented");
    }
}

package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class zfb<T> implements erd<Object, T> {

    /* JADX INFO: renamed from: a */
    @gib
    public T f105006a;

    @Override // p000.erd, p000.yqd
    @yfb
    public T getValue(@gib Object obj, @yfb hp8<?> hp8Var) {
        md8.checkNotNullParameter(hp8Var, "property");
        T t = this.f105006a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + hp8Var.getName() + " should be initialized before get.");
    }

    @Override // p000.erd
    public void setValue(@gib Object obj, @yfb hp8<?> hp8Var, @yfb T t) {
        md8.checkNotNullParameter(hp8Var, "property");
        md8.checkNotNullParameter(t, "value");
        this.f105006a = t;
    }

    @yfb
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("NotNullProperty(");
        if (this.f105006a != null) {
            str = "value=" + this.f105006a;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}

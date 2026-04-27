package p000;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@gd7
@ux4
public abstract class l55 {

    /* JADX INFO: renamed from: a */
    public final lz6<String, String> f56196a = new lz6() { // from class: k55
        @Override // p000.lz6
        public final Object apply(Object obj) {
            return this.f52600a.escape((String) obj);
        }
    };

    public final lz6<String, String> asFunction() {
        return this.f56196a;
    }

    public abstract String escape(String string);
}

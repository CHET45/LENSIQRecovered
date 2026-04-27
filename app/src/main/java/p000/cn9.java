package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class cn9 {

    /* JADX INFO: renamed from: b */
    public static final cn9 f17077b = new cn9();

    /* JADX INFO: renamed from: a */
    public final pp9<String, bn9> f17078a = new pp9<>(20);

    @fdi
    public cn9() {
    }

    public static cn9 getInstance() {
        return f17077b;
    }

    public void clear() {
        this.f17078a.evictAll();
    }

    @hib
    public bn9 get(@hib String str) {
        if (str == null) {
            return null;
        }
        return this.f17078a.get(str);
    }

    public void put(@hib String str, bn9 bn9Var) {
        if (str == null) {
            return;
        }
        this.f17078a.put(str, bn9Var);
    }

    public void resize(int i) {
        this.f17078a.resize(i);
    }
}

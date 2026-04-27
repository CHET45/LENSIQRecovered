package p000;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class d2i<K, A> extends nr0<K, A> {

    /* JADX INFO: renamed from: i */
    public final A f28296i;

    public d2i(bp9<A> bp9Var) {
        this(bp9Var, null);
    }

    @Override // p000.nr0
    /* JADX INFO: renamed from: b */
    public float mo8864b() {
        return 1.0f;
    }

    @Override // p000.nr0
    public A getValue() {
        bp9<A> bp9Var = this.f65337e;
        A a = this.f28296i;
        return bp9Var.getValueInternal(0.0f, 0.0f, a, a, getProgress(), getProgress(), getProgress());
    }

    @Override // p000.nr0
    public void notifyListeners() {
        if (this.f65337e != null) {
            super.notifyListeners();
        }
    }

    @Override // p000.nr0
    public void setProgress(float f) {
        this.f65336d = f;
    }

    public d2i(bp9<A> bp9Var, @hib A a) {
        super(Collections.emptyList());
        setValueCallback(bp9Var);
        this.f28296i = a;
    }

    @Override // p000.nr0
    public A getValue(hs8<K> hs8Var, float f) {
        return getValue();
    }
}

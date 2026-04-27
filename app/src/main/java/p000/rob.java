package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class rob<T> extends ss0 implements Serializable {
    static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b */
    public T f78867b;

    public rob(T t) {
        this.f78867b = t;
    }

    @hib
    public T get() {
        return this.f78867b;
    }

    public void set(T t) {
        if (t != this.f78867b) {
            this.f78867b = t;
            notifyChange();
        }
    }

    public rob() {
    }

    public rob(tkb... tkbVarArr) {
        super(tkbVarArr);
    }
}

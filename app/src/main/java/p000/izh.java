package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public final class izh extends s7c<Object> implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final izh f49170c = new izh();
    private static final long serialVersionUID = 0;

    private izh() {
    }

    private Object readResolve() {
        return f49170c;
    }

    @Override // p000.s7c, java.util.Comparator
    public int compare(Object left, Object right) {
        return left.toString().compareTo(right.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}

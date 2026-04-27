package p000;

import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public class f05 extends gy7<Object, Object> {

    /* JADX INFO: renamed from: L */
    public static final f05 f34629L = new f05();
    private static final long serialVersionUID = 0;

    private f05() {
        super(ox7.m19076of(), 0, null);
    }

    private Object readResolve() {
        return f34629L;
    }

    @Override // p000.ux7, p000.AbstractC2173c3, p000.u3b
    public ox7<Object, Collection<Object>> asMap() {
        return super.asMap();
    }
}

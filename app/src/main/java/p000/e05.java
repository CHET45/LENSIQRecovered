package p000;

import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public class e05 extends mx7<Object, Object> {

    /* JADX INFO: renamed from: F */
    public static final e05 f31418F = new e05();
    private static final long serialVersionUID = 0;

    private e05() {
        super(ox7.m19076of(), 0);
    }

    private Object readResolve() {
        return f31418F;
    }

    @Override // p000.ux7, p000.AbstractC2173c3, p000.u3b
    public ox7<Object, Collection<Object>> asMap() {
        return super.asMap();
    }
}

package p000;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a9b implements jj9, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    /* JADX INFO: renamed from: a */
    public String f730a;

    @Override // p000.jj9
    public String getName() {
        return this.f730a;
    }

    public Object readResolve() throws ObjectStreamException {
        return kj9.getLogger(getName());
    }
}

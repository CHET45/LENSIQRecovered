package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class f2i implements vye<e2i> {

    /* JADX INFO: renamed from: b */
    public static final int f34941b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<e2i> f34942a = new ArrayList();

    @Override // p000.vye
    @yfb
    public Iterator<e2i> iterator() {
        return this.f34942a.iterator();
    }

    public final void set(@yfb String str, @gib Object obj) {
        this.f34942a.add(new e2i(str, obj));
    }
}

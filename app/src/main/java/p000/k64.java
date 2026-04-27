package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class k64 extends n64 {

    /* JADX INFO: renamed from: a */
    public final List<ej2<?>> f52643a;

    public k64(List<ej2<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f52643a = list;
    }

    public List<ej2<?>> getComponentsInCycle() {
        return this.f52643a;
    }
}

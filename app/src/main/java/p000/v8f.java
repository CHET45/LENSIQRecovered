package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class v8f implements sw2 {

    /* JADX INFO: renamed from: a */
    public final String f90344a;

    /* JADX INFO: renamed from: b */
    public final List<sw2> f90345b;

    /* JADX INFO: renamed from: c */
    public final boolean f90346c;

    public v8f(String str, List<sw2> list, boolean z) {
        this.f90344a = str;
        this.f90345b = list;
        this.f90346c = z;
    }

    public List<sw2> getItems() {
        return this.f90345b;
    }

    public String getName() {
        return this.f90344a;
    }

    public boolean isHidden() {
        return this.f90346c;
    }

    @Override // p000.sw2
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        return new pv2(go9Var, pr0Var, this);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f90344a + "' Shapes: " + Arrays.toString(this.f90345b.toArray()) + '}';
    }
}

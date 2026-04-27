package p000;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class eo2 {

    /* JADX INFO: renamed from: a */
    public final List<yih> f33708a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m10164a(yih yihVar) {
        this.f33708a.add(yihVar);
    }

    public void apply(Path path) {
        for (int size = this.f33708a.size() - 1; size >= 0; size--) {
            e1i.applyTrimPathIfNeeded(path, this.f33708a.get(size));
        }
    }
}

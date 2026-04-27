package p000;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class iv9 {

    /* JADX INFO: renamed from: a */
    public final List<nr0<r8f, Path>> f48550a;

    /* JADX INFO: renamed from: b */
    public final List<nr0<Integer, Integer>> f48551b;

    /* JADX INFO: renamed from: c */
    public final List<ev9> f48552c;

    public iv9(List<ev9> list) {
        this.f48552c = list;
        this.f48550a = new ArrayList(list.size());
        this.f48551b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f48550a.add(list.get(i).getMaskPath().createAnimation());
            this.f48551b.add(list.get(i).getOpacity().createAnimation());
        }
    }

    public List<nr0<r8f, Path>> getMaskAnimations() {
        return this.f48550a;
    }

    public List<ev9> getMasks() {
        return this.f48552c;
    }

    public List<nr0<Integer, Integer>> getOpacityAnimations() {
        return this.f48551b;
    }
}

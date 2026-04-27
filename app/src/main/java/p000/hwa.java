package p000;

import java.util.List;
import p000.er9;

/* JADX INFO: loaded from: classes7.dex */
@la8
public final class hwa implements er9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final hwa f45142a = new hwa();

    private hwa() {
    }

    @Override // p000.er9
    @yfb
    public dr9 createDispatcher(@yfb List<? extends er9> list) {
        return new gwa(null, null, 2, null);
    }

    @Override // p000.er9
    public int getLoadPriority() {
        return -1;
    }

    @Override // p000.er9
    @gib
    public String hintOnError() {
        return er9.C5447a.hintOnError(this);
    }
}

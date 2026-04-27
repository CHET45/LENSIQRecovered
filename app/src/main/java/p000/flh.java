package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class flh implements xdg {

    /* JADX INFO: renamed from: b */
    public static final flh f37091b = new flh();

    /* JADX INFO: renamed from: a */
    public final List<o93> f37092a;

    public flh(o93 o93Var) {
        this.f37092a = Collections.singletonList(o93Var);
    }

    @Override // p000.xdg
    public List<o93> getCues(long j) {
        return j >= 0 ? this.f37092a : Collections.emptyList();
    }

    @Override // p000.xdg
    public long getEventTime(int i) {
        u80.checkArgument(i == 0);
        return 0L;
    }

    @Override // p000.xdg
    public int getEventTimeCount() {
        return 1;
    }

    @Override // p000.xdg
    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }

    private flh() {
        this.f37092a = Collections.emptyList();
    }
}

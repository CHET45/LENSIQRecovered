package p000;

import android.util.SparseArray;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class reg implements bk5 {

    /* JADX INFO: renamed from: a */
    public final bk5 f78118a;

    /* JADX INFO: renamed from: b */
    public final peg.InterfaceC10936a f78119b;

    /* JADX INFO: renamed from: c */
    public final SparseArray<teg> f78120c = new SparseArray<>();

    /* JADX INFO: renamed from: d */
    public boolean f78121d;

    public reg(bk5 bk5Var, peg.InterfaceC10936a interfaceC10936a) {
        this.f78118a = bk5Var;
        this.f78119b = interfaceC10936a;
    }

    @Override // p000.bk5
    public void endTracks() {
        this.f78118a.endTracks();
        if (this.f78121d) {
            for (int i = 0; i < this.f78120c.size(); i++) {
                this.f78120c.valueAt(i).shouldSuppressParsingErrors(true);
            }
        }
    }

    public void resetSubtitleParsers() {
        for (int i = 0; i < this.f78120c.size(); i++) {
            this.f78120c.valueAt(i).resetSubtitleParser();
        }
    }

    @Override // p000.bk5
    public void seekMap(gue gueVar) {
        this.f78118a.seekMap(gueVar);
    }

    @Override // p000.bk5
    public q6h track(int i, int i2) {
        if (i2 != 3) {
            this.f78121d = true;
            return this.f78118a.track(i, i2);
        }
        teg tegVar = this.f78120c.get(i);
        if (tegVar != null) {
            return tegVar;
        }
        teg tegVar2 = new teg(this.f78118a.track(i, i2), this.f78119b);
        this.f78120c.put(i, tegVar2);
        return tegVar2;
    }
}

package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class tt1 extends wki {

    /* JADX INFO: renamed from: k */
    public ArrayList<wki> f85803k;

    /* JADX INFO: renamed from: l */
    public int f85804l;

    public tt1(iu2 iu2Var, int i) {
        super(iu2Var);
        this.f85803k = new ArrayList<>();
        this.f94567f = i;
        build();
    }

    private void build() {
        iu2 iu2Var;
        iu2 iu2Var2 = this.f94563b;
        iu2 previousChainMember = iu2Var2.getPreviousChainMember(this.f94567f);
        while (true) {
            iu2 iu2Var3 = previousChainMember;
            iu2Var = iu2Var2;
            iu2Var2 = iu2Var3;
            if (iu2Var2 == null) {
                break;
            } else {
                previousChainMember = iu2Var2.getPreviousChainMember(this.f94567f);
            }
        }
        this.f94563b = iu2Var;
        this.f85803k.add(iu2Var.getRun(this.f94567f));
        iu2 nextChainMember = iu2Var.getNextChainMember(this.f94567f);
        while (nextChainMember != null) {
            this.f85803k.add(nextChainMember.getRun(this.f94567f));
            nextChainMember = nextChainMember.getNextChainMember(this.f94567f);
        }
        for (wki wkiVar : this.f85803k) {
            int i = this.f94567f;
            if (i == 0) {
                wkiVar.f94563b.f48378c = this;
            } else if (i == 1) {
                wkiVar.f94563b.f48380d = this;
            }
        }
        if (this.f94567f == 0 && ((ju2) this.f94563b.getParent()).isRtl() && this.f85803k.size() > 1) {
            ArrayList<wki> arrayList = this.f85803k;
            this.f94563b = arrayList.get(arrayList.size() - 1).f94563b;
        }
        this.f85804l = this.f94567f == 0 ? this.f94563b.getHorizontalChainStyle() : this.f94563b.getVerticalChainStyle();
    }

    private iu2 getFirstVisibleWidget() {
        for (int i = 0; i < this.f85803k.size(); i++) {
            wki wkiVar = this.f85803k.get(i);
            if (wkiVar.f94563b.getVisibility() != 8) {
                return wkiVar.f94563b;
            }
        }
        return null;
    }

    private iu2 getLastVisibleWidget() {
        for (int size = this.f85803k.size() - 1; size >= 0; size--) {
            wki wkiVar = this.f85803k.get(size);
            if (wkiVar.f94563b.getVisibility() != 8) {
                return wkiVar.f94563b;
            }
        }
        return null;
    }

    @Override // p000.wki
    public void applyToWidget() {
        for (int i = 0; i < this.f85803k.size(); i++) {
            this.f85803k.get(i).applyToWidget();
        }
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: c */
    public void mo9896c() {
        Iterator<wki> it = this.f85803k.iterator();
        while (it.hasNext()) {
            it.next().mo9896c();
        }
        int size = this.f85803k.size();
        if (size < 1) {
            return;
        }
        iu2 iu2Var = this.f85803k.get(0).f94563b;
        iu2 iu2Var2 = this.f85803k.get(size - 1).f94563b;
        if (this.f94567f == 0) {
            cu2 cu2Var = iu2Var.f48360Q;
            cu2 cu2Var2 = iu2Var2.f48364S;
            p64 p64VarM24641g = m24641g(cu2Var, 0);
            int margin = cu2Var.getMargin();
            iu2 firstVisibleWidget = getFirstVisibleWidget();
            if (firstVisibleWidget != null) {
                margin = firstVisibleWidget.f48360Q.getMargin();
            }
            if (p64VarM24641g != null) {
                m24637a(this.f94569h, p64VarM24641g, margin);
            }
            p64 p64VarM24641g2 = m24641g(cu2Var2, 0);
            int margin2 = cu2Var2.getMargin();
            iu2 lastVisibleWidget = getLastVisibleWidget();
            if (lastVisibleWidget != null) {
                margin2 = lastVisibleWidget.f48364S.getMargin();
            }
            if (p64VarM24641g2 != null) {
                m24637a(this.f94570i, p64VarM24641g2, -margin2);
            }
        } else {
            cu2 cu2Var3 = iu2Var.f48362R;
            cu2 cu2Var4 = iu2Var2.f48366T;
            p64 p64VarM24641g3 = m24641g(cu2Var3, 1);
            int margin3 = cu2Var3.getMargin();
            iu2 firstVisibleWidget2 = getFirstVisibleWidget();
            if (firstVisibleWidget2 != null) {
                margin3 = firstVisibleWidget2.f48362R.getMargin();
            }
            if (p64VarM24641g3 != null) {
                m24637a(this.f94569h, p64VarM24641g3, margin3);
            }
            p64 p64VarM24641g4 = m24641g(cu2Var4, 1);
            int margin4 = cu2Var4.getMargin();
            iu2 lastVisibleWidget2 = getLastVisibleWidget();
            if (lastVisibleWidget2 != null) {
                margin4 = lastVisibleWidget2.f48366T.getMargin();
            }
            if (p64VarM24641g4 != null) {
                m24637a(this.f94570i, p64VarM24641g4, -margin4);
            }
        }
        this.f94569h.f69817a = this;
        this.f94570i.f69817a = this;
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: d */
    public void mo9897d() {
        this.f94564c = null;
        Iterator<wki> it = this.f85803k.iterator();
        while (it.hasNext()) {
            it.next().mo9897d();
        }
    }

    @Override // p000.wki
    public long getWrapDimension() {
        int size = this.f85803k.size();
        long wrapDimension = 0;
        for (int i = 0; i < size; i++) {
            wki wkiVar = this.f85803k.get(i);
            wrapDimension = wrapDimension + ((long) wkiVar.f94569h.f69822f) + wkiVar.getWrapDimension() + ((long) wkiVar.f94570i.f69822f);
        }
        return wrapDimension;
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: h */
    public void mo9898h() {
        this.f94569h.f69826j = false;
        this.f94570i.f69826j = false;
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: i */
    public boolean mo9899i() {
        int size = this.f85803k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f85803k.get(i).mo9899i()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f94567f == 0 ? "horizontal : " : "vertical : ");
        for (wki wkiVar : this.f85803k) {
            sb.append("<");
            sb.append(wkiVar);
            sb.append("> ");
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0153  */
    @Override // p000.wki, p000.j64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void update(p000.j64 r27) {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tt1.update(j64):void");
    }
}

package p000;

import java.util.Iterator;
import p000.p64;

/* JADX INFO: loaded from: classes.dex */
public class pj7 extends wki {
    public pj7(iu2 iu2Var) {
        super(iu2Var);
    }

    private void addDependency(p64 p64Var) {
        this.f94569h.f69827k.add(p64Var);
        p64Var.f69828l.add(this.f94569h);
    }

    @Override // p000.wki
    public void applyToWidget() {
        iu2 iu2Var = this.f94563b;
        if (iu2Var instanceof zp0) {
            int barrierType = ((zp0) iu2Var).getBarrierType();
            if (barrierType == 0 || barrierType == 1) {
                this.f94563b.setX(this.f94569h.f69823g);
            } else {
                this.f94563b.setY(this.f94569h.f69823g);
            }
        }
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: c */
    public void mo9896c() {
        iu2 iu2Var = this.f94563b;
        if (iu2Var instanceof zp0) {
            this.f94569h.f69818b = true;
            zp0 zp0Var = (zp0) iu2Var;
            int barrierType = zp0Var.getBarrierType();
            boolean allowsGoneWidget = zp0Var.getAllowsGoneWidget();
            int i = 0;
            if (barrierType == 0) {
                this.f94569h.f69821e = p64.EnumC10807a.LEFT;
                while (i < zp0Var.f74597B1) {
                    iu2 iu2Var2 = zp0Var.f74596A1[i];
                    if (allowsGoneWidget || iu2Var2.getVisibility() != 8) {
                        p64 p64Var = iu2Var2.f48382e.f94569h;
                        p64Var.f69827k.add(this.f94569h);
                        this.f94569h.f69828l.add(p64Var);
                    }
                    i++;
                }
                addDependency(this.f94563b.f48382e.f94569h);
                addDependency(this.f94563b.f48382e.f94570i);
                return;
            }
            if (barrierType == 1) {
                this.f94569h.f69821e = p64.EnumC10807a.RIGHT;
                while (i < zp0Var.f74597B1) {
                    iu2 iu2Var3 = zp0Var.f74596A1[i];
                    if (allowsGoneWidget || iu2Var3.getVisibility() != 8) {
                        p64 p64Var2 = iu2Var3.f48382e.f94570i;
                        p64Var2.f69827k.add(this.f94569h);
                        this.f94569h.f69828l.add(p64Var2);
                    }
                    i++;
                }
                addDependency(this.f94563b.f48382e.f94569h);
                addDependency(this.f94563b.f48382e.f94570i);
                return;
            }
            if (barrierType == 2) {
                this.f94569h.f69821e = p64.EnumC10807a.TOP;
                while (i < zp0Var.f74597B1) {
                    iu2 iu2Var4 = zp0Var.f74596A1[i];
                    if (allowsGoneWidget || iu2Var4.getVisibility() != 8) {
                        p64 p64Var3 = iu2Var4.f48384f.f94569h;
                        p64Var3.f69827k.add(this.f94569h);
                        this.f94569h.f69828l.add(p64Var3);
                    }
                    i++;
                }
                addDependency(this.f94563b.f48384f.f94569h);
                addDependency(this.f94563b.f48384f.f94570i);
                return;
            }
            if (barrierType != 3) {
                return;
            }
            this.f94569h.f69821e = p64.EnumC10807a.BOTTOM;
            while (i < zp0Var.f74597B1) {
                iu2 iu2Var5 = zp0Var.f74596A1[i];
                if (allowsGoneWidget || iu2Var5.getVisibility() != 8) {
                    p64 p64Var4 = iu2Var5.f48384f.f94570i;
                    p64Var4.f69827k.add(this.f94569h);
                    this.f94569h.f69828l.add(p64Var4);
                }
                i++;
            }
            addDependency(this.f94563b.f48384f.f94569h);
            addDependency(this.f94563b.f48384f.f94570i);
        }
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: d */
    public void mo9897d() {
        this.f94564c = null;
        this.f94569h.clear();
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: h */
    public void mo9898h() {
        this.f94569h.f69826j = false;
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: i */
    public boolean mo9899i() {
        return false;
    }

    @Override // p000.wki, p000.j64
    public void update(j64 j64Var) {
        zp0 zp0Var = (zp0) this.f94563b;
        int barrierType = zp0Var.getBarrierType();
        Iterator<p64> it = this.f94569h.f69828l.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = it.next().f69823g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (barrierType == 0 || barrierType == 2) {
            this.f94569h.resolve(i2 + zp0Var.getMargin());
        } else {
            this.f94569h.resolve(i + zp0Var.getMargin());
        }
    }
}

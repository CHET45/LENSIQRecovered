package p000;

/* JADX INFO: loaded from: classes.dex */
public class ed7 extends wki {
    public ed7(iu2 iu2Var) {
        super(iu2Var);
        iu2Var.f48382e.mo9897d();
        iu2Var.f48384f.mo9897d();
        this.f94567f = ((dd7) iu2Var).getOrientation();
    }

    private void addDependency(p64 p64Var) {
        this.f94569h.f69827k.add(p64Var);
        p64Var.f69828l.add(this.f94569h);
    }

    @Override // p000.wki
    public void applyToWidget() {
        if (((dd7) this.f94563b).getOrientation() == 1) {
            this.f94563b.setX(this.f94569h.f69823g);
        } else {
            this.f94563b.setY(this.f94569h.f69823g);
        }
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: c */
    public void mo9896c() {
        dd7 dd7Var = (dd7) this.f94563b;
        int relativeBegin = dd7Var.getRelativeBegin();
        int relativeEnd = dd7Var.getRelativeEnd();
        dd7Var.getRelativePercent();
        if (dd7Var.getOrientation() == 1) {
            if (relativeBegin != -1) {
                this.f94569h.f69828l.add(this.f94563b.f48379c0.f48382e.f94569h);
                this.f94563b.f48379c0.f48382e.f94569h.f69827k.add(this.f94569h);
                this.f94569h.f69822f = relativeBegin;
            } else if (relativeEnd != -1) {
                this.f94569h.f69828l.add(this.f94563b.f48379c0.f48382e.f94570i);
                this.f94563b.f48379c0.f48382e.f94570i.f69827k.add(this.f94569h);
                this.f94569h.f69822f = -relativeEnd;
            } else {
                p64 p64Var = this.f94569h;
                p64Var.f69818b = true;
                p64Var.f69828l.add(this.f94563b.f48379c0.f48382e.f94570i);
                this.f94563b.f48379c0.f48382e.f94570i.f69827k.add(this.f94569h);
            }
            addDependency(this.f94563b.f48382e.f94569h);
            addDependency(this.f94563b.f48382e.f94570i);
            return;
        }
        if (relativeBegin != -1) {
            this.f94569h.f69828l.add(this.f94563b.f48379c0.f48384f.f94569h);
            this.f94563b.f48379c0.f48384f.f94569h.f69827k.add(this.f94569h);
            this.f94569h.f69822f = relativeBegin;
        } else if (relativeEnd != -1) {
            this.f94569h.f69828l.add(this.f94563b.f48379c0.f48384f.f94570i);
            this.f94563b.f48379c0.f48384f.f94570i.f69827k.add(this.f94569h);
            this.f94569h.f69822f = -relativeEnd;
        } else {
            p64 p64Var2 = this.f94569h;
            p64Var2.f69818b = true;
            p64Var2.f69828l.add(this.f94563b.f48379c0.f48384f.f94570i);
            this.f94563b.f48379c0.f48384f.f94570i.f69827k.add(this.f94569h);
        }
        addDependency(this.f94563b.f48384f.f94569h);
        addDependency(this.f94563b.f48384f.f94570i);
    }

    @Override // p000.wki
    /* JADX INFO: renamed from: d */
    public void mo9897d() {
        this.f94569h.clear();
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
        return false;
    }

    @Override // p000.wki, p000.j64
    public void update(j64 j64Var) {
        p64 p64Var = this.f94569h;
        if (p64Var.f69819c && !p64Var.f69826j) {
            this.f94569h.resolve((int) ((p64Var.f69828l.get(0).f69823g * ((dd7) this.f94563b).getRelativePercent()) + 0.5f));
        }
    }
}

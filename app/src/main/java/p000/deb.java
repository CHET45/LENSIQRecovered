package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class deb {

    /* JADX INFO: renamed from: a */
    public deb f29522a = null;

    /* JADX INFO: renamed from: b */
    public deb f29523b = null;

    /* JADX INFO: renamed from: c */
    public deb f29524c = null;

    /* JADX INFO: renamed from: d */
    public deb f29525d = null;

    /* JADX INFO: renamed from: e */
    public deb f29526e = null;

    /* JADX INFO: renamed from: a */
    public void mo2946a(deb debVar) {
        this.f29522a = debVar;
    }

    public abstract void accept(idi idiVar);

    public void appendChild(deb debVar) {
        debVar.unlink();
        debVar.mo2946a(this);
        deb debVar2 = this.f29524c;
        if (debVar2 == null) {
            this.f29523b = debVar;
            this.f29524c = debVar;
        } else {
            debVar2.f29526e = debVar;
            debVar.f29525d = debVar2;
            this.f29524c = debVar;
        }
    }

    /* JADX INFO: renamed from: b */
    public String mo9110b() {
        return "";
    }

    public deb getFirstChild() {
        return this.f29523b;
    }

    public deb getLastChild() {
        return this.f29524c;
    }

    public deb getNext() {
        return this.f29526e;
    }

    public deb getParent() {
        return this.f29522a;
    }

    public deb getPrevious() {
        return this.f29525d;
    }

    public void insertAfter(deb debVar) {
        debVar.unlink();
        deb debVar2 = this.f29526e;
        debVar.f29526e = debVar2;
        if (debVar2 != null) {
            debVar2.f29525d = debVar;
        }
        debVar.f29525d = this;
        this.f29526e = debVar;
        deb debVar3 = this.f29522a;
        debVar.f29522a = debVar3;
        if (debVar.f29526e == null) {
            debVar3.f29524c = debVar;
        }
    }

    public void insertBefore(deb debVar) {
        debVar.unlink();
        deb debVar2 = this.f29525d;
        debVar.f29525d = debVar2;
        if (debVar2 != null) {
            debVar2.f29526e = debVar;
        }
        debVar.f29526e = this;
        this.f29525d = debVar;
        deb debVar3 = this.f29522a;
        debVar.f29522a = debVar3;
        if (debVar.f29525d == null) {
            debVar3.f29523b = debVar;
        }
    }

    public void prependChild(deb debVar) {
        debVar.unlink();
        debVar.mo2946a(this);
        deb debVar2 = this.f29523b;
        if (debVar2 == null) {
            this.f29523b = debVar;
            this.f29524c = debVar;
        } else {
            debVar2.f29525d = debVar;
            debVar.f29526e = debVar2;
            this.f29523b = debVar;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + mo9110b() + "}";
    }

    public void unlink() {
        deb debVar = this.f29525d;
        if (debVar != null) {
            debVar.f29526e = this.f29526e;
        } else {
            deb debVar2 = this.f29522a;
            if (debVar2 != null) {
                debVar2.f29523b = this.f29526e;
            }
        }
        deb debVar3 = this.f29526e;
        if (debVar3 != null) {
            debVar3.f29525d = debVar;
        } else {
            deb debVar4 = this.f29522a;
            if (debVar4 != null) {
                debVar4.f29524c = debVar;
            }
        }
        this.f29522a = null;
        this.f29526e = null;
        this.f29525d = null;
    }
}

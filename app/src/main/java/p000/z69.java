package p000;

/* JADX INFO: loaded from: classes8.dex */
public class z69 extends deb {

    /* JADX INFO: renamed from: f */
    public String f104287f;

    /* JADX INFO: renamed from: g */
    public String f104288g;

    public z69() {
    }

    @Override // p000.deb
    public void accept(idi idiVar) {
        idiVar.visit(this);
    }

    @Override // p000.deb
    /* JADX INFO: renamed from: b */
    public String mo9110b() {
        return "destination=" + this.f104287f + ", title=" + this.f104288g;
    }

    public String getDestination() {
        return this.f104287f;
    }

    public String getTitle() {
        return this.f104288g;
    }

    public void setDestination(String str) {
        this.f104287f = str;
    }

    public void setTitle(String str) {
        this.f104288g = str;
    }

    public z69(String str, String str2) {
        this.f104287f = str;
        this.f104288g = str2;
    }
}

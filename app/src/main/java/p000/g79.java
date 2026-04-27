package p000;

/* JADX INFO: loaded from: classes8.dex */
public class g79 extends deb {

    /* JADX INFO: renamed from: f */
    public String f38950f;

    /* JADX INFO: renamed from: g */
    public String f38951g;

    /* JADX INFO: renamed from: h */
    public String f38952h;

    public g79() {
    }

    @Override // p000.deb
    public void accept(idi idiVar) {
        idiVar.visit(this);
    }

    public String getDestination() {
        return this.f38951g;
    }

    public String getLabel() {
        return this.f38950f;
    }

    public String getTitle() {
        return this.f38952h;
    }

    public void setDestination(String str) {
        this.f38951g = str;
    }

    public void setLabel(String str) {
        this.f38950f = str;
    }

    public void setTitle(String str) {
        this.f38952h = str;
    }

    public g79(String str, String str2, String str3) {
        this.f38950f = str;
        this.f38951g = str2;
        this.f38952h = str3;
    }
}

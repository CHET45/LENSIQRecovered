package p000;

/* JADX INFO: loaded from: classes8.dex */
public class os7 extends deb {

    /* JADX INFO: renamed from: f */
    public String f68555f;

    /* JADX INFO: renamed from: g */
    public String f68556g;

    public os7() {
    }

    @Override // p000.deb
    public void accept(idi idiVar) {
        idiVar.visit(this);
    }

    @Override // p000.deb
    /* JADX INFO: renamed from: b */
    public String mo9110b() {
        return "destination=" + this.f68555f + ", title=" + this.f68556g;
    }

    public String getDestination() {
        return this.f68555f;
    }

    public String getTitle() {
        return this.f68556g;
    }

    public void setDestination(String str) {
        this.f68555f = str;
    }

    public void setTitle(String str) {
        this.f68556g = str;
    }

    public os7(String str, String str2) {
        this.f68555f = str;
        this.f68556g = str2;
    }
}

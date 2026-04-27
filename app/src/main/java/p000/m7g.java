package p000;

/* JADX INFO: loaded from: classes8.dex */
public class m7g extends wdg {
    public m7g(String str) {
        super(str);
    }

    @io5
    public static yv9<String> containsString(String str) {
        return new m7g(str);
    }

    @Override // p000.wdg
    /* JADX INFO: renamed from: a */
    public boolean mo13905a(String str) {
        return str.indexOf(this.f93998c) >= 0;
    }

    @Override // p000.wdg
    /* JADX INFO: renamed from: b */
    public String mo13906b() {
        return "containing";
    }
}

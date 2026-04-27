package p000;

/* JADX INFO: loaded from: classes8.dex */
public class j8g extends wdg {
    public j8g(String str) {
        super(str);
    }

    @io5
    public static yv9<String> startsWith(String str) {
        return new j8g(str);
    }

    @Override // p000.wdg
    /* JADX INFO: renamed from: a */
    public boolean mo13905a(String str) {
        return str.startsWith(this.f93998c);
    }

    @Override // p000.wdg
    /* JADX INFO: renamed from: b */
    public String mo13906b() {
        return "starting with";
    }
}

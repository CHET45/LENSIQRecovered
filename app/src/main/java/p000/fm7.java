package p000;

/* JADX INFO: loaded from: classes7.dex */
public class fm7 {

    /* JADX INFO: renamed from: a */
    public static final String f37104a = "￼";

    /* JADX INFO: renamed from: b */
    public static final String f37105b = " ";

    @efb
    public static fm7 create() {
        return new fm7();
    }

    @hib
    public String replace(@efb nm7 nm7Var) {
        String strName = nm7Var.name();
        if ("br".equals(strName)) {
            return "\n";
        }
        if ("img".equals(strName)) {
            String str = nm7Var.attributes().get("alt");
            return (str == null || str.length() == 0) ? f37104a : str;
        }
        if ("iframe".equals(strName)) {
            return f37105b;
        }
        return null;
    }
}

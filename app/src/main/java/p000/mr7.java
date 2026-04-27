package p000;

import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mr7 {

    /* JADX INFO: renamed from: a */
    public static final String f61784a = "";

    /* JADX INFO: renamed from: b */
    public static final File f61785b = new File("");

    @efb
    /* JADX INFO: renamed from: a */
    public abstract File mo4084a();

    public boolean compareIgnoreId(mr7 mr7Var) {
        if (!getUrl().equals(mr7Var.getUrl()) || getUrl().equals("") || getParentFile().equals(f61785b)) {
            return false;
        }
        if (mo4084a().equals(mr7Var.mo4084a())) {
            return true;
        }
        if (!getParentFile().equals(mr7Var.getParentFile())) {
            return false;
        }
        String filename = getFilename();
        String filename2 = mr7Var.getFilename();
        return (filename2 == null || filename == null || !filename2.equals(filename)) ? false : true;
    }

    @hib
    public abstract String getFilename();

    public abstract int getId();

    @efb
    public abstract File getParentFile();

    @efb
    public abstract String getUrl();
}

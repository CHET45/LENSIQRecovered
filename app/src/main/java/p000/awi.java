package p000;

import android.content.res.AssetManager;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class awi {

    /* JADX INFO: renamed from: a */
    public AssetManager f12045a;

    /* JADX INFO: renamed from: b */
    public String f12046b;

    /* JADX INFO: renamed from: c */
    public String f12047c;

    public awi(AssetManager assetManager, String str, String str2) {
        this.f12045a = assetManager;
        this.f12046b = str2;
        this.f12047c = str;
    }

    /* JADX INFO: renamed from: a */
    private Set<String> m2713a(String str) {
        HashSet hashSet = new HashSet();
        try {
            String[] list = this.f12045a.list(str);
            if (list != null) {
                for (String str2 : list) {
                    if (!str.isEmpty()) {
                        str2 = str + pj4.f71071b + str2;
                    }
                    hashSet.add(str2);
                    hashSet.addAll(m2713a(str2));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public void m2716a() {
        m2715a(new File(this.f12046b), this.f12047c, m2713a(this.f12047c));
    }

    /* JADX INFO: renamed from: a */
    private void m2714a(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                m2714a(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: a */
    private void m2715a(File file, String str, Set<String> set) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                String name = str.isEmpty() ? file2.getName() : str + pj4.f71071b + file2.getName();
                if (!set.contains(name)) {
                    m2714a(file2);
                } else if (file2.isDirectory()) {
                    m2715a(file2, name, set);
                }
            }
        }
    }
}

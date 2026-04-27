package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class j4a implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public final Map<String, Long> f49512a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map<String, Long> f49513b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final File f49514c;

    /* JADX INFO: renamed from: j4a$b */
    public final class C7734b extends ade {

        /* JADX INFO: renamed from: a */
        public long f49515a;

        /* JADX INFO: renamed from: b */
        public Map<j74, Long> f49516b;

        private C7734b() {
            this.f49515a = System.currentTimeMillis();
            this.f49516b = new HashMap();
        }

        @Override // p000.ade
        public void testFailure(fp5 fp5Var) throws Exception {
            j4a.this.m13729f(fp5Var.getDescription(), this.f49515a);
        }

        @Override // p000.ade
        public void testFinished(j74 j74Var) throws Exception {
            j4a.this.m13728e(j74Var, System.nanoTime() - this.f49516b.get(j74Var).longValue());
        }

        @Override // p000.ade
        public void testRunFinished(w7e w7eVar) throws Exception {
            j4a.this.save();
        }

        @Override // p000.ade
        public void testStarted(j74 j74Var) throws Exception {
            this.f49516b.put(j74Var, Long.valueOf(System.nanoTime()));
        }
    }

    /* JADX INFO: renamed from: j4a$c */
    public class C7735c implements Comparator<j74> {
        private C7735c() {
        }

        private Long getFailure(j74 j74Var) {
            Long lM13725b = j4a.this.m13725b(j74Var);
            if (lM13725b == null) {
                return 0L;
            }
            return lM13725b;
        }

        @Override // java.util.Comparator
        public int compare(j74 j74Var, j74 j74Var2) {
            if (j4a.this.m13727d(j74Var)) {
                return -1;
            }
            if (j4a.this.m13727d(j74Var2)) {
                return 1;
            }
            int iCompareTo = getFailure(j74Var2).compareTo(getFailure(j74Var));
            return iCompareTo != 0 ? iCompareTo : j4a.this.m13726c(j74Var).compareTo(j4a.this.m13726c(j74Var2));
        }
    }

    private j4a(File file) {
        this.f49514c = file;
    }

    public static j4a forFolder(File file) {
        if (file.exists()) {
            try {
                return readHistory(file);
            } catch (f23 e) {
                e.printStackTrace();
                file.delete();
            }
        }
        return new j4a(file);
    }

    private static j4a readHistory(File file) throws f23 {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    return (j4a) objectInputStream.readObject();
                } finally {
                    objectInputStream.close();
                }
            } finally {
                fileInputStream.close();
            }
        } catch (Exception e) {
            throw new f23(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void save() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.f49514c));
        objectOutputStream.writeObject(this);
        objectOutputStream.close();
    }

    /* JADX INFO: renamed from: b */
    public Long m13725b(j74 j74Var) {
        return this.f49513b.get(j74Var.toString());
    }

    /* JADX INFO: renamed from: c */
    public Long m13726c(j74 j74Var) {
        return this.f49512a.get(j74Var.toString());
    }

    /* JADX INFO: renamed from: d */
    public boolean m13727d(j74 j74Var) {
        return !this.f49512a.containsKey(j74Var.toString());
    }

    /* JADX INFO: renamed from: e */
    public void m13728e(j74 j74Var, long j) {
        this.f49512a.put(j74Var.toString(), Long.valueOf(j));
    }

    /* JADX INFO: renamed from: f */
    public void m13729f(j74 j74Var, long j) {
        this.f49513b.put(j74Var.toString(), Long.valueOf(j));
    }

    public ade listener() {
        return new C7734b();
    }

    public Comparator<j74> testComparator() {
        return new C7735c();
    }
}

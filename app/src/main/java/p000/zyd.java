package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@sx4
@gd7
public abstract class zyd {

    /* JADX INFO: renamed from: a */
    public static final zyd f106515a = new C16316a("EXPLICIT", 0);

    /* JADX INFO: renamed from: b */
    public static final zyd f106516b = new zyd("REPLACED", 1) { // from class: zyd.b
        {
            C16316a c16316a = null;
        }

        @Override // p000.zyd
        /* JADX INFO: renamed from: a */
        public boolean mo27150a() {
            return false;
        }
    };

    /* JADX INFO: renamed from: c */
    public static final zyd f106517c = new zyd("COLLECTED", 2) { // from class: zyd.c
        {
            C16316a c16316a = null;
        }

        @Override // p000.zyd
        /* JADX INFO: renamed from: a */
        public boolean mo27150a() {
            return true;
        }
    };

    /* JADX INFO: renamed from: d */
    public static final zyd f106518d = new zyd("EXPIRED", 3) { // from class: zyd.d
        {
            C16316a c16316a = null;
        }

        @Override // p000.zyd
        /* JADX INFO: renamed from: a */
        public boolean mo27150a() {
            return true;
        }
    };

    /* JADX INFO: renamed from: e */
    public static final zyd f106519e = new zyd("SIZE", 4) { // from class: zyd.e
        {
            C16316a c16316a = null;
        }

        @Override // p000.zyd
        /* JADX INFO: renamed from: a */
        public boolean mo27150a() {
            return true;
        }
    };

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ zyd[] f106520f = $values();

    /* JADX INFO: renamed from: zyd$a */
    public enum C16316a extends zyd {
        public C16316a(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }

        @Override // p000.zyd
        /* JADX INFO: renamed from: a */
        public boolean mo27150a() {
            return false;
        }
    }

    private static /* synthetic */ zyd[] $values() {
        return new zyd[]{f106515a, f106516b, f106517c, f106518d, f106519e};
    }

    private zyd(String $enum$name, int $enum$ordinal) {
    }

    public static zyd valueOf(String name) {
        return (zyd) Enum.valueOf(zyd.class, name);
    }

    public static zyd[] values() {
        return (zyd[]) f106520f.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo27150a();

    public /* synthetic */ zyd(String str, int i, C16316a c16316a) {
        this(str, i);
    }
}

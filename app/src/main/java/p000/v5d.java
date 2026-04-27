package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class v5d {

    /* JADX INFO: renamed from: v5d$a */
    public static class C13878a extends v5d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f90027a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f90028b;

        public C13878a(Object obj, String str) {
            this.f90027a = obj;
            this.f90028b = str;
        }

        @Override // p000.v5d
        public String getDescription() {
            String str;
            Object obj = this.f90027a;
            if (obj == null) {
                str = "null";
            } else {
                try {
                    str = String.format("\"%s\"", obj);
                } catch (Throwable th) {
                    str = String.format("[toString() threw %s: %s]", th.getClass().getSimpleName(), th.getMessage());
                }
            }
            return String.format("%s <from %s>", str, this.f90028b);
        }

        @Override // p000.v5d
        public Object getValue() {
            return this.f90027a;
        }

        public String toString() {
            return String.format("[%s]", this.f90027a);
        }
    }

    /* JADX INFO: renamed from: v5d$b */
    public static class C13879b extends Exception {
        private static final long serialVersionUID = 1;

        public C13879b() {
        }

        public C13879b(Throwable th) {
            super(th);
        }
    }

    public static v5d forValue(String str, Object obj) {
        return new C13878a(obj, str);
    }

    public abstract String getDescription() throws C13879b;

    public abstract Object getValue() throws C13879b;
}

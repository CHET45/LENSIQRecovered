package p000;

/* JADX INFO: loaded from: classes8.dex */
public interface i74 {

    /* JADX INFO: renamed from: a */
    public static final i74 f45895a = new C7170a();

    /* JADX INFO: renamed from: i74$a */
    public static final class C7170a implements i74 {
        @Override // p000.i74
        public i74 appendDescriptionOf(ixe ixeVar) {
            return this;
        }

        @Override // p000.i74
        public i74 appendList(String str, String str2, String str3, Iterable<? extends ixe> iterable) {
            return this;
        }

        @Override // p000.i74
        public i74 appendText(String str) {
            return this;
        }

        @Override // p000.i74
        public i74 appendValue(Object obj) {
            return this;
        }

        @Override // p000.i74
        public <T> i74 appendValueList(String str, String str2, String str3, T... tArr) {
            return this;
        }

        public String toString() {
            return "";
        }

        @Override // p000.i74
        public <T> i74 appendValueList(String str, String str2, String str3, Iterable<T> iterable) {
            return this;
        }
    }

    i74 appendDescriptionOf(ixe ixeVar);

    i74 appendList(String str, String str2, String str3, Iterable<? extends ixe> iterable);

    i74 appendText(String str);

    i74 appendValue(Object obj);

    <T> i74 appendValueList(String str, String str2, String str3, Iterable<T> iterable);

    <T> i74 appendValueList(String str, String str2, String str3, T... tArr);
}

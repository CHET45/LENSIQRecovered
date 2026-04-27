package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ajh {

    /* JADX INFO: renamed from: ajh$a */
    public static class C0293a extends ajh {
        @Override // p000.ajh
        /* JADX INFO: renamed from: a */
        public <T extends Appendable & CharSequence> void mo841a(@efb T t, @efb String str) {
            int length;
            T t2 = t;
            int length2 = t2.length();
            int length3 = str.length();
            boolean z = false;
            for (int i = 0; i < length3; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isWhitespace(cCharAt)) {
                    z = true;
                } else {
                    if (z && (length = t2.length()) > 0 && !Character.isWhitespace(t2.charAt(length - 1))) {
                        i40.m12766a(t, ' ');
                    }
                    i40.m12766a(t, cCharAt);
                    z = false;
                }
            }
            if (!z || length2 >= t2.length()) {
                return;
            }
            i40.m12766a(t, ' ');
        }
    }

    @efb
    /* JADX INFO: renamed from: b */
    public static ajh m840b() {
        return new C0293a();
    }

    /* JADX INFO: renamed from: a */
    public abstract <T extends Appendable & CharSequence> void mo841a(@efb T t, @efb String str);
}

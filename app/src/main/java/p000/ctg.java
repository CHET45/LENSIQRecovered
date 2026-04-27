package p000;

/* JADX INFO: loaded from: classes4.dex */
public final class ctg {

    /* JADX INFO: renamed from: ctg$a */
    public class C4497a implements InterfaceC4499c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vj1 f27540a;

        public C4497a(final vj1 val$input) {
            this.f27540a = val$input;
        }

        @Override // p000.ctg.InterfaceC4499c
        public byte byteAt(int offset) {
            return this.f27540a.byteAt(offset);
        }

        @Override // p000.ctg.InterfaceC4499c
        public int size() {
            return this.f27540a.size();
        }
    }

    /* JADX INFO: renamed from: ctg$b */
    public class C4498b implements InterfaceC4499c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ byte[] f27541a;

        public C4498b(final byte[] val$input) {
            this.f27541a = val$input;
        }

        @Override // p000.ctg.InterfaceC4499c
        public byte byteAt(int offset) {
            return this.f27541a[offset];
        }

        @Override // p000.ctg.InterfaceC4499c
        public int size() {
            return this.f27541a.length;
        }
    }

    /* JADX INFO: renamed from: ctg$c */
    public interface InterfaceC4499c {
        byte byteAt(int offset);

        int size();
    }

    private ctg() {
    }

    /* JADX INFO: renamed from: a */
    public static String m8687a(final vj1 input) {
        return m8688b(new C4497a(input));
    }

    /* JADX INFO: renamed from: b */
    public static String m8688b(InterfaceC4499c input) {
        StringBuilder sb = new StringBuilder(input.size());
        for (int i = 0; i < input.size(); i++) {
            byte bByteAt = input.byteAt(i);
            if (bByteAt == 34) {
                sb.append("\\\"");
            } else if (bByteAt == 39) {
                sb.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m8689c(final byte[] input) {
        return m8688b(new C4498b(input));
    }

    /* JADX INFO: renamed from: d */
    public static String m8690d(String input) {
        return input.replace(nk1.f64796h, "\\\\").replace("\"", "\\\"");
    }

    /* JADX INFO: renamed from: e */
    public static String m8691e(String input) {
        return m8687a(vj1.copyFromUtf8(input));
    }
}

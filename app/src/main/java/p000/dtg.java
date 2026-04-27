package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class dtg {

    /* JADX INFO: renamed from: dtg$a */
    public class C4944a implements InterfaceC4946c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wj1 f30855a;

        public C4944a(final wj1 val$input) {
            this.f30855a = val$input;
        }

        @Override // p000.dtg.InterfaceC4946c
        public byte byteAt(int offset) {
            return this.f30855a.byteAt(offset);
        }

        @Override // p000.dtg.InterfaceC4946c
        public int size() {
            return this.f30855a.size();
        }
    }

    /* JADX INFO: renamed from: dtg$b */
    public class C4945b implements InterfaceC4946c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ byte[] f30856a;

        public C4945b(final byte[] val$input) {
            this.f30856a = val$input;
        }

        @Override // p000.dtg.InterfaceC4946c
        public byte byteAt(int offset) {
            return this.f30856a[offset];
        }

        @Override // p000.dtg.InterfaceC4946c
        public int size() {
            return this.f30856a.length;
        }
    }

    /* JADX INFO: renamed from: dtg$c */
    public interface InterfaceC4946c {
        byte byteAt(int offset);

        int size();
    }

    private dtg() {
    }

    /* JADX INFO: renamed from: a */
    public static String m9359a(final wj1 input) {
        return m9360b(new C4944a(input));
    }

    /* JADX INFO: renamed from: b */
    public static String m9360b(InterfaceC4946c input) {
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
    public static String m9361c(final byte[] input) {
        return m9360b(new C4945b(input));
    }

    /* JADX INFO: renamed from: d */
    public static String m9362d(String input) {
        return input.replace(nk1.f64796h, "\\\\").replace("\"", "\\\"");
    }

    /* JADX INFO: renamed from: e */
    public static String m9363e(String input) {
        return m9359a(wj1.copyFromUtf8(input));
    }
}

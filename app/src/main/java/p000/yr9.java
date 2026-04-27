package p000;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class yr9 implements xpe {

    /* JADX INFO: renamed from: b */
    public static final nsa f102757b = new C15779a();

    /* JADX INFO: renamed from: a */
    public final nsa f102758a;

    /* JADX INFO: renamed from: yr9$a */
    public class C15779a implements nsa {
        @Override // p000.nsa
        public boolean isSupported(Class<?> clazz) {
            return false;
        }

        @Override // p000.nsa
        public lsa messageInfoFor(Class<?> clazz) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: renamed from: yr9$b */
    public static /* synthetic */ class C15780b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f102759a;

        static {
            int[] iArr = new int[ihd.values().length];
            f102759a = iArr;
            try {
                iArr[ihd.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: yr9$c */
    public static class C15781c implements nsa {

        /* JADX INFO: renamed from: a */
        public nsa[] f102760a;

        public C15781c(nsa... factories) {
            this.f102760a = factories;
        }

        @Override // p000.nsa
        public boolean isSupported(Class<?> clazz) {
            for (nsa nsaVar : this.f102760a) {
                if (nsaVar.isSupported(clazz)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000.nsa
        public lsa messageInfoFor(Class<?> clazz) {
            for (nsa nsaVar : this.f102760a) {
                if (nsaVar.isSupported(clazz)) {
                    return nsaVar.messageInfoFor(clazz);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + clazz.getName());
        }
    }

    public yr9() {
        this(getDefaultMessageInfoFactory());
    }

    private static boolean allowExtensions(lsa messageInfo) {
        return C15780b.f102759a[messageInfo.getSyntax().ordinal()] != 1;
    }

    private static nsa getDefaultMessageInfoFactory() {
        return new C15781c(t27.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static nsa getDescriptorMessageInfoFactory() {
        if (lhd.f57633d) {
            return f102757b;
        }
        try {
            return (nsa) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f102757b;
        }
    }

    private static <T> upe<T> newSchema(Class<T> messageType, lsa messageInfo) {
        if (useLiteRuntime(messageType)) {
            return vsa.m24177c(messageType, messageInfo, rcb.m21165b(), b99.m3003b(), iqe.unknownFieldSetLiteSchema(), allowExtensions(messageInfo) ? gj5.m11705b() : null, zs9.m27068b());
        }
        return vsa.m24177c(messageType, messageInfo, rcb.m21164a(), b99.m3002a(), iqe.unknownFieldSetFullSchema(), allowExtensions(messageInfo) ? gj5.m11704a() : null, zs9.m27067a());
    }

    private static boolean useLiteRuntime(Class<?> messageType) {
        return lhd.f57633d || u27.class.isAssignableFrom(messageType);
    }

    @Override // p000.xpe
    public <T> upe<T> createSchema(Class<T> messageType) {
        iqe.requireGeneratedMessage(messageType);
        lsa lsaVarMessageInfoFor = this.f102758a.messageInfoFor(messageType);
        return lsaVarMessageInfoFor.isMessageSetWireFormat() ? useLiteRuntime(messageType) ? ysa.m26351a(iqe.unknownFieldSetLiteSchema(), gj5.m11705b(), lsaVarMessageInfoFor.getDefaultInstance()) : ysa.m26351a(iqe.unknownFieldSetFullSchema(), gj5.m11704a(), lsaVarMessageInfoFor.getDefaultInstance()) : newSchema(messageType, lsaVarMessageInfoFor);
    }

    private yr9(nsa messageInfoFactory) {
        this.f102758a = (nsa) v98.m23882b(messageInfoFactory, "messageInfoFactory");
    }
}

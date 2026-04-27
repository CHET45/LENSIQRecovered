package p000;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class zr9 implements wpe {

    /* JADX INFO: renamed from: b */
    public static final msa f105827b = new C16226a();

    /* JADX INFO: renamed from: a */
    public final msa f105828a;

    /* JADX INFO: renamed from: zr9$a */
    public class C16226a implements msa {
        @Override // p000.msa
        public boolean isSupported(Class<?> clazz) {
            return false;
        }

        @Override // p000.msa
        public ksa messageInfoFor(Class<?> clazz) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: renamed from: zr9$b */
    public static /* synthetic */ class C16227b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105829a;

        static {
            int[] iArr = new int[hhd.values().length];
            f105829a = iArr;
            try {
                iArr[hhd.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: zr9$c */
    public static class C16228c implements msa {

        /* JADX INFO: renamed from: a */
        public msa[] f105830a;

        public C16228c(msa... factories) {
            this.f105830a = factories;
        }

        @Override // p000.msa
        public boolean isSupported(Class<?> clazz) {
            for (msa msaVar : this.f105830a) {
                if (msaVar.isSupported(clazz)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000.msa
        public ksa messageInfoFor(Class<?> clazz) {
            for (msa msaVar : this.f105830a) {
                if (msaVar.isSupported(clazz)) {
                    return msaVar.messageInfoFor(clazz);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + clazz.getName());
        }
    }

    public zr9() {
        this(getDefaultMessageInfoFactory());
    }

    private static boolean allowExtensions(ksa messageInfo) {
        return C16227b.f105829a[messageInfo.getSyntax().ordinal()] != 1;
    }

    private static msa getDefaultMessageInfoFactory() {
        return new C16228c(s27.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static msa getDescriptorMessageInfoFactory() {
        try {
            return (msa) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f105827b;
        }
    }

    private static <T> tpe<T> newSchema(Class<T> messageType, ksa messageInfo) {
        return v27.class.isAssignableFrom(messageType) ? allowExtensions(messageInfo) ? wsa.m24803c(messageType, messageInfo, qcb.m20260b(), y89.m25699b(), hqe.unknownFieldSetLiteSchema(), fj5.m10946b(), ys9.m26350b()) : wsa.m24803c(messageType, messageInfo, qcb.m20260b(), y89.m25699b(), hqe.unknownFieldSetLiteSchema(), null, ys9.m26350b()) : allowExtensions(messageInfo) ? wsa.m24803c(messageType, messageInfo, qcb.m20259a(), y89.m25698a(), hqe.unknownFieldSetFullSchema(), fj5.m10945a(), ys9.m26349a()) : wsa.m24803c(messageType, messageInfo, qcb.m20259a(), y89.m25698a(), hqe.unknownFieldSetFullSchema(), null, ys9.m26349a());
    }

    @Override // p000.wpe
    public <T> tpe<T> createSchema(Class<T> messageType) {
        hqe.requireGeneratedMessage(messageType);
        ksa ksaVarMessageInfoFor = this.f105828a.messageInfoFor(messageType);
        return ksaVarMessageInfoFor.isMessageSetWireFormat() ? v27.class.isAssignableFrom(messageType) ? xsa.m25443a(hqe.unknownFieldSetLiteSchema(), fj5.m10946b(), ksaVarMessageInfoFor.getDefaultInstance()) : xsa.m25443a(hqe.unknownFieldSetFullSchema(), fj5.m10945a(), ksaVarMessageInfoFor.getDefaultInstance()) : newSchema(messageType, ksaVarMessageInfoFor);
    }

    private zr9(msa messageInfoFactory) {
        this.f105828a = (msa) w98.m24433b(messageInfoFactory, "messageInfoFactory");
    }
}

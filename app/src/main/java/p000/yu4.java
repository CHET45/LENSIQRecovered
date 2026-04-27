package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class yu4 extends isd {

    /* JADX INFO: renamed from: e */
    public static final int f102982e = 8;

    /* JADX INFO: renamed from: c */
    @yfb
    public final osd f102983c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final nsd f102984d = new C15809a();

    /* JADX INFO: renamed from: yu4$a */
    public static final class C15809a implements nsd {

        /* JADX INFO: renamed from: a */
        public int f102985a;

        public C15809a() {
        }

        @Override // p000.nsd
        public void onDragEnd() {
            yu4.this.getReceiveContentNode().getReceiveContentListener().onDragEnd();
            this.f102985a = 0;
        }

        @Override // p000.nsd
        public void onDragEnter() {
            int i = this.f102985a + 1;
            this.f102985a = i;
            if (i == 1) {
                yu4.this.getReceiveContentNode().getReceiveContentListener().onDragEnter();
            }
            nsd parentReceiveContentListener = yu4.this.getParentReceiveContentListener();
            if (parentReceiveContentListener != null) {
                parentReceiveContentListener.onDragEnter();
            }
        }

        @Override // p000.nsd
        public void onDragExit() {
            int i = this.f102985a;
            int iCoerceAtLeast = kpd.coerceAtLeast(i - 1, 0);
            this.f102985a = iCoerceAtLeast;
            if (iCoerceAtLeast == 0 && i > 0) {
                yu4.this.getReceiveContentNode().getReceiveContentListener().onDragExit();
            }
            nsd parentReceiveContentListener = yu4.this.getParentReceiveContentListener();
            if (parentReceiveContentListener != null) {
                parentReceiveContentListener.onDragExit();
            }
        }

        @Override // p000.nsd
        public void onDragStart() {
            this.f102985a = 0;
            yu4.this.getReceiveContentNode().getReceiveContentListener().onDragStart();
        }

        @Override // p000.nsd
        @gib
        public sdh onReceive(@yfb sdh sdhVar) {
            sdh sdhVarOnReceive = yu4.this.getReceiveContentNode().getReceiveContentListener().onReceive(sdhVar);
            if (sdhVarOnReceive == null) {
                return null;
            }
            nsd parentReceiveContentListener = yu4.this.getParentReceiveContentListener();
            return parentReceiveContentListener == null ? sdhVarOnReceive : parentReceiveContentListener.onReceive(sdhVarOnReceive);
        }
    }

    public yu4(@yfb osd osdVar) {
        this.f102983c = osdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nsd getParentReceiveContentListener() {
        isd receiveContentConfiguration = ksd.getReceiveContentConfiguration(this.f102983c);
        if (receiveContentConfiguration != null) {
            return receiveContentConfiguration.getReceiveContentListener();
        }
        return null;
    }

    @Override // p000.isd
    @yfb
    public nsd getReceiveContentListener() {
        return this.f102984d;
    }

    @yfb
    public final osd getReceiveContentNode() {
        return this.f102983c;
    }
}

package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class ish {

    /* JADX INFO: renamed from: g */
    public static final int f48156g = 8;

    /* JADX INFO: renamed from: a */
    public final int f48157a;

    /* JADX INFO: renamed from: b */
    @gib
    public C7587a f48158b;

    /* JADX INFO: renamed from: c */
    @gib
    public C7587a f48159c;

    /* JADX INFO: renamed from: d */
    public int f48160d;

    /* JADX INFO: renamed from: e */
    @gib
    public Long f48161e;

    /* JADX INFO: renamed from: f */
    public boolean f48162f;

    public ish() {
        this(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void removeLastUndo() {
        /*
            r3 = this;
            ish$a r0 = r3.f48158b
            r1 = 0
            if (r0 == 0) goto La
            ish$a r2 = r0.getNext()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return
        Le:
            if (r0 == 0) goto L1b
            ish$a r2 = r0.getNext()
            if (r2 == 0) goto L1b
            ish$a r2 = r2.getNext()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            ish$a r0 = r0.getNext()
            goto Le
        L23:
            if (r0 != 0) goto L26
            goto L29
        L26:
            r0.setNext(r1)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ish.removeLastUndo():void");
    }

    public static /* synthetic */ void snapshotIfNeeded$default(ish ishVar, zsg zsgVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = ksh.timeNowMillis();
        }
        ishVar.snapshotIfNeeded(zsgVar, j);
    }

    public final void forceNextSnapshot() {
        this.f48162f = true;
    }

    public final int getMaxStoredCharacters() {
        return this.f48157a;
    }

    public final void makeSnapshot(@yfb zsg zsgVar) {
        zsg value;
        this.f48162f = false;
        C7587a c7587a = this.f48158b;
        if (md8.areEqual(zsgVar, c7587a != null ? c7587a.getValue() : null)) {
            return;
        }
        String text = zsgVar.getText();
        C7587a c7587a2 = this.f48158b;
        if (md8.areEqual(text, (c7587a2 == null || (value = c7587a2.getValue()) == null) ? null : value.getText())) {
            C7587a c7587a3 = this.f48158b;
            if (c7587a3 == null) {
                return;
            }
            c7587a3.setValue(zsgVar);
            return;
        }
        this.f48158b = new C7587a(this.f48158b, zsgVar);
        this.f48159c = null;
        int length = this.f48160d + zsgVar.getText().length();
        this.f48160d = length;
        if (length > this.f48157a) {
            removeLastUndo();
        }
    }

    @gib
    public final zsg redo() {
        C7587a c7587a = this.f48159c;
        if (c7587a == null) {
            return null;
        }
        this.f48159c = c7587a.getNext();
        this.f48158b = new C7587a(this.f48158b, c7587a.getValue());
        this.f48160d += c7587a.getValue().getText().length();
        return c7587a.getValue();
    }

    public final void snapshotIfNeeded(@yfb zsg zsgVar, long j) {
        if (!this.f48162f) {
            Long l = this.f48161e;
            if (j <= (l != null ? l.longValue() : 0L) + ((long) jsh.getSNAPSHOTS_INTERVAL_MILLIS())) {
                return;
            }
        }
        this.f48161e = Long.valueOf(j);
        makeSnapshot(zsgVar);
    }

    @gib
    public final zsg undo() {
        C7587a next;
        C7587a c7587a = this.f48158b;
        if (c7587a == null || (next = c7587a.getNext()) == null) {
            return null;
        }
        this.f48158b = next;
        this.f48160d -= c7587a.getValue().getText().length();
        this.f48159c = new C7587a(this.f48159c, c7587a.getValue());
        return next.getValue();
    }

    public ish(int i) {
        this.f48157a = i;
    }

    /* JADX INFO: renamed from: ish$a */
    public static final class C7587a {

        /* JADX INFO: renamed from: a */
        @gib
        public C7587a f48163a;

        /* JADX INFO: renamed from: b */
        @yfb
        public zsg f48164b;

        public C7587a(@gib C7587a c7587a, @yfb zsg zsgVar) {
            this.f48163a = c7587a;
            this.f48164b = zsgVar;
        }

        @gib
        public final C7587a getNext() {
            return this.f48163a;
        }

        @yfb
        public final zsg getValue() {
            return this.f48164b;
        }

        public final void setNext(@gib C7587a c7587a) {
            this.f48163a = c7587a;
        }

        public final void setValue(@yfb zsg zsgVar) {
            this.f48164b = zsgVar;
        }

        public /* synthetic */ C7587a(C7587a c7587a, zsg zsgVar, int i, jt3 jt3Var) {
            this((i & 1) != 0 ? null : c7587a, zsgVar);
        }
    }

    public /* synthetic */ ish(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 100000 : i);
    }
}

package p000;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayerManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,168:1\n1580#2:169\n1#3:170\n47#4,3:171\n50#4,2:201\n267#5,4:174\n237#5,7:178\n248#5,3:186\n251#5,2:190\n272#5,2:192\n254#5,6:194\n274#5:200\n1810#6:185\n1672#6:189\n305#7,6:203\n*S KotlinDebug\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n*L\n82#1:169\n123#1:171,3\n123#1:201,2\n126#1:174,4\n126#1:178,7\n126#1:186,3\n126#1:190,2\n126#1:192,2\n126#1:194,6\n126#1:200\n126#1:185\n126#1:189\n132#1:203,6\n*E\n"})
public final class wu8 {

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C14798a f95531g = new C14798a(null);

    /* JADX INFO: renamed from: h */
    public static final boolean f95532h;

    /* JADX INFO: renamed from: a */
    @yfb
    public final pr1 f95533a;

    /* JADX INFO: renamed from: c */
    @gib
    public ImageReader f95535c;

    /* JADX INFO: renamed from: e */
    @gib
    public f6b<u97> f95537e;

    /* JADX INFO: renamed from: f */
    public boolean f95538f;

    /* JADX INFO: renamed from: b */
    @yfb
    public final u6b<u97> f95534b = eoe.mutableScatterSetOf();

    /* JADX INFO: renamed from: d */
    @yfb
    public final Handler f95536d = de7.createAsync(Looper.getMainLooper(), new Handler.Callback() { // from class: vu8
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return wu8.handler$lambda$0(this.f92274a, message);
        }
    });

    /* JADX INFO: renamed from: wu8$a */
    public static final class C14798a {
        public /* synthetic */ C14798a(jt3 jt3Var) {
            this();
        }

        public final boolean isRobolectric() {
            return wu8.f95532h;
        }

        private C14798a() {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        md8.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f95532h = md8.areEqual(lowerCase, "robolectric");
    }

    public wu8(@yfb pr1 pr1Var) {
        this.f95533a = pr1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handler$lambda$0(wu8 wu8Var, Message message) {
        wu8Var.persistLayers(wu8Var.f95534b);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void persistLayers(p000.doe<p000.u97> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r21.isNotEmpty()
            if (r2 == 0) goto Lc4
            boolean r2 = p000.wu8.f95532h
            if (r2 != 0) goto Lc4
            android.media.ImageReader r2 = r0.f95535c
            r3 = 1
            if (r2 != 0) goto L24
            r2 = 3
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r3, r3, r3, r2)
            uu8 r4 = new uu8
            r4.<init>()
            android.os.Handler r5 = r0.f95536d
            r2.setOnImageAvailableListener(r4, r5)
            r0.f95535c = r2
        L24:
            android.view.Surface r2 = r2.getSurface()
            ph9 r4 = p000.ph9.f70806a
            android.graphics.Canvas r4 = r4.lockHardwareCanvas(r2)
            r0.f95538f = r3
            pr1 r5 = r0.f95533a
            dq r6 = r5.getAndroidCanvas()
            android.graphics.Canvas r6 = r6.getInternalCanvas()
            dq r7 = r5.getAndroidCanvas()
            r7.setInternalCanvas(r4)
            dq r7 = r5.getAndroidCanvas()
            r4.save()
            r8 = 0
            r4.clipRect(r8, r8, r3, r3)
            java.lang.Object[] r3 = r1.f30278b
            long[] r1 = r1.f30277a
            int r9 = r1.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto L96
            r10 = r8
        L56:
            r11 = r1[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L90
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = r8
        L70:
            if (r15 >= r13) goto L8e
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L89
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r3[r16]
            r8 = r16
            u97 r8 = (p000.u97) r8
            r8.drawForPersistence$ui_graphics_release(r7)
        L89:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            r8 = 0
            goto L70
        L8e:
            if (r13 != r14) goto L96
        L90:
            if (r10 == r9) goto L96
            int r10 = r10 + 1
            r8 = 0
            goto L56
        L96:
            r4.restore()
            dq r1 = r5.getAndroidCanvas()
            r1.setInternalCanvas(r6)
            r1 = 0
            r0.f95538f = r1
            f6b<u97> r3 = r0.f95537e
            if (r3 == 0) goto Lc1
            boolean r5 = r3.isNotEmpty()
            if (r5 == 0) goto Lc1
            java.lang.Object[] r5 = r3.f16823a
            int r6 = r3.f16824b
            r8 = r1
        Lb2:
            if (r8 >= r6) goto Lbe
            r1 = r5[r8]
            u97 r1 = (p000.u97) r1
            r0.release(r1)
            int r8 = r8 + 1
            goto Lb2
        Lbe:
            r3.clear()
        Lc1:
            r2.unlockCanvasAndPost(r4)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wu8.persistLayers(doe):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void persistLayers$lambda$3$lambda$2(ImageReader imageReader) {
        Image imageAcquireLatestImage;
        if (imageReader == null || (imageAcquireLatestImage = imageReader.acquireLatestImage()) == null) {
            return;
        }
        imageAcquireLatestImage.close();
    }

    public final void destroy() {
        ImageReader imageReader = this.f95535c;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f95535c = null;
    }

    @yfb
    public final pr1 getCanvasHolder() {
        return this.f95533a;
    }

    public final boolean hasImageReader() {
        return this.f95535c != null;
    }

    public final void persist(@yfb u97 u97Var) {
        this.f95534b.add(u97Var);
        if (this.f95536d.hasMessages(0)) {
            return;
        }
        this.f95536d.sendMessageAtFrontOfQueue(Message.obtain());
    }

    public final void release(@yfb u97 u97Var) {
        if (!this.f95538f) {
            if (this.f95534b.remove(u97Var)) {
                u97Var.discardDisplayList$ui_graphics_release();
            }
        } else {
            f6b<u97> f6bVar = this.f95537e;
            if (f6bVar == null) {
                f6bVar = new f6b<>(0, 1, null);
                this.f95537e = f6bVar;
            }
            f6bVar.add(u97Var);
        }
    }

    public final void updateLayerPersistence() {
        destroy();
        persistLayers(this.f95534b);
    }
}

package p000;

import android.view.DragEvent;
import p000.sdh;

/* JADX INFO: loaded from: classes.dex */
public final class lsd {

    /* JADX INFO: renamed from: lsd$a */
    public static final class C8955a extends tt8 implements qy6<tn4, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C8955a f58619a = new C8955a();

        public C8955a() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb tn4 tn4Var) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: lsd$b */
    public static final class C8956b implements co4 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ isd f58620a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<tn4, bth> f58621b;

        /* JADX WARN: Multi-variable type inference failed */
        public C8956b(isd isdVar, qy6<? super tn4, bth> qy6Var) {
            this.f58620a = isdVar;
            this.f58621b = qy6Var;
        }

        @Override // p000.co4
        public boolean onDrop(@yfb tn4 tn4Var) {
            this.f58621b.invoke(tn4Var);
            sdh transferableContent = lsd.toTransferableContent(tn4Var);
            return !md8.areEqual(transferableContent, this.f58620a.getReceiveContentListener().onReceive(transferableContent));
        }

        @Override // p000.co4
        public void onEnded(@yfb tn4 tn4Var) {
            this.f58620a.getReceiveContentListener().onDragEnd();
        }

        @Override // p000.co4
        public void onEntered(@yfb tn4 tn4Var) {
            this.f58620a.getReceiveContentListener().onDragEnter();
        }

        @Override // p000.co4
        public void onExited(@yfb tn4 tn4Var) {
            this.f58620a.getReceiveContentListener().onDragExit();
        }

        @Override // p000.co4
        public void onStarted(@yfb tn4 tn4Var) {
            this.f58620a.getReceiveContentListener().onDragStart();
        }
    }

    @yfb
    public static final vn4 ReceiveContentDragAndDropNode(@yfb isd isdVar, @yfb qy6<? super tn4, bth> qy6Var) {
        return xn4.DragAndDropModifierNode(C8955a.f58619a, new C8956b(isdVar, qy6Var));
    }

    @yfb
    public static final sdh toTransferableContent(@yfb tn4 tn4Var) {
        DragEvent androidDragEvent = fo4.toAndroidDragEvent(tn4Var);
        return new sdh(C7562iq.toClipEntry(androidDragEvent.getClipData()), C7562iq.toClipMetadata(androidDragEvent.getClipDescription()), sdh.C12541a.f81504b.m32308getDragAndDropkB6V9T0(), null, 8, null);
    }
}

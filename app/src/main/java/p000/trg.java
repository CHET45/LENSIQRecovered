package p000;

import android.content.ClipDescription;
import android.view.DragEvent;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class trg {

    /* JADX INFO: renamed from: trg$a */
    @dwf({"SMAP\nTextFieldDragAndDropNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDragAndDropNode.android.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1747#2,3:84\n*S KotlinDebug\n*F\n+ 1 TextFieldDragAndDropNode.android.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$1\n*L\n49#1:84,3\n*E\n"})
    public static final class C13179a extends tt8 implements qy6<tn4, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<Set<xpa>> f85687a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13179a(ny6<? extends Set<xpa>> ny6Var) {
            super(1);
            this.f85687a = ny6Var;
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb tn4 tn4Var) {
            ClipDescription clipDescription = fo4.toAndroidDragEvent(tn4Var).getClipDescription();
            Set<xpa> setInvoke = this.f85687a.invoke();
            boolean z = false;
            if (!(setInvoke instanceof Collection) || !setInvoke.isEmpty()) {
                for (xpa xpaVar : setInvoke) {
                    if (md8.areEqual(xpaVar, xpa.f98864b.getAll()) || clipDescription.hasMimeType(xpaVar.getRepresentation())) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: trg$b */
    public static final class C13180b implements co4 {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ qy6<tn4, bth> f85688C;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<tn4, bth> f85689a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<u42, w42, Boolean> f85690b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<tn4, bth> f85691c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<tn4, bth> f85692d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qy6<izb, bth> f85693e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ qy6<tn4, bth> f85694f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ qy6<tn4, bth> f85695m;

        /* JADX WARN: Multi-variable type inference failed */
        public C13180b(qy6<? super tn4, bth> qy6Var, gz6<? super u42, ? super w42, Boolean> gz6Var, qy6<? super tn4, bth> qy6Var2, qy6<? super tn4, bth> qy6Var3, qy6<? super izb, bth> qy6Var4, qy6<? super tn4, bth> qy6Var5, qy6<? super tn4, bth> qy6Var6, qy6<? super tn4, bth> qy6Var7) {
            this.f85689a = qy6Var;
            this.f85690b = gz6Var;
            this.f85691c = qy6Var2;
            this.f85692d = qy6Var3;
            this.f85693e = qy6Var4;
            this.f85694f = qy6Var5;
            this.f85695m = qy6Var6;
            this.f85688C = qy6Var7;
        }

        @Override // p000.co4
        public void onChanged(@yfb tn4 tn4Var) {
            qy6<tn4, bth> qy6Var = this.f85695m;
            if (qy6Var != null) {
                qy6Var.invoke(tn4Var);
                bth bthVar = bth.f14751a;
            }
        }

        @Override // p000.co4
        public boolean onDrop(@yfb tn4 tn4Var) {
            this.f85689a.invoke(tn4Var);
            return this.f85690b.invoke(C7562iq.toClipEntry(fo4.toAndroidDragEvent(tn4Var).getClipData()), C7562iq.toClipMetadata(fo4.toAndroidDragEvent(tn4Var).getClipDescription())).booleanValue();
        }

        @Override // p000.co4
        public void onEnded(@yfb tn4 tn4Var) {
            qy6<tn4, bth> qy6Var = this.f85688C;
            if (qy6Var != null) {
                qy6Var.invoke(tn4Var);
                bth bthVar = bth.f14751a;
            }
        }

        @Override // p000.co4
        public void onEntered(@yfb tn4 tn4Var) {
            qy6<tn4, bth> qy6Var = this.f85692d;
            if (qy6Var != null) {
                qy6Var.invoke(tn4Var);
                bth bthVar = bth.f14751a;
            }
        }

        @Override // p000.co4
        public void onExited(@yfb tn4 tn4Var) {
            qy6<tn4, bth> qy6Var = this.f85694f;
            if (qy6Var != null) {
                qy6Var.invoke(tn4Var);
                bth bthVar = bth.f14751a;
            }
        }

        @Override // p000.co4
        public void onMoved(@yfb tn4 tn4Var) {
            DragEvent androidDragEvent = fo4.toAndroidDragEvent(tn4Var);
            qy6<izb, bth> qy6Var = this.f85693e;
            if (qy6Var != null) {
                qy6Var.invoke(izb.m30418boximpl(mzb.Offset(androidDragEvent.getX(), androidDragEvent.getY())));
                bth bthVar = bth.f14751a;
            }
        }

        @Override // p000.co4
        public void onStarted(@yfb tn4 tn4Var) {
            qy6<tn4, bth> qy6Var = this.f85691c;
            if (qy6Var != null) {
                qy6Var.invoke(tn4Var);
                bth bthVar = bth.f14751a;
            }
        }
    }

    @yfb
    public static final vn4 textFieldDragAndDropNode(@yfb ny6<? extends Set<xpa>> ny6Var, @yfb gz6<? super u42, ? super w42, Boolean> gz6Var, @yfb qy6<? super tn4, bth> qy6Var, @gib qy6<? super tn4, bth> qy6Var2, @gib qy6<? super tn4, bth> qy6Var3, @gib qy6<? super izb, bth> qy6Var4, @gib qy6<? super tn4, bth> qy6Var5, @gib qy6<? super tn4, bth> qy6Var6, @gib qy6<? super tn4, bth> qy6Var7) {
        return xn4.DragAndDropModifierNode(new C13179a(ny6Var), new C13180b(qy6Var, gz6Var, qy6Var2, qy6Var3, qy6Var4, qy6Var6, qy6Var5, qy6Var7));
    }
}

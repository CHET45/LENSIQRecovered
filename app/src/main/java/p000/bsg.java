package p000;

import android.view.KeyEvent;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.input.key.C0743a;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
public final class bsg {

    /* JADX INFO: renamed from: bsg$a */
    public static final class C2040a extends tt8 implements qy6<zsg, bth> {

        /* JADX INFO: renamed from: a */
        public static final C2040a f14694a = new C2040a();

        public C2040a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(zsg zsgVar) {
            invoke2(zsgVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb zsg zsgVar) {
        }
    }

    /* JADX INFO: renamed from: bsg$b */
    @dwf({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,263:1\n1223#2,6:264\n1223#2,6:270\n1223#2,6:276\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n*L\n246#1:264,6\n247#1:270,6\n261#1:276,6\n*E\n"})
    public static final class C2041b extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ qy6<zsg, bth> f14695C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f14696F;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z39 f14697a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ osg f14698b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zsg f14699c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f14700d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f14701e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ nzb f14702f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ ish f14703m;

        /* JADX INFO: renamed from: bsg$b$a */
        public /* synthetic */ class a extends n07 implements qy6<kq8, Boolean> {
            public a(Object obj) {
                super(1, obj, asg.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ Boolean invoke(kq8 kq8Var) {
                return m28054invokeZmokQxo(kq8Var.m30741unboximpl());
            }

            @yfb
            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m28054invokeZmokQxo(@yfb KeyEvent keyEvent) {
                return Boolean.valueOf(((asg) this.receiver).m27880processZmokQxo(keyEvent));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2041b(z39 z39Var, osg osgVar, zsg zsgVar, boolean z, boolean z2, nzb nzbVar, ish ishVar, qy6<? super zsg, bth> qy6Var, int i) {
            super(3);
            this.f14697a = z39Var;
            this.f14698b = osgVar;
            this.f14699c = zsgVar;
            this.f14700d = z;
            this.f14701e = z2;
            this.f14702f = nzbVar;
            this.f14703m = ishVar;
            this.f14695C = qy6Var;
            this.f14696F = i;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(851809892);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(851809892, i, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
            }
            Object objRememberedValue = zl2Var.rememberedValue();
            zl2.C16170a c16170a = zl2.f105372a;
            if (objRememberedValue == c16170a.getEmpty()) {
                objRememberedValue = new ivg();
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            ivg ivgVar = (ivg) objRememberedValue;
            Object objRememberedValue2 = zl2Var.rememberedValue();
            if (objRememberedValue2 == c16170a.getEmpty()) {
                objRememberedValue2 = new rj3();
                zl2Var.updateRememberedValue(objRememberedValue2);
            }
            asg asgVar = new asg(this.f14697a, this.f14698b, this.f14699c, this.f14700d, this.f14701e, ivgVar, this.f14702f, this.f14703m, (rj3) objRememberedValue2, null, this.f14695C, this.f14696F, 512, null);
            InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
            boolean zChangedInstance = zl2Var.changedInstance(asgVar);
            Object objRememberedValue3 = zl2Var.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == c16170a.getEmpty()) {
                objRememberedValue3 = new a(asgVar);
                zl2Var.updateRememberedValue(objRememberedValue3);
            }
            InterfaceC0701e interfaceC0701eOnKeyEvent = C0743a.onKeyEvent(aVar, (qy6) ((to8) objRememberedValue3));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return interfaceC0701eOnKeyEvent;
        }
    }

    @yfb
    /* JADX INFO: renamed from: textFieldKeyInput-2WJ9YEU, reason: not valid java name */
    public static final InterfaceC0701e m28052textFieldKeyInput2WJ9YEU(@yfb InterfaceC0701e interfaceC0701e, @yfb z39 z39Var, @yfb osg osgVar, @yfb zsg zsgVar, @yfb qy6<? super zsg, bth> qy6Var, boolean z, boolean z2, @yfb nzb nzbVar, @yfb ish ishVar, int i) {
        return C0696c.composed$default(interfaceC0701e, null, new C2041b(z39Var, osgVar, zsgVar, z, z2, nzbVar, ishVar, qy6Var, i), 1, null);
    }
}

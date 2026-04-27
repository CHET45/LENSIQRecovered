package p000;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.mylhyl.circledialog.C3860a;
import com.mylhyl.circledialog.CircleParams;
import com.mylhyl.circledialog.params.DialogParams;
import com.mylhyl.circledialog.params.PopupParams;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes6.dex */
public final class ag1 extends rf1 {

    /* JADX INFO: renamed from: p */
    public static final int f1362p = 49;

    /* JADX INFO: renamed from: q */
    public static final int f1363q = 81;

    /* JADX INFO: renamed from: r */
    public static final int f1364r = 51;

    /* JADX INFO: renamed from: s */
    public static final int f1365s = 83;

    /* JADX INFO: renamed from: t */
    public static final int f1366t = 19;

    /* JADX INFO: renamed from: u */
    public static final int f1367u = 53;

    /* JADX INFO: renamed from: v */
    public static final int f1368v = 85;

    /* JADX INFO: renamed from: w */
    public static final int f1369w = 21;

    /* JADX INFO: renamed from: x */
    public static final float f1370x = 0.1f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f1371g;

    /* JADX INFO: renamed from: h */
    public View f1372h;

    /* JADX INFO: renamed from: i */
    public sg8 f1373i;

    /* JADX INFO: renamed from: j */
    public int f1374j;

    /* JADX INFO: renamed from: k */
    public int f1375k;

    /* JADX INFO: renamed from: l */
    public int[] f1376l;

    /* JADX INFO: renamed from: m */
    public int f1377m;

    /* JADX INFO: renamed from: n */
    public C3860a.k f1378n;

    /* JADX INFO: renamed from: o */
    public Queue<Integer> f1379o;

    /* JADX INFO: renamed from: ag1$a */
    public class ViewOnLayoutChangeListenerC0215a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogParams f1380a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PopupParams f1381b;

        public ViewOnLayoutChangeListenerC0215a(DialogParams dialogParams, PopupParams popupParams) {
            this.f1380a = dialogParams;
            this.f1381b = popupParams;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            DialogParams dialogParams = this.f1380a;
            float f = dialogParams.f24310e;
            if (f == -2.0f || f != -1.0f) {
                dialogParams.f24310e = ag1.this.f78143c.getWidth();
            }
            ag1.this.handleAtLocation(this.f1380a, this.f1381b, i4, i8, this);
        }
    }

    public ag1(Context context, C3860a.k kVar, CircleParams circleParams, int[] iArr, int i) {
        super(context, circleParams);
        this.f1379o = new LinkedList();
        this.f1378n = kVar;
        this.f1376l = iArr;
        this.f1377m = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAtLocation(DialogParams dialogParams, PopupParams popupParams, int i, int i2, View.OnLayoutChangeListener onLayoutChangeListener) {
        View view;
        if (!popupParams.f24380Z1 || this.f1371g == null || (view = this.f1372h) == null) {
            this.f78143c.removeOnLayoutChangeListener(onLayoutChangeListener);
            resizeDialogSize(this.f78142b.f24219H, popupParams.f24381a2, this.f1374j, this.f1375k, popupParams.f24377M1, 0);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (popupParams.f24378V1 == null) {
            int i3 = (int) (dialogParams.f24310e * 0.1f);
            layoutParams.width = i3;
            layoutParams.height = i3;
        } else {
            layoutParams.width = C3860a.dp2px(this.f78141a, r1[0]);
            layoutParams.height = C3860a.dp2px(this.f78141a, r1[1]);
        }
        if (i != 0 && i2 != 0 && i == i2) {
            int i4 = layoutParams.width;
            popupParams.f24377M1 = i4;
            int i5 = this.f1375k;
            if (i5 == 3) {
                layoutParams.leftMargin = i4;
            } else if (i5 == 48) {
                layoutParams.topMargin = i4;
            } else if (i5 == 5) {
                layoutParams.rightMargin = i4;
            } else if (i5 == 80) {
                layoutParams.bottomMargin = i4;
            }
            this.f1379o.add(Integer.valueOf(i2));
            if (this.f1379o.size() == 3) {
                int iIntValue = this.f1379o.poll().intValue();
                while (true) {
                    if (!this.f1379o.isEmpty()) {
                        Integer numPoll = this.f1379o.poll();
                        if (numPoll != null && iIntValue != numPoll.intValue()) {
                            break;
                        }
                    } else {
                        this.f78143c.removeOnLayoutChangeListener(onLayoutChangeListener);
                        break;
                    }
                }
            }
            resizeDialogSize(dialogParams, popupParams.f24381a2, this.f1374j, this.f1375k, popupParams.f24377M1, layoutParams.width);
        }
        this.f1372h.setLayoutParams(layoutParams);
    }

    private void resizeDialogSize(DialogParams dialogParams, View view, int i, int i2, int i3, int i4) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.f1376l;
        int i5 = iArr2[0];
        int i6 = iArr2[1];
        this.f78143c.getHeight();
        int width = (i == 48 || i == 80) ? view.getWidth() / 2 : view.getWidth();
        if (i2 == 3) {
            width += (iArr[0] - (i4 / 2)) - i3;
        } else if (i2 == 5) {
            width = (((i5 - iArr[0]) - width) - (i4 / 2)) - i3;
        } else if (i2 == 1) {
            width += ((i5 / 2) - iArr[0]) * (-1);
        }
        dialogParams.f24300M = width;
        int height = i2 == 48 ? (((iArr[1] - this.f1377m) + (view.getHeight() / 2)) - (i4 / 2)) - i3 : i2 == 80 ? (((i6 - iArr[1]) - (view.getHeight() / 2)) - (i4 / 2)) - i3 : i2 == 16 ? (view.getHeight() / 2) + ((((i6 / 2) - iArr[1]) * (-1)) - (this.f1377m / 2)) : (i == 48 && (i2 == 3 || i2 == 5 || i2 == 1)) ? (iArr[1] - this.f1377m) + view.getHeight() : i6 - iArr[1];
        dialogParams.f24301N = height;
        C3860a.k kVar = this.f1378n;
        if (kVar != null) {
            kVar.dialogAtLocation(dialogParams.f24300M, height);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b1  */
    @Override // p000.qf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildBodyView() {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ag1.buildBodyView():void");
    }

    @Override // p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ wh1 buildButton() {
        return super.buildButton();
    }

    @Override // p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ o52 buildCloseImgView() {
        return super.buildCloseImgView();
    }

    @Override // p000.qf1
    public void refreshContent() {
        sg8 sg8Var = this.f1373i;
        if (sg8Var != null) {
            sg8Var.refreshItems();
        }
    }

    @Override // p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ void refreshTitle() {
        super.refreshTitle();
    }

    @Override // p000.qf1
    public sg8 getBodyView() {
        return this.f1373i;
    }
}

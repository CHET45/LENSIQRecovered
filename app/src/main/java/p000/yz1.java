package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.BaseAdapter;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mylhyl.circledialog.BaseCircleDialog;
import com.mylhyl.circledialog.CircleParams;
import com.mylhyl.circledialog.params.AdParams;
import com.mylhyl.circledialog.params.ButtonParams;
import com.mylhyl.circledialog.params.CloseParams;
import com.mylhyl.circledialog.params.DialogParams;
import com.mylhyl.circledialog.params.InputParams;
import com.mylhyl.circledialog.params.ItemsParams;
import com.mylhyl.circledialog.params.LottieParams;
import com.mylhyl.circledialog.params.PopupParams;
import com.mylhyl.circledialog.params.ProgressParams;
import com.mylhyl.circledialog.params.SubTitleParams;
import com.mylhyl.circledialog.params.TextParams;
import com.mylhyl.circledialog.params.TitleParams;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class yz1 {

    /* JADX INFO: renamed from: a */
    public BaseCircleDialog f103496a;

    /* JADX INFO: renamed from: yz1$b */
    public static class C15898b {

        /* JADX INFO: renamed from: a */
        public yz1 f103497a;

        /* JADX INFO: renamed from: b */
        public CircleParams f103498b;

        public C15898b() {
            CircleParams circleParams = new CircleParams();
            this.f103498b = circleParams;
            circleParams.f24219H = new DialogParams();
        }

        private void newAdParams() {
            CircleParams circleParams = this.f103498b;
            if (circleParams.f24250n2 == null) {
                circleParams.f24250n2 = new AdParams();
            }
        }

        private void newCloseParams() {
            CircleParams circleParams = this.f103498b;
            if (circleParams.f24249m2 == null) {
                circleParams.f24249m2 = new CloseParams();
            }
        }

        private void newInputParams() {
            CircleParams circleParams = this.f103498b;
            if (circleParams.f24225V1 == null) {
                circleParams.f24225V1 = new InputParams();
            }
        }

        private void newItemsParams() {
            CircleParams circleParams = this.f103498b;
            if (circleParams.f24227Y == null) {
                circleParams.f24227Y = new ItemsParams();
            }
        }

        private void newLottieParams() {
            CircleParams circleParams = this.f103498b;
            if (circleParams.f24222M1 == null) {
                circleParams.f24222M1 = new LottieParams();
            }
        }

        private void newNegativeParams() {
            CircleParams circleParams = this.f103498b;
            if (circleParams.f24224Q == null) {
                circleParams.f24224Q = new ButtonParams();
                this.f103498b.f24224Q.f24277b = wz1.f95824i;
            }
        }

        private void newNeutralParams() {
            CircleParams circleParams = this.f103498b;
            if (circleParams.f24229Z1 == null) {
                circleParams.f24229Z1 = new ButtonParams();
            }
        }

        private void newPopupParams() {
            CircleParams circleParams = this.f103498b;
            if (circleParams.f24246k2 == null) {
                circleParams.f24246k2 = new PopupParams();
            }
        }

        private void newPositiveParams() {
            CircleParams circleParams = this.f103498b;
            if (circleParams.f24226X == null) {
                circleParams.f24226X = new ButtonParams();
            }
        }

        private void newProgressParams() {
            CircleParams circleParams = this.f103498b;
            if (circleParams.f24228Z == null) {
                circleParams.f24228Z = new ProgressParams();
            }
        }

        private void newSubTitleParams() {
            CircleParams circleParams = this.f103498b;
            if (circleParams.f24221M == null) {
                circleParams.f24221M = new SubTitleParams();
            }
        }

        private void newTextParams() {
            CircleParams circleParams = this.f103498b;
            if (circleParams.f24223N == null) {
                circleParams.f24223N = new TextParams();
            }
        }

        private void newTitleParams() {
            CircleParams circleParams = this.f103498b;
            if (circleParams.f24220L == null) {
                circleParams.f24220L = new TitleParams();
            }
        }

        public C15898b bottomFull() {
            DialogParams dialogParams = this.f103498b.f24219H;
            dialogParams.f24306a = 80;
            dialogParams.f24299L = 0;
            dialogParams.f24310e = 1.0f;
            dialogParams.f24301N = 0;
            return this;
        }

        public C15898b configDialog(@efb iq2 iq2Var) {
            iq2Var.onConfig(this.f103498b.f24219H);
            return this;
        }

        public C15898b configInput(@efb jq2 jq2Var) {
            newInputParams();
            jq2Var.onConfig(this.f103498b.f24225V1);
            return this;
        }

        public C15898b configItems(@efb kq2 kq2Var) {
            newItemsParams();
            kq2Var.onConfig(this.f103498b.f24227Y);
            return this;
        }

        public C15898b configLottie(@efb lq2 lq2Var) {
            newLottieParams();
            lq2Var.onConfig(this.f103498b.f24222M1);
            return this;
        }

        public C15898b configNegative(@efb eq2 eq2Var) {
            newNegativeParams();
            eq2Var.onConfig(this.f103498b.f24224Q);
            return this;
        }

        public C15898b configNeutral(@efb eq2 eq2Var) {
            newNeutralParams();
            eq2Var.onConfig(this.f103498b.f24229Z1);
            return this;
        }

        public C15898b configPopup(@efb mq2 mq2Var) {
            newPopupParams();
            mq2Var.onConfig(this.f103498b.f24246k2);
            return this;
        }

        public C15898b configPositive(@efb eq2 eq2Var) {
            newPositiveParams();
            eq2Var.onConfig(this.f103498b.f24226X);
            return this;
        }

        public C15898b configProgress(@efb nq2 nq2Var) {
            newProgressParams();
            nq2Var.onConfig(this.f103498b.f24228Z);
            return this;
        }

        public C15898b configSubTitle(@efb oq2 oq2Var) {
            newSubTitleParams();
            oq2Var.onConfig(this.f103498b.f24221M);
            return this;
        }

        public C15898b configText(@efb pq2 pq2Var) {
            newTextParams();
            pq2Var.onConfig(this.f103498b.f24223N);
            return this;
        }

        public C15898b configTitle(@efb qq2 qq2Var) {
            newTitleParams();
            qq2Var.onConfig(this.f103498b.f24220L);
            return this;
        }

        public BaseCircleDialog create() {
            if (this.f103497a == null) {
                this.f103497a = new yz1();
            }
            return this.f103497a.create(this.f103498b);
        }

        public C15898b playLottieAnimation() {
            newLottieParams();
            this.f103498b.f24222M1.f24351C = true;
            return this;
        }

        public void refresh() {
            yz1 yz1Var = this.f103497a;
            if (yz1Var != null) {
                yz1Var.refresh();
            }
        }

        public C15898b setAdIndicator(boolean z) {
            newAdParams();
            this.f103498b.f24250n2.f24270c = z;
            return this;
        }

        public C15898b setAdIndicatorPoint(@gq4 int i) {
            newAdParams();
            this.f103498b.f24250n2.f24271d = i;
            return this;
        }

        public C15898b setAdResId(@gq4 int i, s1c s1cVar) {
            newAdParams();
            return setAdResId(new int[]{i}, s1cVar);
        }

        public C15898b setAdUrl(String str, s1c s1cVar) {
            return setAdUrl(new String[]{str}, s1cVar);
        }

        public C15898b setBodyView(@uw8 int i, e2c e2cVar) {
            CircleParams circleParams = this.f103498b;
            circleParams.f24231a2 = i;
            circleParams.f24235c2 = e2cVar;
            return this;
        }

        public C15898b setCancelable(boolean z) {
            this.f103498b.f24219H.f24308c = z;
            return this;
        }

        public C15898b setCanceledOnTouchOutside(boolean z) {
            this.f103498b.f24219H.f24307b = z;
            return this;
        }

        public C15898b setCloseConnector(int i, int i2) {
            newCloseParams();
            CloseParams closeParams = this.f103498b.f24249m2;
            closeParams.f24293e = i;
            closeParams.f24294f = i2;
            return this;
        }

        public C15898b setCloseGravity(int i) {
            newCloseParams();
            this.f103498b.f24249m2.f24292d = i;
            return this;
        }

        public C15898b setClosePadding(int[] iArr) {
            newCloseParams();
            this.f103498b.f24249m2.f24291c = iArr;
            return this;
        }

        public C15898b setCloseResId(@gq4 int i) {
            setCloseResId(i, 0);
            return this;
        }

        public C15898b setGravity(int i) {
            this.f103498b.f24219H.f24306a = i;
            return this;
        }

        public C15898b setImageLoadEngine(nv7 nv7Var) {
            this.f103498b.f24251o2 = nv7Var;
            return this;
        }

        public C15898b setInputCounter(int i) {
            newInputParams();
            this.f103498b.f24225V1.f24324Z = i;
            return this;
        }

        public C15898b setInputCounterColor(@g92 int i) {
            newInputParams();
            this.f103498b.f24225V1.f24321V1 = i;
            return this;
        }

        public C15898b setInputEmoji(boolean z) {
            newInputParams();
            this.f103498b.f24225V1.f24327a2 = z;
            return this;
        }

        public C15898b setInputHeight(int i) {
            newInputParams();
            this.f103498b.f24225V1.f24328b = i;
            return this;
        }

        public C15898b setInputHint(@efb String str) {
            newInputParams();
            this.f103498b.f24225V1.f24330c = str;
            return this;
        }

        public C15898b setInputShowKeyboard(boolean z) {
            newInputParams();
            this.f103498b.f24225V1.f24325Z1 = z;
            return this;
        }

        public C15898b setInputText(@efb String str) {
            newInputParams();
            this.f103498b.f24225V1.f24320Q = str;
            return this;
        }

        public C15898b setItems(@efb Object obj, s3c s3cVar) {
            newItemsParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24247l2 = true;
            circleParams.f24227Y.f24344a = obj;
            circleParams.f24240f = s3cVar;
            return this;
        }

        public C15898b setItemsViewBinder(e02 e02Var) {
            newItemsParams();
            this.f103498b.f24227Y.f24343Y = e02Var;
            return this;
        }

        public C15898b setLottieAnimation(String str) {
            newLottieParams();
            this.f103498b.f24222M1.f24364m = str;
            return this;
        }

        public C15898b setLottieLoop(boolean z) {
            newLottieParams();
            this.f103498b.f24222M1.f24352F = z;
            return this;
        }

        public C15898b setLottieSize(int i, int i2) {
            newLottieParams();
            LottieParams lottieParams = this.f103498b.f24222M1;
            lottieParams.f24362e = i;
            lottieParams.f24361d = i2;
            return this;
        }

        public C15898b setLottieText(String str) {
            newLottieParams();
            this.f103498b.f24222M1.f24353H = str;
            return this;
        }

        public C15898b setMaxHeight(@y46(from = 0.0d, m25645to = 1.0d) float f) {
            this.f103498b.f24219H.f24303X = f;
            return this;
        }

        public C15898b setNegative(@efb String str, View.OnClickListener onClickListener) {
            newNegativeParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24224Q.f24281f = str;
            circleParams.f24234c = onClickListener;
            return this;
        }

        public C15898b setNeutral(@efb String str, View.OnClickListener onClickListener) {
            newNeutralParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24229Z1.f24281f = str;
            circleParams.f24232b = onClickListener;
            return this;
        }

        public C15898b setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f103498b.f24217C = onCancelListener;
            return this;
        }

        public C15898b setOnCreateButtonListener(f2c f2cVar) {
            this.f103498b.f24244i2 = f2cVar;
            return this;
        }

        public C15898b setOnCreateInputListener(g2c g2cVar) {
            this.f103498b.f24243h2 = g2cVar;
            return this;
        }

        public C15898b setOnCreateLottieListener(h2c h2cVar) {
            this.f103498b.f24239e2 = h2cVar;
            return this;
        }

        public C15898b setOnCreateProgressListener(i2c i2cVar) {
            this.f103498b.f24237d2 = i2cVar;
            return this;
        }

        public C15898b setOnCreateTextListener(j2c j2cVar) {
            this.f103498b.f24242g2 = j2cVar;
            return this;
        }

        public C15898b setOnCreateTitleListener(@efb k2c k2cVar) {
            this.f103498b.f24241f2 = k2cVar;
            return this;
        }

        public C15898b setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f103498b.f24248m = onDismissListener;
            return this;
        }

        public C15898b setOnShowListener(DialogInterface.OnShowListener onShowListener) {
            this.f103498b.f24218F = onShowListener;
            return this;
        }

        public C15898b setPopup(View view, int i) {
            newPopupParams();
            PopupParams popupParams = this.f103498b.f24246k2;
            popupParams.f24381a2 = view;
            popupParams.f24379Z = i;
            return this;
        }

        public C15898b setPopupItems(@efb Object obj, o4c o4cVar) {
            newPopupParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24246k2.f24344a = obj;
            circleParams.f24238e = o4cVar;
            return this;
        }

        public C15898b setPopupTriangleShow(boolean z) {
            newPopupParams();
            this.f103498b.f24246k2.f24380Z1 = z;
            return this;
        }

        public C15898b setPopupTriangleSize(int i, int i2) {
            newPopupParams();
            this.f103498b.f24246k2.f24378V1 = new int[]{i, i2};
            return this;
        }

        public C15898b setPositive(@efb String str, View.OnClickListener onClickListener) {
            newPositiveParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24226X.f24281f = str;
            circleParams.f24230a = onClickListener;
            return this;
        }

        public C15898b setPositiveInput(@efb String str, z2c z2cVar) {
            newPositiveParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24226X.f24281f = str;
            circleParams.f24236d = z2cVar;
            return this;
        }

        public C15898b setProgress(int i, int i2) {
            newProgressParams();
            ProgressParams progressParams = this.f103498b.f24228Z;
            progressParams.f24394f = i;
            progressParams.f24395m = i2;
            return this;
        }

        public C15898b setProgressDrawable(@gq4 int i) {
            newProgressParams();
            this.f103498b.f24228Z.f24392d = i;
            return this;
        }

        public C15898b setProgressHeight(int i) {
            newProgressParams();
            this.f103498b.f24228Z.f24393e = i;
            return this;
        }

        public C15898b setProgressStyle(int i) {
            newProgressParams();
            this.f103498b.f24228Z.f24389a = i;
            return this;
        }

        public C15898b setProgressText(@efb String str) {
            newProgressParams();
            this.f103498b.f24228Z.f24384C = str;
            return this;
        }

        public C15898b setRadius(int i) {
            this.f103498b.f24219H.f24299L = i;
            return this;
        }

        public C15898b setSubTitle(@efb String str) {
            newSubTitleParams();
            this.f103498b.f24221M.f24397a = str;
            return this;
        }

        public C15898b setSubTitleColor(@g92 int i) {
            newSubTitleParams();
            this.f103498b.f24221M.f24401e = i;
            return this;
        }

        public C15898b setText(@efb String str) {
            newTextParams();
            this.f103498b.f24223N.f24406b = str;
            return this;
        }

        public C15898b setTextColor(@g92 int i) {
            newTextParams();
            this.f103498b.f24223N.f24409e = i;
            return this;
        }

        public C15898b setTitle(@efb String str) {
            newTitleParams();
            this.f103498b.f24220L.f24414a = str;
            return this;
        }

        public C15898b setTitleColor(@g92 int i) {
            newTitleParams();
            this.f103498b.f24220L.f24418e = i;
            return this;
        }

        public C15898b setTitleIcon(@gq4 int i) {
            newTitleParams();
            this.f103498b.f24220L.f24413F = i;
            return this;
        }

        public C15898b setWidth(@y46(from = 0.0d, m25645to = 1.0d) float f) {
            this.f103498b.f24219H.f24310e = f;
            return this;
        }

        public C15898b setYoff(int i) {
            this.f103498b.f24219H.f24301N = i;
            return this;
        }

        public BaseCircleDialog show(FragmentManager fragmentManager) {
            BaseCircleDialog baseCircleDialogCreate = create();
            this.f103497a.show(fragmentManager);
            return baseCircleDialogCreate;
        }

        public C15898b setAdUrl(String[] strArr, s1c s1cVar) {
            newAdParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24250n2.f24269b = strArr;
            circleParams.f24252p2 = s1cVar;
            return this;
        }

        public C15898b setCloseResId(@gq4 int i, int i2) {
            newCloseParams();
            CloseParams closeParams = this.f103498b.f24249m2;
            closeParams.f24289a = i;
            closeParams.f24290b = i2;
            return this;
        }

        public C15898b setAdResId(@gq4 int[] iArr, s1c s1cVar) {
            newAdParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24250n2.f24268a = iArr;
            circleParams.f24252p2 = s1cVar;
            return this;
        }

        public C15898b setBodyView(View view, e2c e2cVar) {
            CircleParams circleParams = this.f103498b;
            circleParams.f24233b2 = view;
            circleParams.f24235c2 = e2cVar;
            return this;
        }

        public C15898b setInputCounter(int i, a3c a3cVar) {
            newInputParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24225V1.f24324Z = i;
            circleParams.f24245j2 = a3cVar;
            return this;
        }

        public C15898b setInputText(@efb String str, @efb String str2) {
            newInputParams();
            InputParams inputParams = this.f103498b.f24225V1;
            inputParams.f24320Q = str;
            inputParams.f24330c = str2;
            return this;
        }

        public C15898b setLottieAnimation(int i) {
            newLottieParams();
            this.f103498b.f24222M1.f24363f = i;
            return this;
        }

        public C15898b setCloseConnector(int i, int i2, int i3) {
            newCloseParams();
            CloseParams closeParams = this.f103498b.f24249m2;
            closeParams.f24293e = i;
            closeParams.f24294f = i2;
            closeParams.f24295m = i3;
            return this;
        }

        public C15898b setPopupItems(@efb Object obj, RecyclerView.LayoutManager layoutManager, o4c o4cVar) {
            newPopupParams();
            CircleParams circleParams = this.f103498b;
            PopupParams popupParams = circleParams.f24246k2;
            popupParams.f24344a = obj;
            popupParams.f24338L = layoutManager;
            circleParams.f24238e = o4cVar;
            return this;
        }

        public C15898b setAdUrl(List<String> list, s1c s1cVar) {
            return setAdUrl((String[]) list.toArray(new String[list.size()]), s1cVar);
        }

        public C15898b setItems(@efb BaseAdapter baseAdapter, s3c s3cVar) {
            newItemsParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24247l2 = true;
            circleParams.f24227Y.f24336F = baseAdapter;
            circleParams.f24240f = s3cVar;
            return this;
        }

        public C15898b setPopupItems(@efb RecyclerView.Adapter adapter, RecyclerView.LayoutManager layoutManager) {
            newPopupParams();
            PopupParams popupParams = this.f103498b.f24246k2;
            popupParams.f24338L = layoutManager;
            popupParams.f24337H = adapter;
            return this;
        }

        public C15898b setItems(@efb Object obj, @efb o4c o4cVar) {
            newItemsParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24247l2 = false;
            circleParams.f24227Y.f24344a = obj;
            circleParams.f24238e = o4cVar;
            return this;
        }

        public C15898b setPopupItems(@efb RecyclerView.Adapter adapter, RecyclerView.LayoutManager layoutManager, RecyclerView.ItemDecoration itemDecoration) {
            newPopupParams();
            PopupParams popupParams = this.f103498b.f24246k2;
            popupParams.f24338L = layoutManager;
            popupParams.f24340N = itemDecoration;
            popupParams.f24337H = adapter;
            return this;
        }

        public C15898b setItems(@efb Object obj, RecyclerView.LayoutManager layoutManager, @efb o4c o4cVar) {
            newItemsParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24247l2 = false;
            ItemsParams itemsParams = circleParams.f24227Y;
            itemsParams.f24344a = obj;
            itemsParams.f24338L = layoutManager;
            circleParams.f24238e = o4cVar;
            return this;
        }

        public C15898b setItems(@efb RecyclerView.Adapter adapter, @efb RecyclerView.LayoutManager layoutManager) {
            newItemsParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24247l2 = false;
            ItemsParams itemsParams = circleParams.f24227Y;
            itemsParams.f24338L = layoutManager;
            itemsParams.f24337H = adapter;
            return this;
        }

        public C15898b setItems(@efb RecyclerView.Adapter adapter, @efb RecyclerView.LayoutManager layoutManager, @efb RecyclerView.ItemDecoration itemDecoration) {
            newItemsParams();
            CircleParams circleParams = this.f103498b;
            circleParams.f24247l2 = false;
            ItemsParams itemsParams = circleParams.f24227Y;
            itemsParams.f24338L = layoutManager;
            itemsParams.f24340N = itemDecoration;
            itemsParams.f24337H = adapter;
            return this;
        }
    }

    public BaseCircleDialog create(CircleParams circleParams) {
        BaseCircleDialog baseCircleDialogNewAbsCircleDialog = BaseCircleDialog.newAbsCircleDialog(circleParams);
        this.f103496a = baseCircleDialogNewAbsCircleDialog;
        return baseCircleDialogNewAbsCircleDialog;
    }

    public void refresh() {
        Dialog dialog;
        BaseCircleDialog baseCircleDialog = this.f103496a;
        if (baseCircleDialog == null || (dialog = baseCircleDialog.getDialog()) == null || !dialog.isShowing()) {
            return;
        }
        this.f103496a.refreshView();
    }

    public void show(FragmentManager fragmentManager) {
        this.f103496a.show(fragmentManager, "circleDialog");
    }

    private yz1() {
    }
}

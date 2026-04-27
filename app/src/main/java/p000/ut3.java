package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.permissionx.guolindev.C3877R;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ut3 extends qpd {

    /* JADX INFO: renamed from: a */
    public vpc f89062a;

    /* JADX INFO: renamed from: b */
    public final List<String> f89063b;

    /* JADX INFO: renamed from: c */
    public final String f89064c;

    /* JADX INFO: renamed from: d */
    public final String f89065d;

    /* JADX INFO: renamed from: e */
    public final String f89066e;

    /* JADX INFO: renamed from: f */
    public final int f89067f;

    /* JADX INFO: renamed from: m */
    public final int f89068m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut3(@yfb Context context, @yfb List<String> list, @yfb String str, @yfb String str2, @gib String str3, int i, int i2) {
        super(context, C3877R.style.PermissionXDefaultDialog);
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(list, "permissions");
        md8.checkNotNullParameter(str, g55.f38799h);
        md8.checkNotNullParameter(str2, "positiveText");
        this.f89063b = list;
        this.f89064c = str;
        this.f89065d = str2;
        this.f89066e = str3;
        this.f89067f = i;
        this.f89068m = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void buildPermissionsLayout() {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ut3.buildPermissionsLayout():void");
    }

    private final boolean isDarkTheme() {
        Context context = getContext();
        md8.checkNotNullExpressionValue(context, "context");
        Resources resources = context.getResources();
        md8.checkNotNullExpressionValue(resources, "context.resources");
        return (resources.getConfiguration().uiMode & 48) == 32;
    }

    private final void setupText() {
        vpc vpcVar = this.f89062a;
        if (vpcVar == null) {
            md8.throwUninitializedPropertyAccessException("binding");
        }
        TextView textView = vpcVar.f91935b;
        md8.checkNotNullExpressionValue(textView, "binding.messageText");
        textView.setText(this.f89064c);
        vpc vpcVar2 = this.f89062a;
        if (vpcVar2 == null) {
            md8.throwUninitializedPropertyAccessException("binding");
        }
        Button button = vpcVar2.f91939f;
        md8.checkNotNullExpressionValue(button, "binding.positiveBtn");
        button.setText(this.f89065d);
        if (this.f89066e != null) {
            vpc vpcVar3 = this.f89062a;
            if (vpcVar3 == null) {
                md8.throwUninitializedPropertyAccessException("binding");
            }
            LinearLayout linearLayout = vpcVar3.f91937d;
            md8.checkNotNullExpressionValue(linearLayout, "binding.negativeLayout");
            linearLayout.setVisibility(0);
            vpc vpcVar4 = this.f89062a;
            if (vpcVar4 == null) {
                md8.throwUninitializedPropertyAccessException("binding");
            }
            Button button2 = vpcVar4.f91936c;
            md8.checkNotNullExpressionValue(button2, "binding.negativeBtn");
            button2.setText(this.f89066e);
        } else {
            vpc vpcVar5 = this.f89062a;
            if (vpcVar5 == null) {
                md8.throwUninitializedPropertyAccessException("binding");
            }
            LinearLayout linearLayout2 = vpcVar5.f91937d;
            md8.checkNotNullExpressionValue(linearLayout2, "binding.negativeLayout");
            linearLayout2.setVisibility(8);
        }
        if (isDarkTheme()) {
            if (this.f89068m != -1) {
                vpc vpcVar6 = this.f89062a;
                if (vpcVar6 == null) {
                    md8.throwUninitializedPropertyAccessException("binding");
                }
                vpcVar6.f91939f.setTextColor(this.f89068m);
                vpc vpcVar7 = this.f89062a;
                if (vpcVar7 == null) {
                    md8.throwUninitializedPropertyAccessException("binding");
                }
                vpcVar7.f91936c.setTextColor(this.f89068m);
                return;
            }
            return;
        }
        if (this.f89067f != -1) {
            vpc vpcVar8 = this.f89062a;
            if (vpcVar8 == null) {
                md8.throwUninitializedPropertyAccessException("binding");
            }
            vpcVar8.f91939f.setTextColor(this.f89067f);
            vpc vpcVar9 = this.f89062a;
            if (vpcVar9 == null) {
                md8.throwUninitializedPropertyAccessException("binding");
            }
            vpcVar9.f91936c.setTextColor(this.f89067f);
        }
    }

    private final void setupWindow() {
        Context context = getContext();
        md8.checkNotNullExpressionValue(context, "context");
        Resources resources = context.getResources();
        md8.checkNotNullExpressionValue(resources, "context.resources");
        int i = resources.getDisplayMetrics().widthPixels;
        Context context2 = getContext();
        md8.checkNotNullExpressionValue(context2, "context");
        Resources resources2 = context2.getResources();
        md8.checkNotNullExpressionValue(resources2, "context.resources");
        if (i < resources2.getDisplayMetrics().heightPixels) {
            Window window = getWindow();
            if (window != null) {
                md8.checkNotNullExpressionValue(window, "it");
                WindowManager.LayoutParams attributes = window.getAttributes();
                window.setGravity(17);
                attributes.width = (int) (((double) i) * 0.86d);
                window.setAttributes(attributes);
                return;
            }
            return;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            md8.checkNotNullExpressionValue(window2, "it");
            WindowManager.LayoutParams attributes2 = window2.getAttributes();
            window2.setGravity(17);
            attributes2.width = (int) (((double) i) * 0.6d);
            window2.setAttributes(attributes2);
        }
    }

    @Override // p000.qpd
    @gib
    public View getNegativeButton() {
        if (this.f89066e == null) {
            return null;
        }
        vpc vpcVar = this.f89062a;
        if (vpcVar == null) {
            md8.throwUninitializedPropertyAccessException("binding");
        }
        return vpcVar.f91936c;
    }

    @Override // p000.qpd
    @yfb
    public List<String> getPermissionsToRequest() {
        return this.f89063b;
    }

    @Override // p000.qpd
    @yfb
    public View getPositiveButton() {
        vpc vpcVar = this.f89062a;
        if (vpcVar == null) {
            md8.throwUninitializedPropertyAccessException("binding");
        }
        Button button = vpcVar.f91939f;
        md8.checkNotNullExpressionValue(button, "binding.positiveBtn");
        return button;
    }

    public final boolean isPermissionLayoutEmpty$permissionx_release() {
        vpc vpcVar = this.f89062a;
        if (vpcVar == null) {
            md8.throwUninitializedPropertyAccessException("binding");
        }
        LinearLayout linearLayout = vpcVar.f91938e;
        md8.checkNotNullExpressionValue(linearLayout, "binding.permissionsLayout");
        return linearLayout.getChildCount() == 0;
    }

    @Override // android.app.Dialog
    public void onCreate(@gib Bundle bundle) {
        super.onCreate(bundle);
        vpc vpcVarInflate = vpc.inflate(getLayoutInflater());
        md8.checkNotNullExpressionValue(vpcVarInflate, "PermissionxDefaultDialog…g.inflate(layoutInflater)");
        this.f89062a = vpcVarInflate;
        if (vpcVarInflate == null) {
            md8.throwUninitializedPropertyAccessException("binding");
        }
        setContentView(vpcVarInflate.getRoot());
        setupText();
        buildPermissionsLayout();
        setupWindow();
    }
}

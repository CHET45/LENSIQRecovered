package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.ToastUtils;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class dxg extends RecyclerView.Adapter<C4997a> {

    /* JADX INFO: renamed from: d */
    public static final String f31259d = "ThemeSelectAdapter";

    /* JADX INFO: renamed from: a */
    public int[] f31260a;

    /* JADX INFO: renamed from: b */
    public final Context f31261b;

    /* JADX INFO: renamed from: c */
    public InterfaceC4998b f31262c;

    /* JADX INFO: renamed from: dxg$a */
    public static class C4997a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public uve f31263a;

        public C4997a(uve binding) {
            super(binding.getRoot());
            this.f31263a = binding;
        }
    }

    /* JADX INFO: renamed from: dxg$b */
    public interface InterfaceC4998b {
        void click(int position);
    }

    public dxg(Context context) {
        this.f31261b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        this.f31262c.click(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f31260a.length;
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(int[] country) {
        this.f31260a = country;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(InterfaceC4998b onItemClickListener) {
        this.f31262c = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb C4997a holder, final int position) {
        String string;
        try {
            uve uveVar = holder.f31263a;
            uveVar.f89244c.setText(this.f31260a[position]);
            String string2 = vfe.getInstance().getString("THEMES");
            if (!TextUtils.isEmpty(string2)) {
                if (string2.equals(ToastUtils.InterfaceC2464f.f17508u0)) {
                    string = this.f31261b.getString(C2531R.string.eyevue_theme_light);
                    vfe.getInstance().putBoolean("THEME_DARK", false);
                } else {
                    string = this.f31261b.getString(C2531R.string.eyevue_theme_dark);
                    vfe.getInstance().putBoolean("THEME_DARK", true);
                }
                if (string.equals(uveVar.f89244c.getText())) {
                    uveVar.f89243b.setVisibility(0);
                    uveVar.f89243b.setBackgroundResource(C2531R.drawable.ic_checkbox);
                }
            } else if (uveVar.f89244c.getText().equals(this.f31261b.getString(C2531R.string.eyevue_theme_light))) {
                uveVar.f89243b.setVisibility(0);
                uveVar.f89243b.setBackgroundResource(C2531R.drawable.ic_checkbox);
                vfe.getInstance().putBoolean("THEME_DARK", false);
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: cxg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28022a.lambda$onBindViewHolder$0(position, view);
                }
            });
            uveVar.f89245d.setVisibility(position == this.f31260a.length - 1 ? 8 : 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public C4997a onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        return new C4997a(uve.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }
}
